package ji;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f19971a;

    public a(ConnectivityManager connectivityManager) {
        this.f19971a = connectivityManager;
    }

    private String c() {
        NetworkInfo activeNetworkInfo = this.f19971a.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "none";
        }
        int type = activeNetworkInfo.getType();
        return type != 0 ? type != 1 ? (type == 4 || type == 5) ? "mobile" : type != 6 ? type != 7 ? type != 9 ? type != 17 ? "none" : "vpn" : "ethernet" : "bluetooth" : "wifi" : "wifi" : "mobile";
    }

    public ConnectivityManager a() {
        return this.f19971a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        NetworkCapabilities networkCapabilities = this.f19971a.getNetworkCapabilities(this.f19971a.getActiveNetwork());
        return networkCapabilities == null ? "none" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(3) ? "ethernet" : networkCapabilities.hasTransport(4) ? "vpn" : networkCapabilities.hasTransport(0) ? "mobile" : networkCapabilities.hasTransport(2) ? "bluetooth" : c();
    }
}
