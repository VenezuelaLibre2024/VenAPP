package l2;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class p {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        kotlin.jvm.internal.n.e(connectivityManager, "<this>");
        kotlin.jvm.internal.n.e(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
