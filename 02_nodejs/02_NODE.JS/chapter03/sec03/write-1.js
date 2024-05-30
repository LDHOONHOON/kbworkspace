fs = require('fs');

const data = fs.readFileSync(
  './02_NODE.JS/chapter03/sec03/example.txt',
  'utf-8'
); //   인코딩 지정
fs.writeFileSync('./text-1 txt', data);
