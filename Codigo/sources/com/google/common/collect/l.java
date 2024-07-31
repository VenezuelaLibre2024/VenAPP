package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class l<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: a */
    private transient Object f11130a;

    /* renamed from: b */
    private transient int[] f11131b;

    /* renamed from: c */
    transient Object[] f11132c;

    /* renamed from: d */
    private transient int f11133d;

    /* renamed from: e */
    private transient int f11134e;

    /* loaded from: classes2.dex */
    public class a implements Iterator<E> {

        /* renamed from: a */
        int f11135a;

        /* renamed from: b */
        int f11136b;

        /* renamed from: c */
        int f11137c = -1;

        a() {
            this.f11135a = l.this.f11133d;
            this.f11136b = l.this.q();
        }

        private void a() {
            if (l.this.f11133d != this.f11135a) {
                throw new ConcurrentModificationException();
            }
        }

        void c() {
            this.f11135a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11136b >= 0;
        }

        @Override // java.util.Iterator
        public E next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f11136b;
            this.f11137c = i10;
            E e10 = (E) l.this.o(i10);
            this.f11136b = l.this.r(this.f11136b);
            return e10;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            i.c(this.f11137c >= 0);
            c();
            l lVar = l.this;
            lVar.remove(lVar.o(this.f11137c));
            this.f11136b = l.this.f(this.f11136b, this.f11137c);
            this.f11137c = -1;
        }
    }

    l() {
        u(3);
    }

    private Object A() {
        Object obj = this.f11130a;
        Objects.requireNonNull(obj);
        return obj;
    }

    private void D(int i10) {
        int min;
        int length = z().length;
        if (i10 <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        C(min);
    }

    private int E(int i10, int i11, int i12, int i13) {
        Object a10 = m.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            m.i(a10, i12 & i14, i13 + 1);
        }
        Object A = A();
        int[] z10 = z();
        for (int i15 = 0; i15 <= i10; i15++) {
            int h10 = m.h(A, i15);
            while (h10 != 0) {
                int i16 = h10 - 1;
                int i17 = z10[i16];
                int b10 = m.b(i17, i10) | i15;
                int i18 = b10 & i14;
                int h11 = m.h(a10, i18);
                m.i(a10, i18, h10);
                z10[i16] = m.d(b10, h11, i14);
                h10 = m.c(i17, i10);
            }
        }
        this.f11130a = a10;
        H(i14);
        return i14;
    }

    private void F(int i10, E e10) {
        y()[i10] = e10;
    }

    private void G(int i10, int i11) {
        z()[i10] = i11;
    }

    private void H(int i10) {
        this.f11133d = m.d(this.f11133d, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    public static <E> l<E> l() {
        return new l<>();
    }

    private Set<E> m(int i10) {
        return new LinkedHashSet(i10, 1.0f);
    }

    public E o(int i10) {
        return (E) y()[i10];
    }

    private int p(int i10) {
        return z()[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid size: " + readInt);
        }
        u(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            add(objectInputStream.readObject());
        }
    }

    private int s() {
        return (1 << (this.f11133d & 31)) - 1;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    private Object[] y() {
        Object[] objArr = this.f11132c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private int[] z() {
        int[] iArr = this.f11131b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    void C(int i10) {
        this.f11131b = Arrays.copyOf(z(), i10);
        this.f11132c = Arrays.copyOf(y(), i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        if (x()) {
            h();
        }
        Set<E> n10 = n();
        if (n10 != null) {
            return n10.add(e10);
        }
        int[] z10 = z();
        Object[] y10 = y();
        int i10 = this.f11134e;
        int i11 = i10 + 1;
        int c10 = t.c(e10);
        int s10 = s();
        int i12 = c10 & s10;
        int h10 = m.h(A(), i12);
        if (h10 == 0) {
            if (i11 <= s10) {
                m.i(A(), i12, i11);
                D(i11);
                v(i10, e10, c10, s10);
                this.f11134e = i11;
                t();
                return true;
            }
            s10 = E(s10, m.e(s10), c10, i10);
            D(i11);
            v(i10, e10, c10, s10);
            this.f11134e = i11;
            t();
            return true;
        }
        int b10 = m.b(c10, s10);
        int i13 = 0;
        while (true) {
            int i14 = h10 - 1;
            int i15 = z10[i14];
            if (m.b(i15, s10) == b10 && eb.k.a(e10, y10[i14])) {
                return false;
            }
            int c11 = m.c(i15, s10);
            i13++;
            if (c11 != 0) {
                h10 = c11;
            } else {
                if (i13 >= 9) {
                    return k().add(e10);
                }
                if (i11 <= s10) {
                    z10[i14] = m.d(i15, i11, s10);
                }
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (x()) {
            return;
        }
        t();
        Set<E> n10 = n();
        if (n10 != null) {
            this.f11133d = hb.e.f(size(), 3, 1073741823);
            n10.clear();
            this.f11130a = null;
        } else {
            Arrays.fill(y(), 0, this.f11134e, (Object) null);
            m.g(A());
            Arrays.fill(z(), 0, this.f11134e, 0);
        }
        this.f11134e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (x()) {
            return false;
        }
        Set<E> n10 = n();
        if (n10 != null) {
            return n10.contains(obj);
        }
        int c10 = t.c(obj);
        int s10 = s();
        int h10 = m.h(A(), c10 & s10);
        if (h10 == 0) {
            return false;
        }
        int b10 = m.b(c10, s10);
        do {
            int i10 = h10 - 1;
            int p10 = p(i10);
            if (m.b(p10, s10) == b10 && eb.k.a(obj, o(i10))) {
                return true;
            }
            h10 = m.c(p10, s10);
        } while (h10 != 0);
        return false;
    }

    int f(int i10, int i11) {
        return i10 - 1;
    }

    int h() {
        eb.o.v(x(), "Arrays already allocated");
        int i10 = this.f11133d;
        int j10 = m.j(i10);
        this.f11130a = m.a(j10);
        H(j10 - 1);
        this.f11131b = new int[i10];
        this.f11132c = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> n10 = n();
        return n10 != null ? n10.iterator() : new a();
    }

    Set<E> k() {
        Set<E> m10 = m(s() + 1);
        int q10 = q();
        while (q10 >= 0) {
            m10.add(o(q10));
            q10 = r(q10);
        }
        this.f11130a = m10;
        this.f11131b = null;
        this.f11132c = null;
        t();
        return m10;
    }

    Set<E> n() {
        Object obj = this.f11130a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    int q() {
        return isEmpty() ? -1 : 0;
    }

    int r(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f11134e) {
            return i11;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (x()) {
            return false;
        }
        Set<E> n10 = n();
        if (n10 != null) {
            return n10.remove(obj);
        }
        int s10 = s();
        int f10 = m.f(obj, null, s10, A(), z(), y(), null);
        if (f10 == -1) {
            return false;
        }
        w(f10, s10);
        this.f11134e--;
        t();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> n10 = n();
        return n10 != null ? n10.size() : this.f11134e;
    }

    void t() {
        this.f11133d += 32;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (x()) {
            return new Object[0];
        }
        Set<E> n10 = n();
        return n10 != null ? n10.toArray() : Arrays.copyOf(y(), this.f11134e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (!x()) {
            Set<E> n10 = n();
            return n10 != null ? (T[]) n10.toArray(tArr) : (T[]) q0.e(y(), 0, this.f11134e, tArr);
        }
        if (tArr.length > 0) {
            tArr[0] = null;
        }
        return tArr;
    }

    void u(int i10) {
        eb.o.e(i10 >= 0, "Expected size must be >= 0");
        this.f11133d = hb.e.f(i10, 1, 1073741823);
    }

    void v(int i10, E e10, int i11, int i12) {
        G(i10, m.d(i11, 0, i12));
        F(i10, e10);
    }

    void w(int i10, int i11) {
        Object A = A();
        int[] z10 = z();
        Object[] y10 = y();
        int size = size() - 1;
        if (i10 >= size) {
            y10[i10] = null;
            z10[i10] = 0;
            return;
        }
        Object obj = y10[size];
        y10[i10] = obj;
        y10[size] = null;
        z10[i10] = z10[size];
        z10[size] = 0;
        int c10 = t.c(obj) & i11;
        int h10 = m.h(A, c10);
        int i12 = size + 1;
        if (h10 == i12) {
            m.i(A, c10, i10 + 1);
            return;
        }
        while (true) {
            int i13 = h10 - 1;
            int i14 = z10[i13];
            int c11 = m.c(i14, i11);
            if (c11 == i12) {
                z10[i13] = m.d(i14, i10 + 1, i11);
                return;
            }
            h10 = c11;
        }
    }

    boolean x() {
        return this.f11130a == null;
    }
}
