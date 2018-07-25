package com.bing.test.jpa.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * <p>Title: User</p>
 * <p>Description: </p>
 *
 * @author bing
 * @date 2018/7/24
 * @Company 东方网力
 */
@Entity
@Table(name = "user")
@Data
public class User {
    /**
     * strategy = GenerationType.IDENTITY
     * 表示采用数据库自增长
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}
