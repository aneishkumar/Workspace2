package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niit.dao.EmployeeDao;
import com.niit.model.Employee;

@Controller
public class controller {
	@Autowired
	EmployeeDao employeedao;
	@RequestMapping(value="addemployee")
	public @ResponseBody void addemployee(@RequestBody Employee employee)
	{
		employeedao.addEmployee(employee);
		
	}

}
