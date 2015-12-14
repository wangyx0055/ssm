
package com.saic.ticket.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.saic.ticket.util.AjaxObj;

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
    @ResponseBody
    public AjaxObj loginValidate(){
        
        AjaxObj ajaxObj = new AjaxObj();
        ajaxObj.setObj(AjaxObj.SUCCESS);
      return ajaxObj;
        
    }

}
