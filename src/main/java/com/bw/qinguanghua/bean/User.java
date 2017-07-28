package com.bw.qinguanghua.bean;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by 秦光华 on 2017/7/28.
 */
@Entity
@Table(name="user")
@Data
public class User {
    @Id
    @GeneratedValue(generator = "Generator")
    @GenericGenerator(name="Generator",strategy = "identity")
    private int id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private int age;
    @Column
    private int sex;
    @Column
    private String headphoto;
    @Column
    private String hobby;

}
