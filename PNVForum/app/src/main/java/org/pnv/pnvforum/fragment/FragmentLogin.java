package org.pnv.pnvforum.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.pnv.pnvforum.R;
import org.pnv.pnvforum.activity.Main;
import org.pnv.pnvforum.utils.Utils;

/**
 * Created by Sonhv on 3/11/2016.
 */
public class FragmentLogin extends Fragment {

    private Activity activity;

    public void setUp(Activity activity){
        this.activity = activity;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.layout_login, container, false);

        TextView tvLoginRegister = (TextView) view.findViewById(R.id.tv_login_register);
        tvLoginRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.smoothToRegister(activity);
            }
        });

        Button btnLogin = (Button) view.findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // check login

                Intent main = new Intent(activity, Main.class);
                startActivity(main);
            }
        });

// control view here
        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
