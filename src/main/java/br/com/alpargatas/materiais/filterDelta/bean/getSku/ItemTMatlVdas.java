package br.com.alpargatas.materiais.filterDelta.bean.getSku;

public class ItemTMatlVdas {

    private String MATNR;
    private String VKORG;
    private String VTWEG;
    private String SPART;
    private String LVORM;
    private String VMSTA;
    private String VMSTD;
    private String PRODH;
    private String KONDM;
    private String MVGR1;
    private String DWERK;
    private String MSTAE;

    public ItemTMatlVdas(String MATNR, String VKORG, String VTWEG, String SPART, String LVORM, String VMSTA, String VMSTD, String PRODH, String KONDM, String MVGR1, String DWERK, String MSTAE) {
        this.MATNR = MATNR;
        this.VKORG = VKORG;
        this.VTWEG = VTWEG;
        this.SPART = SPART;
        this.LVORM = LVORM;
        this.VMSTA = VMSTA;
        this.VMSTD = VMSTD;
        this.PRODH = PRODH;
        this.KONDM = KONDM;
        this.MVGR1 = MVGR1;
        this.DWERK = DWERK;
        this.MSTAE = MSTAE;
    }

    public ItemTMatlVdas() {
    }

    public String getMATNR() {
        return MATNR;
    }

    public void setMATNR(String MATNR) {
        this.MATNR = MATNR;
    }

    public String getVKORG() {
        return VKORG;
    }

    public void setVKORG(String VKORG) {
        this.VKORG = VKORG;
    }

    public String getVTWEG() {
        return VTWEG;
    }

    public void setVTWEG(String VTWEG) {
        this.VTWEG = VTWEG;
    }

    public String getSPART() {
        return SPART;
    }

    public void setSPART(String SPART) {
        this.SPART = SPART;
    }

    public String getLVORM() {
        return LVORM;
    }

    public void setLVORM(String LVORM) {
        this.LVORM = LVORM;
    }

    public String getVMSTA() {
        return VMSTA;
    }

    public void setVMSTA(String VMSTA) {
        this.VMSTA = VMSTA;
    }

    public String getVMSTD() {
        return VMSTD;
    }

    public void setVMSTD(String VMSTD) {
        this.VMSTD = VMSTD;
    }

    public String getPRODH() {
        return PRODH;
    }

    public void setPRODH(String PRODH) {
        this.PRODH = PRODH;
    }

    public String getKONDM() {
        return KONDM;
    }

    public void setKONDM(String KONDM) {
        this.KONDM = KONDM;
    }

    public String getMVGR1() {
        return MVGR1;
    }

    public void setMVGR1(String MVGR1) {
        this.MVGR1 = MVGR1;
    }

    public String getDWERK() {
        return DWERK;
    }

    public void setDWERK(String DWERK) {
        this.DWERK = DWERK;
    }

    public String getMSTAE() {
        return MSTAE;
    }

    public void setMSTAE(String MSTAE) {
        this.MSTAE = MSTAE;
    }
}
