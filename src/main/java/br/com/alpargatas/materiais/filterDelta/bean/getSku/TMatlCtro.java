package br.com.alpargatas.materiais.filterDelta.bean.getSku;

import java.util.List;

public class TMatlCtro {

    private List<ItemTMatlCtro> item;

    public TMatlCtro(List<ItemTMatlCtro> item) {
        this.item = item;
    }

    public TMatlCtro() {
    }

    public List<ItemTMatlCtro> getItem() {
        return item;
    }

    public void setItem(List<ItemTMatlCtro> item) {
        this.item = item;
    }



}
