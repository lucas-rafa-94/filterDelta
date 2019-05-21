package br.com.alpargatas.materiais.filterDelta.bean.getSku;

import java.util.List;

public class TMatlDepo {

    private List<ItemTMatlDepo> item;

    public TMatlDepo(List<ItemTMatlDepo> item) {
        this.item = item;
    }

    public TMatlDepo() {
    }

    public List<ItemTMatlDepo> getItem() {
        return item;
    }

    public void setItem(List<ItemTMatlDepo> item) {
        this.item = item;
    }



}
