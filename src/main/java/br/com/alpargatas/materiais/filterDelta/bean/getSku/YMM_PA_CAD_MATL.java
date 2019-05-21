package br.com.alpargatas.materiais.filterDelta.bean.getSku;

public class YMM_PA_CAD_MATL {


    private String I_CARGA_INICIAL;
    private String I_ERDAT;
    private String I_UZEIT;
    public  TMaterial T_MATERIAL;

    public YMM_PA_CAD_MATL(String i_CARGA_INICIAL, String i_ERDAT, String i_UZEIT, TMaterial t_MATERIAL) {
        this.I_CARGA_INICIAL = i_CARGA_INICIAL;
        this.I_ERDAT = i_ERDAT;
        this.I_UZEIT = i_UZEIT;
        this.T_MATERIAL = t_MATERIAL;
    }

    public YMM_PA_CAD_MATL() {
    }

    public String getI_CARGA_INICIAL() {
        return I_CARGA_INICIAL;
    }

    public String getI_ERDAT() {
        return I_ERDAT;
    }

    public String getI_UZEIT() {
        return I_UZEIT;
    }

    public TMaterial getT_MATERIAL() {
        return T_MATERIAL;
    }

    public void setI_CARGA_INICIAL(String i_CARGA_INICIAL) {
        this.I_CARGA_INICIAL = i_CARGA_INICIAL;
    }

    public void setI_ERDAT(String i_ERDAT) {
        this.I_ERDAT = i_ERDAT;
    }

    public void setI_UZEIT(String i_UZEIT) {
        this.I_UZEIT = i_UZEIT;
    }

    public void setT_MATERIAL(TMaterial t_MATERIAL) {
        this.T_MATERIAL = t_MATERIAL;
    }
}


