package com.yong.orders.model;

import com.yong.orders.annotation.NotNull;
import com.yong.orders.annotation.Unique;
import com.yong.orders.model.base.BaseEntity;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by yong.a.liang on 6/20/2017.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity{

    @Id
    private String id;

    @NotNull(message = "User Name Can't be null!")
    @Unique(message = "name already exists!")
    private String name;
    private int age;
    private Address address;
    private List<DepartmentGroup> departmentGroupList;

}
