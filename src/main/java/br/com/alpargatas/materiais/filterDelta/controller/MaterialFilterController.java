package br.com.alpargatas.materiais.filterDelta.controller;

import br.com.alpargatas.materiais.filterDelta.bean.FilterDevCall;
import br.com.alpargatas.materiais.filterDelta.bean.RestCallResponse;
import br.com.alpargatas.materiais.filterDelta.bean.getSku.TMaterial;
import br.com.alpargatas.materiais.filterDelta.service.MaterialFilterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@EnableAsync
@RestController
@RequestMapping("/materias/filter-delta")
public class MaterialFilterController {

    @Autowired
    MaterialFilterService materialFilterService;

    Logger logger = LoggerFactory.getLogger(MaterialFilterController.class);

    @PostMapping
    public RestCallResponse filterDeltaCall(@RequestBody FilterDevCall filterDevCall){
        RestCallResponse restCallResponse = new RestCallResponse("Carga Delta Materiais em andamento | Data: " + filterDevCall.getData() + " horario: " + filterDevCall.getHorario());
        logger.info(restCallResponse.getStatus());
        materialFilterService.filterDeltaCall(filterDevCall);
        return restCallResponse;
    }

    @PostMapping("/input")
    public String filterDeltaCall(@RequestBody TMaterial tMaterial){
        materialFilterService.input(tMaterial);
        return "Ok";
    }
}
