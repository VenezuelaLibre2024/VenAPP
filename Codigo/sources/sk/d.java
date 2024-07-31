package sk;

import kotlin.jvm.internal.n;
import uk.f;

/* loaded from: classes3.dex */
public final class d {
    public static final String a(Object from, Object until) {
        n.e(from, "from");
        n.e(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void b(int i10, int i11) {
        if (!(i11 > i10)) {
            throw new IllegalArgumentException(a(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    public static final int c(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static final int d(c cVar, f range) {
        n.e(cVar, "<this>");
        n.e(range, "range");
        if (!range.isEmpty()) {
            return range.d() < Integer.MAX_VALUE ? cVar.e(range.c(), range.d() + 1) : range.c() > Integer.MIN_VALUE ? cVar.e(range.c() - 1, range.d()) + 1 : cVar.c();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int e(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
