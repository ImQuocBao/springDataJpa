package com.example.spingdatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.spingdatajpa.entity.*;

public interface MayBayReponsitory extends JpaRepository<MayBay, Long> {

  // 2.Cho biết các loại máy bay có tầm bay lớn hơn 10,000km
  @Query(value = "select * from maybay where TamBay > 10000", nativeQuery = true)
  public List<MayBay> lstMaybayThan10K();

  // 7. Có bao nhiêu loại máy báy Boeing.
  @Query(value = "select count(*) from maybay where loai like 'Boeing%'", nativeQuery = true)
  public int countMayBayLikeBoeing();

  // 11. Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái
  @Query(value = "select mb.mamb from nhanvien nv JOIN chungnhan cn on nv.MaNV = cn.manv Join maybay mb on mb.MaMB = cn.MaMB where nv.ten like 'nguyen%' ", nativeQuery = true)
  public List<String> findMaMBUsedByNguyen();

  // 13. Cho biết các loại máy bay có thể thực hiện chuyến bay VN280
  @Query(value = "select * from maybay where TamBay >= 11979", nativeQuery = true)
  public List<MayBay> lstCBByVN280();
}
