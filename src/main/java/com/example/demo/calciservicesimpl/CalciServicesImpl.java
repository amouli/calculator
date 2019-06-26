package com.example.demo.calciservicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.calcidao.CalciDao;
import com.example.demo.calcientity.CalciEntity;
import com.example.demo.calciservices.CalciServices;

@Service
public class CalciServicesImpl implements CalciServices {
	
	@Autowired
	private CalciDao calciDao;
	
	@Autowired
	private CalciEntity calcientity;

	@Override
	public Integer additionOperation(Integer value1, Integer value2) 
	{
		calcientity.setValue1(value1);
		calcientity.setValue2(value2);
		calcientity.setTotal(value1+value2);
		calciDao.save(calcientity);
		return value1+value2;
		
	}

	public Integer subtractionOperation(Integer value1, Integer value2) {
		calcientity.setValue1(value1);
		calcientity.setValue2(value2);
		calcientity.setTotal(value1-value2);
		calciDao.save(calcientity);
		return value1-value2;
	}

	public Integer multiplicationOperation(Integer value1, Integer value2) {
		calcientity.setValue1(value1);
		calcientity.setValue2(value2);
		calcientity.setTotal(value1-value2);
		calciDao.save(calcientity);
		return value1*value2;
	}

	public Integer divisionOperation(Integer value1, Integer value2) {
		calcientity.setValue1(value1);
		calcientity.setValue2(value2);
		calcientity.setTotal(value1-value2);
		calciDao.save(calcientity);
		return value1/value2;
	}

}
