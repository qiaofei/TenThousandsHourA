package qiaofei.com.tenthousandhour.injector.moudle;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import qiaofei.com.tenthousandhour.base.MyApp;
import qiaofei.com.tenthousandhour.injector.scopes.ContextLife;

/**
 * Created by QiaoFei on 2016/6/7.
 */

@Module public class AppModule {
  private MyApp myApp;

  public AppModule(MyApp myApp) {
    this.myApp = myApp;
  }

  @Provides @Singleton @ContextLife("Application") public Context provideContext() {
    return myApp.getApplicationContext();
  }
}
