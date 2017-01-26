package apanlili.uw.tacoma.edu.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class LogInActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        username = (EditText)findViewById(R.id.editText1);
        password = (EditText)findViewById(R.id.editText2);
    }




    public void login(View  view){
        if (username.getText().toString().equals("admin")
                && password.getText().toString().equals("admin") && counter > 0) {
            //correct
            Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
        } else {
            //wrong password
            if (counter > 0)
                counter--;
            Toast.makeText(getApplicationContext(), "Wrong Credentials",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
