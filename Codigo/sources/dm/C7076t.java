package dm;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C9322n;
import p073e2.C7099c;

/* renamed from: dm.t */
/* loaded from: classes3.dex */
public final class C7076t {

    /* renamed from: a */
    public static final C7076t f15688a = new C7076t();

    /* renamed from: b */
    private static final int f15689b = 65536;

    /* renamed from: c */
    private static final C7075s f15690c = new C7075s(new byte[0], 0, 0, false, false);

    /* renamed from: d */
    private static final int f15691d;

    /* renamed from: e */
    private static final AtomicReference<C7075s>[] f15692e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f15691d = highestOneBit;
        AtomicReference<C7075s>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f15692e = atomicReferenceArr;
    }

    private C7076t() {
    }

    /* renamed from: a */
    private final AtomicReference<C7075s> m20841a() {
        return f15692e[(int) (Thread.currentThread().getId() & (f15691d - 1))];
    }

    /* renamed from: b */
    public static final void m20842b(C7075s segment) {
        AtomicReference<C7075s> m20841a;
        C7075s c7075s;
        C9322n.m27781e(segment, "segment");
        if (!(segment.f15686f == null && segment.f15687g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.f15684d || (c7075s = (m20841a = f15688a.m20841a()).get()) == f15690c) {
            return;
        }
        int i10 = c7075s != null ? c7075s.f15683c : 0;
        if (i10 >= f15689b) {
            return;
        }
        segment.f15686f = c7075s;
        segment.f15682b = 0;
        segment.f15683c = i10 + 8192;
        if (C7099c.m20926a(m20841a, c7075s, segment)) {
            return;
        }
        segment.f15686f = null;
    }

    /* renamed from: c */
    public static final C7075s m20843c() {
        AtomicReference<C7075s> m20841a = f15688a.m20841a();
        C7075s c7075s = f15690c;
        C7075s andSet = m20841a.getAndSet(c7075s);
        if (andSet == c7075s) {
            return new C7075s();
        }
        if (andSet == null) {
            m20841a.set(null);
            return new C7075s();
        }
        m20841a.set(andSet.f15686f);
        andSet.f15686f = null;
        andSet.f15683c = 0;
        return andSet;
    }
}
