/**
 * 
 */
app.controller('EmployeeController',['$scope',function($scope,EmployeeService)
		{
	
	
	$scope.addemployee=function(employee)
	{
		alert("Sucessfull")
		console.log(employee)
	
	EmployeeService.addemployee(employee).then(function(response)
			{
		alert("Sucessfull")
		console.log(response.data)
		console.log(response.status)
		
			},function(response)
			{
				console.log(response.data)
				alert("Unsucessfull")
			})
	}
		}])
	
		