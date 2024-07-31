package dk;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C9322n;
import uk.C11585l;

/* renamed from: dk.n0 */
/* loaded from: classes3.dex */
final class C7024n0<T> extends AbstractC7001c<T> implements RandomAccess {

    /* renamed from: b */
    private final Object[] f15585b;

    /* renamed from: c */
    private final int f15586c;

    /* renamed from: d */
    private int f15587d;

    /* renamed from: e */
    private int f15588e;

    /* renamed from: dk.n0$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC6999b<T> {

        /* renamed from: c */
        private int f15589c;

        /* renamed from: d */
        private int f15590d;

        /* renamed from: e */
        final /* synthetic */ C7024n0<T> f15591e;

        a(C7024n0<T> c7024n0) {
            this.f15591e = c7024n0;
            this.f15589c = c7024n0.size();
            this.f15590d = ((C7024n0) c7024n0).f15587d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dk.AbstractC6999b
        /* renamed from: a */
        protected void mo20319a() {
            if (this.f15589c == 0) {
                m20320c();
                return;
            }
            m20321d(((C7024n0) this.f15591e).f15585b[this.f15590d]);
            this.f15590d = (this.f15590d + 1) % ((C7024n0) this.f15591e).f15586c;
            this.f15589c--;
        }
    }

    public C7024n0(int i10) {
        this(new Object[i10], 0);
    }

    public C7024n0(Object[] buffer, int i10) {
        C9322n.m27781e(buffer, "buffer");
        this.f15585b = buffer;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        }
        if (i10 <= buffer.length) {
            this.f15586c = buffer.length;
            this.f15588e = i10;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    @Override // dk.AbstractC6997a
    /* renamed from: c */
    public int mo20314c() {
        return this.f15588e;
    }

    @Override // dk.AbstractC7001c, java.util.List
    public T get(int i10) {
        AbstractC7001c.f15569a.m20328b(i10, size());
        return (T) this.f15585b[(this.f15587d + i10) % this.f15586c];
    }

    @Override // dk.AbstractC7001c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new a(this);
    }

    /* renamed from: l */
    public final void m20503l(T t10) {
        if (m20505n()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f15585b[(this.f15587d + size()) % this.f15586c] = t10;
        this.f15588e = size() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final C7024n0<T> m20504m(int i10) {
        int m36295d;
        Object[] array;
        int i11 = this.f15586c;
        m36295d = C11585l.m36295d(i11 + (i11 >> 1) + 1, i10);
        if (this.f15587d == 0) {
            array = Arrays.copyOf(this.f15585b, m36295d);
            C9322n.m27780d(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[m36295d]);
        }
        return new C7024n0<>(array, size());
    }

    /* renamed from: n */
    public final boolean m20505n() {
        return size() == this.f15586c;
    }

    /* renamed from: o */
    public final void m20506o(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        }
        if (!(i10 <= size())) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        }
        if (i10 > 0) {
            int i11 = this.f15587d;
            int i12 = (i11 + i10) % this.f15586c;
            if (i11 > i12) {
                C7019l.m20443k(this.f15585b, null, i11, this.f15586c);
                C7019l.m20443k(this.f15585b, null, 0, i12);
            } else {
                C7019l.m20443k(this.f15585b, null, i11, i12);
            }
            this.f15587d = i12;
            this.f15588e = size() - i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dk.AbstractC6997a, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // dk.AbstractC6997a, java.util.Collection
    public <T> T[] toArray(T[] array) {
        C9322n.m27781e(array, "array");
        if (array.length < size()) {
            array = (T[]) Arrays.copyOf(array, size());
            C9322n.m27780d(array, "copyOf(this, newSize)");
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f15587d; i11 < size && i12 < this.f15586c; i12++) {
            array[i11] = this.f15585b[i12];
            i11++;
        }
        while (i11 < size) {
            array[i11] = this.f15585b[i10];
            i11++;
            i10++;
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }
}
