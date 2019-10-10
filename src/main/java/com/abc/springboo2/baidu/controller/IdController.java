package com.abc.springboo2.baidu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.fsg.uid.service.UidGenService;

@RestController
@RequestMapping("/id")
public class IdController {

	@Autowired
	private UidGenService uidGenService;

	@RequestMapping("/create")
	public Long create() {
		 return uidGenService.getUid();
	}
}
