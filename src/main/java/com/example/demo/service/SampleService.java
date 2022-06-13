package com.example.demo.service;

import com.example.demo.vo.Sample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SampleService {
    public void submit(Sample sample) {
        log.info("Sample received: {}", sample);
        throw new RuntimeException("Hey Dude! some error");
    }
}
