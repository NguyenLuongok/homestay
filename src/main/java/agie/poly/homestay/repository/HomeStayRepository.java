package agie.poly.homestay.repository;

import agie.poly.homestay.entity.HomeStay;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Nguyen Danh Luong on 8/2/2020.
 * @created 02/08/2020
 * @project poly-homestay-mai-la-ae
 */
public interface HomeStayRepository extends JpaRepository<HomeStay,Long> {
    Page<HomeStay> findAll(Pageable pageable);
    Page<HomeStay> findAllBy(Pageable pageable);
}
