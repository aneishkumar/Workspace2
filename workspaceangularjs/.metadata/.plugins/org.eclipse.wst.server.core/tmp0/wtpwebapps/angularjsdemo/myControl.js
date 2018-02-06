/**
 * 
 */
app.controller('myControl', function($scope) {
    $scope.firstname = "Aneish";
    $scope.lastname = "Kumar"; 
    $scope.fullName = function() {
        return $scope.firstName + " " + $scope.lastName;
    };
});