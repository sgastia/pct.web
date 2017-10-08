///////////////////////////////////////////////////////////////////////////////////
//Controller

function indexCtrl($scope, serv) {
    $scope.message = "Hola angular";
    
    ///////////////////////////////////////////
    //Cargar todo
    var loadConciertos = function () {
        serv.getConciertos(
            function (conciertos) {
                $scope.conciertos = conciertos.coleccion;
            }
        );
    };
    
    var loadIntegrantes = function () {
        serv.getIntegrantes(
            function (integrantes) {
                $scope.integrantes = integrantes.coleccion;
            }
        );
    };
    
    var loadVideos = function () {
        serv.getVideos(
            function (videos) {
                $scope.videos = videos.coleccion;
            }
        );
    };

    //$scope.loadConciertos = loadConciertos;
    loadConciertos();
    loadIntegrantes();
    loadVideos();
    
    /////////////////////////////////////////////////////////////////////////////////////////////
    
    $scope.showIntegrantes = function(){
    	$scope.message = "ver integrantes";
    	$scope.showSeccionConciertos = false;
    	$scope.showSeccionIntegrantes = true;
    	$scope.showSeccionVideos = false;
    }
    
    $scope.showConciertos = function(){
    	$scope.message = "ver conciertos";
    	$scope.showSeccionConciertos = true;
    	$scope.showSeccionIntegrantes = false;
    	$scope.showSeccionVideos = false;
    }
    
    $scope.showVideos = function(){
    	$scope.message = "ver videos";
    	$scope.showSeccionConciertos = false;
    	$scope.showSeccionIntegrantes = false;
    	$scope.showSeccionVideos = true;
    }
    
    $scope.selectConcierto = function(idConcierto){
    	alert("Id concierto: " + idConcierto);
    }

    ///////////////////////////////////////////
    //Paging
    var setPaging = function (currentPage) {
        $scope.pagingSettings = {
            currentPage: currentPage,
            offset: 0,
            pageLimit: MAX_ROWS,
            pageLimits: ['5', '10', '50', '100']
        };
    }
    setPaging(0);

}
