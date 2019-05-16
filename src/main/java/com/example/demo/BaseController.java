/**
 * 
 */
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author sowndhariyanandarajkumar
 *
 */

@Controller
public class BaseController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
		 
	        
        return "index";
    }
	
	@RequestMapping(value= "/charts", method = RequestMethod.GET)
	public String charts() {
	    return "charts";
	}

	
	@RequestMapping(value= "/dashboard", method = RequestMethod.GET)
	public String dashboard() {
	    return "dashboard";
	}
	
	
	@RequestMapping(value= "/faq", method = RequestMethod.GET)
	public String faq() {
	    return "faq";
	}
	
	@RequestMapping(value= "/info", method = RequestMethod.GET)
	public String info() {
	    return "info";
	}
	
	@RequestMapping(value= "/notes", method = RequestMethod.GET)
	public String notes() {
	    return "notes";
	}

	
	@RequestMapping(value= "/tables", method = RequestMethod.GET)
	public String tables() {
	    return "tables";
	}
	 

}
