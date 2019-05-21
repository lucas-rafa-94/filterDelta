package br.com.alpargatas.materiais.filterDelta.bean.getSku;

public class YMM_PA_CAD_MATL_Response {


    private TMaterial T_MATERIAL;
    private TMatlAmad T_MATL_AMAD;
    private TMatlCtro T_MATL_CTRO;
    private TMatlDbas T_MATL_DBAS;
    private TMatlDepo T_MATL_DEPO;
    private TMatlLtec T_MATL_LTEC;
    private TMatlMafs T_MATL_MAFS;
    private TMatlMafsStat T_MATL_MAFS_STAT;
    private TMatlMean T_MATL_MEAN;
    private TMatlVdas T_MATL_VDAS;

    public YMM_PA_CAD_MATL_Response(TMaterial t_MATERIAL , TMatlAmad t_MATL_AMAD, TMatlCtro t_MATL_CTRO, TMatlDbas t_MATL_DBAS, TMatlDepo t_MATL_DEPO, TMatlLtec t_MATL_LTEC, TMatlMafs t_MATL_MAFS, TMatlMafsStat t_MATL_MAFS_STAT, TMatlMean t_MATL_MEAN, TMatlVdas t_MATL_VDAS) {
        this.T_MATL_AMAD = t_MATL_AMAD;
        this.T_MATERIAL = t_MATERIAL;
        this.T_MATL_CTRO = t_MATL_CTRO;
        this.T_MATL_DBAS = t_MATL_DBAS;
        this.T_MATL_DEPO = t_MATL_DEPO;
        this.T_MATL_LTEC = t_MATL_LTEC;
        this.T_MATL_MAFS = t_MATL_MAFS;
        this.T_MATL_MAFS_STAT = t_MATL_MAFS_STAT;
        this.T_MATL_MEAN = t_MATL_MEAN;
        this.T_MATL_VDAS = t_MATL_VDAS;
    }

    public YMM_PA_CAD_MATL_Response() {
    }

    public TMaterial getT_MATERIAL() {
        return T_MATERIAL;
    }

    public void setT_MATERIAL(TMaterial t_MATERIAL) {
        this.T_MATERIAL = t_MATERIAL;
    }

    public void setT_MATL_AMAD(TMatlAmad t_MATL_AMAD) {
        this.T_MATL_AMAD = t_MATL_AMAD;
    }

    public void setT_MATL_CTRO(TMatlCtro t_MATL_CTRO) {
        this.T_MATL_CTRO = t_MATL_CTRO;
    }

    public void setT_MATL_DBAS(TMatlDbas t_MATL_DBAS) {
        this.T_MATL_DBAS = t_MATL_DBAS;
    }

    public void setT_MATL_DEPO(TMatlDepo t_MATL_DEPO) {
        this.T_MATL_DEPO = t_MATL_DEPO;
    }

    public void setT_MATL_LTEC(TMatlLtec t_MATL_LTEC) {
        this.T_MATL_LTEC = t_MATL_LTEC;
    }

    public void setT_MATL_MAFS(TMatlMafs t_MATL_MAFS) {
        this.T_MATL_MAFS = t_MATL_MAFS;
    }

    public void setT_MATL_MAFS_STAT(TMatlMafsStat t_MATL_MAFS_STAT) {
        this.T_MATL_MAFS_STAT = t_MATL_MAFS_STAT;
    }

    public void setT_MATL_MEAN(TMatlMean t_MATL_MEAN) {
        this.T_MATL_MEAN = t_MATL_MEAN;
    }

    public void setT_MATL_VDAS(TMatlVdas t_MATL_VDAS) {
        this.T_MATL_VDAS = t_MATL_VDAS;
    }

    public TMatlAmad getT_MATL_AMAD() {
        return T_MATL_AMAD;
    }

    public TMatlCtro getT_MATL_CTRO() {
        return T_MATL_CTRO;
    }

    public TMatlDbas getT_MATL_DBAS() {
        return T_MATL_DBAS;
    }

    public TMatlDepo getT_MATL_DEPO() {
        return T_MATL_DEPO;
    }

    public TMatlLtec getT_MATL_LTEC() {
        return T_MATL_LTEC;
    }

    public TMatlMafs getT_MATL_MAFS() {
        return T_MATL_MAFS;
    }

    public TMatlMafsStat getT_MATL_MAFS_STAT() {
        return T_MATL_MAFS_STAT;
    }

    public TMatlMean getT_MATL_MEAN() {
        return T_MATL_MEAN;
    }

    public TMatlVdas getT_MATL_VDAS() {
        return T_MATL_VDAS;
    }
}