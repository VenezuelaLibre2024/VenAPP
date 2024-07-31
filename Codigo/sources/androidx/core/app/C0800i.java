package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;

/* renamed from: androidx.core.app.i */
/* loaded from: classes.dex */
public final class C0800i {

    /* renamed from: androidx.core.app.i$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static IBinder m4041a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        /* renamed from: b */
        static void m4042b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* renamed from: a */
    public static IBinder m4039a(Bundle bundle, String str) {
        return a.m4041a(bundle, str);
    }

    /* renamed from: b */
    public static void m4040b(Bundle bundle, String str, IBinder iBinder) {
        a.m4042b(bundle, str, iBinder);
    }
}
