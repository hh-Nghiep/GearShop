package com.example.gearshop;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Bt7Activity extends AppCompatActivity {
    ListView lvDanhSach;
    ArrayList <SinhVien> dataSV = new ArrayList<>();
    CustomAdapter_SV adapter_SV;
    EditText editHoTen, editNgaySinh, editMaSV;
    RadioButton radNam, radNu;
    Button btnThem, btnXoa, btnSua, btnThoat, btnChonHet, btnBoChon, btnXoaDS;

    SinhVien sinhVien = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bt7);
        setControl();
        setEvent();
    }

    private void setEvent(){
        KhoiTao();
        adapter_SV = new CustomAdapter_SV(this, R.layout.bt8, dataSV);
        lvDanhSach.setAdapter(adapter_SV);
        lvDanhSach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                sinhVien = dataSV.get(i);
                Toast.makeText(Bt7Activity.this, (String)"Tên: "+sinhVien.getName(), Toast.LENGTH_LONG).show();
                ChonSinhVien();
                CheckBox cbChon = (CheckBox) view.findViewById(R.id.cbChon);
                cbChon.setSelected(true);
            }
        });



        lvDanhSach.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                dataSV.remove(i);
                adapter_SV.notifyDataSetChanged();
                return false;
            }
        });

        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ThemDL();
            }
        });

        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int z = dataSV.size();
                for(int i = 0 ; i<dataSV.size() ; ){
                    if(dataSV.get(i).getSelect()){
                        dataSV.remove(i);
                    }else{
                        i++;
                    }
                }
                if(dataSV.isEmpty()){
                    ArrayList<SinhVien> data_temp = new ArrayList<>();
                    dataSV.clear();
                    dataSV.addAll(data_temp);
                }
                adapter_SV.notifyDataSetChanged();
            }
        });

        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sinhVien.setId(editMaSV.getText().toString());
                sinhVien.setName(editHoTen.getText().toString());
                sinhVien.setDayofbirth(editNgaySinh.getText().toString());
                sinhVien.setGender(radNam.isChecked());
                adapter_SV.notifyDataSetChanged();
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        btnChonHet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChonHet();
            }
        });

        btnBoChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BoChon();
            }
        });

        btnXoaDS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XoaDS();
            }
        });
    }

    private void ChonSinhVien() {
        editMaSV.setText(sinhVien.getId());
        editHoTen.setText(sinhVien.getName());
        editNgaySinh.setText(sinhVien.getDayofbirth());
        if(sinhVien.getGender()){
            radNam.setChecked(true);
        }else{
            radNu.setChecked(true);
        }
    }

    private void ThemDL() {
        SinhVien sv = new SinhVien();
        sv.setId(editMaSV.getText().toString());
        sv.setName(editHoTen.getText().toString());
        sv.setDayofbirth(editNgaySinh.getText().toString());
        sv.setGender(radNam.isChecked());
        dataSV.add(sv);
        adapter_SV.notifyDataSetChanged();
    }

    public void ChonHet(){
        for(SinhVien sv:dataSV){
            sv.setSelect(true);
        }
        adapter_SV.notifyDataSetChanged();
    }

    public void BoChon(){
        for(SinhVien sv:dataSV){
            sv.setSelect(false);
        }
        adapter_SV.notifyDataSetChanged();
    }

    public void XoaDS(){
        ArrayList<SinhVien> data_temp = new ArrayList<>();
        for(SinhVien sv:dataSV){
            if(!sv.getSelect()){
                data_temp.add(sv);
            }
        }
        dataSV.clear();
        dataSV.addAll(data_temp);
        adapter_SV.notifyDataSetChanged();
    }

    private void KhoiTao(){
        dataSV.add(new SinhVien("SV01", "Nguyễn Văn A", "12/12/2000", true, false));
        dataSV.add(new SinhVien("SV01", "Nguyễn Văn B", "12/12/2000", false, false));
        dataSV.add(new SinhVien("SV01", "Nguyễn Văn C", "12/12/2000", true, false));
    }


    private void setControl(){
        lvDanhSach = findViewById(R.id.lvDanhSach);
        editMaSV = findViewById(R.id.editMaSV);
        editHoTen = findViewById(R.id.editHoTen);
        editNgaySinh = findViewById(R.id.editNgaySinh);
        radNam = findViewById(R.id.radNam);
        radNu = findViewById(R.id.radNu);
        btnThem = findViewById(R.id.btnThem);
        btnXoa = findViewById(R.id.btnXoa);
        btnSua = findViewById(R.id.btnSua);
        btnThoat = findViewById(R.id.btnThoat);
        btnChonHet = findViewById(R.id.btnChonHet);
        btnBoChon = findViewById(R.id.btnBoChon);
        btnXoaDS = findViewById(R.id.btnXoaDS);

    }
}