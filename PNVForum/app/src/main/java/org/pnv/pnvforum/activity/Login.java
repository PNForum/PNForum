package org.pnv.pnvforum.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import org.pnv.pnvforum.R;
import org.pnv.pnvforum.utils.Utils;

public class Login extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_login);

        Utils.showFragmentLogin(this);
        Utils.showFragmentRegister(this);

    }

    public static boolean isSmoothRegister = false;
    @Override
    public void onBackPressed(){
        if (isSmoothRegister){
            Utils.smoothToLogin(this);
            isSmoothRegister = false;
        }
    }
}
