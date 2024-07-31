package l2;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
public final class o {
    public static final Network a(ConnectivityManager connectivityManager) {
        kotlin.jvm.internal.n.e(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
