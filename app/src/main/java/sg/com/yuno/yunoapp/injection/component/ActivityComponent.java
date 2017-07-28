package sg.com.yuno.yunoapp.injection.component;

import dagger.Subcomponent;
import sg.com.yuno.yunoapp.injection.PerActivity;
import sg.com.yuno.yunoapp.injection.module.ActivityModule;
import sg.com.yuno.yunoapp.ui.main.MainActivity;
import sg.com.yuno.yunoapp.ui.signin.SignInActivity;
import sg.com.yuno.yunoapp.ui.signup.SignUpActivity;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

    void inject(SignInActivity signInActivity);

    void inject(SignUpActivity signUpActivity);

}
