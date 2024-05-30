fs = require('fs');

fs.readFile (
    './02_NODE.JS/chapter03/sec03/example.txt',
    'utf-8',(err,data) => {
        if (err) {
            console.log(err);
        }
    }