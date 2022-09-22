package com.example.spingdatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.spingdatajpa.entity.*;

public interface NhanVienReponsitory extends JpaRepository<NhanVien, String> {

  // 3. Tìm các nhân viên có lương nhỏ hơn 10,000.
  @Query(value = "select * from nhanvien where luong < 10000", nativeQuery = true)
  public List<NhanVien> findEmpsBySalaryLT10000();

}
