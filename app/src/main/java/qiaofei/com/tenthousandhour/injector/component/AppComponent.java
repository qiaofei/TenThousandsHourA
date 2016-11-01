package qiaofei.com.tenthousandhour.injector.component;

import android.content.Context;
import dagger.Component;
import javax.inject.Singleton;
import qiaofei.com.tenthousandhour.injector.moudle.AppModule;
import qiaofei.com.tenthousandhour.injector.scopes.ContextLife;
import qiaofei.com.tenthousandhour.views.main.MainPresenter;

/**
 * Created by QiaoFei on 2016/6/7.
 */
@Singleton @Component(modules = AppModule.class) public interface AppComponent {

  @ContextLife("Application") Context getContext();

  //ACache getAcache();

  //DiskLruCacheHelper getDiskLruCacheHelper();

  void inject(MainPresenter mainPresenter);
}
