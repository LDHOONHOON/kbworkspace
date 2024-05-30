// import, export 키워드 사용하기 위해서는
// 1) 확장자를 mjs로 사용하거나,
// 2) package.json에 "type" : "moduels" 설정 추가할 것
import getBase, { add } from './02-20-module';

console.log(add(4));
