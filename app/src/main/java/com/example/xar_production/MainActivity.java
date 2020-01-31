package com.example.xar_production;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class MainActivity extends AppCompatActivity implements RestaurantAdapter.OnItemClickListener{


    private ImageView imageView;
    private EditText serachText;
    //private DatabaseReference muserdatabase;



    private RestaurantAdapter adapter;
    private RecyclerView mRecyclerrrview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mRecyclerrrview = findViewById(R.id.cycleView);
        mRecyclerrrview.setHasFixedSize(true);
        mRecyclerrrview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<Model> options =
                new FirebaseRecyclerOptions.Builder<Model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("restaurants"), Model.class)
                        .build();

        adapter = new RestaurantAdapter(options);
        adapter.setClickListener(this);
        mRecyclerrrview.setAdapter(adapter);


    }


    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    public void onItemClick(Model model) {
        Intent intent=new Intent(getApplicationContext(),SelectService.class);
        intent.putExtra("AppbarTitle",model.getName());
        ///intent.putStringArrayListExtra("lambda",Model.);
        startActivity(intent);
    }


}
