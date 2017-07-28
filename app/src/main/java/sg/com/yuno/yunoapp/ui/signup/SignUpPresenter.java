package sg.com.yuno.yunoapp.ui.signup;

import javax.inject.Inject;

import sg.com.yuno.yunoapp.data.DataManager;
import sg.com.yuno.yunoapp.ui.base.BasePresenter;
import sg.com.yuno.yunoapp.ui.signin.SignInMvpView;

/**
 * Created by teckwuong on 23/7/17.
 */

public class SignUpPresenter extends BasePresenter<SignUpMvpView> {

    private final DataManager mDataManager;
    @Inject
    public SignUpPresenter(DataManager dataManager) {
        mDataManager = dataManager;
    }

    @Override
    public void attachView(SignUpMvpView mvpView) {
        super.attachView(mvpView);
    }

    @Override
    public void detachView() {
        super.detachView();
    }
}
