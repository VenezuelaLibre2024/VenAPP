package p211l2;

import android.net.ConnectivityManager;
import kotlin.jvm.internal.C9322n;

/* renamed from: l2.p */
/* loaded from: classes.dex */
public final class C9364p {
    /* renamed from: a */
    public static final void m27877a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        C9322n.m27781e(connectivityManager, "<this>");
        C9322n.m27781e(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
