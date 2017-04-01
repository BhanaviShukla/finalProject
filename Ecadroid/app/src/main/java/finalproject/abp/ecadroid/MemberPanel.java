package finalproject.abp.ecadroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MemberPanel extends AppCompatActivity {
    public static final String CATEGORY = "finalproject.abp.ecadroid.CATEGORY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_panel);
    }

    public void councilLogin(View view){
        //intent, to bind the two activities, current and the one to be opened, on runtime, w.r.t context, i.e. the button
        Intent intent = new Intent(this, LoginActivity.class); //Intent takes two parameters (context, Class)
        String category = "council";
        intent.putExtra(CATEGORY, category);
        startActivity(intent);
    }

    public void presidentLogin(View view){
        Intent intent = new Intent(this, LoginActivity.class); //Intent takes two parameters (context, Class)
        String category = "president";
        intent.putExtra(CATEGORY, category);
        startActivity(intent);
    }

    public void memberLogin(View view){
        Intent intent = new Intent(this, LoginActivity.class); //Intent takes two parameters (context, Class)
        String category = "member";
        intent.putExtra(CATEGORY, category);
        startActivity(intent);
    }

    public void noLogin(View view){

    }
}
