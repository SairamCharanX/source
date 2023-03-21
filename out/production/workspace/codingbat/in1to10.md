public boolean in1To10(int n, boolean outsideMode) {
boolean flag = false;
if(!outsideMode){
if(n>=1 && n<=10)
flag = true;
}
else{
if(n<=1 || n>=10){
flag = true;
}
}
return flag;
}
