'use strict';

angular.module('projectApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


