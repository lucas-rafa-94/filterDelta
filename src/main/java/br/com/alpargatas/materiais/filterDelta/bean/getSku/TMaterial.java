package br.com.alpargatas.materiais.filterDelta.bean.getSku;

import java.util.List;

public class TMaterial {

    private List<ItemMaterial> item;

    public TMaterial(List<ItemMaterial> item) {
        this.item = item;
    }

    public TMaterial() {
    }

    public List<ItemMaterial> getItem() {
        return item;
    }

    public void setItem(List<ItemMaterial> item) {
        this.item = item;
    }
}
