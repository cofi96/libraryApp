/**
 * 
 */

(function() {

	'use strict';

	angular.module('app').controller('BookController', BookController);

	BookController.$inject = ['$http'];

	function BookController($http) {
		var vm = this;
		
		vm.books = [];
		vm.getAll=getAll;
		vm.deleteBook=deleteBook;
		vm.addBook=addBook;
		init();
		
		
		
		function init() {
			getAll();
		}


		function getAll() {
			var url = "/book/all";
			var request = $http.get(url);

			request.then(function(response) {
				vm.books = response.data;
			});

		}
		
		function deleteBook(id){
			var url = "/book/delete/" + id;
			
			
			$http.post(url).then(function(response){
				
				vm.books=response.data;
			});
		}
		
		function addBook(name, autor,price) {
			
    		return $http({
        		method : 'POST',
        		url : '/book/create',
        		data : {
            		bookName : name,
            		autor: autor,
					price : price
        		}
   			}).then(function(response){
				vm.books=response.data;
			});
			
		}

	}


})();

