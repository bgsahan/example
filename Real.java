public class Singleton{
 
  private static Singleton mInstance = null;
  private String mExample;
  
  private Singleton(){
    }
  
  public static Singleton getInstance(){
    if(mInstance == null){
      mInstance = new Singleton();
      }
    return mInstance;
    }
  
  public String getExample(){
    return this.mExample;
    }
  
  public String setExample(String value){
    mExample = value;
    }
  
    
  
  
  
  
  
  
  
  
  
  
  
}
