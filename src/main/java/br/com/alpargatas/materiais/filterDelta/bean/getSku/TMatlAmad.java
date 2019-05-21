package br.com.alpargatas.materiais.filterDelta.bean.getSku;

import java.util.List;

public class TMatlAmad {

    private List<ItemTMatlAmad> item;

    public TMatlAmad(List<ItemTMatlAmad> item) {
        this.item = item;
    }

    public TMatlAmad() {
    }

    public List<ItemTMatlAmad> getItem() {
        return item;
    }

    public void setItem(List<ItemTMatlAmad> item) {
        this.item = item;
    }




}