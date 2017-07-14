package com.yong.orders.model;

import com.yong.orders.model.base.BaseEntity;
import org.springframework.data.annotation.Id;

/**
 * Created by yong.a.liang on 7/14/2017.
 */
public class DepartmentGroup extends BaseEntity {

    @Id
    private String id;
    private String name;
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DepartmentGroup{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
