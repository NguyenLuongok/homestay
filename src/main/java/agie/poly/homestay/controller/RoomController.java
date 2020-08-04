package agie.poly.homestay.controller;

import agie.poly.homestay.repository.HomeStayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nguyen Danh Luong on 8/2/2020.
 * @created 02/08/2020
 * @project poly-homestay-mai-la-ae
 */
@Controller
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private HomeStayRepository homeStayRepository;

    @GetMapping(value = {"", "/"})
    public String room(Model model, @PageableDefault(size = 2,sort = "id",direction = Sort.Direction.ASC) Pageable pageable){
        model.addAttribute("page",homeStayRepository.findAll(pageable));
        return "rooms";
    }

    @GetMapping("/room-detail/{id}")
    public String roomDetail(@PathVariable Long id, Model model){
        model.addAttribute("room", homeStayRepository.findById(id).get());
        return "room-details";
    }

    @GetMapping("/booking")
    public String boocking(){
        return "booking";
    }
}
