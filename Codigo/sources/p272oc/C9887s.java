package p272oc;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzg;
import ga.C7533a;
import la.C9464i;
import p485zb.C12867g;

/* renamed from: oc.s */
/* loaded from: classes.dex */
public final class C9887s {

    /* renamed from: h */
    private static C7533a f24377h = new C7533a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a */
    private final C12867g f24378a;

    /* renamed from: b */
    volatile long f24379b;

    /* renamed from: c */
    volatile long f24380c;

    /* renamed from: d */
    private long f24381d;

    /* renamed from: e */
    private HandlerThread f24382e;

    /* renamed from: f */
    private Handler f24383f;

    /* renamed from: g */
    private Runnable f24384g;

    public C9887s(C12867g c12867g) {
        f24377h.m22875g("Initializing TokenRefresher", new Object[0]);
        C12867g c12867g2 = (C12867g) C5276s.m13324j(c12867g);
        this.f24378a = c12867g2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f24382e = handlerThread;
        handlerThread.start();
        this.f24383f = new zzg(this.f24382e.getLooper());
        this.f24384g = new RunnableC9884r(this, c12867g2.m42631q());
        this.f24381d = 300000L;
    }

    /* renamed from: b */
    public final void m29590b() {
        this.f24383f.removeCallbacks(this.f24384g);
    }

    /* renamed from: c */
    public final void m29591c() {
        f24377h.m22875g("Scheduling refresh for " + (this.f24379b - this.f24381d), new Object[0]);
        m29590b();
        this.f24380c = Math.max((this.f24379b - C9464i.m28142d().mo28130a()) - this.f24381d, 0L) / 1000;
        this.f24383f.postDelayed(this.f24384g, this.f24380c * 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m29592d() {
        int i10 = (int) this.f24380c;
        this.f24380c = (i10 == 30 || i10 == 60 || i10 == 120 || i10 == 240 || i10 == 480) ? 2 * this.f24380c : i10 != 960 ? 30L : 960L;
        this.f24379b = C9464i.m28142d().mo28130a() + (this.f24380c * 1000);
        f24377h.m22875g("Scheduling refresh for " + this.f24379b, new Object[0]);
        this.f24383f.postDelayed(this.f24384g, this.f24380c * 1000);
    }
}
