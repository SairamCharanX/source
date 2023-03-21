public int dateFashion(int you, int date) {
int result = 0;
if(you<=2 || date<=2){
result = 0;
}
else if(you>=8 ||date>=8){
result = 2;
}
else
result = 1;

return result;
}
