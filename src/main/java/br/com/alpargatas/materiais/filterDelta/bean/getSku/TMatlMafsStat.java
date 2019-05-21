package br.com.alpargatas.materiais.filterDelta.bean.getSku;

import java.util.List;

public class TMatlMafsStat {

    private List<ItemTMatlMafsStat> item;

    public TMatlMafsStat(List<ItemTMatlMafsStat> item) {
        this.item = item;
    }

    public TMatlMafsStat() {
    }

    public List<ItemTMatlMafsStat> getItem() {
        return item;
    }

    public void setItem(List<ItemTMatlMafsStat> item) {
        this.item = item;
    }


}
