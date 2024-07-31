package androidx.core.net;

import android.net.ConnectivityManager;

/* renamed from: androidx.core.net.a */
/* loaded from: classes.dex */
public final class C0941a {

    /* renamed from: androidx.core.net.a$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static boolean m4696a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    /* renamed from: a */
    public static boolean m4695a(ConnectivityManager connectivityManager) {
        return a.m4696a(connectivityManager);
    }
}
