package com.example.spingdatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.spingdatajpa.entity.*;

public interface NhanVienReponsitory extends JpaRepository<NhanVien, String> {

  // 3. Tìm các nhân viên có lương nhỏ hơn 10,000.
  @Query(value = "select * from nhanvien where luong < 10000", nativeQuery = true)
  public List<NhanVien> findEmpsBySalaryLT10000();

  // 8. Cho biết tổng số lương phải trả cho các nhân viên..
  @Query(value = "select sum(luong) as luong from nhanvien ", nativeQuery = true)
  public Long sumOfSalaryPaidEmp();

  // 9. Cho biết mã số của các phi công lái máy báy Boeing.
  @Query(value = "select nv.manv from nhanvien nv JOIN chungnhan cn on nv.MaNV = cn.manv Join maybay mb on mb.MaMB = cn.MaMB where mb.Loai like 'Boeing%' group by nv.MaNV, nv.Ten", nativeQuery = true)
  public List<String> findPilotInBoeing();

  // 10. Cho biết các nhân viên có thể lái máy bay có mã số 747
  @Query(value = "select * from nhanvien nv JOIN chungnhan cn on nv.MaNV = cn.manv Join maybay mb on mb.MaMB = cn.MaMB where mb.mamb=747", nativeQuery = true)
  public List<NhanVien> findEmpCanFlyWith747();

  // 12. Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus
  @Query(value = "SELECT * FROM nhanvien WHERE MaNV In (select cn.MaNV from chungnhan cn inner join maybay mb on mb.MaMB = cn.MaMB where mb.Loai like '%Airbus%' or mb.Loai like '%Boeing%')", nativeQuery = true)
  public List<NhanVien> findNameEmpCanUseBoeAndAir();

  // 15. Cho biết tên của các phi công lái máy bay Boeing\
  @Query(value = "select nv.Ten from maybay mb join chungnhan cn on mb.mamb = cn.MaMB join nhanvien nv on cn.MaNV = nv.MaNV where mb.loai like 'boeing%' group by nv.ten, nv.manv", nativeQuery = true)
  public List<String> findNameEmpUseBoeing();

}
