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
import p082eb.C7155k;
import p082eb.C7159o;
import p137hb.C7690e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.l */
/* loaded from: classes2.dex */
public class C5885l<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: a */
    private transient Object f12345a;

    /* renamed from: b */
    private transient int[] f12346b;

    /* renamed from: c */
    transient Object[] f12347c;

    /* renamed from: d */
    private transient int f12348d;

    /* renamed from: e */
    private transient int f12349e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.l$a */
    /* loaded from: classes2.dex */
    public class a implements Iterator<E> {

        /* renamed from: a */
        int f12350a;

        /* renamed from: b */
        int f12351b;

        /* renamed from: c */
        int f12352c = -1;

        a() {
            this.f12350a = C5885l.this.f12348d;
            this.f12351b = C5885l.this.m14983q();
        }

        /* renamed from: a */
        private void m14990a() {
            if (C5885l.this.f12348d != this.f12350a) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: c */
        void m14991c() {
            this.f12350a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12351b >= 0;
        }

        @Override // java.util.Iterator
        public E next() {
            m14990a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f12351b;
            this.f12352c = i10;
            E e10 = (E) C5885l.this.m14973o(i10);
            this.f12351b = C5885l.this.m14984r(this.f12351b);
            return e10;
        }

        @Override // java.util.Iterator
        public void remove() {
            m14990a();
            C5878i.m14884c(this.f12352c >= 0);
            m14991c();
            C5885l c5885l = C5885l.this;
            c5885l.remove(c5885l.m14973o(this.f12352c));
            this.f12351b = C5885l.this.m14979f(this.f12351b, this.f12352c);
            this.f12352c = -1;
        }
    }

    C5885l() {
        m14986u(3);
    }

    /* renamed from: A */
    private Object m14963A() {
        Object obj = this.f12345a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: D */
    private void m14964D(int i10) {
        int min;
        int length = m14977z().length;
        if (i10 <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        m14978C(min);
    }

    /* renamed from: E */
    private int m14965E(int i10, int i11, int i12, int i13) {
        Object m15001a = C5887m.m15001a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            C5887m.m15009i(m15001a, i12 & i14, i13 + 1);
        }
        Object m14963A = m14963A();
        int[] m14977z = m14977z();
        for (int i15 = 0; i15 <= i10; i15++) {
            int m15008h = C5887m.m15008h(m14963A, i15);
            while (m15008h != 0) {
                int i16 = m15008h - 1;
                int i17 = m14977z[i16];
                int m15002b = C5887m.m15002b(i17, i10) | i15;
                int i18 = m15002b & i14;
                int m15008h2 = C5887m.m15008h(m15001a, i18);
                C5887m.m15009i(m15001a, i18, m15008h);
                m14977z[i16] = C5887m.m15004d(m15002b, m15008h2, i14);
                m15008h = C5887m.m15003c(i17, i10);
            }
        }
        this.f12345a = m15001a;
        m14968H(i14);
        return i14;
    }

    /* renamed from: F */
    private void m14966F(int i10, E e10) {
        m14976y()[i10] = e10;
    }

    /* renamed from: G */
    private void m14967G(int i10, int i11) {
        m14977z()[i10] = i11;
    }

    /* renamed from: H */
    private void m14968H(int i10) {
        this.f12348d = C5887m.m15004d(this.f12348d, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    /* renamed from: l */
    public static <E> C5885l<E> m14971l() {
        return new C5885l<>();
    }

    /* renamed from: m */
    private Set<E> m14972m(int i10) {
        return new LinkedHashSet(i10, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public E m14973o(int i10) {
        return (E) m14976y()[i10];
    }

    /* renamed from: p */
    private int m14974p(int i10) {
        return m14977z()[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid size: " + readInt);
        }
        m14986u(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            add(objectInputStream.readObject());
        }
    }

    /* renamed from: s */
    private int m14975s() {
        return (1 << (this.f12348d & 31)) - 1;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    /* renamed from: y */
    private Object[] m14976y() {
        Object[] objArr = this.f12347c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: z */
    private int[] m14977z() {
        int[] iArr = this.f12346b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: C */
    void m14978C(int i10) {
        this.f12346b = Arrays.copyOf(m14977z(), i10);
        this.f12347c = Arrays.copyOf(m14976y(), i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        if (m14989x()) {
            m14980h();
        }
        Set<E> m14982n = m14982n();
        if (m14982n != null) {
            return m14982n.add(e10);
        }
        int[] m14977z = m14977z();
        Object[] m14976y = m14976y();
        int i10 = this.f12349e;
        int i11 = i10 + 1;
        int m15051c = C5901t.m15051c(e10);
        int m14975s = m14975s();
        int i12 = m15051c & m14975s;
        int m15008h = C5887m.m15008h(m14963A(), i12);
        if (m15008h == 0) {
            if (i11 <= m14975s) {
                C5887m.m15009i(m14963A(), i12, i11);
                m14964D(i11);
                m14987v(i10, e10, m15051c, m14975s);
                this.f12349e = i11;
                m14985t();
                return true;
            }
            m14975s = m14965E(m14975s, C5887m.m15005e(m14975s), m15051c, i10);
            m14964D(i11);
            m14987v(i10, e10, m15051c, m14975s);
            this.f12349e = i11;
            m14985t();
            return true;
        }
        int m15002b = C5887m.m15002b(m15051c, m14975s);
        int i13 = 0;
        while (true) {
            int i14 = m15008h - 1;
            int i15 = m14977z[i14];
            if (C5887m.m15002b(i15, m14975s) == m15002b && C7155k.m21289a(e10, m14976y[i14])) {
                return false;
            }
            int m15003c = C5887m.m15003c(i15, m14975s);
            i13++;
            if (m15003c != 0) {
                m15008h = m15003c;
            } else {
                if (i13 >= 9) {
                    return m14981k().add(e10);
                }
                if (i11 <= m14975s) {
                    m14977z[i14] = C5887m.m15004d(i15, i11, m14975s);
                }
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (m14989x()) {
            return;
        }
        m14985t();
        Set<E> m14982n = m14982n();
        if (m14982n != null) {
            this.f12348d = C7690e.m23415f(size(), 3, 1073741823);
            m14982n.clear();
            this.f12345a = null;
        } else {
            Arrays.fill(m14976y(), 0, this.f12349e, (Object) null);
            C5887m.m15007g(m14963A());
            Arrays.fill(m14977z(), 0, this.f12349e, 0);
        }
        this.f12349e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (m14989x()) {
            return false;
        }
        Set<E> m14982n = m14982n();
        if (m14982n != null) {
            return m14982n.contains(obj);
        }
        int m15051c = C5901t.m15051c(obj);
        int m14975s = m14975s();
        int m15008h = C5887m.m15008h(m14963A(), m15051c & m14975s);
        if (m15008h == 0) {
            return false;
        }
        int m15002b = C5887m.m15002b(m15051c, m14975s);
        do {
            int i10 = m15008h - 1;
            int m14974p = m14974p(i10);
            if (C5887m.m15002b(m14974p, m14975s) == m15002b && C7155k.m21289a(obj, m14973o(i10))) {
                return true;
            }
            m15008h = C5887m.m15003c(m14974p, m14975s);
        } while (m15008h != 0);
        return false;
    }

    /* renamed from: f */
    int m14979f(int i10, int i11) {
        return i10 - 1;
    }

    /* renamed from: h */
    int m14980h() {
        C7159o.m21319v(m14989x(), "Arrays already allocated");
        int i10 = this.f12348d;
        int m15010j = C5887m.m15010j(i10);
        this.f12345a = C5887m.m15001a(m15010j);
        m14968H(m15010j - 1);
        this.f12346b = new int[i10];
        this.f12347c = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> m14982n = m14982n();
        return m14982n != null ? m14982n.iterator() : new a();
    }

    /* renamed from: k */
    Set<E> m14981k() {
        Set<E> m14972m = m14972m(m14975s() + 1);
        int m14983q = m14983q();
        while (m14983q >= 0) {
            m14972m.add(m14973o(m14983q));
            m14983q = m14984r(m14983q);
        }
        this.f12345a = m14972m;
        this.f12346b = null;
        this.f12347c = null;
        m14985t();
        return m14972m;
    }

    /* renamed from: n */
    Set<E> m14982n() {
        Object obj = this.f12345a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    /* renamed from: q */
    int m14983q() {
        return isEmpty() ? -1 : 0;
    }

    /* renamed from: r */
    int m14984r(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f12349e) {
            return i11;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (m14989x()) {
            return false;
        }
        Set<E> m14982n = m14982n();
        if (m14982n != null) {
            return m14982n.remove(obj);
        }
        int m14975s = m14975s();
        int m15006f = C5887m.m15006f(obj, null, m14975s, m14963A(), m14977z(), m14976y(), null);
        if (m15006f == -1) {
            return false;
        }
        m14988w(m15006f, m14975s);
        this.f12349e--;
        m14985t();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> m14982n = m14982n();
        return m14982n != null ? m14982n.size() : this.f12349e;
    }

    /* renamed from: t */
    void m14985t() {
        this.f12348d += 32;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (m14989x()) {
            return new Object[0];
        }
        Set<E> m14982n = m14982n();
        return m14982n != null ? m14982n.toArray() : Arrays.copyOf(m14976y(), this.f12349e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (!m14989x()) {
            Set<E> m14982n = m14982n();
            return m14982n != null ? (T[]) m14982n.toArray(tArr) : (T[]) C5896q0.m15035e(m14976y(), 0, this.f12349e, tArr);
        }
        if (tArr.length > 0) {
            tArr[0] = null;
        }
        return tArr;
    }

    /* renamed from: u */
    void m14986u(int i10) {
        C7159o.m21302e(i10 >= 0, "Expected size must be >= 0");
        this.f12348d = C7690e.m23415f(i10, 1, 1073741823);
    }

    /* renamed from: v */
    void m14987v(int i10, E e10, int i11, int i12) {
        m14967G(i10, C5887m.m15004d(i11, 0, i12));
        m14966F(i10, e10);
    }

    /* renamed from: w */
    void m14988w(int i10, int i11) {
        Object m14963A = m14963A();
        int[] m14977z = m14977z();
        Object[] m14976y = m14976y();
        int size = size() - 1;
        if (i10 >= size) {
            m14976y[i10] = null;
            m14977z[i10] = 0;
            return;
        }
        Object obj = m14976y[size];
        m14976y[i10] = obj;
        m14976y[size] = null;
        m14977z[i10] = m14977z[size];
        m14977z[size] = 0;
        int m15051c = C5901t.m15051c(obj) & i11;
        int m15008h = C5887m.m15008h(m14963A, m15051c);
        int i12 = size + 1;
        if (m15008h == i12) {
            C5887m.m15009i(m14963A, m15051c, i10 + 1);
            return;
        }
        while (true) {
            int i13 = m15008h - 1;
            int i14 = m14977z[i13];
            int m15003c = C5887m.m15003c(i14, i11);
            if (m15003c == i12) {
                m14977z[i13] = C5887m.m15004d(i14, i10 + 1, i11);
                return;
            }
            m15008h = m15003c;
        }
    }

    /* renamed from: x */
    boolean m14989x() {
        return this.f12345a == null;
    }
}
