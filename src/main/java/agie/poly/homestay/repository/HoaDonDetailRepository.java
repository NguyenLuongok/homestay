package agie.poly.homestay.repository;

import agie.poly.homestay.entity.ChiTietHoaDon;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Nguyen Danh Luong on 8/2/2020.
 * @created 02/08/2020
 * @project poly-homestay-mai-la-ae
 */
public interface HoaDonDetailRepository extends JpaRepository<ChiTietHoaDon,Long> {
}
