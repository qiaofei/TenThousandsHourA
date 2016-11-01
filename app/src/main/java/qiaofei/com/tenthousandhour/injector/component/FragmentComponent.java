package qiaofei.com.tenthousandhour.injector.component;

import android.app.Activity;
import android.content.Context;
import dagger.Component;
import qiaofei.com.tenthousandhour.injector.moudle.FragmentModule;
import qiaofei.com.tenthousandhour.injector.scopes.ContextLife;
import qiaofei.com.tenthousandhour.injector.scopes.PerFragment;

/**
 * Created by yuyidong on 15/11/22.
 */
@PerFragment @Component(modules = FragmentModule.class) public interface FragmentComponent {

  @ContextLife("Activity") Context getActivityContext();

  Activity getActivity();

}
