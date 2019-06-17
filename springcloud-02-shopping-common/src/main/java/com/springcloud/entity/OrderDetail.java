package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ORDER_DETAIL���Ӧ��ʵ���࣬���ڷ�װһ�ж�����ϸ��Ϣ
 * 
 * @author �λۻ�
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail implements java.io.Serializable {

	private static final long serialVersionUID = -569452398984381835L;

	/**
	 * ������ϸ���
	 */
	private Integer orderDetailId;

	/**
	 * �������
	 */
	private Integer orderId;

	/**
	 * ��Ʒ���
	 */
	private Integer goodsId;

	/**
	 *  ��Ʒ����
	 */
	private String goodsName;

	/**
	 * �ɽ���
	 */
	private Double transactionPrice;

	/**
	 * �ɽ�����
	 */
	private Integer transactionCount;

}