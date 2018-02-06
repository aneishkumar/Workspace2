package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niit.dao.EmployeeDao;

@Controller
public class controller {
	@Autowired
	EmployeeDao employeedao;
	@RequestMapping(value="addemployee")
	public @ResponseBody employee addemployee(@RequestBody Employee employee)
	{
		employeedao.addemployee(employee);
		
	}

}
