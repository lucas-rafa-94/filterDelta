package br.com.alpargatas.materiais.filterDelta.bean.getSku;

public class ItemTMatlMafsStat {

    private String MATNR;
    private String VKORG;
    private String VTWEG;
    private String J_3ASIZE;
    private String VMSTA;
    private String VMSTD;
    private String J_3AGEND;

    public ItemTMatlMafsStat(String MATNR, String VKORG, String VTWEG, String j_3ASIZE, String VMSTA, String VMSTD, String j_3AGEND) {
        this.MATNR = MATNR;
        this.VKORG = VKORG;
        this.VTWEG = VTWEG;
        this.J_3ASIZE = j_3ASIZE;
        this.VMSTA = VMSTA;
        this.VMSTD = VMSTD;
        this.J_3AGEND = j_3AGEND;
    }

    public void setMATNR(String MATNR) {
        this.MATNR = MATNR;
    }

    public void setVKORG(String VKORG) {
        this.VKORG = VKORG;
    }

    public void setVTWEG(String VTWEG) {
        this.VTWEG = VTWEG;
    }

    public void setJ_3ASIZE(String j_3ASIZE) {
        this.J_3ASIZE = j_3ASIZE;
    }

    public void setVMSTA(String VMSTA) {
        this.VMSTA = VMSTA;
    }

    public void setVMSTD(String VMSTD) {
        this.VMSTD = VMSTD;
    }

    public void setJ_3AGEND(String j_3AGEND) {
        this.J_3AGEND = j_3AGEND;
    }

    public String getMATNR() {
        return MATNR;
    }

    public String getVKORG() {
        return VKORG;
    }

    public String getVTWEG() {
        return VTWEG;
    }

    public String getJ_3ASIZE() {
        return J_3ASIZE;
    }

    public String getVMSTA() {
        return VMSTA;
    }

    public String getVMSTD() {
        return VMSTD;
    }

    public String getJ_3AGEND() {
        return J_3AGEND;
    }
}

