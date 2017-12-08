var request = require("request");

var options = { method: 'GET',
    url: 'http://www.baidu.com',
    qs: { limit: '10', offset: '0' },
    headers:
        {authorization: 'bearer JTcoaH3dLulA94qqpHndwTrKJXD4lI' } };

request(options, function (error, response, body) {
    if (error) throw new Error(error);

    console.log(body);
});
