package io.flutter.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class HandlerCompat {
    public static Handler createAsyncHandler(Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT < 28) {
            return new Handler(looper);
        }
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
