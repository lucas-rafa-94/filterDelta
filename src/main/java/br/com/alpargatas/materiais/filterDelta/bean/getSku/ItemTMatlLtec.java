package br.com.alpargatas.materiais.filterDelta.bean.getSku;

public class ItemTMatlLtec {

    private String MATNR;
    private String WERKS;
    private String J_3AKORDXL;
    private String BMEIN;
    private double BMENG;
    private String IDNRK;
    private String MEINS;
    private double MENGE;
    private String J_3APGNR;
    private String J_3AKORDX;
    private double CMENG;

    public ItemTMatlLtec(String MATNR, String WERKS, String j_3AKORDXL, String BMEIN, double BMENG, String IDNRK, String MEINS, double MENGE, String j_3APGNR, String j_3AKORDX, double CMENG) {
        this.MATNR = MATNR;
        this.WERKS = WERKS;
        this.J_3AKORDXL = j_3AKORDXL;
        this.BMEIN = BMEIN;
        this.BMENG = BMENG;
        this.IDNRK = IDNRK;
        this.MEINS = MEINS;
        this.MENGE = MENGE;
        this.J_3APGNR = j_3APGNR;
        this.J_3AKORDX = j_3AKORDX;
        this.CMENG = CMENG;
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

    public String getJ_3AKORDXL() {
        return J_3AKORDXL;
    }

    public void setJ_3AKORDXL(String j_3AKORDXL) {
        this.J_3AKORDXL = j_3AKORDXL;
    }

    public String getBMEIN() {
        return BMEIN;
    }

    public void setBMEIN(String BMEIN) {
        this.BMEIN = BMEIN;
    }

    public double getBMENG() {
        return BMENG;
    }

    public void setBMENG(double BMENG) {
        this.BMENG = BMENG;
    }

    public String getIDNRK() {
        return IDNRK;
    }

    public void setIDNRK(String IDNRK) {
        this.IDNRK = IDNRK;
    }

    public String getMEINS() {
        return MEINS;
    }

    public void setMEINS(String MEINS) {
        this.MEINS = MEINS;
    }

    public double getMENGE() {
        return MENGE;
    }

    public void setMENGE(double MENGE) {
        this.MENGE = MENGE;
    }

    public String getJ_3APGNR() {
        return J_3APGNR;
    }

    public void setJ_3APGNR(String j_3APGNR) {
        this.J_3APGNR = j_3APGNR;
    }

    public String getJ_3AKORDX() {
        return J_3AKORDX;
    }

    public void setJ_3AKORDX(String j_3AKORDX) {
        this.J_3AKORDX = j_3AKORDX;
    }

    public double getCMENG() {
        return CMENG;
    }

    public void setCMENG(double CMENG) {
        this.CMENG = CMENG;
    }
}