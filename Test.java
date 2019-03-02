public class Test extends Activity {
  
  TextView mTextView;
  
  protected void onCreate(Bundle savedInstanceState) {
    
    super.onCreate(savedInstanceState);
    setContentview(R.layout.main_activity_layout);
    
    mTextview = (TextView) findViewById(R.id.text_view);
    
  }
  
  public void sayHello (View view) {
    
    mTextView.setText("Hello");
    
  }
  
}

