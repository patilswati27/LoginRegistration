package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Login;
import model.User;
import services.UserService;

/**
 * @author swati Userlogin
 */
@Controller
public class LoginController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("login", new Login());
		return "login";

	}

	/**
	 * * Purpose: Servlet which is created for login validation in this we are
	 * validating user from database whether that user is exist in database or not
	 * if exist then user will redirect to login page else user will get error msg
	 */
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") Login login) {
		ModelAndView mav = null;
		User user = userService.validateUser(login);
		if (user != null) {
			mav = new ModelAndView("welcome");
			mav.addObject("fname", user.getFname());
		} else {
			mav = new ModelAndView("login");
			mav.addObject("message", "username or password is incorrect");
		}

		return mav;

	}

}
