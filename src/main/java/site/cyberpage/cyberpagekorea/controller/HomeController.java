package site.cyberpage.cyberpagekorea.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("")
    public String getHomeBySlash(){
        System.out.println("슬래시로 접근");
        return "home";
    }

    @GetMapping("home")
    public ModelAndView getHome(ModelAndView mav) {
        System.out.println("gethome으로 접근중");

        System.out.println("홈화면 접근(겟)");
        return mav;
    }




}

