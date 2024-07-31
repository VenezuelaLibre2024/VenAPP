package io.flutter.embedding.android;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

@Deprecated
/* loaded from: classes3.dex */
public interface SplashScreen {
    View createSplashView(Context context, Bundle bundle);

    default boolean doesSplashViewRememberItsTransition() {
        return false;
    }

    default Bundle saveSplashScreenState() {
        return null;
    }

    void transitionToFlutter(Runnable runnable);
}
