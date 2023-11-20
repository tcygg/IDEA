package com.msb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: TcYgg
 * @Date: 2023/11/20 - 11 - 20 - 18:04
 * @Description: com.msb.pojo
 * @version: 1.0
 */

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Dept implements Serializable {
        private Integer deptno;
        private String dname;
        private String loc;


    }

