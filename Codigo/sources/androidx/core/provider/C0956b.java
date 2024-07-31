package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;

/* renamed from: androidx.core.provider.b */
/* loaded from: classes.dex */
class C0956b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Handler m4742a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
