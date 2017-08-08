package com.yong.orders.model;

import com.yong.orders.annotation.NotNull;
import com.yong.orders.annotation.Unique;
import com.yong.orders.model.base.BaseEntity;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by yong.a.liang on 6/20/2017.
 */
public class User extends BaseEntity{

    @Id
    private String id;

    @NotNull(message = "User Name Can't be null!")
    private String name;
    private int age;
    private Address address;
    private List<DepartmentGroup> departmentGroupList;

    public User(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<DepartmentGroup> getDepartmentGroup() {
        return departmentGroupList;
    }

    public void setDepartmentGroup(List<DepartmentGroup> departmentGroup) {
        this.departmentGroupList = departmentGroup;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", departmentGroup=" + departmentGroupList +
                '}';
    }
}
