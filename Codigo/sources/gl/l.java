package gl;

import el.i0;
import el.k0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a */
    public static final String f16330a = i0.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b */
    public static final long f16331b;

    /* renamed from: c */
    public static final int f16332c;

    /* renamed from: d */
    public static final int f16333d;

    /* renamed from: e */
    public static final long f16334e;

    /* renamed from: f */
    public static g f16335f;

    /* renamed from: g */
    public static final i f16336g;

    /* renamed from: h */
    public static final i f16337h;

    static {
        long f10;
        int b10;
        int e10;
        int e11;
        long f11;
        f10 = k0.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f16331b = f10;
        b10 = uk.l.b(i0.a(), 2);
        e10 = k0.e("kotlinx.coroutines.scheduler.core.pool.size", b10, 1, 0, 8, null);
        f16332c = e10;
        e11 = k0.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f16333d = e11;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f11 = k0.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f16334e = timeUnit.toNanos(f11);
        f16335f = e.f16320a;
        f16336g = new j(0);
        f16337h = new j(1);
    }
}
