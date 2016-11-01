package qiaofei.com.tenthousandhour.injector.moudle;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import java.io.IOException;
import javax.inject.Singleton;
import qiaofei.com.tenthousandhour.base.MyApp;
import qiaofei.com.tenthousandhour.injector.scopes.ContextLife;
import qiaofei.com.tenthousandhour.utils.cacheutils.ACache;
import qiaofei.com.tenthousandhour.utils.cacheutils.DiskLruCacheHelper;

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

  @Provides @Singleton public ACache getAcache(Context context) {
    return ACache.get(context);
  }

  @Provides @Singleton public DiskLruCacheHelper getDiskLruCacheHelper(Context context) {
    DiskLruCacheHelper diskLruCacheHelper = null;
    try {
      diskLruCacheHelper = new DiskLruCacheHelper(context);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return diskLruCacheHelper;
  }
}
