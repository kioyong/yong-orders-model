package com.yong.orders.model.base;

import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.*;

import java.util.Date;


/**
 * Created by yong.a.liang on 6/22/2017.
 */
@Getter
@Setter
public class BaseEntity {
    @CreatedDate
    protected Date createdDate;
    @LastModifiedDate
    protected Date lastModifiedDate;
    @CreatedBy
    protected String createdBy;
    @LastModifiedBy
    protected String lastModifiedBy;
    protected Boolean isActive;


}
