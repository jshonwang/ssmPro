package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.entity.Detail;
import com.ssm.service.DetailService;

@Controller
public class DetailAboutController {
	@Autowired
	private DetailService ds;
	Detail detail;
	@RequestMapping("/")
	public String toInsertInfo(){
		return "InsertInfo";
	}
	@RequestMapping("/detail")
	public String getDetailInfo(Model model,String username){
		detail = ds.getDetailService("����");
		model.addAttribute("DetailInfo", detail);
		System.out.println(detail.getDetail());
		return "index";
		
	}
	@RequestMapping("/save")
	public String saveInfo(Model model,Detail detail){
		if(ds.SaveInfo(detail)==1){
			model.addAttribute("meg", "�ö����Ѿ����ڣ���ȷ��");
			return "index";
		}
		if(ds.SaveInfo(detail)==2)
		model.addAttribute("meg", "�������ݳɹ�");
		return "index";
	}

}
