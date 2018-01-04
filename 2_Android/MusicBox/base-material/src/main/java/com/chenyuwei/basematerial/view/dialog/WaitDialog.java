package com.chenyuwei.basematerial.view.dialog;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.chenyuwei.basematerial.R;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

/**
 * Created by 93294 on 2017/1/3 0003.
 */

public class WaitDialog extends AlertDialog {

    public WaitDialog(Context context){
        super(context);

    }

    @Override
    public void show() {
        super.show();
        setContentView(R.layout.dialog_wait);
    }
}
