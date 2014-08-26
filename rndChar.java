class RandomCharacter{

public static char rndChar(){

int rnd=(int)(Math.random()*52);
char base=(rnd<26)?'a':'A';
return (char)(base+rnd%26);
  }
 }