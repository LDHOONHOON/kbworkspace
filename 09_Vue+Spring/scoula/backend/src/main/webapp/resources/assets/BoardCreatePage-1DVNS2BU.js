import{b as _,a as p,u as b,c as h,r as v,d as y,j as x,o as k,e as w,f as e,w as r,v as i,h as a,k as V,l as g,q,i as B,F as C}from"./index-Deirz3vm.js";import{b as N}from"./boardApi-BhCtuu9c.js";import"./index-BMA8_isv.js";const S=e("h1",null,[e("i",{class:"fa-regular fa-pen-to-square"}),a(" 글 작성")],-1),A={class:"mb-3 mt-3"},F=e("label",{for:"title",class:"form-label"}," 제목 ",-1),M={class:"mb-3 mt-3"},R=e("label",{for:"files",class:"form-label"}," 첨부파일 ",-1),T={class:"mb-3 mt-3"},U=e("label",{for:"content",class:"form-label"}," 내용 ",-1),j={class:"my-5 text-center"},D=["disabled"],E=e("i",{class:"fa-solid fa-check"},null,-1),P=e("i",{class:"fa-solid fa-list"},null,-1),K={__name:"BoardCreatePage",setup(z){const n=_(),c=p(),u=b(),l=h(null),t=v({writer:n.username,title:"",files:null}),d=y(()=>!t.title),f=async()=>{confirm("등록할까요?")&&(l.value.files.length>0&&(t.files=l.value.files),await N.create(t),c.push("/board/list"))};return(G,s)=>{const m=x("router-link");return k(),w(C,null,[S,e("form",{onSubmit:B(f,["prevent"])},[e("div",A,[F,r(e("input",{type:"text",class:"form-control",placeholder:"제목",id:"title","onUpdate:modelValue":s[0]||(s[0]=o=>t.title=o)},null,512),[[i,t.title]])]),e("div",M,[R,e("input",{type:"file",class:"form-control",placeholder:"첨부파일",id:"files",ref_key:"files",ref:l,multiple:""},null,512)]),e("div",T,[U,r(e("textarea",{class:"form-control",placeholder:"내용",id:"content","onUpdate:modelValue":s[1]||(s[1]=o=>t.content=o),rows:"10"},null,512),[[i,t.content]])]),e("div",j,[e("button",{type:"submit",class:"btn btn-primary me-3",disabled:d.value},[E,a(" 확인 ")],8,D),V(m,{class:"btn btn-primary",to:{name:"board/list",query:q(u).query}},{default:g(()=>[P,a(" 목록 ")]),_:1},8,["to"])])],32)],64)}}};export{K as default};
