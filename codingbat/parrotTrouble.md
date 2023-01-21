public boolean parrotTrouble(boolean talking, int hour) {
if(hour < 7 || hour > 20){
if(talking){
return true;
}
}
return false;
}
