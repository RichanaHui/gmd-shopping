package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * GOODS表对应的实体类，用于保存表中商品信息
 * 
 * @author 任慧慧
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements java.io.Serializable {

	private static final long serialVersionUID = 5550168279140722620L;

	/**
	 * 商品编号
	 */
	private Integer goodsId;

	/**
	 * 商品名称
	 */
	private String goodsName;

	/**
	 * 商品价格
	 */
	private Double goodsPrices;

	/**
	 * 商品折扣价
	 */
	private Double goodsDiscount;

	/**
	 * 商品状态：0为上架，1为下架
	 */
	private Integer goodsStatus;

	/**
	 * 商品数量
	 */
	private Integer goodsCount;

	/**
	 * 是否新品：0是新品，1不是新品
	 */
	private Integer goodsIsNew;

	/**
	 * 是否热卖：0是热卖，1不是新卖
	 */
	private Integer goodsIsHot;

	/**
	 * 商品级别：0是1星，1是2星，2是3星，3是4星，4是5星
	 */
	private Integer goodsLevel;

	/**
	 * 商品简介
	 */
	private String goodsBrief;

	/**
	 * 商品详情
	 */
	private String goodsDetails;

	/**
	 * 商品图片
	 */
	private String goodsPhoto;

	/**
	 * 二级类别编号
	 */
	private Integer class2Id;

	/**
	 * 查询条件：商品价格下限
	 */
	private Double goodsPriceMin;

	/**
	 * 查询条件：商品价格上限
	 */
	private Double goodsPriceMax;

	/**
	 * 查询条件：一级类别编号
	 */
	private Integer class1Id;

	/**
	 * 商品销售：用于保存统计分组的结果
	 */
	private Integer goodsSum;

}