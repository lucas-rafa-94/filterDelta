package br.com.alpargatas.materiais.filterDelta.bean.getSku;

import java.util.List;

public class TMatlMean {

    private List<ItemTMatlMean> item;

    public TMatlMean(List<ItemTMatlMean> item) {
        this.item = item;
    }

    public TMatlMean() {
    }

    public List<ItemTMatlMean> getItem() {
        return item;
    }

    public void setItem(List<ItemTMatlMean> item) {
        this.item = item;
    }


}