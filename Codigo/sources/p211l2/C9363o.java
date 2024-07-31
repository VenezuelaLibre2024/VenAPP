package p211l2;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.C9322n;

/* renamed from: l2.o */
/* loaded from: classes.dex */
public final class C9363o {
    /* renamed from: a */
    public static final Network m27876a(ConnectivityManager connectivityManager) {
        C9322n.m27781e(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
