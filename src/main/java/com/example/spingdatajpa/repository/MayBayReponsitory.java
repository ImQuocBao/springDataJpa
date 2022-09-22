package com.example.spingdatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.spingdatajpa.entity.*;

public interface MayBayReponsitory extends JpaRepository<MayBay, Long> {

  // 2.Cho biết các loại máy bay có tầm bay lớn hơn 10,000km
  @Query(value = "select * from maybay where TamBay > 10000", nativeQuery = true)
  public List<MayBay> lstMaybayThan10K();

}
