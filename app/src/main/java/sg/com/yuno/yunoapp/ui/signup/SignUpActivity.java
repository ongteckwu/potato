package sg.com.yuno.yunoapp.ui.signup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import javax.inject.Inject;

import butterknife.ButterKnife;
import sg.com.yuno.yunoapp.R;
import sg.com.yuno.yunoapp.data.SyncService;
import sg.com.yuno.yunoapp.ui.base.BaseActivity;

/**
 * Created by teckwuong on 23/7/17.
 */

public class SignUpActivity extends BaseActivity implements SignUpMvpView {

    public static void launch(Context context) {
        Intent intent = new Intent(context, SignUpActivity.class);
        context.startActivity(intent);
    }

    @Inject
    SignUpPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);

        mPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        mPresenter.detachView();
        super.onDestroy();
    }

}
