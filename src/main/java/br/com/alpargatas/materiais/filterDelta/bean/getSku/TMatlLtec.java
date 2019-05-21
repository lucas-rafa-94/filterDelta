package br.com.alpargatas.materiais.filterDelta.bean.getSku;

import java.util.List;

public class TMatlLtec {

    private List<ItemTMatlLtec> item;

    public TMatlLtec(List<ItemTMatlLtec> item) {
        this.item = item;
    }

    public TMatlLtec() {
    }

    public List<ItemTMatlLtec> getItem() {
        return item;
    }

    public void setItem(List<ItemTMatlLtec> item) {
        this.item = item;
    }



}
