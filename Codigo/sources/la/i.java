package la;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class i implements f {

    /* renamed from: a, reason: collision with root package name */
    private static final i f21148a = new i();

    private i() {
    }

    public static f d() {
        return f21148a;
    }

    @Override // la.f
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // la.f
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // la.f
    public final long c() {
        return System.nanoTime();
    }
}
