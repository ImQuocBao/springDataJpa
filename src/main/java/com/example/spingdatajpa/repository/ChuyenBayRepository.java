package com.example.spingdatajpa.repository;

import com.example.spingdatajpa.entity.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChuyenBayRepository extends JpaRepository<ChuyenBay,String> {
//    1.\tCho biết các chuyến bay đi Đà Lạt (DAD)
    @Query(value = "select * from chuyenbay where GaDen ='DaD'",nativeQuery = true)
    public List<ChuyenBay> lstDad();

}
