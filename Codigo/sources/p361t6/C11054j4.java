package p361t6;

import android.content.Context;
import android.os.PowerManager;
import p363t8.C11173s;

/* renamed from: t6.j4 */
/* loaded from: classes.dex */
final class C11054j4 {

    /* renamed from: a */
    private final PowerManager f28495a;

    /* renamed from: b */
    private PowerManager.WakeLock f28496b;

    /* renamed from: c */
    private boolean f28497c;

    /* renamed from: d */
    private boolean f28498d;

    public C11054j4(Context context) {
        this.f28495a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* renamed from: c */
    private void m34215c() {
        PowerManager.WakeLock wakeLock = this.f28496b;
        if (wakeLock == null) {
            return;
        }
        if (this.f28497c && this.f28498d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    /* renamed from: a */
    public void m34216a(boolean z10) {
        if (z10 && this.f28496b == null) {
            PowerManager powerManager = this.f28495a;
            if (powerManager == null) {
                C11173s.m34970i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f28496b = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        this.f28497c = z10;
        m34215c();
    }

    /* renamed from: b */
    public void m34217b(boolean z10) {
        this.f28498d = z10;
        m34215c();
    }
}
