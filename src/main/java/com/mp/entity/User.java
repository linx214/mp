package com.mp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
}
