package tj;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p241mj.InterfaceC9599i;
import p449xj.C12508k;

/* renamed from: tj.b */
/* loaded from: classes3.dex */
public final class C11289b<T> implements InterfaceC9599i<T> {

    /* renamed from: t */
    static final int f29269t = Integer.getInteger("jctools.spsc.max.lookahead.step", RecognitionOptions.AZTEC).intValue();

    /* renamed from: u */
    private static final Object f29270u = new Object();

    /* renamed from: b */
    int f29272b;

    /* renamed from: c */
    long f29273c;

    /* renamed from: d */
    final int f29274d;

    /* renamed from: e */
    AtomicReferenceArray<Object> f29275e;

    /* renamed from: f */
    final int f29276f;

    /* renamed from: r */
    AtomicReferenceArray<Object> f29277r;

    /* renamed from: a */
    final AtomicLong f29271a = new AtomicLong();

    /* renamed from: s */
    final AtomicLong f29278s = new AtomicLong();

    public C11289b(int i10) {
        int m40953a = C12508k.m40953a(Math.max(8, i10));
        int i11 = m40953a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(m40953a + 1);
        this.f29275e = atomicReferenceArray;
        this.f29274d = i11;
        m35256a(m40953a);
        this.f29277r = atomicReferenceArray;
        this.f29276f = i11;
        this.f29273c = i11 - 1;
        m35270p(0L);
    }

    /* renamed from: a */
    private void m35256a(int i10) {
        this.f29272b = Math.min(i10 / 4, f29269t);
    }

    /* renamed from: b */
    private static int m35257b(int i10) {
        return i10;
    }

    /* renamed from: c */
    private static int m35258c(long j10, int i10) {
        return m35257b(((int) j10) & i10);
    }

    /* renamed from: d */
    private long m35259d() {
        return this.f29278s.get();
    }

    /* renamed from: e */
    private long m35260e() {
        return this.f29271a.get();
    }

    /* renamed from: f */
    private long m35261f() {
        return this.f29278s.get();
    }

    /* renamed from: g */
    private static <E> Object m35262g(AtomicReferenceArray<Object> atomicReferenceArray, int i10) {
        return atomicReferenceArray.get(i10);
    }

    /* renamed from: h */
    private AtomicReferenceArray<Object> m35263h(AtomicReferenceArray<Object> atomicReferenceArray, int i10) {
        int m35257b = m35257b(i10);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m35262g(atomicReferenceArray, m35257b);
        m35268n(atomicReferenceArray, m35257b, null);
        return atomicReferenceArray2;
    }

    /* renamed from: i */
    private long m35264i() {
        return this.f29271a.get();
    }

    /* renamed from: j */
    private T m35265j(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10) {
        this.f29277r = atomicReferenceArray;
        int m35258c = m35258c(j10, i10);
        T t10 = (T) m35262g(atomicReferenceArray, m35258c);
        if (t10 != null) {
            m35268n(atomicReferenceArray, m35258c, null);
            m35267m(j10 + 1);
        }
        return t10;
    }

    /* renamed from: k */
    private void m35266k(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10, T t10, long j11) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f29275e = atomicReferenceArray2;
        this.f29273c = (j11 + j10) - 1;
        m35268n(atomicReferenceArray2, i10, t10);
        m35269o(atomicReferenceArray, atomicReferenceArray2);
        m35268n(atomicReferenceArray, i10, f29270u);
        m35270p(j10 + 1);
    }

    /* renamed from: m */
    private void m35267m(long j10) {
        this.f29278s.lazySet(j10);
    }

    /* renamed from: n */
    private static void m35268n(AtomicReferenceArray<Object> atomicReferenceArray, int i10, Object obj) {
        atomicReferenceArray.lazySet(i10, obj);
    }

    /* renamed from: o */
    private void m35269o(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m35268n(atomicReferenceArray, m35257b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    /* renamed from: p */
    private void m35270p(long j10) {
        this.f29271a.lazySet(j10);
    }

    /* renamed from: q */
    private boolean m35271q(AtomicReferenceArray<Object> atomicReferenceArray, T t10, long j10, int i10) {
        m35268n(atomicReferenceArray, i10, t10);
        m35270p(j10 + 1);
        return true;
    }

    @Override // p241mj.InterfaceC9600j
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // p241mj.InterfaceC9600j
    public boolean isEmpty() {
        return m35264i() == m35261f();
    }

    @Override // p241mj.InterfaceC9600j
    public boolean offer(T t10) {
        if (t10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f29275e;
        long m35260e = m35260e();
        int i10 = this.f29274d;
        int m35258c = m35258c(m35260e, i10);
        if (m35260e < this.f29273c) {
            return m35271q(atomicReferenceArray, t10, m35260e, m35258c);
        }
        long j10 = this.f29272b + m35260e;
        if (m35262g(atomicReferenceArray, m35258c(j10, i10)) == null) {
            this.f29273c = j10 - 1;
            return m35271q(atomicReferenceArray, t10, m35260e, m35258c);
        }
        if (m35262g(atomicReferenceArray, m35258c(1 + m35260e, i10)) == null) {
            return m35271q(atomicReferenceArray, t10, m35260e, m35258c);
        }
        m35266k(atomicReferenceArray, m35260e, m35258c, t10, i10);
        return true;
    }

    @Override // p241mj.InterfaceC9599i, p241mj.InterfaceC9600j
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f29277r;
        long m35259d = m35259d();
        int i10 = this.f29276f;
        int m35258c = m35258c(m35259d, i10);
        T t10 = (T) m35262g(atomicReferenceArray, m35258c);
        boolean z10 = t10 == f29270u;
        if (t10 == null || z10) {
            if (z10) {
                return m35265j(m35263h(atomicReferenceArray, i10 + 1), m35259d, i10);
            }
            return null;
        }
        m35268n(atomicReferenceArray, m35258c, null);
        m35267m(m35259d + 1);
        return t10;
    }
}
