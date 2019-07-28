public class MainActivity extends Activity {

 //RecyclerView declarations
 private RecyclerView mRecyclerView;
 private MainRecyclerAdapter mMainRecyclerAdapter;
 //private final ArrayList<String> mProjectList = new ArrayList<Project>();

 //Room Database declarations
 ProjectDatabase mProjectDatabase;
  
 //Create Singleton
 Singleton singleton = Singleton.getInstance();
  
 private void onCreate(Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);
   setContentView(R.layout.main_activity_layout);
  
   //Room Database initialising & building
   mProjectDatabase = Room.databaseBuilder(getApplicationContext(), ProjectDatabase.class, "PROJECT_DATABASE").build();

   //Custom method for loading all Room Database projects using LiveData
   loadAllProjects();
   
   mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

   // Create an RecyclerView adapter and supply the data to be displayed.
   mAdapter = new MainRecyclerAdapter(this, singleton.getProjectList());

   // Connect the adapter with the recycler view.
   mRecyclerView.setAdapter(mAdapter);

   // Give the recycler view a default layout manager.
   mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

   //TODO:Add FAB for project add

   //TODO: Add Toolbar and Options Menu 

 }

 //Custom method for loading all Room Database projects using LiveData
 private void loadAllProjects() {
   mProjectDatabase.daoAcces().loadAllProjects().observe(this, new Observer<List<Project>>() {
     @Override
     public void onChanged(@Nullable List<Project> projectList) {
       singleton.setProjectList(projectList);
       mAdapter.mProjectList = singleton.getProjectList(); //why is this needed?
       mAdapter.notifyDatasetChanged();
      //Comment: maybe we should take the 2 lines above out of this method inyo onCreate? Because we are doing 2 things here. but notifOnDataSetChanged would work then?
      
     }

   });

 }

}


       


   


   

