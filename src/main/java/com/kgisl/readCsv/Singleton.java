package com.kgisl.readCsv;

 class GFG 
{
  // public instance initialized when loading the class
  private static final GFG instance = new GFG();
 
  private GFG()
  {
    // private constructor
  }
  public static GFG getInstance(){
        return instance;
    }
}
public class Singleton {
    public static void main(String[] args) {
     
      System.out.println( GFG.getInstance());
      System.out.println( GFG.getInstance());
      System.out.println( GFG.getInstance());
      

    }
}
