function Hello($scope, $http, $location) {
	cnpjFundo = $location.search().cnpjFundo;
	if (cnpjFundo == null) {
		alert("Informar cnpj fundo. Ex: http://localhost:8080/#/?cnpjFundo=4");
		return;
	}

	$http({
		method: 'GET',
		url: 'http://localhost:8081/fii/informes/mensal/' + cnpjFundo + '?competencia=01/2016'
	}).then(function successCallback(response) {
		$scope.retorno = response.data;
	}, function errorCallback(response) {
		alert('Falha ao chamar serviço de informe mensal FII. Response status: ' + response.status);
	});
}