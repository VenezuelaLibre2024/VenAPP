package p170j2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.core.net.C0941a;
import kotlin.jvm.internal.C9322n;
import p094f2.AbstractC7277j;
import p128h2.C7612b;
import p211l2.C9362n;
import p211l2.C9363o;
import p230m2.InterfaceC9536b;

/* renamed from: j2.k */
/* loaded from: classes.dex */
public final class C8950k {

    /* renamed from: a */
    private static final String f21290a;

    static {
        String m21769i = AbstractC7277j.m21769i("NetworkStateTracker");
        C9322n.m27780d(m21769i, "tagWithPrefix(\"NetworkStateTracker\")");
        f21290a = m21769i;
    }

    /* renamed from: a */
    public static final AbstractC8947h<C7612b> m26170a(Context context, InterfaceC9536b taskExecutor) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(taskExecutor, "taskExecutor");
        return new C8949j(context, taskExecutor);
    }

    /* renamed from: c */
    public static final C7612b m26172c(ConnectivityManager connectivityManager) {
        C9322n.m27781e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return new C7612b(activeNetworkInfo != null && activeNetworkInfo.isConnected(), m26173d(connectivityManager), C0941a.m4695a(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }

    /* renamed from: d */
    public static final boolean m26173d(ConnectivityManager connectivityManager) {
        C9322n.m27781e(connectivityManager, "<this>");
        try {
            NetworkCapabilities m27873a = C9362n.m27873a(connectivityManager, C9363o.m27876a(connectivityManager));
            if (m27873a != null) {
                return C9362n.m27874b(m27873a, 16);
            }
            return false;
        } catch (SecurityException e10) {
            AbstractC7277j.m21767e().mo21773d(f21290a, "Unable to validate active network", e10);
            return false;
        }
    }
}
