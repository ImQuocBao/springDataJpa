package com.example.spingdatajpa;

import com.example.spingdatajpa.repository.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpingDataJpaApplicationTests {

    @Autowired
    ChuyenBayRepository chuyenBayRepository;
    @Autowired
    MayBayReponsitory mayBayReponsitory;
    @Autowired
    NhanVienReponsitory nhanVienReponsitory;

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

    @Test
    void cau3NhanVien() {
        nhanVienReponsitory.findEmpsBySalaryLT10000().forEach(System.out::println);
    }

    @Test
    void cau4ChuyenBay() {
        chuyenBayRepository.lstCBBy10kand8k().forEach(System.out::println);
    }

    @Test
    void cau5ChuyenBay() {
        chuyenBayRepository.lstCBBySGNToBMV().forEach(System.out::println);
    }

    @Test
    void cau6ChuyenBay() {
        System.out.println("so chuyen bay : " + chuyenBayRepository.lstCBBySGN());
    }

    @Test
    void cau7MayBay() {
        System.out.println("so maybay boeing : " + mayBayReponsitory.countMayBayLikeBoeing());
    }

    @Test
    void cau8NhanVien() {
        System.out.println("so lương của nhân viên : " + nhanVienReponsitory.sumOfSalaryPaidEmp());
    }

}
