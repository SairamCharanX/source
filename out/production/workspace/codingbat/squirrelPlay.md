public boolean squirrelPlay(int temp, boolean isSummer) {
boolean flag = false;
if(!isSummer){
if(temp>=60 && temp<=90)
flag = true;
}
else{
if(temp>=60 && temp<=100){
flag = true;
}
}
return flag;
}
