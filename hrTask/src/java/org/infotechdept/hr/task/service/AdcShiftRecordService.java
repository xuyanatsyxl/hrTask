package org.infotechdept.hr.task.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.infotechdept.hr.system.ADCException;
import org.infotechdept.hr.system.HrUtils;
import org.infotechdept.hr.task.dao.AdcShiftApplyMapper;
import org.infotechdept.hr.task.dao.AdcShiftGroupEmplMapper;
import org.infotechdept.hr.task.dao.AdcShiftPatternDetailMapper;
import org.infotechdept.hr.task.dao.AdcShiftPatternMapper;
import org.infotechdept.hr.task.dao.AdcShiftRecordMapper;
import org.infotechdept.hr.task.model.AdcShiftApply;
import org.infotechdept.hr.task.model.AdcShiftApplyExample;
import org.infotechdept.hr.task.model.AdcShiftGroupEmpl;
import org.infotechdept.hr.task.model.AdcShiftGroupEmplExample;
import org.infotechdept.hr.task.model.AdcShiftPattern;
import org.infotechdept.hr.task.model.AdcShiftPatternDetail;
import org.infotechdept.hr.task.model.AdcShiftPatternDetailExample;
import org.infotechdept.hr.task.model.AdcShiftRecord;
import org.infotechdept.hr.task.model.AdcShiftRecordExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdcShiftRecordService {
	
	@Autowired
	private AdcShiftApplyMapper adcShiftApplyMapper;
	@Autowired
	private AdcShiftPatternMapper adcShiftPatternMapper;
	@Autowired
	private AdcShiftPatternDetailMapper adcShiftPatternDetailMapper;
	@Autowired
	private AdcShiftRecordMapper adcShiftRecordMapper;
	@Autowired
	private AdcShiftGroupEmplMapper adcShiftGroupEmplMapper;
	
	private String findGroupIdByEmpid(Long empid){
		AdcShiftGroupEmplExample example = new AdcShiftGroupEmplExample();
		example.createCriteria().andEmpidEqualTo(empid);
		List<AdcShiftGroupEmpl> items = adcShiftGroupEmplMapper.selectByExample(example);
		//if (items.size() > 0)
		return null;
	}
	
	/**
	 * 根据指定的规律班次id返回班次的明细
	 * @param patternId
	 * @return
	 * @throws ADCException
	 */
	private List<AdcShiftPatternDetail> findPatternDetailByPatternId(String patternId) throws ADCException{
		AdcShiftPatternDetailExample example = new AdcShiftPatternDetailExample();
		example.createCriteria().andPatternIdEqualTo(patternId);
		example.setOrderByClause("position_id asc");
		List<AdcShiftPatternDetail> items = adcShiftPatternDetailMapper.selectByExample(example);
		if (items.size() == 0){
			throw new ADCException("没有找到编号为[" + patternId + "]的规律班次明细");
		}else{
			return items;
		}
	}
	
	/**
	 * 根据班次应用id查找排班初始化记录
	 * 以最后一次排班为准 order by rec_id desc
	 * @param applyId
	 * @return
	 */
	private AdcShiftRecord findRecordByApplyId(Long applyId){
		AdcShiftRecordExample example = new AdcShiftRecordExample();
		example.createCriteria().andApplyIdEqualTo(applyId);
		example.setOrderByClause("order by rec_id desc");
		List<AdcShiftRecord> items = adcShiftRecordMapper.selectByExample(example);
		if (items.size() > 0){
			return items.get(0);
		}
		return null;
	}
	
	
	private Map findPattern(Long empid){
		Map<String, Object> rsltMap = new HashMap<String, Object>();
		
		AdcShiftApplyExample adcShiftApplyExample = new AdcShiftApplyExample();
		adcShiftApplyExample.createCriteria().andEmpidEqualTo(empid);
		List<AdcShiftApply> applyItems = adcShiftApplyMapper.selectByExample(adcShiftApplyExample);
		if (applyItems.size() > 0){
			AdcShiftApply adcShiftApply = applyItems.get(0);
			AdcShiftRecord adcShiftRecord = findRecordByApplyId(adcShiftApply.getApplyId());
			if (!HrUtils.isEmpty(adcShiftRecord)){
				rsltMap.put("adcshiftapply", adcShiftApply);
				rsltMap.put("adcshiftrecord", adcShiftRecord);
				return rsltMap;
			}
		}
		return null;
	}
	
	private AdcShiftPattern findPattern(String groupId){
		AdcShiftApplyExample adcShiftApplyExample = new AdcShiftApplyExample();
		adcShiftApplyExample.createCriteria().andGroupIdEqualTo(groupId);
		List<AdcShiftApply> applyItems = adcShiftApplyMapper.selectByExample(adcShiftApplyExample);
		return null;
	}

	/**
	 * 现在我该上什么班呢？
	 * 返回指定人员当前所属的规律班次
	 * @param empid
	 * @return
	 */
	public AdcShiftPattern findAdcShiftPatternByEmpid(Long empid){
		
		return null;
	}

}
