package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niit.dao.EmployeeDao;
import com.niit.model.Employee;

@Controller
public class controller {
	@Autowired
	EmployeeDao employeedao;
	@RequestMapping(value="/addemployee",method=RequestMethod.POST)
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee){//employee object in JSON from Http Request body
		System.out.println("BEFORE INSERTING " + employee.getEid());
		try{
		employeedao.addEmployee(employee);//new employee details entered in the form
		}catch(Exception e){
		    	ErrorClazz error=new ErrorClazz(2,"Unable to insert employee details...some fiels are null");
		    	return new ResponseEntity<ErrorClazz>(error, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		System.out.println("AFTER INSERTING " +employee.getEid());
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}

}
