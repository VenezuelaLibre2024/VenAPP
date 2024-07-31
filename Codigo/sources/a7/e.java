package a7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import t8.r0;
import y6.a0;
import y6.b0;
import y6.l;
import y6.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    protected final b0 f98a;

    /* renamed from: b, reason: collision with root package name */
    private final int f99b;

    /* renamed from: c, reason: collision with root package name */
    private final int f100c;

    /* renamed from: d, reason: collision with root package name */
    private final long f101d;

    /* renamed from: e, reason: collision with root package name */
    private final int f102e;

    /* renamed from: f, reason: collision with root package name */
    private int f103f;

    /* renamed from: g, reason: collision with root package name */
    private int f104g;

    /* renamed from: h, reason: collision with root package name */
    private int f105h;

    /* renamed from: i, reason: collision with root package name */
    private int f106i;

    /* renamed from: j, reason: collision with root package name */
    private int f107j;

    /* renamed from: k, reason: collision with root package name */
    private long[] f108k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f109l;

    public e(int i10, int i11, long j10, int i12, b0 b0Var) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        t8.a.a(z10);
        this.f101d = j10;
        this.f102e = i12;
        this.f98a = b0Var;
        this.f99b = d(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f100c = i11 == 2 ? d(i10, 1650720768) : -1;
        this.f108k = new long[RecognitionOptions.UPC_A];
        this.f109l = new int[RecognitionOptions.UPC_A];
    }

    private static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private long e(int i10) {
        return (this.f101d * i10) / this.f102e;
    }

    private a0 h(int i10) {
        return new a0(this.f109l[i10] * g(), this.f108k[i10]);
    }

    public void a() {
        this.f105h++;
    }

    public void b(long j10) {
        if (this.f107j == this.f109l.length) {
            long[] jArr = this.f108k;
            this.f108k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f109l;
            this.f109l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f108k;
        int i10 = this.f107j;
        jArr2[i10] = j10;
        this.f109l[i10] = this.f106i;
        this.f107j = i10 + 1;
    }

    public void c() {
        this.f108k = Arrays.copyOf(this.f108k, this.f107j);
        this.f109l = Arrays.copyOf(this.f109l, this.f107j);
    }

    public long f() {
        return e(this.f105h);
    }

    public long g() {
        return e(1);
    }

    public z.a i(long j10) {
        int g10 = (int) (j10 / g());
        int h10 = r0.h(this.f109l, g10, true, true);
        if (this.f109l[h10] == g10) {
            return new z.a(h(h10));
        }
        a0 h11 = h(h10);
        int i10 = h10 + 1;
        return i10 < this.f108k.length ? new z.a(h11, h(i10)) : new z.a(h11);
    }

    public boolean j(int i10) {
        return this.f99b == i10 || this.f100c == i10;
    }

    public void k() {
        this.f106i++;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f109l, this.f105h) >= 0;
    }

    public boolean m(l lVar) {
        int i10 = this.f104g;
        int f10 = i10 - this.f98a.f(lVar, i10, false);
        this.f104g = f10;
        boolean z10 = f10 == 0;
        if (z10) {
            if (this.f103f > 0) {
                this.f98a.b(f(), l() ? 1 : 0, this.f103f, 0, null);
            }
            a();
        }
        return z10;
    }

    public void n(int i10) {
        this.f103f = i10;
        this.f104g = i10;
    }

    public void o(long j10) {
        int i10;
        if (this.f107j == 0) {
            i10 = 0;
        } else {
            i10 = this.f109l[r0.i(this.f108k, j10, true, true)];
        }
        this.f105h = i10;
    }
}
