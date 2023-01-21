public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
//check if both are smiling
if(aSmile){
if(bSmile){
return true;
}
}
if(!aSmile){
if(!bSmile){
return true;
}
}
return false;
}
