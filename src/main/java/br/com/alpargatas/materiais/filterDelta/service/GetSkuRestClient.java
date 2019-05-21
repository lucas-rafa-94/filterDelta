package br.com.alpargatas.materiais.filterDelta.service;

import br.com.alpargatas.materiais.filterDelta.bean.getSku.YMM_PA_CAD_MATL;
import br.com.alpargatas.materiais.filterDelta.bean.getSku.YMM_PA_CAD_MATL_Response;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import org.springframework.stereotype.Service;

@Service
public class GetSkuRestClient {

    public YMM_PA_CAD_MATL_Response postGetMaterialChanged (YMM_PA_CAD_MATL ymm_pa_cad_matl){

        Gson gson = new Gson();

        ClientResponse response = null;
        WebResource webResource = null;
        Client client = null;

        client = Client.create();

        HTTPBasicAuthFilter authFilter = new HTTPBasicAuthFilter("lucas.dos@oracle.com", "VeruskaRamos05@");


        webResource = client.
                resource("https://DEVALPAOIC-alpargatas.integration.ocp.oraclecloud.com:443/ic/api/integration/v1/flows/rest/GET_SKU_REST/1.0/");

        client.addFilter(authFilter);


        response = webResource.header("Content-Type", "application/json")
                .post(ClientResponse.class, gson.toJson(ymm_pa_cad_matl));


        YMM_PA_CAD_MATL_Response ymmpacadmatlResponse = gson.fromJson(response.getEntity(String.class), YMM_PA_CAD_MATL_Response.class);


        return ymmpacadmatlResponse;
    }
}
