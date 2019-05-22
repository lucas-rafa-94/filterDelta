package br.com.alpargatas.materiais.filterDelta.client;

import br.com.alpargatas.materiais.filterDelta.bean.RestCallResponse;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;



@Service
public class PostMaterialRestClient {

    ClientResponse response = null;
    WebResource webResource = null;
    Client client = null;

    Logger logger = LoggerFactory.getLogger(PostMaterialRestClient.class);

    public void postGetMaterialChanged (String id){

        Gson gson = new Gson();

        client = Client.create();

        HTTPBasicAuthFilter authFilter = new HTTPBasicAuthFilter("lucas.dos@oracle.com", "VeruskaRamos05@");


        webResource = client.
                resource("http://127.0.0.1:8082/fluxo-material/" + id);

        client.addFilter(authFilter);


        response = webResource.header("Content-Type", "application/json")
                .post(ClientResponse.class);

    }
}
