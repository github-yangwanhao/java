package cn.yangwanhao.bookshop.common.pojo.order;

import java.io.Serializable;
import java.util.Date;

public class PayRecord implements Serializable {
    private Long id;

    private Long userId;

    private Long orderId;

    private String orderNo;

    private Integer type;

    private Long money;

    private String alipayTransactionNum;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public String getAlipayTransactionNum() {
        return alipayTransactionNum;
    }

    public void setAlipayTransactionNum(String alipayTransactionNum) {
        this.alipayTransactionNum = alipayTransactionNum == null ? null : alipayTransactionNum.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}