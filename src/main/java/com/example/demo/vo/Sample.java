package com.example.demo.vo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Sample {
    private String property1;
    private LocalDate requestDate;
    private int count;
}
