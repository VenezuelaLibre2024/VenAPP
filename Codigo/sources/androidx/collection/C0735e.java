package androidx.collection;

/* renamed from: androidx.collection.e */
/* loaded from: classes.dex */
public class C0735e<E> implements Cloneable {

    /* renamed from: e */
    private static final Object f3195e = new Object();

    /* renamed from: a */
    private boolean f3196a;

    /* renamed from: b */
    private long[] f3197b;

    /* renamed from: c */
    private Object[] f3198c;

    /* renamed from: d */
    private int f3199d;

    public C0735e() {
        this(10);
    }

    public C0735e(int i10) {
        this.f3196a = false;
        if (i10 == 0) {
            this.f3197b = C0734d.f3193b;
            this.f3198c = C0734d.f3194c;
        } else {
            int m3679f = C0734d.m3679f(i10);
            this.f3197b = new long[m3679f];
            this.f3198c = new Object[m3679f];
        }
    }

    /* renamed from: c */
    private void m3680c() {
        int i10 = this.f3199d;
        long[] jArr = this.f3197b;
        Object[] objArr = this.f3198c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f3195e) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f3196a = false;
        this.f3199d = i11;
    }

    /* renamed from: a */
    public void m3681a() {
        int i10 = this.f3199d;
        Object[] objArr = this.f3198c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f3199d = 0;
        this.f3196a = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0735e<E> clone() {
        try {
            C0735e<E> c0735e = (C0735e) super.clone();
            c0735e.f3197b = (long[]) this.f3197b.clone();
            c0735e.f3198c = (Object[]) this.f3198c.clone();
            return c0735e;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: d */
    public E m3683d(long j10) {
        return m3684e(j10, null);
    }

    /* renamed from: e */
    public E m3684e(long j10, E e10) {
        E e11;
        int m3675b = C0734d.m3675b(this.f3197b, this.f3199d, j10);
        return (m3675b < 0 || (e11 = (E) this.f3198c[m3675b]) == f3195e) ? e10 : e11;
    }

    /* renamed from: g */
    public int m3685g(long j10) {
        if (this.f3196a) {
            m3680c();
        }
        return C0734d.m3675b(this.f3197b, this.f3199d, j10);
    }

    /* renamed from: h */
    public long m3686h(int i10) {
        if (this.f3196a) {
            m3680c();
        }
        return this.f3197b[i10];
    }

    /* renamed from: i */
    public void m3687i(long j10, E e10) {
        int m3675b = C0734d.m3675b(this.f3197b, this.f3199d, j10);
        if (m3675b >= 0) {
            this.f3198c[m3675b] = e10;
            return;
        }
        int i10 = ~m3675b;
        int i11 = this.f3199d;
        if (i10 < i11) {
            Object[] objArr = this.f3198c;
            if (objArr[i10] == f3195e) {
                this.f3197b[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f3196a && i11 >= this.f3197b.length) {
            m3680c();
            i10 = ~C0734d.m3675b(this.f3197b, this.f3199d, j10);
        }
        int i12 = this.f3199d;
        if (i12 >= this.f3197b.length) {
            int m3679f = C0734d.m3679f(i12 + 1);
            long[] jArr = new long[m3679f];
            Object[] objArr2 = new Object[m3679f];
            long[] jArr2 = this.f3197b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f3198c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3197b = jArr;
            this.f3198c = objArr2;
        }
        int i13 = this.f3199d;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f3197b;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f3198c;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f3199d - i10);
        }
        this.f3197b[i10] = j10;
        this.f3198c[i10] = e10;
        this.f3199d++;
    }

    /* renamed from: j */
    public void m3688j(long j10) {
        int m3675b = C0734d.m3675b(this.f3197b, this.f3199d, j10);
        if (m3675b >= 0) {
            Object[] objArr = this.f3198c;
            Object obj = objArr[m3675b];
            Object obj2 = f3195e;
            if (obj != obj2) {
                objArr[m3675b] = obj2;
                this.f3196a = true;
            }
        }
    }

    /* renamed from: k */
    public void m3689k(int i10) {
        Object[] objArr = this.f3198c;
        Object obj = objArr[i10];
        Object obj2 = f3195e;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f3196a = true;
        }
    }

    /* renamed from: l */
    public int m3690l() {
        if (this.f3196a) {
            m3680c();
        }
        return this.f3199d;
    }

    /* renamed from: m */
    public E m3691m(int i10) {
        if (this.f3196a) {
            m3680c();
        }
        return (E) this.f3198c[i10];
    }

    public String toString() {
        if (m3690l() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f3199d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f3199d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(m3686h(i10));
            sb2.append('=');
            E m3691m = m3691m(i10);
            if (m3691m != this) {
                sb2.append(m3691m);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
