package agie.poly.homestay.controller;

import agie.poly.homestay.repository.HoaDonRepository;
import agie.poly.homestay.repository.UserRepository;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nguyen Danh Luong on 8/4/2020.
 * @created 04/08/2020
 * @project poly-homestay-mai-la-ae
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private HoaDonRepository hoaDonRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/receipt")
    public String receiptView(Model model){
        model.addAttribute("receipts",this.hoaDonRepository.findAll(Sort.by(Sort.Direction.DESC,"dateBooking")));
        return "/admin/receipt";
    }

    @GetMapping("/user")
    public String userView(Model model){
        model.addAttribute("users", this.userRepository.findAll(Sort.by(Sort.Direction.ASC,"id")));
        return "admin/user";
    }
}
