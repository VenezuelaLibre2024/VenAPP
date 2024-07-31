package sk;

import kotlin.jvm.internal.C9322n;
import uk.C11579f;

/* renamed from: sk.d */
/* loaded from: classes3.dex */
public final class C10934d {
    /* renamed from: a */
    public static final String m33403a(Object from, Object until) {
        C9322n.m27781e(from, "from");
        C9322n.m27781e(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    /* renamed from: b */
    public static final void m33404b(int i10, int i11) {
        if (!(i11 > i10)) {
            throw new IllegalArgumentException(m33403a(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    /* renamed from: c */
    public static final int m33405c(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    /* renamed from: d */
    public static final int m33406d(AbstractC10933c abstractC10933c, C11579f range) {
        C9322n.m27781e(abstractC10933c, "<this>");
        C9322n.m27781e(range, "range");
        if (!range.isEmpty()) {
            return range.m36269d() < Integer.MAX_VALUE ? abstractC10933c.mo33402e(range.m36268c(), range.m36269d() + 1) : range.m36268c() > Integer.MIN_VALUE ? abstractC10933c.mo33402e(range.m36268c() - 1, range.m36269d()) + 1 : abstractC10933c.mo33397c();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    /* renamed from: e */
    public static final int m33407e(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
