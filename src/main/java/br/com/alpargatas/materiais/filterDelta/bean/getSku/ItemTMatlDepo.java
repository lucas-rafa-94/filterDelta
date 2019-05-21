package br.com.alpargatas.materiais.filterDelta.bean.getSku;

public class ItemTMatlDepo {

    private String MATNR;
    private String WERKS;
    private String LGORT;
    private String LVORM;
    private String HERKL;

    public ItemTMatlDepo(String MATNR, String WERKS, String LGORT, String LVORM, String HERKL) {
        this.MATNR = MATNR;
        this.WERKS = WERKS;
        this.LGORT = LGORT;
        this.LVORM = LVORM;
        this.HERKL = HERKL;
    }

    public ItemTMatlDepo() {
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

    public String getLGORT() {
        return LGORT;
    }

    public void setLGORT(String LGORT) {
        this.LGORT = LGORT;
    }

    public String getLVORM() {
        return LVORM;
    }

    public void setLVORM(String LVORM) {
        this.LVORM = LVORM;
    }

    public String getHERKL() {
        return HERKL;
    }

    public void setHERKL(String HERKL) {
        this.HERKL = HERKL;
    }
}
