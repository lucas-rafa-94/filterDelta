package br.com.alpargatas.materiais.filterDelta.bean.getSku;

import java.io.Serializable;
import java.util.List;

public class TMatlDbas implements Serializable {

    private List<ItemTMatlDbas> item;

    public TMatlDbas(List<ItemTMatlDbas> item) {
        this.item = item;
    }

    public TMatlDbas() {
    }

    public List<ItemTMatlDbas> getItem() {
        return item;
    }

    public void setItem(List<ItemTMatlDbas> item) {
        this.item = item;
    }



}
