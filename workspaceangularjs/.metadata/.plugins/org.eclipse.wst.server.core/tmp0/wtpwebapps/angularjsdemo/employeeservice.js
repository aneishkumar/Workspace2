/**
 * 
 */
app.factory('EmployeeService',function($https){
	var employeeservice={}
	employeeservice.addemployee=function(){
		
	
	return $https.post("http:\\localhost:8085\demo\addemployee",employee)
}
return employeeservice
})