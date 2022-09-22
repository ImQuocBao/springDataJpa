package com.example.spingdatajpa;

import com.example.spingdatajpa.repository.ChuyenBayRepository;
import com.example.spingdatajpa.repository.MayBayReponsitory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpingDataJpaApplicationTests {

    @Autowired
    ChuyenBayRepository chuyenBayRepository;
    @Autowired
    MayBayReponsitory mayBayReponsitory;

    @Test
    void cau1DaD() {
        chuyenBayRepository.lstDad()
                .forEach(e -> {
                    System.out.println(e.toString());
                });
    }

    @Test
    void cau2MayBay() {
        mayBayReponsitory.lstMaybayThan10K().forEach(System.out::println);
    }

}
