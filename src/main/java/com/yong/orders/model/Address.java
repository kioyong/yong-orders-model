package com.yong.orders.model;

import lombok.*;

/**
 * Created by yong.a.liang on 6/21/2017.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String add;
    private String location;
    private String country;
}
