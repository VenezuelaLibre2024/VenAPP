package p211l2;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.C9322n;

/* renamed from: l2.n */
/* loaded from: classes.dex */
public final class C9362n {
    /* renamed from: a */
    public static final NetworkCapabilities m27873a(ConnectivityManager connectivityManager, Network network) {
        C9322n.m27781e(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    /* renamed from: b */
    public static final boolean m27874b(NetworkCapabilities networkCapabilities, int i10) {
        C9322n.m27781e(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i10);
    }

    /* renamed from: c */
    public static final void m27875c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        C9322n.m27781e(connectivityManager, "<this>");
        C9322n.m27781e(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
