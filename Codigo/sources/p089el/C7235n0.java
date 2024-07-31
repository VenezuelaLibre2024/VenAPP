package p089el;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.C9322n;
import p089el.InterfaceC7237o0;

/* renamed from: el.n0 */
/* loaded from: classes3.dex */
public class C7235n0<T extends InterfaceC7237o0 & Comparable<? super T>> {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f16213b = AtomicIntegerFieldUpdater.newUpdater(C7235n0.class, "_size");
    private volatile int _size;

    /* renamed from: a */
    private T[] f16214a;

    /* renamed from: f */
    private final T[] m21621f() {
        T[] tArr = this.f16214a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new InterfaceC7237o0[4];
            this.f16214a = tArr2;
            return tArr2;
        }
        if (m21628c() < tArr.length) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, m21628c() * 2);
        C9322n.m27780d(copyOf, "copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((InterfaceC7237o0[]) copyOf);
        this.f16214a = tArr3;
        return tArr3;
    }

    /* renamed from: j */
    private final void m21622j(int i10) {
        f16213b.set(this, i10);
    }

    /* renamed from: k */
    private final void m21623k(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 >= m21628c()) {
                return;
            }
            T[] tArr = this.f16214a;
            C9322n.m27778b(tArr);
            int i12 = i11 + 1;
            if (i12 < m21628c()) {
                T t10 = tArr[i12];
                C9322n.m27778b(t10);
                T t11 = tArr[i11];
                C9322n.m27778b(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    i11 = i12;
                }
            }
            T t12 = tArr[i10];
            C9322n.m27778b(t12);
            T t13 = tArr[i11];
            C9322n.m27778b(t13);
            if (((Comparable) t12).compareTo(t13) <= 0) {
                return;
            }
            m21625m(i10, i11);
            i10 = i11;
        }
    }

    /* renamed from: l */
    private final void m21624l(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f16214a;
            C9322n.m27778b(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            C9322n.m27778b(t10);
            T t11 = tArr[i10];
            C9322n.m27778b(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            m21625m(i10, i11);
            i10 = i11;
        }
    }

    /* renamed from: m */
    private final void m21625m(int i10, int i11) {
        T[] tArr = this.f16214a;
        C9322n.m27778b(tArr);
        T t10 = tArr[i11];
        C9322n.m27778b(t10);
        T t11 = tArr[i10];
        C9322n.m27778b(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }

    /* renamed from: a */
    public final void m21626a(T t10) {
        t10.mo21638b(this);
        T[] m21621f = m21621f();
        int m21628c = m21628c();
        m21622j(m21628c + 1);
        m21621f[m21628c] = t10;
        t10.setIndex(m21628c);
        m21624l(m21628c);
    }

    /* renamed from: b */
    public final T m21627b() {
        T[] tArr = this.f16214a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int m21628c() {
        return f16213b.get(this);
    }

    /* renamed from: d */
    public final boolean m21629d() {
        return m21628c() == 0;
    }

    /* renamed from: e */
    public final T m21630e() {
        T m21627b;
        synchronized (this) {
            m21627b = m21627b();
        }
        return m21627b;
    }

    /* renamed from: g */
    public final boolean m21631g(T t10) {
        boolean z10;
        synchronized (this) {
            if (t10.mo21639i() == null) {
                z10 = false;
            } else {
                m21632h(t10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: h */
    public final T m21632h(int i10) {
        T[] tArr = this.f16214a;
        C9322n.m27778b(tArr);
        m21622j(m21628c() - 1);
        if (i10 < m21628c()) {
            m21625m(i10, m21628c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                C9322n.m27778b(t10);
                T t11 = tArr[i11];
                C9322n.m27778b(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    m21625m(i10, i11);
                    m21624l(i11);
                }
            }
            m21623k(i10);
        }
        T t12 = tArr[m21628c()];
        C9322n.m27778b(t12);
        t12.mo21638b(null);
        t12.setIndex(-1);
        tArr[m21628c()] = null;
        return t12;
    }

    /* renamed from: i */
    public final T m21633i() {
        T m21632h;
        synchronized (this) {
            m21632h = m21628c() > 0 ? m21632h(0) : null;
        }
        return m21632h;
    }
}
