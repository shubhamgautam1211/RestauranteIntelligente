package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View view,view2;
    ImageView imageview2;
    TextView email,password,textView3,textView4;
    Button login,signup;
    String email1,password1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        password=(TextView)findViewById(R.id.password);
        email=(TextView)findViewById(R.id.email);
        login=(Button)findViewById(R.id.login);
        signup=(Button)findViewById(R.id.signup);
        view2=(View)findViewById(R.id.view2);
        view=(View)findViewById(R.id.view);
        imageview2=(ImageView)findViewById(R.id.imageView2);
        textView3=(TextView)findViewById(R.id.textView3);
        textView4=(TextView)findViewById(R.id.textView4);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email1 = email.getText().toString();
                password1 = password.getText().toString();
                if (email1.equals("ROHIT")) {
                    if(password1.equals("ADMIN")) {

                       openhomepage();
                    }
                    if(!password1.equals("ADMIN")){
                        Toast.makeText(MainActivity.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
                    }
                }
                if (password1.equals("ADMIN")){
                    if (!email1.equals("ROHIT")){
                        Toast.makeText(MainActivity.this, "Incorrect EMAIL", Toast.LENGTH_SHORT).show();
                    }
                }
                if (!password1.equals("ADMIN") && !password1.equals("STAFF")){
                    if (!email1.equals("ROHIT") && !email1.equals("STAFF")){
                        Toast.makeText(MainActivity.this, "Incorrect EMAIL And PASSWORD", Toast.LENGTH_SHORT).show();
                    }
                }
                if (password1.equals("STAFF")){
                    if (email1.equals("STAFF")){
                        Toast.makeText(MainActivity.this, "Home Page Of Staff is in Progress !!!", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Contact Customer Care : 9996467850", Toast.LENGTH_LONG).show();
            }
        });

        }
        public void openhomepage()
        {
            view.animate().translationY(3000).setDuration(2000).setStartDelay(10);
            view2.animate().translationY(3000).setDuration(2000).setStartDelay(10);
            imageview2.animate().translationY(3000).setDuration(2000).setStartDelay(10);
            textView3.animate().translationY(3000).setDuration(2000).setStartDelay(10);
            textView4.animate().translationY(3000).setDuration(2000).setStartDelay(10);
            email.animate().translationY(-3000).setDuration(2000).setStartDelay(10);
            password.animate().translationY(-3000).setDuration(2000).setStartDelay(10);
            login.animate().translationY(-3000).setDuration(2000).setStartDelay(10);
            signup.animate().translationY(-3000).setDuration(2000).setStartDelay(10);
            new Handler() .postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity.this,Home_Page.class);
                    startActivity(intent);
                    finish();

                }

            },1000);
        }

}