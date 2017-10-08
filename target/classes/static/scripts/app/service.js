function pctServ($http) {
    var conciertos;
    var integrantes;
    var videos;

    ////////////////////////////////
    //Private
    var getPromise = function (urlMetodo,datos) {
        var promise = $http({
            method: "GET",
            url: urlMetodo,
            cache:true
        });
        promise.success(
            function (data, status) {
            	datos = data.coleccion;
                return data;
            }
       );

        promise.error(
            function (data, status) {
                console.log(data, status);
                return { "status": false };
            }
        );
        return promise;
    };

    var errorCallback = function (response) {
        alert("Critical error: " + response);
    }

    
    var getGenerico = function (url,datos,successCallback) {
        if (datos == null) {
            getPromise(url,datos).then
            (
                function success(response) {
                    successCallback(response.data);
                },
                function error(response) {
                    errorCallback(response);
                }
            );
        }
        else {
            successCallback(datos);
        }
    };

    ////////////////////////////////
    //Public
    this.getConciertos = function(successCallback){
    	return getGenerico("/conciertos",conciertos,successCallback);
    };

    this.getIntegrantes = function(successCallback){
    	return getGenerico("/integrantes",integrantes,successCallback);
    };
    
    this.getVideos = function(successCallback){
    	return getGenerico("/videos",videos,successCallback);
    };

}
