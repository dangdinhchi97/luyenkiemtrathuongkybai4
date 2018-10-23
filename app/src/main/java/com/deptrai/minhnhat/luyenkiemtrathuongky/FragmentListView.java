package com.deptrai.minhnhat.luyenkiemtrathuongky;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FragmentListView extends ListFragment {
    private List<Student> lstSinhVien;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        lstSinhVien = new ArrayList<>();
        lstSinhVien.add(new Student("1", "Đoàn Minh Nhật", R.mipmap.nhat, "TPHCM", "doanminhnhatnhat@gmail.com", 1997));
        lstSinhVien.add(new Student("2", "Nguyễn Ngọc Sơn", R.mipmap.son, "TPHCM", "nguyenngocson@gmail.com", 1997));
        lstSinhVien.add(new Student("3", "Hồ Trọng Phát", R.mipmap.phat, "TPHCM", "doanminhnhatnhat@gmail.com", 1997));
        lstSinhVien.add(new Student("4", "Hồ Thị Thu Trang", R.mipmap.trang, "TPHCM", "hotrang@gmail.com", 1997));
        lstSinhVien.add(new Student("5", "Huỳnh Thị Anh Thư", R.mipmap.thu, "TPHCM", "huynhthu@gmail.com", 1997));

        View view= inflater.inflate(R.layout.fragment_listview, container, false);
        MyAdapter adapter = new MyAdapter(getActivity(), R.layout.sinhvien_list, lstSinhVien);
        setListAdapter(adapter);

        return view;
    }
    private void openInformationActivity(Student student)
    {
        Intent intent= new Intent(getActivity(), InformationActivity.class);
        Bundle bundle= new Bundle();
        bundle.putSerializable("student", student);
        intent.putExtra("data", bundle);
        startActivity(intent);
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Student student = lstSinhVien.get(position);
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_PORTRAIT)
        {
            openInformationActivity(student);
        }else {
            FragmentInformation frg= new FragmentInformation();
            Bundle bundle = new Bundle();
            bundle.putSerializable("student",student);
            frg.setArguments(bundle);
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.containerMain, frg).commit();

        }

    }
}
