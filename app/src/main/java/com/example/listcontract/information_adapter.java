package com.example.listcontract;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class information_adapter extends BaseAdapter {
    Context mycontext;
    int  mylayout;
    List<information> mylist;
    public information_adapter(Context context, int layout, List<information> list){
            mycontext=context;
            mylayout=layout;
            mylist=list;
    }
    @Override
    public int getCount() {
        return mylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) mycontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(mylayout,null);
        TextView txtname=(TextView)view.findViewById(R.id.hoten);
        TextView txtphone=(TextView)view.findViewById(R.id.phone);
        ImageView imgview1=(ImageView)view.findViewById(R.id.imageView2);
        ImageView imgview2=(ImageView)view.findViewById(R.id.imageView3);

        txtname.setText(mylist.get(i).name);
        txtphone.setText(mylist.get(i).phonenumber);
        imgview1.setImageResource(mylist.get(i).myimg);
        imgview2.setImageResource(mylist.get(i).myimg1);









        return view;
    }
}
