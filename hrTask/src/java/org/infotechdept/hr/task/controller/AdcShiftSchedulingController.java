package org.infotechdept.hr.task.controller;

import java.util.Date;

import org.infotechdept.hr.task.service.AdcShiftSchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/adcshift/scheduling")
public class AdcShiftSchedulingController {
	
	@Autowired
	private AdcShiftSchedulingService adcShiftSchedulingService;
	
	/**
	 * 指定人员的排班生成
	 * @param empid
	 * @param startDateStr
	 * @param endDateStr
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void addScheduling(Long empid, String startDateStr, String endDateStr){
		
	}

}
