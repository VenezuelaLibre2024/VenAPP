package p185ji;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* renamed from: ji.a */
/* loaded from: classes3.dex */
public class C9067a {

    /* renamed from: a */
    private final ConnectivityManager f21750a;

    public C9067a(ConnectivityManager connectivityManager) {
        this.f21750a = connectivityManager;
    }

    /* renamed from: c */
    private String m26670c() {
        NetworkInfo activeNetworkInfo = this.f21750a.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "none";
        }
        int type = activeNetworkInfo.getType();
        return type != 0 ? type != 1 ? (type == 4 || type == 5) ? "mobile" : type != 6 ? type != 7 ? type != 9 ? type != 17 ? "none" : "vpn" : "ethernet" : "bluetooth" : "wifi" : "wifi" : "mobile";
    }

    /* renamed from: a */
    public ConnectivityManager m26671a() {
        return this.f21750a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m26672b() {
        NetworkCapabilities networkCapabilities = this.f21750a.getNetworkCapabilities(this.f21750a.getActiveNetwork());
        return networkCapabilities == null ? "none" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(3) ? "ethernet" : networkCapabilities.hasTransport(4) ? "vpn" : networkCapabilities.hasTransport(0) ? "mobile" : networkCapabilities.hasTransport(2) ? "bluetooth" : m26670c();
    }
}
