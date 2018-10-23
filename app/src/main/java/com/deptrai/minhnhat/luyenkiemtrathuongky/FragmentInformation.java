package com.deptrai.minhnhat.luyenkiemtrathuongky;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentInformation extends Fragment {
    private TextView lblTen, lblDiachi, lblEmail, lblNamsinh;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_information,container,false);

        lblTen = (TextView) view.findViewById(R.id.lbl_Ten);
        lblDiachi = (TextView) view.findViewById(R.id.lbl_Diachi);
        lblEmail = (TextView) view.findViewById(R.id.lbl_Email);
        lblNamsinh = (TextView) view.findViewById(R.id.lbl_Namsinh);

        Bundle bundle =this.getArguments();
        Student student= (Student) bundle.getSerializable("student");
        lblTen.setText(student.getTen());
        lblNamsinh.setText(student.getNamsinh()+"");
        lblDiachi.setText(student.getDiachi());
        lblEmail.setText(student.getEmail());
        return view;
    }
}
