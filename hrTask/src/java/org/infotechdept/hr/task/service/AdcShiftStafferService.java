package org.infotechdept.hr.task.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.infotechdept.hr.system.HrUtils;
import org.infotechdept.hr.system.SpringBeanLoader;
import org.infotechdept.hr.task.dao.AdcShiftStafferMapper;
import org.infotechdept.hr.task.hr.service.HrStafferService;
import org.infotechdept.hr.task.model.AdcShiftStaffer;
import org.infotechdept.hr.task.model.AdcShiftStafferExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdcShiftStafferService {

	@Autowired
	private AdcShiftStafferMapper adcShiftStafferMapper;
	
	/**
	 * 根据recordType查找adc_shift_staffer记录
	 * @param type
	 * @return
	 */
	private AdcShiftStaffer getAdcShiftStafferByRecordType(String type){
		AdcShiftStafferExample example = new AdcShiftStafferExample();
		example.createCriteria().andEnabledEqualTo("1").andRecordTypeEqualTo(type);
		List<AdcShiftStaffer> entitys = adcShiftStafferMapper.selectByExample(example);
		if (entitys.size() == 0){
			return null;
		}else{
			return entitys.get(0);
		}
	}
	
	/**
	 * 查找在adc_shift_staffer表中注册的SPRING BEAN，并调用处理传过来的参数
	 * @param stafferMap
	 * @return
	 */
	@Transactional(rollbackFor = Exception.class)
	public Map invokeBeanMethod(Map stafferMap){
		Map outMap = new HashMap<String, Object>();
		String recordType = (String) stafferMap.get("C_RECORDTYPE");
		AdcShiftStaffer item = getAdcShiftStafferByRecordType(recordType);
		if (HrUtils.isNotEmpty(item.getProcClass())){
			try{
				HrStafferService srv = (HrStafferService) SpringBeanLoader.getBean(item.getProcClass());
				srv.procHrStaffer(stafferMap);
			}catch(Exception e){
				outMap.put("success", new Boolean(false));
				outMap.put("message", e.getMessage());
			}
		}
		return outMap;
	}
	
}
