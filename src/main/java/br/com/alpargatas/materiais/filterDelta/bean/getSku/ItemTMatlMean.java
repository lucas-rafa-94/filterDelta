package br.com.alpargatas.materiais.filterDelta.bean.getSku;

public class ItemTMatlMean {

    private String MATNR;
    private String MEINH;
    private String EAN11;
    private String EANTP;
    private String J_3AKORDX;
    private double UMREZ;

    public ItemTMatlMean(String MATNR, String MEINH, String EAN11, String EANTP, String j_3AKORDX, double UMREZ) {
        this.MATNR = MATNR;
        this.MEINH = MEINH;
        this.EAN11 = EAN11;
        this.EANTP = EANTP;
        this.J_3AKORDX = j_3AKORDX;
        this.UMREZ = UMREZ;
    }

    public ItemTMatlMean() {
    }

    public void setMATNR(String MATNR) {
        this.MATNR = MATNR;
    }

    public void setMEINH(String MEINH) {
        this.MEINH = MEINH;
    }

    public void setEAN11(String EAN11) {
        this.EAN11 = EAN11;
    }

    public void setEANTP(String EANTP) {
        this.EANTP = EANTP;
    }

    public void setJ_3AKORDX(String j_3AKORDX) {
        this.J_3AKORDX = j_3AKORDX;
    }

    public void setUMREZ(double UMREZ) {
        this.UMREZ = UMREZ;
    }

    public String getMATNR() {
        return MATNR;
    }

    public String getMEINH() {
        return MEINH;
    }

    public String getEAN11() {
        return EAN11;
    }

    public String getEANTP() {
        return EANTP;
    }

    public String getJ_3AKORDX() {
        return J_3AKORDX;
    }

    public double getUMREZ() {
        return UMREZ;
    }
}
