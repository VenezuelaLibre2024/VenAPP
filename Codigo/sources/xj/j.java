package xj;

/* loaded from: classes3.dex */
public final class j<T> {

    /* renamed from: a, reason: collision with root package name */
    final float f31387a;

    /* renamed from: b, reason: collision with root package name */
    int f31388b;

    /* renamed from: c, reason: collision with root package name */
    int f31389c;

    /* renamed from: d, reason: collision with root package name */
    int f31390d;

    /* renamed from: e, reason: collision with root package name */
    T[] f31391e;

    public j() {
        this(16, 0.75f);
    }

    public j(int i10, float f10) {
        this.f31387a = f10;
        int a10 = k.a(i10);
        this.f31388b = a10 - 1;
        this.f31390d = (int) (f10 * a10);
        this.f31391e = (T[]) new Object[a10];
    }

    static int c(int i10) {
        int i11 = i10 * (-1640531527);
        return i11 ^ (i11 >>> 16);
    }

    public boolean a(T t10) {
        T t11;
        T[] tArr = this.f31391e;
        int i10 = this.f31388b;
        int c10 = c(t10.hashCode()) & i10;
        T t12 = tArr[c10];
        if (t12 != null) {
            if (t12.equals(t10)) {
                return false;
            }
            do {
                c10 = (c10 + 1) & i10;
                t11 = tArr[c10];
                if (t11 == null) {
                }
            } while (!t11.equals(t10));
            return false;
        }
        tArr[c10] = t10;
        int i11 = this.f31389c + 1;
        this.f31389c = i11;
        if (i11 >= this.f31390d) {
            d();
        }
        return true;
    }

    public Object[] b() {
        return this.f31391e;
    }

    void d() {
        T t10;
        T[] tArr = this.f31391e;
        int length = tArr.length;
        int i10 = length << 1;
        int i11 = i10 - 1;
        T[] tArr2 = (T[]) new Object[i10];
        int i12 = this.f31389c;
        while (true) {
            int i13 = i12 - 1;
            if (i12 == 0) {
                this.f31388b = i11;
                this.f31390d = (int) (i10 * this.f31387a);
                this.f31391e = tArr2;
                return;
            }
            do {
                length--;
                t10 = tArr[length];
            } while (t10 == null);
            int c10 = c(t10.hashCode()) & i11;
            if (tArr2[c10] == null) {
                tArr2[c10] = tArr[length];
                i12 = i13;
            }
            do {
                c10 = (c10 + 1) & i11;
            } while (tArr2[c10] != null);
            tArr2[c10] = tArr[length];
            i12 = i13;
        }
    }

    public boolean e(T t10) {
        T t11;
        T[] tArr = this.f31391e;
        int i10 = this.f31388b;
        int c10 = c(t10.hashCode()) & i10;
        T t12 = tArr[c10];
        if (t12 == null) {
            return false;
        }
        if (t12.equals(t10)) {
            return f(c10, tArr, i10);
        }
        do {
            c10 = (c10 + 1) & i10;
            t11 = tArr[c10];
            if (t11 == null) {
                return false;
            }
        } while (!t11.equals(t10));
        return f(c10, tArr, i10);
    }

    boolean f(int i10, T[] tArr, int i11) {
        int i12;
        T t10;
        this.f31389c--;
        while (true) {
            int i13 = i10 + 1;
            while (true) {
                i12 = i13 & i11;
                t10 = tArr[i12];
                if (t10 == null) {
                    tArr[i10] = null;
                    return true;
                }
                int c10 = c(t10.hashCode()) & i11;
                if (i10 > i12) {
                    if (i10 >= c10 && c10 > i12) {
                        break;
                    }
                    i13 = i12 + 1;
                } else if (i10 < c10 && c10 <= i12) {
                    i13 = i12 + 1;
                }
            }
            tArr[i10] = t10;
            i10 = i12;
        }
    }
}
