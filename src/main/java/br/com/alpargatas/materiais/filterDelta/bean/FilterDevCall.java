package br.com.alpargatas.materiais.filterDelta.bean;

public class FilterDevCall {

    private String cargaInicial;
    private String data;
    private String horario;

    public FilterDevCall(String cargaInicial, String data, String horario) {
        this.cargaInicial = cargaInicial;
        this.data = data;
        this.horario = horario;
    }

    public FilterDevCall() {
    }

    public String getCargaInicial() {
        return cargaInicial;
    }

    public void setCargaInicial(String cargaInicial) {
        this.cargaInicial = cargaInicial;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
