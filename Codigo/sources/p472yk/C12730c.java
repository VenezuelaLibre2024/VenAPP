package p472yk;

import kotlin.jvm.internal.C9322n;
import uk.C11582i;
import uk.C11585l;

/* renamed from: yk.c */
/* loaded from: classes3.dex */
public final class C12730c {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final long m42037d(long j10, int i10) {
        return C12728a.m42017m((j10 << 1) + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final long m42038e(long j10) {
        return C12728a.m42017m((j10 << 1) + 1);
    }

    /* renamed from: f */
    private static final long m42039f(long j10) {
        return C12728a.m42017m(j10 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final long m42040g(long j10) {
        return j10 * 1000000;
    }

    /* renamed from: h */
    public static final long m42041h(int i10, EnumC12731d unit) {
        C9322n.m27781e(unit, "unit");
        return unit.compareTo(EnumC12731d.SECONDS) <= 0 ? m42039f(C12732e.m42046b(i10, unit, EnumC12731d.NANOSECONDS)) : m42042i(i10, unit);
    }

    /* renamed from: i */
    public static final long m42042i(long j10, EnumC12731d unit) {
        long m36298g;
        C9322n.m27781e(unit, "unit");
        EnumC12731d enumC12731d = EnumC12731d.NANOSECONDS;
        long m42046b = C12732e.m42046b(4611686018426999999L, enumC12731d, unit);
        if (new C11582i(-m42046b, m42046b).m36281k(j10)) {
            return m42039f(C12732e.m42046b(j10, unit, enumC12731d));
        }
        m36298g = C11585l.m36298g(C12732e.m42045a(j10, unit, EnumC12731d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L);
        return m42038e(m36298g);
    }
}
