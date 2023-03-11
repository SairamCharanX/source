public boolean posNeg(int a, int b, boolean negative) {
boolean flag = false;
if(negative){
if(a<0 && b<0)
flag = true;
}
else{
if(a*b<0){
flag = true;
}
else
flag = false;
}
return flag;
}
