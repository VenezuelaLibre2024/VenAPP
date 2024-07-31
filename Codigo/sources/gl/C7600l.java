package gl;

import java.util.concurrent.TimeUnit;
import p089el.C7225i0;
import p089el.C7229k0;
import uk.C11585l;

/* renamed from: gl.l */
/* loaded from: classes3.dex */
public final class C7600l {

    /* renamed from: a */
    public static final String f17967a = C7225i0.m21579e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b */
    public static final long f17968b;

    /* renamed from: c */
    public static final int f17969c;

    /* renamed from: d */
    public static final int f17970d;

    /* renamed from: e */
    public static final long f17971e;

    /* renamed from: f */
    public static AbstractC7595g f17972f;

    /* renamed from: g */
    public static final InterfaceC7597i f17973g;

    /* renamed from: h */
    public static final InterfaceC7597i f17974h;

    static {
        long m21603f;
        int m36293b;
        int m21602e;
        int m21602e2;
        long m21603f2;
        m21603f = C7229k0.m21603f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f17968b = m21603f;
        m36293b = C11585l.m36293b(C7225i0.m21575a(), 2);
        m21602e = C7229k0.m21602e("kotlinx.coroutines.scheduler.core.pool.size", m36293b, 1, 0, 8, null);
        f17969c = m21602e;
        m21602e2 = C7229k0.m21602e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f17970d = m21602e2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m21603f2 = C7229k0.m21603f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f17971e = timeUnit.toNanos(m21603f2);
        f17972f = C7593e.f17957a;
        f17973g = new C7598j(0);
        f17974h = new C7598j(1);
    }
}
