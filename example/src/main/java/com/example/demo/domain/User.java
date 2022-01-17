package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@TableName("tb_user")
public class User {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private String address;
}