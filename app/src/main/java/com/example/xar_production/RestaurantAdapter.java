package com.example.xar_production;



import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.squareup.picasso.Picasso;



public class RestaurantAdapter extends FirebaseRecyclerAdapter<Model, RestaurantAdapter.PastViewHolder> {

    OnItemClickListener onItemClickListener;
    public interface OnItemClickListener {
        void onItemClick(Model model);
    }



    public RestaurantAdapter(@NonNull FirebaseRecyclerOptions<Model> options) {
        super(options);
    }



    public void setClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener=onItemClickListener;
    }


    @Override
    protected void onBindViewHolder(@NonNull PastViewHolder holder, int i, @NonNull Model post) {
        holder.dishes.setText(post.getDishes());
        holder.name.setText(post.getName());
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/xarproduction.appspot.com/o/1st.jpeg?alt=media&token=36671639-38f9-4ade-9c11-b1328f4b598c").into(holder.image);
        //holder.author.setText(post.getAuthor());








    }

    @NonNull
    @Override
    public PastViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);
        return new PastViewHolder(view,onItemClickListener);
    }

    class PastViewHolder extends RecyclerView.ViewHolder{

        TextView dishes,name;
        ImageView image;

        public PastViewHolder(@NonNull View itemView, final OnItemClickListener onItemClickListener ) {
            super(itemView);
            dishes = itemView.findViewById(R.id.dishDetails);
            name = itemView.findViewById(R.id.restaurantName);
            image = itemView.findViewById(R.id.imageView);
            //author = itemView.findViewById(R.id.author);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    onItemClickListener.onItemClick(getSnapshots().get(getAdapterPosition()));


                }
            });


        }
    }
}
