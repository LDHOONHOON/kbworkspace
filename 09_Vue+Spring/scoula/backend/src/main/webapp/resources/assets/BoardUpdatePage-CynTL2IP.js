import{u as q,a as B,r as C,c as u,o as m,e as f,f as t,w as v,v as y,F as k,p as V,h as n,i as A,t as F}from"./index-Deirz3vm.js";import{b as p}from"./boardApi-BhCtuu9c.js";import"./index-BMA8_isv.js";const U=t("h1",null,[t("i",{class:"fa-regular fa-pen-to-square"}),n(" 글 수정")],-1),D={class:"mb-3 mt-3"},M=t("label",{for:"title",class:"form-label"}," 제목 ",-1),N=t("div",{class:"invalid-feedback"},"제목은 필수 요소입니다.",-1),R={class:"mb-3 mt-3"},S=t("label",{class:"form-label"}," 기존 첨부파일 ",-1),T=t("i",{class:"fa-solid fa-paperclip"},null,-1),E=["onClick"],I={class:"mb-3 mt-3"},L=t("label",{for:"files",class:"form-label"}," 첨부파일 ",-1),P={class:"mb-3 mt-3"},$=t("label",{for:"content",class:"form-label"}," 내용 ",-1),j=t("button",{type:"submit",class:"btn btn-primary me-3"},[t("i",{class:"fa-solid fa-check"}),n(" 확인 ")],-1),z=t("i",{class:"fa-solid fa-undo"},null,-1),G=t("i",{class:"fa-solid fa-arrow-left"},null,-1),W={__name:"BoardUpdatePage",setup(H){const c=q(),_=B(),r=c.params.no,e=C({}),i=u([]),o=u({}),d=u(null),w=()=>{_.push({name:"board/detail",params:{no:r},query:c.query})},x=async(a,l)=>{if(!confirm(l+"을 삭제할까요?"))return;await p.deleteAttachment(a);const s=i.value.findIndex(h=>h.no===a);i.value.splice(s,1)},g=async()=>{confirm("수정할까요?")&&(d.value.files.length>0&&(e.files=d.value.files),await p.update(e),_.push({name:"board/detail",params:{no:r},query:c.query}))};function b(){e.no=o.value.no,e.title=o.value.title,e.writer=o.value.writer,e.content=o.value.content,console.log(e)}return(async()=>{const a=await p.get(r);o.value={...a},i.value=a.attaches,b()})(),(a,l)=>(m(),f(k,null,[U,t("form",{onSubmit:A(g,["prevent"])},[t("div",D,[M,v(t("input",{type:"text",class:"form-control",placeholder:"제목",id:"title","onUpdate:modelValue":l[0]||(l[0]=s=>e.title=s)},null,512),[[y,e.title]]),N]),t("div",R,[S,(m(!0),f(k,null,V(i.value,s=>(m(),f("div",{key:s.no,class:"attach"},[T,n(" "+F(s.filename)+" ",1),t("i",{class:"fa-solid fa-trash-can text-danger ms-2",onClick:h=>x(s.no,s.filename)},null,8,E)]))),128))]),t("div",I,[L,t("input",{type:"file",class:"form-control",placeholder:"첨부파일",id:"files",ref_key:"files",ref:d,multiple:""},null,512)]),t("div",P,[$,v(t("textarea",{class:"form-control",placeholder:"내용",id:"content","onUpdate:modelValue":l[1]||(l[1]=s=>e.content=s),rows:"10"},null,512),[[y,e.content]])]),t("div",{class:"my-5 text-center"},[j,t("button",{type:"button",class:"btn btn-primary me-3",onClick:b},[z,n(" 취소 ")]),t("button",{class:"btn btn-primary",onClick:w},[G,n(" 돌아가기 ")])])],32)],64))}};export{W as default};
