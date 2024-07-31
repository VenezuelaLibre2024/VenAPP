package t6;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
final class j4 {

    /* renamed from: a, reason: collision with root package name */
    private final PowerManager f26268a;

    /* renamed from: b, reason: collision with root package name */
    private PowerManager.WakeLock f26269b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26270c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26271d;

    public j4(Context context) {
        this.f26268a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    private void c() {
        PowerManager.WakeLock wakeLock = this.f26269b;
        if (wakeLock == null) {
            return;
        }
        if (this.f26270c && this.f26271d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f26269b == null) {
            PowerManager powerManager = this.f26268a;
            if (powerManager == null) {
                t8.s.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f26269b = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        this.f26270c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f26271d = z10;
        c();
    }
}
