public class MainActivity extends AppCompatActivity implements View.OnClickViewListener {

  Button button;
  EditText mEditText;
  //REALITY

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity_layout);
    
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    
    button = (Button) findViewById(R.id.button);
    mEditText = (EditText) findViewById(R.id.edit_text);
    
    button.setOnClickListener(this);
    
  }
  
  @Override
  public void onClick(View view) {
    //revised conditional
    if(view.getId() == R.id.button) {
      String tempText = mEditText.getString().toString();
      Toast.makeText(getActivty(), tempText, Toast.LENGTH_SHORT).show();
    }
  }
  
  
}
    
    
    
