package sg.com.yuno.yunoapp.test.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import sg.com.yuno.yunoapp.injection.component.ApplicationComponent;
import sg.com.yuno.yunoapp.test.common.injection.module.ApplicationTestModule;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}
