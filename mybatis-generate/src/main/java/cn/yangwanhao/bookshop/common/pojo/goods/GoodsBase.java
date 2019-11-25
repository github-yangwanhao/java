package cn.yangwanhao.bookshop.common.pojo.goods;

import java.io.Serializable;
import java.util.Date;

public class GoodsBase implements Serializable {
    private Long id;

    private Integer status;

    private Long price;

    private Integer stock;

    private Integer category;

    private Long goodsVersion;

    private Long goodsBuyVersion;

    private Date createTime;

    private Long creator;

    private Date updateTime;

    private Long mender;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Long getGoodsVersion() {
        return goodsVersion;
    }

    public void setGoodsVersion(Long goodsVersion) {
        this.goodsVersion = goodsVersion;
    }

    public Long getGoodsBuyVersion() {
        return goodsBuyVersion;
    }

    public void setGoodsBuyVersion(Long goodsBuyVersion) {
        this.goodsBuyVersion = goodsBuyVersion;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getMender() {
        return mender;
    }

    public void setMender(Long mender) {
        this.mender = mender;
    }
}