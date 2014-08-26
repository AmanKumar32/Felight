class test1{
public static int Return(int[][] source){
int[][] target=source;
for(int i=0,j=0;i<target.length;i++,j++){
total+=target[i][j];
}
return total;
}
}