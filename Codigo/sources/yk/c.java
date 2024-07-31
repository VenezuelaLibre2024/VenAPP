package yk;

import kotlin.jvm.internal.n;
import uk.i;
import uk.l;

/* loaded from: classes3.dex */
public final class c {
    public static final long d(long j10, int i10) {
        return a.m((j10 << 1) + i10);
    }

    public static final long e(long j10) {
        return a.m((j10 << 1) + 1);
    }

    private static final long f(long j10) {
        return a.m(j10 << 1);
    }

    public static final long g(long j10) {
        return j10 * 1000000;
    }

    public static final long h(int i10, d unit) {
        n.e(unit, "unit");
        return unit.compareTo(d.SECONDS) <= 0 ? f(e.b(i10, unit, d.NANOSECONDS)) : i(i10, unit);
    }

    public static final long i(long j10, d unit) {
        long g10;
        n.e(unit, "unit");
        d dVar = d.NANOSECONDS;
        long b10 = e.b(4611686018426999999L, dVar, unit);
        if (new i(-b10, b10).k(j10)) {
            return f(e.b(j10, unit, dVar));
        }
        g10 = l.g(e.a(j10, unit, d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L);
        return e(g10);
    }
}
