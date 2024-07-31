package uk;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.n;
import uk.d;

/* loaded from: classes3.dex */
public class l extends k {
    public static int b(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long c(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static int d(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long e(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static int f(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long g(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static d h(int i10, int i11) {
        return d.f27787d.a(i10, i11, -1);
    }

    public static int i(f fVar, sk.c random) {
        n.e(fVar, "<this>");
        n.e(random, "random");
        try {
            return sk.d.d(random, fVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static d j(d dVar, int i10) {
        n.e(dVar, "<this>");
        k.a(i10 > 0, Integer.valueOf(i10));
        d.a aVar = d.f27787d;
        int c10 = dVar.c();
        int d10 = dVar.d();
        if (dVar.f() <= 0) {
            i10 = -i10;
        }
        return aVar.a(c10, d10, i10);
    }

    public static f k(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? f.f27795e.a() : new f(i10, i11 - 1);
    }
}
