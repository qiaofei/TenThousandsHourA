package qiaofei.com.tenthousandhour.base;

import android.support.annotation.NonNull;

/**
 * Created by yuyidong on 15/11/13.
 */
public interface IPresenter {

    /**
     * 注入View，使之能够与View相互响应
     *
     * @param iView
     */
    void attachView(@NonNull IView iView);

    /**
     * 释放资源
     */
    void detachView();

    /**
     * init
     */
    void initPresenter();
}
