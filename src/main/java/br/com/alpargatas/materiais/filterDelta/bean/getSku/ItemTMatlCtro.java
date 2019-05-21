package br.com.alpargatas.materiais.filterDelta.bean.getSku;

public class ItemTMatlCtro {

    private String MATNR;
    private String WERKS;
    private String LVORM;
    private String MMSTA;
    private String MMSTD;
    private String MTORG;
    private String MATGR;
    private String STEUC;

    public ItemTMatlCtro(String MATNR, String WERKS, String LVORM, String MMSTA, String MMSTD, String MTORG, String MATGR, String STEUC) {
        this.MATNR = MATNR;
        this.WERKS = WERKS;
        this.LVORM = LVORM;
        this.MMSTA = MMSTA;
        this.MMSTD = MMSTD;
        this.MTORG = MTORG;
        this.MATGR = MATGR;
        this.STEUC = STEUC;
    }

    public ItemTMatlCtro() {
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

    public String getLVORM() {
        return LVORM;
    }

    public void setLVORM(String LVORM) {
        this.LVORM = LVORM;
    }

    public String getMMSTA() {
        return MMSTA;
    }

    public void setMMSTA(String MMSTA) {
        this.MMSTA = MMSTA;
    }

    public String getMMSTD() {
        return MMSTD;
    }

    public void setMMSTD(String MMSTD) {
        this.MMSTD = MMSTD;
    }

    public String getMTORG() {
        return MTORG;
    }

    public void setMTORG(String MTORG) {
        this.MTORG = MTORG;
    }

    public String getMATGR() {
        return MATGR;
    }

    public void setMATGR(String MATGR) {
        this.MATGR = MATGR;
    }

    public String getSTEUC() {
        return STEUC;
    }

    public void setSTEUC(String STEUC) {
        this.STEUC = STEUC;
    }
}
