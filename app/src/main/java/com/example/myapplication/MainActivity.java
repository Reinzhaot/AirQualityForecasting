package com.example.myapplication;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Welcome(View view) {
        Toast.makeText(this, "欢迎来到安卓世界", Toast.LENGTH_SHORT).show();
    }
}

