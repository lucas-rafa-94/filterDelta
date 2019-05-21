package br.com.alpargatas.materiais.filterDelta.bean.getSku;

import java.util.List;

public class TMatlMafs {

    private List<ItemTMatlMafs> item;

    public TMatlMafs(List<ItemTMatlMafs> item) {
        this.item = item;
    }

    public TMatlMafs() {
    }

    public List<ItemTMatlMafs> getItem() {
        return item;
    }

    public void setItem(List<ItemTMatlMafs> item) {
        this.item = item;
    }



}
