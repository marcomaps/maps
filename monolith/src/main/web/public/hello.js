function Hello($scope, $http, $location) {

cnpjFundo = $location.search().fundo;

$http({
  method: 'GET',
  url: 'http://localhost:8081/fii/informes/mensal/' + cnpjFundo + '?competencia=01/2016'

}).then(function successCallback(response) {
	$scope.retorno = response.data;
  }, function errorCallback(response) {
	alert('response.status: ' + response.status);
	alert('response.statusText: ' + response.statusText);
	
  });
}