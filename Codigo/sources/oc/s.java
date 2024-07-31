package oc;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.internal.p002firebaseauthapi.zzg;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: h */
    private static ga.a f22444h = new ga.a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a */
    private final zb.g f22445a;

    /* renamed from: b */
    volatile long f22446b;

    /* renamed from: c */
    volatile long f22447c;

    /* renamed from: d */
    private long f22448d;

    /* renamed from: e */
    private HandlerThread f22449e;

    /* renamed from: f */
    private Handler f22450f;

    /* renamed from: g */
    private Runnable f22451g;

    public s(zb.g gVar) {
        f22444h.g("Initializing TokenRefresher", new Object[0]);
        zb.g gVar2 = (zb.g) com.google.android.gms.common.internal.s.j(gVar);
        this.f22445a = gVar2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f22449e = handlerThread;
        handlerThread.start();
        this.f22450f = new zzg(this.f22449e.getLooper());
        this.f22451g = new r(this, gVar2.q());
        this.f22448d = 300000L;
    }

    public final void b() {
        this.f22450f.removeCallbacks(this.f22451g);
    }

    public final void c() {
        f22444h.g("Scheduling refresh for " + (this.f22446b - this.f22448d), new Object[0]);
        b();
        this.f22447c = Math.max((this.f22446b - la.i.d().a()) - this.f22448d, 0L) / 1000;
        this.f22450f.postDelayed(this.f22451g, this.f22447c * 1000);
    }

    public final void d() {
        int i10 = (int) this.f22447c;
        this.f22447c = (i10 == 30 || i10 == 60 || i10 == 120 || i10 == 240 || i10 == 480) ? 2 * this.f22447c : i10 != 960 ? 30L : 960L;
        this.f22446b = la.i.d().a() + (this.f22447c * 1000);
        f22444h.g("Scheduling refresh for " + this.f22446b, new Object[0]);
        this.f22450f.postDelayed(this.f22451g, this.f22447c * 1000);
    }
}
