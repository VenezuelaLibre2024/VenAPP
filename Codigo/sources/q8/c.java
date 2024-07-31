package q8;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import t6.u1;
import t8.r0;
import v7.d1;

/* loaded from: classes.dex */
public abstract class c implements r {

    /* renamed from: a, reason: collision with root package name */
    protected final d1 f23631a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f23632b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f23633c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23634d;

    /* renamed from: e, reason: collision with root package name */
    private final u1[] f23635e;

    /* renamed from: f, reason: collision with root package name */
    private final long[] f23636f;

    /* renamed from: g, reason: collision with root package name */
    private int f23637g;

    public c(d1 d1Var, int... iArr) {
        this(d1Var, iArr, 0);
    }

    public c(d1 d1Var, int[] iArr, int i10) {
        int i11 = 0;
        t8.a.g(iArr.length > 0);
        this.f23634d = i10;
        this.f23631a = (d1) t8.a.e(d1Var);
        int length = iArr.length;
        this.f23632b = length;
        this.f23635e = new u1[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f23635e[i12] = d1Var.d(iArr[i12]);
        }
        Arrays.sort(this.f23635e, new Comparator() { // from class: q8.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int w10;
                w10 = c.w((u1) obj, (u1) obj2);
                return w10;
            }
        });
        this.f23633c = new int[this.f23632b];
        while (true) {
            int i13 = this.f23632b;
            if (i11 >= i13) {
                this.f23636f = new long[i13];
                return;
            } else {
                this.f23633c[i11] = d1Var.e(this.f23635e[i11]);
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int w(u1 u1Var, u1 u1Var2) {
        return u1Var2.f26513s - u1Var.f26513s;
    }

    @Override // q8.u
    public final u1 a(int i10) {
        return this.f23635e[i10];
    }

    @Override // q8.u
    public final int b(int i10) {
        return this.f23633c[i10];
    }

    @Override // q8.u
    public final int c(int i10) {
        for (int i11 = 0; i11 < this.f23632b; i11++) {
            if (this.f23633c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // q8.u
    public final d1 d() {
        return this.f23631a;
    }

    @Override // q8.u
    public final int e(u1 u1Var) {
        for (int i10 = 0; i10 < this.f23632b; i10++) {
            if (this.f23635e[i10] == u1Var) {
                return i10;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f23631a == cVar.f23631a && Arrays.equals(this.f23633c, cVar.f23633c);
    }

    @Override // q8.r
    public void f() {
    }

    public int hashCode() {
        if (this.f23637g == 0) {
            this.f23637g = (System.identityHashCode(this.f23631a) * 31) + Arrays.hashCode(this.f23633c);
        }
        return this.f23637g;
    }

    @Override // q8.r
    public boolean i(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean j11 = j(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.f23632b && !j11) {
            j11 = (i11 == i10 || j(i11, elapsedRealtime)) ? false : true;
            i11++;
        }
        if (!j11) {
            return false;
        }
        long[] jArr = this.f23636f;
        jArr[i10] = Math.max(jArr[i10], r0.b(elapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    @Override // q8.r
    public boolean j(int i10, long j10) {
        return this.f23636f[i10] > j10;
    }

    @Override // q8.r
    public void l(float f10) {
    }

    @Override // q8.u
    public final int length() {
        return this.f23633c.length;
    }

    @Override // q8.r
    public void p() {
    }

    @Override // q8.r
    public int q(long j10, List<? extends x7.n> list) {
        return list.size();
    }

    @Override // q8.r
    public final int r() {
        return this.f23633c[h()];
    }

    @Override // q8.r
    public final u1 s() {
        return this.f23635e[h()];
    }
}
