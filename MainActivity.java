public class MainActivity extends AppCompatActivity implements View.OnClickViewListener {

  Button button;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity_layout);
    
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    
    button = (Button) findViewById(R.id.button);
    
    button.setOnClickListener(this);
    
  }
  
  @Override
  public void onClick(View view) {
    if(view.getId() == R.id.button) {
      Toast.makeText(getActivty(), "Hello", Toast.LENGTH_SHORT).show();
    }
  }
}
    
    
    
