package kr.or.kmgs.website.opensite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @Autowired WebService webService;

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("carouselimgs", webService.getCarouselImages());
        model.addAttribute("mainnotice", webService.getMainNotices());
        model.addAttribute("president", webService.getPresidentInfo());
        model.addAttribute("members", webService.getMemberList());

        return "index";
    }

}
