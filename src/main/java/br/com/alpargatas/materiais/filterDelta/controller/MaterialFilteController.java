package br.com.alpargatas.materiais.filterDelta.controller;

import br.com.alpargatas.materiais.filterDelta.bean.FilterDevCall;
import br.com.alpargatas.materiais.filterDelta.bean.RestCallResponse;
import br.com.alpargatas.materiais.filterDelta.service.MaterialFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAsync
@RestController
@RequestMapping("/materias/filter-delta")
public class MaterialFilteController {

    @Autowired
    MaterialFilterService materialFilterService;

    @PostMapping
    public RestCallResponse filterDeltaCall(@RequestBody FilterDevCall filterDevCall){
        RestCallResponse restCallResponse = new RestCallResponse("Carga Delta Materiais em andamento");
        materialFilterService.filterDeltaCall(filterDevCall);
        return restCallResponse;

    }
}
