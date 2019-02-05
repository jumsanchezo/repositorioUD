/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var x="";
var y="";
var q="";
var f;
function num(c){
    x=x+c;
    entero=parseInt(x);
    bin=entero.toString(2);
    document.getElementById("texto").value=bin;
}
function sum(){
    y=parseInt(x);
    document.getElementById("texto").value=q;
    x="";
    f=1;
}
function res(){
    y=parseInt(x);
    document.getElementById("texto").value=q;
    x="";
    f=2;
}
function mul(){
    y=parseInt(x);
    document.getElementById("texto").value=q;
    x="";
    f=3;
}
function div(){
    y=parseInt(x);
    document.getElementById("texto").value=q;
    x="";
    f=4;
}
function igual(){
    if(f==1){
      r=parseInt(x)+parseInt(y);
      r=r.toString(2);
      document.getElementById("texto").value=r;  
    }
    if(f==2){
        r=parseInt(y)-parseInt(x);
        r=r.toString(2);
      document.getElementById("texto").value=r;
    }
    if(f==3){
        r=parseInt(x)*parseInt(y);
        r=r.toString(2);
      document.getElementById("texto").value=r;  
    }
    if(f==4){
        r=parseInt(y)/parseInt(x);
        r=r.toString(2);
      document.getElementById("texto").value=r;  
    }
}
