package p449xj;

/* renamed from: xj.j */
/* loaded from: classes3.dex */
public final class C12507j<T> {

    /* renamed from: a */
    final float f33907a;

    /* renamed from: b */
    int f33908b;

    /* renamed from: c */
    int f33909c;

    /* renamed from: d */
    int f33910d;

    /* renamed from: e */
    T[] f33911e;

    public C12507j() {
        this(16, 0.75f);
    }

    public C12507j(int i10, float f10) {
        this.f33907a = f10;
        int m40953a = C12508k.m40953a(i10);
        this.f33908b = m40953a - 1;
        this.f33910d = (int) (f10 * m40953a);
        this.f33911e = (T[]) new Object[m40953a];
    }

    /* renamed from: c */
    static int m40947c(int i10) {
        int i11 = i10 * (-1640531527);
        return i11 ^ (i11 >>> 16);
    }

    /* renamed from: a */
    public boolean m40948a(T t10) {
        T t11;
        T[] tArr = this.f33911e;
        int i10 = this.f33908b;
        int m40947c = m40947c(t10.hashCode()) & i10;
        T t12 = tArr[m40947c];
        if (t12 != null) {
            if (t12.equals(t10)) {
                return false;
            }
            do {
                m40947c = (m40947c + 1) & i10;
                t11 = tArr[m40947c];
                if (t11 == null) {
                }
            } while (!t11.equals(t10));
            return false;
        }
        tArr[m40947c] = t10;
        int i11 = this.f33909c + 1;
        this.f33909c = i11;
        if (i11 >= this.f33910d) {
            m40950d();
        }
        return true;
    }

    /* renamed from: b */
    public Object[] m40949b() {
        return this.f33911e;
    }

    /* renamed from: d */
    void m40950d() {
        T t10;
        T[] tArr = this.f33911e;
        int length = tArr.length;
        int i10 = length << 1;
        int i11 = i10 - 1;
        T[] tArr2 = (T[]) new Object[i10];
        int i12 = this.f33909c;
        while (true) {
            int i13 = i12 - 1;
            if (i12 == 0) {
                this.f33908b = i11;
                this.f33910d = (int) (i10 * this.f33907a);
                this.f33911e = tArr2;
                return;
            }
            do {
                length--;
                t10 = tArr[length];
            } while (t10 == null);
            int m40947c = m40947c(t10.hashCode()) & i11;
            if (tArr2[m40947c] == null) {
                tArr2[m40947c] = tArr[length];
                i12 = i13;
            }
            do {
                m40947c = (m40947c + 1) & i11;
            } while (tArr2[m40947c] != null);
            tArr2[m40947c] = tArr[length];
            i12 = i13;
        }
    }

    /* renamed from: e */
    public boolean m40951e(T t10) {
        T t11;
        T[] tArr = this.f33911e;
        int i10 = this.f33908b;
        int m40947c = m40947c(t10.hashCode()) & i10;
        T t12 = tArr[m40947c];
        if (t12 == null) {
            return false;
        }
        if (t12.equals(t10)) {
            return m40952f(m40947c, tArr, i10);
        }
        do {
            m40947c = (m40947c + 1) & i10;
            t11 = tArr[m40947c];
            if (t11 == null) {
                return false;
            }
        } while (!t11.equals(t10));
        return m40952f(m40947c, tArr, i10);
    }

    /* renamed from: f */
    boolean m40952f(int i10, T[] tArr, int i11) {
        int i12;
        T t10;
        this.f33909c--;
        while (true) {
            int i13 = i10 + 1;
            while (true) {
                i12 = i13 & i11;
                t10 = tArr[i12];
                if (t10 == null) {
                    tArr[i10] = null;
                    return true;
                }
                int m40947c = m40947c(t10.hashCode()) & i11;
                if (i10 > i12) {
                    if (i10 >= m40947c && m40947c > i12) {
                        break;
                    }
                    i13 = i12 + 1;
                } else if (i10 < m40947c && m40947c <= i12) {
                    i13 = i12 + 1;
                }
            }
            tArr[i10] = t10;
            i10 = i12;
        }
    }
}
