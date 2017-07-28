package sg.com.yuno.yunoapp.ui.signin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.os.Build;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ProgressBar;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import sg.com.yuno.yunoapp.R;
import sg.com.yuno.yunoapp.data.DataManager;
import sg.com.yuno.yunoapp.ui.base.BasePresenter;

/**
 * Created by teckwuong on 9/7/17.
 */

public class SignInPresenter extends BasePresenter<SignInMvpView> {

    private final DataManager mDataManager;

    @Inject
    public SignInPresenter(DataManager dataManager) {
        mDataManager = dataManager;
    }

    @Override
    public void attachView(SignInMvpView mvpView) {
        super.attachView(mvpView);
    }

    @Override
    public void detachView() {
        super.detachView();
    }

    public void onLoad() {
        checkViewAttached();



    }

    public void attemptLogin() {
        // do sign in
        getMvpView().showSignInSuccessful();
    }

}
