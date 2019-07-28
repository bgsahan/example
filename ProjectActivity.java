public class ProjectActivity extends Activity {

  int projectId;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstaneState)
    setContentView(R.layout.project_activity_layout);
    
    Intent incomingIntent = getIntent();
    projectId = incomingIntent.getIntExtra(MainRecyclerViewAdapter.EXTRA_PROJECT_ID);
    
    //TODO: Check related project id from Room Database and bring related data. Singleton should be used?
    
    //TODO: Implement RecyclerView
    
  }
}
