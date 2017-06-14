package com.lrcf.yhb.dao.mapper;

import com.lrcf.yhb.dao.model.StoreGoods;
import java.util.List;

public interface StoreGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_goods
     *
     * @mbggenerated Tue Jun 13 14:17:09 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_goods
     *
     * @mbggenerated Tue Jun 13 14:17:09 GMT+08:00 2017
     */
    int insert(StoreGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_goods
     *
     * @mbggenerated Tue Jun 13 14:17:09 GMT+08:00 2017
     */
    StoreGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_goods
     *
     * @mbggenerated Tue Jun 13 14:17:09 GMT+08:00 2017
     */
    List<StoreGoods> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_goods
     *
     * @mbggenerated Tue Jun 13 14:17:09 GMT+08:00 2017
     */
    int updateByPrimaryKey(StoreGoods record);
}