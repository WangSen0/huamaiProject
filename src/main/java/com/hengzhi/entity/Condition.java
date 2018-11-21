package com.hengzhi.entity;

public class Condition {

    /*
       实现条件查询的实体类（根据日期时间，车号，品种，供货单位，出入库，注意查询出来后要有分页）
     */
    private String pinZhong;//品种
    private String gongHuoDanWei;//供货单位
    private String cheHao;//车号
    private String riQiShiJian;//日期时间
    private String chuRuKu;//出入库

    public String getPinZhong() {
        return pinZhong;
    }

    public void setPinZhong(String pinZhong) {
        this.pinZhong = pinZhong;
    }

    public String getGongHuoDanWei() {
        return gongHuoDanWei;
    }

    public void setGongHuoDanWei(String gongHuoDanWei) {
        this.gongHuoDanWei = gongHuoDanWei;
    }

    public String getCheHao() {
        return cheHao;
    }

    public void setCheHao(String cheHao) {
        this.cheHao = cheHao;
    }

    public String getRiQiShiJian() {
        return riQiShiJian;
    }

    public void setRiQiShiJian(String riQiShiJian) {
        this.riQiShiJian = riQiShiJian;
    }


    public String getChuRuKu() {
        return chuRuKu;
    }

    public void setChuRuKu(String chuRuKu) {
        this.chuRuKu = chuRuKu;
    }
}
