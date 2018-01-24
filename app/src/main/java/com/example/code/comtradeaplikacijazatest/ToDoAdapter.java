package com.example.code.comtradeaplikacijazatest;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by CODE on 1/24/2018.
 */

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder> {

    private static final String TAG = ToDoAdapter.class.getSimpleName();
    private List<Todo> toDoList;

    public ToDoAdapter(List<Todo> autoList) {
        this.toDoList = autoList;
    }

    @Override
    public ToDoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "On create view Holder");
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ToDoAdapter.ToDoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ToDoViewHolder holder, int position) {
        Todo todo = toDoList.get(position);
        Log.d(TAG, "On Bind View Holder: " + todo);
        holder.itemTextView.setText(todo.getTitle());

    }

    @Override
    public int getItemCount() {
        return toDoList.size();
    }


    public static class ToDoViewHolder extends RecyclerView.ViewHolder {
        public TextView itemTextView;


        public ToDoViewHolder(View itemView) {
            super(itemView);
            itemTextView = itemView.findViewById(R.id.item_u_listi);

        }
    }
}
