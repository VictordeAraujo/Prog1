class Main{
  public static void main(String[] args){
    Quadro a= new Quadro();
    Quadro b= new Quadro();
    Quadro c= new Quadro();
    a.altura=20;
    a.largura=10;
    b.altura= a.altura+a.largura;
    c.largura= a.altura+b.largura;
    c.altura= c.altura+5;
    a.largura=3;
    a.altura=0;
    b.largura=2;
 
    System.out.println("altura= "+a.altura+" largura= "+a.largura+"\n");
    System.out.println("altura= "+b.altura+" largura= "+b.largura+"\n");
    System.out.println("altura= "+c.altura+" largura= "+c.largura+"\n");

  }
}
