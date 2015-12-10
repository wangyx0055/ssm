
package com.saic.ticket.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author pengqiang
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController{
    
    
    @RequestMapping("/toLogin")
    public ModelAndView toLogin(){
        
        
        return new ModelAndView("");
        
    }
    
    
    @RequestMapping("/loginValidate")
    public ModelAndView loginValidate(){
        
        
        return new ModelAndView("");
        
    }

}
