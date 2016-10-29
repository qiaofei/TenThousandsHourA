package qiaofei.com.tenthousandhour.injector.component;

import android.content.Context;
import dagger.Component;
import javax.inject.Singleton;
import qiaofei.com.tenthousandhour.injector.moudle.AppModule;
import qiaofei.com.tenthousandhour.injector.moudle.NetworkModule;
import qiaofei.com.tenthousandhour.utils.network.NetworkApi;
import qiaofei.com.tenthousandhour.injector.scopes.ContextLife;
import qiaofei.com.tenthousandhour.views.main.MainPresenter;

/**
 * Created by QiaoFei on 2016/6/7.
 */
@Singleton @Component(modules = { AppModule.class, NetworkModule.class }) public interface AppComponent {
  //void inject(LoginPresenter loginPresenter);

  @ContextLife("Application") Context getContext();

  NetworkApi getNetworkApi();

  void inject(MainPresenter mainPresenter);
}
