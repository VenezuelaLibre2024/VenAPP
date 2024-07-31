package j2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import l2.o;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19539a;

    static {
        String i10 = f2.j.i("NetworkStateTracker");
        kotlin.jvm.internal.n.d(i10, "tagWithPrefix(\"NetworkStateTracker\")");
        f19539a = i10;
    }

    public static final h<h2.b> a(Context context, m2.b taskExecutor) {
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(taskExecutor, "taskExecutor");
        return new j(context, taskExecutor);
    }

    public static final h2.b c(ConnectivityManager connectivityManager) {
        kotlin.jvm.internal.n.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return new h2.b(activeNetworkInfo != null && activeNetworkInfo.isConnected(), d(connectivityManager), androidx.core.net.a.a(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }

    public static final boolean d(ConnectivityManager connectivityManager) {
        kotlin.jvm.internal.n.e(connectivityManager, "<this>");
        try {
            NetworkCapabilities a10 = l2.n.a(connectivityManager, o.a(connectivityManager));
            if (a10 != null) {
                return l2.n.b(a10, 16);
            }
            return false;
        } catch (SecurityException e10) {
            f2.j.e().d(f19539a, "Unable to validate active network", e10);
            return false;
        }
    }
}
