package top.newforesee.dao;


import top.newforesee.bean.CityCountBean;
import top.newforesee.bean.networkType;

import java.util.List;

/**
 * xxx
 * creat by newforesee 2019/1/21
 */
public interface INetworkImpl {
   void saveToDB(List<networkType> beans);
}
