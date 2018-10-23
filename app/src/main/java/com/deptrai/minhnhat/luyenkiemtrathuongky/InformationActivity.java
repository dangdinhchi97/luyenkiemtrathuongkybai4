package com.deptrai.minhnhat.luyenkiemtrathuongky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        Student student= (Student) bundle.getSerializable("student");

        Bundle bundle1 = new Bundle();
        bundle1.putSerializable("student", student);
        FragmentInformation frag= new FragmentInformation();
        frag.setArguments(bundle1);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, frag).commit();
    }
}
