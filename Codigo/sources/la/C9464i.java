package la;

import android.os.SystemClock;

/* renamed from: la.i */
/* loaded from: classes.dex */
public class C9464i implements InterfaceC9461f {

    /* renamed from: a */
    private static final C9464i f23001a = new C9464i();

    private C9464i() {
    }

    /* renamed from: d */
    public static InterfaceC9461f m28142d() {
        return f23001a;
    }

    @Override // la.InterfaceC9461f
    /* renamed from: a */
    public final long mo28130a() {
        return System.currentTimeMillis();
    }

    @Override // la.InterfaceC9461f
    /* renamed from: b */
    public final long mo28131b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // la.InterfaceC9461f
    /* renamed from: c */
    public final long mo28132c() {
        return System.nanoTime();
    }
}
