import{b as f,a as _,u as p,c as b,r as h,d as v,j as x,o as y,e as k,f as e,w as i,v as r,h as a,k as w,l as V,i as g,F as B}from"./index-JrWJ8MT6.js";import{b as C}from"./boardApi-RTm42h4g.js";import"./index-BmvlXOwq.js";const N=e("h1",null,[e("i",{class:"fa-regular fa-pen-to-square"}),a(" 글 작성")],-1),S={class:"mb-3 mt-3"},A=e("label",{for:"title",class:"form-label"}," 제목 ",-1),F={class:"mb-3 mt-3"},M=e("label",{for:"files",class:"form-label"}," 첨부파일 ",-1),R={class:"mb-3 mt-3"},T=e("label",{for:"content",class:"form-label"}," 내용 ",-1),U={class:"my-5 text-center"},j=["disabled"],q=e("i",{class:"fa-solid fa-check"},null,-1),D=e("i",{class:"fa-solid fa-list"},null,-1),I={__name:"BoardCreatePage",setup(E){const n=f(),c=_();p();const l=b(null),t=h({writer:n.username,title:"",files:null}),d=v(()=>!t.title),u=async()=>{confirm("등록할까요?")&&(l.value.files.length>0&&(t.files=l.value.files),await C.create(t),c.push("/board/list"))};return(P,s)=>{const m=x("router-link");return y(),k(B,null,[N,e("form",{onSubmit:g(u,["prevent"])},[e("div",S,[A,i(e("input",{type:"text",class:"form-control",placeholder:"제목",id:"title","onUpdate:modelValue":s[0]||(s[0]=o=>t.title=o)},null,512),[[r,t.title]])]),e("div",F,[M,e("input",{type:"file",class:"form-control",placeholder:"첨부파일",id:"files",ref_key:"files",ref:l,multiple:""},null,512)]),e("div",R,[T,i(e("textarea",{class:"form-control",placeholder:"내용",id:"content","onUpdate:modelValue":s[1]||(s[1]=o=>t.content=o),rows:"10"},null,512),[[r,t.content]])]),e("div",U,[e("button",{type:"submit",class:"btn btn-primary me-3",disabled:d.value},[q,a(" 확인 ")],8,j),w(m,{class:"btn btn-primary",to:{name:"board/list"}},{default:V(()=>[D,a(" 목록 ")]),_:1})])],32)],64)}}};export{I as default};
