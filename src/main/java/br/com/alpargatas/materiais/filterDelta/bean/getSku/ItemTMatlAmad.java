package br.com.alpargatas.materiais.filterDelta.bean.getSku;

public class ItemTMatlAmad {

    private String MATNR;
    private String WERKS;
    private String J_3AKORD;
    private String J_3ASIGR;
    private String J_4ASTAT;

    public ItemTMatlAmad(String MATNR, String WERKS, String j_3AKORD, String j_3ASIGR, String j_4ASTAT) {
        this.MATNR = MATNR;
        this.WERKS = WERKS;
        this.J_3AKORD = j_3AKORD;
        this.J_3ASIGR = j_3ASIGR;
        this.J_4ASTAT = j_4ASTAT;
    }

    public ItemTMatlAmad() {
    }

    public String getMATNR() {
        return MATNR;
    }

    public void setMATNR(String MATNR) {
        this.MATNR = MATNR;
    }

    public String getWERKS() {
        return WERKS;
    }

    public void setWERKS(String WERKS) {
        this.WERKS = WERKS;
    }

    public String getJ_3AKORD() {
        return J_3AKORD;
    }

    public void setJ_3AKORD(String j_3AKORD) {
        this.J_3AKORD = j_3AKORD;
    }

    public String getJ_3ASIGR() {
        return J_3ASIGR;
    }

    public void setJ_3ASIGR(String j_3ASIGR) {
        this.J_3ASIGR = j_3ASIGR;
    }

    public String getJ_4ASTAT() {
        return J_4ASTAT;
    }

    public void setJ_4ASTAT(String j_4ASTAT) {
        this.J_4ASTAT = j_4ASTAT;
    }
}
