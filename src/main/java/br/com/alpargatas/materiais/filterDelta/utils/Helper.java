package br.com.alpargatas.materiais.filterDelta.utils;

import br.com.alpargatas.materiais.filterDelta.bean.getSku.ItemMaterial;
import br.com.alpargatas.materiais.filterDelta.bean.getSku.TMaterial;
import br.com.alpargatas.materiais.filterDelta.bean.getSku.YMM_PA_CAD_MATL_Response;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Helper {

    public TMaterial filterMaterialChange(YMM_PA_CAD_MATL_Response ymm_pa_cad_matl_response){

        List<String> materialChangedList = new ArrayList<>();

        if(ymm_pa_cad_matl_response.getT_MATL_DBAS() != null){
            for(int i = 0; i < ymm_pa_cad_matl_response.getT_MATL_DBAS().getItem().size(); i++){
                materialChangedList.add(ymm_pa_cad_matl_response.getT_MATL_DBAS().getItem().get(i).getMATNR());
            }

        }

        if(ymm_pa_cad_matl_response.getT_MATL_AMAD() != null){
            for(int i = 0; i < ymm_pa_cad_matl_response.getT_MATL_AMAD().getItem().size(); i++){
                materialChangedList.add(ymm_pa_cad_matl_response.getT_MATL_AMAD().getItem().get(i).getMATNR());
            }

        }

        if(ymm_pa_cad_matl_response.getT_MATL_CTRO() != null){
            for(int i = 0; i < ymm_pa_cad_matl_response.getT_MATL_CTRO().getItem().size(); i++){
                materialChangedList.add(ymm_pa_cad_matl_response.getT_MATL_CTRO().getItem().get(i).getMATNR());
            }

        }

        if(ymm_pa_cad_matl_response.getT_MATL_DEPO() != null){
            for(int i = 0; i < ymm_pa_cad_matl_response.getT_MATL_DEPO().getItem().size(); i++){
                materialChangedList.add(ymm_pa_cad_matl_response.getT_MATL_DEPO().getItem().get(i).getMATNR());
            }

        }

        if(ymm_pa_cad_matl_response.getT_MATL_LTEC() != null){
            for(int i = 0; i < ymm_pa_cad_matl_response.getT_MATL_LTEC().getItem().size(); i++){
                materialChangedList.add(ymm_pa_cad_matl_response.getT_MATL_LTEC().getItem().get(i).getMATNR());
            }

        }

        if(ymm_pa_cad_matl_response.getT_MATL_MAFS_STAT() != null){
            for(int i = 0; i < ymm_pa_cad_matl_response.getT_MATL_MAFS_STAT().getItem().size(); i++){
                materialChangedList.add(ymm_pa_cad_matl_response.getT_MATL_MAFS_STAT().getItem().get(i).getMATNR());
            }

        }

        if(ymm_pa_cad_matl_response.getT_MATL_MEAN() != null){
            for(int i = 0; i < ymm_pa_cad_matl_response.getT_MATL_MEAN().getItem().size(); i++){
                materialChangedList.add(ymm_pa_cad_matl_response.getT_MATL_MEAN().getItem().get(i).getMATNR());
            }

        }

        if(ymm_pa_cad_matl_response.getT_MATL_VDAS() != null){
            for(int i = 0; i < ymm_pa_cad_matl_response.getT_MATL_VDAS().getItem().size(); i++){
                materialChangedList.add(ymm_pa_cad_matl_response.getT_MATL_VDAS().getItem().get(i).getMATNR());
            }

        }


        List<String> listWithoutDuplicatesMaterial = materialChangedList.stream()
                .distinct()
                .collect(Collectors.toList());

        TMaterial tMaterial = new TMaterial();

        List<ItemMaterial> itemMaterials = new ArrayList<>();

        for (int i = 0; i < listWithoutDuplicatesMaterial.size(); i++ ){
            ItemMaterial item = new ItemMaterial();
            item.setMATNR(listWithoutDuplicatesMaterial.get(i));
            itemMaterials.add(item);
        }


        tMaterial.setItem(itemMaterials);

        return tMaterial;
    }
}
