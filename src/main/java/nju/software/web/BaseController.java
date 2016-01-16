package nju.software.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lab on 16-1-16.
 */
@Controller
public class BaseController {


    @RequestMapping(name = "/base.do" , method = RequestMethod.GET)
    public String base(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        return "home";
    }

}
