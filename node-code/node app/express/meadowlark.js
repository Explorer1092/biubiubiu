/**
 * Created by Shen on 2017/8/1.
 */
var fortune = require('./lib/fortune.js');
var express = require('express');
var app = express();

app.use(express.static(__dirname + '/public'));
//设置handlebars视图引擎
var handlebars = require('express3-handlebars')
    .create({defaultLayout: 'main'});
app.engine('handlebars', handlebars.engine);
app.set('view engine', 'handlebars');


app.set('port', process.env.PORT || 3000);

app.get('/', function (req, res) {
    res.render('home')
});

app.get('/about', function (req, res) {
    res.render('about', {fortune: fortune.getFeature()});
});




//定制404页面
app.use(function (req, res,next) {
    res.status(404);
    res.render('404');
});

//定制500页面
app.use(function (req, res) {
    console.error(err.stack);
    res.type('text/plain');
    res.status(500);
    res.render('500 ');
});
app.listen(app.get('port'), function () {
    console.log(' Express started on http://localhost:' + app.get('port') + ';press Ctrl-C to terminate.');
});

var fortunes = [
    "Conquer you fears or they will conquer you.",
    "Rivers need springs.",
    "Do not fear what you don't know.",
    "You will have a pleasant surprise.",
    "Whenever possible,keep it simple.",
];