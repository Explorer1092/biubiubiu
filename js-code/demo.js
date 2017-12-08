var casper = require('casper').create();
casper.start('http://www.baidu.com');

casper.then(function() {
    this.echo('获取title: ' + this.getTitle());
});

casper.run();