package com.example.magicshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class WaresAdapter extends ArrayAdapter<Ware> {

    private List<Ware> waresList;
    private Context context;

    public WaresAdapter(@NonNull Context context, int resource, @NonNull List<Ware> wareList) {
        super(context, resource, wareList);
        this.waresList = wareList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;

        if(listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);

        Ware currentWares = waresList.get(position);
        TextView tvName = listItem.findViewById(R.id.txt_name);
        TextView tvPrice = listItem.findViewById(R.id.txt_price);
        TextView tvQuantity = listItem.findViewById(R.id.txt_quantity);
        TextView tvDescription = listItem.findViewById(R.id.txt_description);

        tvName.setText(currentWares.getName());
        tvPrice.setText(String.valueOf(currentWares.getPrice()));
        tvQuantity.setText(String.valueOf(currentWares.getQuantity()));
        tvDescription.setText(currentWares.getDescription());

        listItem.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(currentWares.getQuantity() > 0){
                    Data.ShoppingCart.add(currentWares);
                    Toast.makeText(context, "Added " + currentWares.getName(), Toast.LENGTH_LONG).show();
                    int i = currentWares.getQuantity();
                    i--;
                    currentWares.setQuantity(i);
                    notifyDataSetChanged();
                }

            }
        });


//        return super.getView(position, convertView, parent);
        return listItem;
    }
}
