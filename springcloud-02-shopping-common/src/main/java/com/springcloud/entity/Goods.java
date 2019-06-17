package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * GOODS���Ӧ��ʵ���࣬���ڱ��������Ʒ��Ϣ
 * 
 * @author �λۻ�
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements java.io.Serializable {

	private static final long serialVersionUID = 5550168279140722620L;

	/**
	 * ��Ʒ���
	 */
	private Integer goodsId;

	/**
	 * ��Ʒ����
	 */
	private String goodsName;

	/**
	 * ��Ʒ�۸�
	 */
	private Double goodsPrices;

	/**
	 * ��Ʒ�ۿۼ�
	 */
	private Double goodsDiscount;

	/**
	 * ��Ʒ״̬��0Ϊ�ϼܣ�1Ϊ�¼�
	 */
	private Integer goodsStatus;

	/**
	 * ��Ʒ����
	 */
	private Integer goodsCount;

	/**
	 * �Ƿ���Ʒ��0����Ʒ��1������Ʒ
	 */
	private Integer goodsIsNew;

	/**
	 * �Ƿ�������0��������1��������
	 */
	private Integer goodsIsHot;

	/**
	 * ��Ʒ����0��1�ǣ�1��2�ǣ�2��3�ǣ�3��4�ǣ�4��5��
	 */
	private Integer goodsLevel;

	/**
	 * ��Ʒ���
	 */
	private String goodsBrief;

	/**
	 * ��Ʒ����
	 */
	private String goodsDetails;

	/**
	 * ��ƷͼƬ
	 */
	private String goodsPhoto;

	/**
	 * ���������
	 */
	private Integer class2Id;

	/**
	 * ��ѯ��������Ʒ�۸�����
	 */
	private Double goodsPriceMin;

	/**
	 * ��ѯ��������Ʒ�۸�����
	 */
	private Double goodsPriceMax;

	/**
	 * ��ѯ������һ�������
	 */
	private Integer class1Id;

	/**
	 * ��Ʒ���ۣ����ڱ���ͳ�Ʒ���Ľ��
	 */
	private Integer goodsSum;

}