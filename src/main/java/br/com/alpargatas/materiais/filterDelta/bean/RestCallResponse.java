package br.com.alpargatas.materiais.filterDelta.bean;

public class RestCallResponse {

    public String status;

    public RestCallResponse(String status) {
        this.status = status;
    }

    public RestCallResponse() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
