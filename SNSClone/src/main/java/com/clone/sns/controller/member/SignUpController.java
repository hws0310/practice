package com.clone.sns.controller.member;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clone.sns.model.request.MemberRegistRequest;
import com.clone.sns.model.service.MemberRegistService;

@Controller
@RequestMapping("/signup")
public class SignUpController {
	@Resource(name="memberRegistService")
	MemberRegistService memberReigstService;
	
	@PostMapping("/signupProcess")
	public String signupProcess(MemberRegistRequest memberRegistRequest) {
		try {
			memberReigstService.insertMember(memberRegistRequest);
			return "redirect:/login";	
		}catch(Exception e){
			e.printStackTrace();
			return "";
		}
		
	}
}
