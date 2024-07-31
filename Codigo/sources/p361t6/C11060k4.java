package p361t6;

import android.content.Context;
import android.net.wifi.WifiManager;
import p363t8.C11173s;

/* renamed from: t6.k4 */
/* loaded from: classes.dex */
final class C11060k4 {

    /* renamed from: a */
    private final WifiManager f28506a;

    /* renamed from: b */
    private WifiManager.WifiLock f28507b;

    /* renamed from: c */
    private boolean f28508c;

    /* renamed from: d */
    private boolean f28509d;

    public C11060k4(Context context) {
        this.f28506a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* renamed from: c */
    private void m34225c() {
        WifiManager.WifiLock wifiLock = this.f28507b;
        if (wifiLock == null) {
            return;
        }
        if (this.f28508c && this.f28509d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    /* renamed from: a */
    public void m34226a(boolean z10) {
        if (z10 && this.f28507b == null) {
            WifiManager wifiManager = this.f28506a;
            if (wifiManager == null) {
                C11173s.m34970i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f28507b = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        this.f28508c = z10;
        m34225c();
    }

    /* renamed from: b */
    public void m34227b(boolean z10) {
        this.f28509d = z10;
        m34225c();
    }
}
