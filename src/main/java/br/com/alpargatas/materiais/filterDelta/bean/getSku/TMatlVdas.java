package br.com.alpargatas.materiais.filterDelta.bean.getSku;

import java.util.List;

public class TMatlVdas {

    private List<ItemTMatlVdas> item;

    public TMatlVdas(List<ItemTMatlVdas> item) {
        this.item = item;
    }

    public TMatlVdas() {
    }

    public List<ItemTMatlVdas> getItem() {
        return item;
    }

    public void setItem(List<ItemTMatlVdas> item) {
        this.item = item;
    }



}