package agie.poly.homestay.service;

import agie.poly.homestay.entity.HomeStay;

import java.util.Date;

public interface HomeStayService {
    Iterable<HomeStay> finByAll(int adults, Date checkIn, Date checkOut, String address);
}
