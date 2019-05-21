package br.com.alpargatas.materiais.filterDelta.service;

import br.com.alpargatas.materiais.filterDelta.bean.FilterDevCall;
import br.com.alpargatas.materiais.filterDelta.bean.getSku.YMM_PA_CAD_MATL;
import br.com.alpargatas.materiais.filterDelta.utils.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MaterialFilterService {

    @Autowired
    GetSkuRestClient getSkuRestClient;

    @Autowired
    Helper helper;

    @Async
    public void filterDeltaCall(FilterDevCall filterDevCall){

        YMM_PA_CAD_MATL ymm_pa_cad_matl = new YMM_PA_CAD_MATL();
        ymm_pa_cad_matl.setI_CARGA_INICIAL(filterDevCall.getCargaInicial());
        ymm_pa_cad_matl.setI_ERDAT(filterDevCall.getData());
        ymm_pa_cad_matl.setI_UZEIT(filterDevCall.getHorario());



    }

}
