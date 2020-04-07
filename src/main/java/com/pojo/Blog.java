package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createdAt;
    private int views;
}
