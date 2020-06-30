package com.blend.architecture;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.blend.architecture.eventbus.EventBusMainActivity;
import com.blend.architecture.handle_message.ActivityThreadActivity;

public class ArchitectureMainActivity extends AppCompatActivity {

    private Button handleMessage;
    private Button eventBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_architecture_main);
        handleMessage = findViewById(R.id.handleMessage);
        eventBus = findViewById(R.id.eventBus);
        handleMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArchitectureMainActivity.this, ActivityThreadActivity.class));
            }
        });
        eventBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArchitectureMainActivity.this, EventBusMainActivity.class));
            }
        });
    }
}