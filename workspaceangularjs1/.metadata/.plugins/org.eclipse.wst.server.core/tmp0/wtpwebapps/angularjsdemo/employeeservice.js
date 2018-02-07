/**
 * 
 */
app.factory('EmployeeService',function($https){
	var employeeservice={}
	employeeservice.addemployee=function(employee){
		
	
	return $https.post("http:\\localhost:8088\demo\addemployee",employee)
}
return employeeservice
})