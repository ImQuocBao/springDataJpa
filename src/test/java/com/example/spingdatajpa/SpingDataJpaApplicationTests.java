package com.example.spingdatajpa;

import com.example.spingdatajpa.repository.ChuyenBayRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpingDataJpaApplicationTests {

    @Autowired
    ChuyenBayRepository chuyenBayRepository;

    @Test
    void cau1DaD() {
        chuyenBayRepository.lstDad()
                .forEach(e -> {
                    System.out.println(e.toString());
                });
    }

}
