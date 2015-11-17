package org.infotechdept.hr.task.hr.service.impl;

import java.util.Map;

import org.infotechdept.hr.task.dao.AdcShiftSchedulingMapper;
import org.infotechdept.hr.task.dao.DeptemplMapper;
import org.infotechdept.hr.task.dao.EmployeeMapper;
import org.infotechdept.hr.task.hr.service.HrStafferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HrStaffcerServiceImpl implements HrStafferService {
	
	@Autowired
	private AdcShiftSchedulingMapper adcShiftSchedulingMapper;
	@Autowired
	private EmployeeMapper employeeMapper;
	@Autowired
	private DeptemplMapper deptemplMapper;

	public Map procHrStaffer(Map stafferMap) {

		return null;
	}

}
