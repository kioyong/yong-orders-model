package com.yong.orders.model;

import com.yong.orders.model.base.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by LiangYong on 2017/8/14.
 */
@Document(collection = "orders")
public class OrdersInfo extends BaseEntity {
    private String id;
    private String cust_id;
    private String ord_date;
    private String status;
    private long amount;
    private List<Name> name;

    @Override
    public String toString() {
        return "OrdersInfo{" +
                "id='" + id + '\'' +
                ", cust_id='" + cust_id + '\'' +
                ", ord_date='" + ord_date + '\'' +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                ", name=" + name +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getOrd_date() {
        return ord_date;
    }

    public void setOrd_date(String ord_date) {
        this.ord_date = ord_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public List<Name> getName() {
        return name;
    }

    public void setName(List<Name> name) {
        this.name = name;
    }
}
