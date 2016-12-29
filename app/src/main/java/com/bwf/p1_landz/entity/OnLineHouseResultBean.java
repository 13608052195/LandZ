package com.bwf.p1_landz.entity;



import java.util.List;

/**
 * Created by cao_ye on 2016/7/19 0019.
 * Description:
 */
public class OnLineHouseResultBean{

    public List<HouseArrBean> houseArr;
    public List<HouseOneArrBean> houseOneArr;

    @Override
    public String toString() {
        return "OnLineHouseResultBean{" +
                "houseArr=" + houseArr +
                ", houseOneArr=" + houseOneArr +
                '}';
    }
}
