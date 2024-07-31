package el;

import el.o0;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public class n0<T extends o0 & Comparable<? super T>> {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f14790b = AtomicIntegerFieldUpdater.newUpdater(n0.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    private T[] f14791a;

    private final T[] f() {
        T[] tArr = this.f14791a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new o0[4];
            this.f14791a = tArr2;
            return tArr2;
        }
        if (c() < tArr.length) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
        kotlin.jvm.internal.n.d(copyOf, "copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((o0[]) copyOf);
        this.f14791a = tArr3;
        return tArr3;
    }

    private final void j(int i10) {
        f14790b.set(this, i10);
    }

    private final void k(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 >= c()) {
                return;
            }
            T[] tArr = this.f14791a;
            kotlin.jvm.internal.n.b(tArr);
            int i12 = i11 + 1;
            if (i12 < c()) {
                T t10 = tArr[i12];
                kotlin.jvm.internal.n.b(t10);
                T t11 = tArr[i11];
                kotlin.jvm.internal.n.b(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    i11 = i12;
                }
            }
            T t12 = tArr[i10];
            kotlin.jvm.internal.n.b(t12);
            T t13 = tArr[i11];
            kotlin.jvm.internal.n.b(t13);
            if (((Comparable) t12).compareTo(t13) <= 0) {
                return;
            }
            m(i10, i11);
            i10 = i11;
        }
    }

    private final void l(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f14791a;
            kotlin.jvm.internal.n.b(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            kotlin.jvm.internal.n.b(t10);
            T t11 = tArr[i10];
            kotlin.jvm.internal.n.b(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            m(i10, i11);
            i10 = i11;
        }
    }

    private final void m(int i10, int i11) {
        T[] tArr = this.f14791a;
        kotlin.jvm.internal.n.b(tArr);
        T t10 = tArr[i11];
        kotlin.jvm.internal.n.b(t10);
        T t11 = tArr[i10];
        kotlin.jvm.internal.n.b(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }

    public final void a(T t10) {
        t10.b(this);
        T[] f10 = f();
        int c10 = c();
        j(c10 + 1);
        f10[c10] = t10;
        t10.setIndex(c10);
        l(c10);
    }

    public final T b() {
        T[] tArr = this.f14791a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return f14790b.get(this);
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b10;
        synchronized (this) {
            b10 = b();
        }
        return b10;
    }

    public final boolean g(T t10) {
        boolean z10;
        synchronized (this) {
            if (t10.i() == null) {
                z10 = false;
            } else {
                h(t10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    public final T h(int i10) {
        T[] tArr = this.f14791a;
        kotlin.jvm.internal.n.b(tArr);
        j(c() - 1);
        if (i10 < c()) {
            m(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                kotlin.jvm.internal.n.b(t10);
                T t11 = tArr[i11];
                kotlin.jvm.internal.n.b(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    m(i10, i11);
                    l(i11);
                }
            }
            k(i10);
        }
        T t12 = tArr[c()];
        kotlin.jvm.internal.n.b(t12);
        t12.b(null);
        t12.setIndex(-1);
        tArr[c()] = null;
        return t12;
    }

    public final T i() {
        T h10;
        synchronized (this) {
            h10 = c() > 0 ? h(0) : null;
        }
        return h10;
    }
}
