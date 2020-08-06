package agie.poly.homestay.service;

import agie.poly.homestay.entity.HoaDon;
import agie.poly.homestay.entity.HomeStay;
import agie.poly.homestay.repository.HomeStayRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Date;

public class HomeStayServiceImpl implements HomeStayService {
    @Autowired
    private HomeStayRepository homeStayRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Iterable<HomeStay> finByAll(int adults, Date checkIn, Date checkOut, String address) {
        String query = "select hs from HomeStay as hs where hs.soNguoiLon = '"+adults+"' or hs.diaChi like '%"+address+"%'";
        TypedQuery<HomeStay> homeStayTypedQuery = entityManager.createQuery(query,HomeStay.class);
        return homeStayTypedQuery.getResultList();
    }
}
