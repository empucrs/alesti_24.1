public class Main{

  public static void main(String args[]){
	  
	long antesN, depoisN;
	long antesM, depoisM;

    for(int n=10_000; n<80_000; n+=1_000){
	  antesN = System.nanoTime();
	  antesM = System.currentTimeMillis();
      int valor = fB(n);
      depoisN = System.nanoTime();
	  depoisM = System.currentTimeMillis();
      System.out.println(n+";"+valor+";"+(depoisN-antesN)+";"+(depoisM-antesM));
	}
  }

  public static int fA(int n){
    int cont=0;
    for(int i=0; i<n; i++)
      cont++;
    return cont;
  }

  public static int fB(int n){
    int cont=0;
    for(int i=0; i<n; i++)
      for(int j=i; j<2*i; j++)
        cont++;
    return cont;
  }

  public static int fC(int n){
    int cont=0;
	for (int i=0; i < n; i++)
	  for (int j=i; j < 2*i; j++)
	    cont++;
    return cont;
  }

  public static int fD(int n){
    int cont=0;
	for (int i=1; i < n; i=i+i)
	  cont++;
    return cont;
  }

  public static int fE(int n){
    int cont=0;
	for (int i=1; i < n; i++)
	  for (int j=1; j < n; j=j+j)
	    cont++;
    return cont;
  }

  public static int fF(int n){
    int cont=0;
	for (int i=0; i < n; i++)
	  for (int j=0; j < n; j++)
	    for (int k=0; k < n; k++)
	      cont++;
    return cont;
  }

  public static int fG(int n){
    int cont=0;
	for (int i=0; i < n; i++)
	  for (int j=i; j < i+2; j++)
	    for (int k=0; k < n; k++)
		  cont++;
    return cont;
  }

}
