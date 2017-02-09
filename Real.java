//SINGLETON
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
 
 
 //WRITE FILE
 private final String FILENAME = "testfile.txt";
  
 public void writeFile(ArrayList<Projekt> arrayList){
  try{
    FileOutputStream fileOutputStream = getActivity().openFileOutput(FILENAME, Context.PRIVATE_CONTEXT);
    fileOutputStream.write(....);
    fileOutputStream.close();
   }
  catch(java.io.IOException e){
    Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
   }
  }
  
    
  
  
  
  
  
  
  
  
  
  
  
}
