(function() {
    'use strict';

    angular
        .module('webuiApp')
        .factory('PasswordResetInit', PasswordResetInit);

    PasswordResetInit.$inject = ['$resource'];

    function PasswordResetInit($resource) {
        var service = $resource('auth/api/account/reset_password/init', {}, {});

        return service;
    }
})();
