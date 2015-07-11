package com.stv.trieucse.nhacsan.Fragments;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;

import com.stv.trieucse.nhacsan.ButtonAwesome;
import com.stv.trieucse.nhacsan.MainActivity;
import com.stv.trieucse.nhacsan.PlayActivity;
import com.stv.trieucse.nhacsan.R;
import com.stv.trieucse.nhacsan.TextAwesome;
import com.stv.trieucse.nhacsan.VideoActivity;

public class FragmentHome1 extends Fragment implements View.OnClickListener {
    View view;
    ButtonAwesome btnplaymp3,btnplayvideo;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("NhacSan.tv");
        btnplaymp3=(ButtonAwesome)view.findViewById(R.id.playmusic);
        btnplaymp3.setOnClickListener(this);
        btnplayvideo=(ButtonAwesome)view.findViewById(R.id.playvideo);
        btnplayvideo.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        if(v== btnplaymp3)
        {
            Intent intent = new Intent(view.getContext(), PlayActivity.class);
//            EditText editText = (EditText) findViewById(R.id.edit_message);
//            String message = editText.getText().toString();
//            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
       else if(v== btnplayvideo)
        {
            Intent intent = new Intent(view.getContext(), VideoActivity.class);
//            EditText editText = (EditText) findViewById(R.id.edit_message);
//            String message = editText.getText().toString();
//            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
    }
}

