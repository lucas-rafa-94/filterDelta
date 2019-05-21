package br.com.alpargatas.materiais.filterDelta.bean.getSku;

public class ItemMaterial{

    private String MATNR;

    public ItemMaterial(String MATNR) {
        this.MATNR = MATNR;
    }

    public ItemMaterial() {
    }

    public String getMATNR() {
        return MATNR;
    }

    public void setMATNR(String MATNR) {
        this.MATNR = MATNR;
    }
}