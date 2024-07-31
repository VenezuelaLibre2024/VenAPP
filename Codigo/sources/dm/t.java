package dm;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a */
    public static final t f14330a = new t();

    /* renamed from: b */
    private static final int f14331b = 65536;

    /* renamed from: c */
    private static final s f14332c = new s(new byte[0], 0, 0, false, false);

    /* renamed from: d */
    private static final int f14333d;

    /* renamed from: e */
    private static final AtomicReference<s>[] f14334e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f14333d = highestOneBit;
        AtomicReference<s>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f14334e = atomicReferenceArr;
    }

    private t() {
    }

    private final AtomicReference<s> a() {
        return f14334e[(int) (Thread.currentThread().getId() & (f14333d - 1))];
    }

    public static final void b(s segment) {
        AtomicReference<s> a10;
        s sVar;
        kotlin.jvm.internal.n.e(segment, "segment");
        if (!(segment.f14328f == null && segment.f14329g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.f14326d || (sVar = (a10 = f14330a.a()).get()) == f14332c) {
            return;
        }
        int i10 = sVar != null ? sVar.f14325c : 0;
        if (i10 >= f14331b) {
            return;
        }
        segment.f14328f = sVar;
        segment.f14324b = 0;
        segment.f14325c = i10 + 8192;
        if (e2.c.a(a10, sVar, segment)) {
            return;
        }
        segment.f14328f = null;
    }

    public static final s c() {
        AtomicReference<s> a10 = f14330a.a();
        s sVar = f14332c;
        s andSet = a10.getAndSet(sVar);
        if (andSet == sVar) {
            return new s();
        }
        if (andSet == null) {
            a10.set(null);
            return new s();
        }
        a10.set(andSet.f14328f);
        andSet.f14328f = null;
        andSet.f14325c = 0;
        return andSet;
    }
}
