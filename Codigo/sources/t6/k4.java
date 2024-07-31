package t6;

import android.content.Context;
import android.net.wifi.WifiManager;

/* loaded from: classes.dex */
final class k4 {

    /* renamed from: a, reason: collision with root package name */
    private final WifiManager f26279a;

    /* renamed from: b, reason: collision with root package name */
    private WifiManager.WifiLock f26280b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26281c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26282d;

    public k4(Context context) {
        this.f26279a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f26280b;
        if (wifiLock == null) {
            return;
        }
        if (this.f26281c && this.f26282d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f26280b == null) {
            WifiManager wifiManager = this.f26279a;
            if (wifiManager == null) {
                t8.s.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f26280b = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        this.f26281c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f26282d = z10;
        c();
    }
}
