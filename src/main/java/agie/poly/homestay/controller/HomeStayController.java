package agie.poly.homestay.controller;

import agie.poly.homestay.entity.HomeStay;
import agie.poly.homestay.repository.HomeStayRepository;
import agie.poly.homestay.service.HomeStayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;


@Controller
@RequestMapping("/homestay")
public class HomeStayController {
    @Autowired
    private HomeStayService homeStayService;
    @Autowired
    private HomeStayRepository homeStayRepository;
    @GetMapping("/{page}")
    public String homestay(Model model,
                           @PathVariable int page
                           ){
        Pageable pageable = PageRequest.of(page,4, Sort.by("id").ascending());
        model.addAttribute("homeStayList",homeStayRepository.findAll(pageable));
        return "index";
    }

    @GetMapping("/seach")
    public String search(@RequestParam("address")String address,
                         @RequestParam("dateIn") Date dateIn,
                         @RequestParam("dateOut") Date dateOut,
                         @RequestParam("adults")String adults,
                         Model model) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateIn);
        Iterable<HomeStay> list = homeStayService.finByAll(2,dateIn,dateOut,address);
        System.out.println(list);
        return "index";
    }

}
