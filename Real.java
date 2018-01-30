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
 
 
 //WRITE FILE. Problem: Context: Activity? get.Activity(): context?
 private final String FILENAME = "testfile.txt";
 ArrayList<Project> projectArrayList;
  
 public void writeFile(ArrayList<Projekt> arrayList){
  try{
    FileOutputStream fileOutputStream = getActivity().openFileOutput(FILENAME, Context.PRIVATE_CONTEXT);
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeInt(arrayList.size());
    for(Projekt p:arrayList)
      objectOutStream.writeObject(p);
    objectOutStream.close();
    fileOutputStream.close();
   }
  catch(java.io.IOException e){
    Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
   }
  }
  
  
//READ FILE
public ArrayList<Project> readFile(){
  FileInputStream fileInputStream = openFileInput(FILENAME);
  ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
  projectArrayList = (ArrayList<Projekt> objectInputStream.readObject();  
  return projectArrayList;
                      
//test branch
  
  
  
  }
  
  
  
    
  
}
