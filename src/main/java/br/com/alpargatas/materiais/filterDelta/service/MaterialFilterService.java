package br.com.alpargatas.materiais.filterDelta.service;

import br.com.alpargatas.materiais.filterDelta.bean.FilterDevCall;
import br.com.alpargatas.materiais.filterDelta.bean.getSku.TMaterial;
import br.com.alpargatas.materiais.filterDelta.bean.getSku.YMM_PA_CAD_MATL;
import br.com.alpargatas.materiais.filterDelta.client.GetSkuRestClient;
import br.com.alpargatas.materiais.filterDelta.client.PostMaterialRestClient;
import br.com.alpargatas.materiais.filterDelta.utils.Helper;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MaterialFilterService {

    @Autowired
    GetSkuRestClient getSkuRestClient;

    @Autowired
    PostMaterialRestClient postMaterialRestClient;

    @Autowired
    Helper helper;

    Logger logger = LoggerFactory.getLogger(MaterialFilterService.class);

    Gson gson = new Gson();

    @Async
    public void filterDeltaCall(FilterDevCall filterDevCall){

        YMM_PA_CAD_MATL ymm_pa_cad_matl = new YMM_PA_CAD_MATL();
        ymm_pa_cad_matl.setI_CARGA_INICIAL(filterDevCall.getCargaInicial());
        ymm_pa_cad_matl.setI_ERDAT(filterDevCall.getData());
        ymm_pa_cad_matl.setI_UZEIT(filterDevCall.getHorario());

        logger.info("Consultando ao SAP delta | " + gson.toJson(ymm_pa_cad_matl));

        TMaterial tMaterial = helper.filterMaterialChange(getSkuRestClient.postGetMaterialChanged(ymm_pa_cad_matl));

        logger.info("Recebimento delta SAP filtrado | " + gson.toJson(tMaterial));

        for(int i = 0; i < tMaterial.getItem().size(); i++){
            postMaterialRestClient.postGetMaterialChanged(tMaterial.getItem().get(i).getMATNR());
            logger.info("Enviando Material para criacao/atualizacao " + tMaterial.getItem().get(i).getMATNR());
        }

    }

    @Async
    public void input(TMaterial tMaterial){
        for(int i = 0; i < tMaterial.getItem().size(); i++){
//            try{
//                Thread.sleep(10000);
//            }catch (Exception e){
//                e.printStackTrace();
//            }
            postMaterialRestClient.postGetMaterialChanged(tMaterial.getItem().get(i).getMATNR());
            logger.info("Enviando Material para criacao/atualizacao " + tMaterial.getItem().get(i).getMATNR());
        }
    }

}
