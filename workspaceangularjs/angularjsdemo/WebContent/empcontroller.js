/**
 * 
 */
app.controller('EmployeeController',function($scope,EmployeeService)
		{
	$scope.addEmployee=function(employee)
	console.log(employee)
	EmployeService.addemployee(employee)
		})