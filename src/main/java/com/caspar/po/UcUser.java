package com.caspar.po;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Data
@Accessors(chain = true)
@Table(name = "`uc_user`")
public class UcUser {
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

}