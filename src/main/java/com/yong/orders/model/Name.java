package com.yong.orders.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Created by LiangYong on 2017/8/14.
 */
@Data
@Builder
public class Name {
    private String firstName,lastName,type;
    }
