package com.andro.ijang.basades;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmen1_Dasboard extends Fragment {

    /*private Button buttonSatu;*/


    public Fragmen1_Dasboard() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment1_dashboard, container, false);

        CardView btnMoney=(CardView) view.findViewById(R.id.money);
        CardView btnListrik=(CardView) view.findViewById(R.id.listrik);
        CardView btnVoucher=(CardView) view.findViewById(R.id.kuota);
        btnMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenmoney=new Intent(getActivity(),Activity_Money.class);
                startActivity(intenmoney);
            }
        });
        btnListrik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenlistrik=new Intent(getActivity(),Activity_Listrik.class);
                startActivity(intenlistrik);
            }
        });
        btnVoucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenvoucher=new Intent(getActivity(),Activity_Voucherinternet.class);
                startActivity(intenvoucher);
            }
        });

        return view;
    }

}