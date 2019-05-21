package br.com.alpargatas.materiais.filterDelta.bean.getSku;

import java.io.Serializable;

public class ItemTMatlDbas implements Serializable {

    private String MATNR;
    private String MAKTX;
    private String ERSDA;
    private String LAEDA;
    private String LVORM;
    private String MTART;
    private String MATKL;
    private String MEINS;
    private double BRGEW;
    private double NTGEW;
    private String GEWEI;
    private double VOLUM;
    private String VOLEH;
    private String KZKFG;
    private String EXTWG;
    private String MSTAE;
    private String MSTDE;

    public ItemTMatlDbas(String MATNR, String MAKTX, String ERSDA, String LAEDA, String LVORM, String MTART, String MATKL, String MEINS, double BRGEW, double NTGEW, String GEWEI, double VOLUM, String VOLEH, String KZKFG, String EXTWG, String MSTAE, String MSTDE) {
        this.MATNR = MATNR;
        this.MAKTX = MAKTX;
        this.ERSDA = ERSDA;
        this.LAEDA = LAEDA;
        this.LVORM = LVORM;
        this.MTART = MTART;
        this.MATKL = MATKL;
        this.MEINS = MEINS;
        this.BRGEW = BRGEW;
        this.NTGEW = NTGEW;
        this.GEWEI = GEWEI;
        this.VOLUM = VOLUM;
        this.VOLEH = VOLEH;
        this.KZKFG = KZKFG;
        this.EXTWG = EXTWG;
        this.MSTAE = MSTAE;
        this.MSTDE = MSTDE;
    }

    public ItemTMatlDbas() {
    }

    public String getMATNR() {
        return MATNR;
    }

    public void setMATNR(String MATNR) {
        this.MATNR = MATNR;
    }

    public String getMAKTX() {
        return MAKTX;
    }

    public void setMAKTX(String MAKTX) {
        this.MAKTX = MAKTX;
    }

    public String getERSDA() {
        return ERSDA;
    }

    public void setERSDA(String ERSDA) {
        this.ERSDA = ERSDA;
    }

    public String getLAEDA() {
        return LAEDA;
    }

    public void setLAEDA(String LAEDA) {
        this.LAEDA = LAEDA;
    }

    public String getLVORM() {
        return LVORM;
    }

    public void setLVORM(String LVORM) {
        this.LVORM = LVORM;
    }

    public String getMTART() {
        return MTART;
    }

    public void setMTART(String MTART) {
        this.MTART = MTART;
    }

    public String getMATKL() {
        return MATKL;
    }

    public void setMATKL(String MATKL) {
        this.MATKL = MATKL;
    }

    public String getMEINS() {
        return MEINS;
    }

    public void setMEINS(String MEINS) {
        this.MEINS = MEINS;
    }

    public double getBRGEW() {
        return BRGEW;
    }

    public void setBRGEW(double BRGEW) {
        this.BRGEW = BRGEW;
    }

    public double getNTGEW() {
        return NTGEW;
    }

    public void setNTGEW(double NTGEW) {
        this.NTGEW = NTGEW;
    }

    public String getGEWEI() {
        return GEWEI;
    }

    public void setGEWEI(String GEWEI) {
        this.GEWEI = GEWEI;
    }

    public double getVOLUM() {
        return VOLUM;
    }

    public void setVOLUM(double VOLUM) {
        this.VOLUM = VOLUM;
    }

    public String getVOLEH() {
        return VOLEH;
    }

    public void setVOLEH(String VOLEH) {
        this.VOLEH = VOLEH;
    }

    public String getKZKFG() {
        return KZKFG;
    }

    public void setKZKFG(String KZKFG) {
        this.KZKFG = KZKFG;
    }

    public String getEXTWG() {
        return EXTWG;
    }

    public void setEXTWG(String EXTWG) {
        this.EXTWG = EXTWG;
    }

    public String getMSTAE() {
        return MSTAE;
    }

    public void setMSTAE(String MSTAE) {
        this.MSTAE = MSTAE;
    }

    public String getMSTDE() {
        return MSTDE;
    }

    public void setMSTDE(String MSTDE) {
        this.MSTDE = MSTDE;
    }
}
