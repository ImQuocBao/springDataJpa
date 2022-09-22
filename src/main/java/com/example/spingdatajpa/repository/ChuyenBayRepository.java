package com.example.spingdatajpa.repository;

import com.example.spingdatajpa.entity.ChuyenBay;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
    // 1. Cho biết các chuyến bay đi Đà Lạt (DAD)
    @Query(value = "select * from chuyenbay where GaDen ='DaD'", nativeQuery = true)
    public List<ChuyenBay> lstDad();

    // 4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn
    // 8.000km.
    @Query(value = "select * from chuyenbay where dodai > 8000 and dodai < 10000", nativeQuery = true)
    public List<ChuyenBay> lstCBBy10kand8k();
}
