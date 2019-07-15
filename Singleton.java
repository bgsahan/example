//SINGLETON
public class Singleton {
  private static Singleton mInstance = null;
  private ArrayList<Project> mProjectList;
  
  private Singleton(){
  }
  
  public static Singleton getInstance() {
    if (mInstance == null){
      mInstance = new Singleton();
    }
    return mInstance;
  }
  
  public String getProjectList(){
    return this.mProjectList;
  }
  
  public String setProjectList(ArrayList<Project> projectList){
    mProjectList = projectList;
  }
}
    
