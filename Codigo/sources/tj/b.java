package tj;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import mj.i;
import xj.k;

/* loaded from: classes3.dex */
public final class b<T> implements i<T> {

    /* renamed from: t, reason: collision with root package name */
    static final int f26967t = Integer.getInteger("jctools.spsc.max.lookahead.step", RecognitionOptions.AZTEC).intValue();

    /* renamed from: u, reason: collision with root package name */
    private static final Object f26968u = new Object();

    /* renamed from: b, reason: collision with root package name */
    int f26970b;

    /* renamed from: c, reason: collision with root package name */
    long f26971c;

    /* renamed from: d, reason: collision with root package name */
    final int f26972d;

    /* renamed from: e, reason: collision with root package name */
    AtomicReferenceArray<Object> f26973e;

    /* renamed from: f, reason: collision with root package name */
    final int f26974f;

    /* renamed from: r, reason: collision with root package name */
    AtomicReferenceArray<Object> f26975r;

    /* renamed from: a, reason: collision with root package name */
    final AtomicLong f26969a = new AtomicLong();

    /* renamed from: s, reason: collision with root package name */
    final AtomicLong f26976s = new AtomicLong();

    public b(int i10) {
        int a10 = k.a(Math.max(8, i10));
        int i11 = a10 - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a10 + 1);
        this.f26973e = atomicReferenceArray;
        this.f26972d = i11;
        a(a10);
        this.f26975r = atomicReferenceArray;
        this.f26974f = i11;
        this.f26971c = i11 - 1;
        p(0L);
    }

    private void a(int i10) {
        this.f26970b = Math.min(i10 / 4, f26967t);
    }

    private static int b(int i10) {
        return i10;
    }

    private static int c(long j10, int i10) {
        return b(((int) j10) & i10);
    }

    private long d() {
        return this.f26976s.get();
    }

    private long e() {
        return this.f26969a.get();
    }

    private long f() {
        return this.f26976s.get();
    }

    private static <E> Object g(AtomicReferenceArray<Object> atomicReferenceArray, int i10) {
        return atomicReferenceArray.get(i10);
    }

    private AtomicReferenceArray<Object> h(AtomicReferenceArray<Object> atomicReferenceArray, int i10) {
        int b10 = b(i10);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) g(atomicReferenceArray, b10);
        n(atomicReferenceArray, b10, null);
        return atomicReferenceArray2;
    }

    private long i() {
        return this.f26969a.get();
    }

    private T j(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10) {
        this.f26975r = atomicReferenceArray;
        int c10 = c(j10, i10);
        T t10 = (T) g(atomicReferenceArray, c10);
        if (t10 != null) {
            n(atomicReferenceArray, c10, null);
            m(j10 + 1);
        }
        return t10;
    }

    private void k(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10, T t10, long j11) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f26973e = atomicReferenceArray2;
        this.f26971c = (j11 + j10) - 1;
        n(atomicReferenceArray2, i10, t10);
        o(atomicReferenceArray, atomicReferenceArray2);
        n(atomicReferenceArray, i10, f26968u);
        p(j10 + 1);
    }

    private void m(long j10) {
        this.f26976s.lazySet(j10);
    }

    private static void n(AtomicReferenceArray<Object> atomicReferenceArray, int i10, Object obj) {
        atomicReferenceArray.lazySet(i10, obj);
    }

    private void o(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        n(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void p(long j10) {
        this.f26969a.lazySet(j10);
    }

    private boolean q(AtomicReferenceArray<Object> atomicReferenceArray, T t10, long j10, int i10) {
        n(atomicReferenceArray, i10, t10);
        p(j10 + 1);
        return true;
    }

    @Override // mj.j
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // mj.j
    public boolean isEmpty() {
        return i() == f();
    }

    @Override // mj.j
    public boolean offer(T t10) {
        if (t10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f26973e;
        long e10 = e();
        int i10 = this.f26972d;
        int c10 = c(e10, i10);
        if (e10 < this.f26971c) {
            return q(atomicReferenceArray, t10, e10, c10);
        }
        long j10 = this.f26970b + e10;
        if (g(atomicReferenceArray, c(j10, i10)) == null) {
            this.f26971c = j10 - 1;
            return q(atomicReferenceArray, t10, e10, c10);
        }
        if (g(atomicReferenceArray, c(1 + e10, i10)) == null) {
            return q(atomicReferenceArray, t10, e10, c10);
        }
        k(atomicReferenceArray, e10, c10, t10, i10);
        return true;
    }

    @Override // mj.i, mj.j
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f26975r;
        long d10 = d();
        int i10 = this.f26974f;
        int c10 = c(d10, i10);
        T t10 = (T) g(atomicReferenceArray, c10);
        boolean z10 = t10 == f26968u;
        if (t10 == null || z10) {
            if (z10) {
                return j(h(atomicReferenceArray, i10 + 1), d10, i10);
            }
            return null;
        }
        n(atomicReferenceArray, c10, null);
        m(d10 + 1);
        return t10;
    }
}
