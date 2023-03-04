package com.example.gearshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter_SV extends ArrayAdapter<SinhVien> {
    Context context;
    int resource;
    ArrayList <SinhVien> data;


    public CustomAdapter_SV(@NonNull Context context, int resource, @NonNull ArrayList <SinhVien> data) {
        super(context, resource, data);
        this.context =context;
        this.resource = resource;
        this.data = data;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(resource, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        SinhVien sv = data.get(position);
        viewHolder.tvHoTen.setText(sv.getName());
        if(sv.getGender())
            viewHolder.imGioiTinh.setImageResource(R.drawable.baseline_man_24);
        else
            viewHolder.imGioiTinh.setImageResource(R.drawable.baseline_woman_24);

//        viewHolder.cbChon.setChecked(f);
        return convertView;
    }

    private class ViewHolder {
        TextView tvHoTen;
        ImageView imGioiTinh;

        CheckBox cbChon;

        public ViewHolder(View view) {
            this.tvHoTen = view.findViewById(R.id.tvHoTen);
            this.imGioiTinh = view.findViewById(R.id.ivGioiTinh);
            this.cbChon = view.findViewById(R.id.cbChon);
        }

        public void ChonHet(){
            for(SinhVien sv:data){
                sv.setSelect(true);
            }
            notifyDataSetChanged();
        }

        public void BoChon(){
            for(SinhVien sv:data){
                sv.setSelect(false);
            }
            notifyDataSetChanged();
        }

        public void XoaDS(){
            ArrayList<SinhVien> data_temp = new ArrayList<>();
            for(SinhVien sv:data){
                if(!sv.getSelect()){
                    data_temp.add(sv);
                }
            }
            data.clear();
            data.addAll(data_temp);
            notifyDataSetChanged();
        }
    }
}
