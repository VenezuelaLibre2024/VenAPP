package p009a7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import p363t8.C11137a;
import p363t8.C11172r0;
import p459y6.C12607a0;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12636z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a7.e */
/* loaded from: classes.dex */
public final class C0039e {

    /* renamed from: a */
    protected final InterfaceC12609b0 f98a;

    /* renamed from: b */
    private final int f99b;

    /* renamed from: c */
    private final int f100c;

    /* renamed from: d */
    private final long f101d;

    /* renamed from: e */
    private final int f102e;

    /* renamed from: f */
    private int f103f;

    /* renamed from: g */
    private int f104g;

    /* renamed from: h */
    private int f105h;

    /* renamed from: i */
    private int f106i;

    /* renamed from: j */
    private int f107j;

    /* renamed from: k */
    private long[] f108k;

    /* renamed from: l */
    private int[] f109l;

    public C0039e(int i10, int i11, long j10, int i12, InterfaceC12609b0 interfaceC12609b0) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        C11137a.m34599a(z10);
        this.f101d = j10;
        this.f102e = i12;
        this.f98a = interfaceC12609b0;
        this.f99b = m135d(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f100c = i11 == 2 ? m135d(i10, 1650720768) : -1;
        this.f108k = new long[RecognitionOptions.UPC_A];
        this.f109l = new int[RecognitionOptions.UPC_A];
    }

    /* renamed from: d */
    private static int m135d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    /* renamed from: e */
    private long m136e(int i10) {
        return (this.f101d * i10) / this.f102e;
    }

    /* renamed from: h */
    private C12607a0 m137h(int i10) {
        return new C12607a0(this.f109l[i10] * m142g(), this.f108k[i10]);
    }

    /* renamed from: a */
    public void m138a() {
        this.f105h++;
    }

    /* renamed from: b */
    public void m139b(long j10) {
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

    /* renamed from: c */
    public void m140c() {
        this.f108k = Arrays.copyOf(this.f108k, this.f107j);
        this.f109l = Arrays.copyOf(this.f109l, this.f107j);
    }

    /* renamed from: f */
    public long m141f() {
        return m136e(this.f105h);
    }

    /* renamed from: g */
    public long m142g() {
        return m136e(1);
    }

    /* renamed from: i */
    public InterfaceC12636z.a m143i(long j10) {
        int m142g = (int) (j10 / m142g());
        int m34924h = C11172r0.m34924h(this.f109l, m142g, true, true);
        if (this.f109l[m34924h] == m142g) {
            return new InterfaceC12636z.a(m137h(m34924h));
        }
        C12607a0 m137h = m137h(m34924h);
        int i10 = m34924h + 1;
        return i10 < this.f108k.length ? new InterfaceC12636z.a(m137h, m137h(i10)) : new InterfaceC12636z.a(m137h);
    }

    /* renamed from: j */
    public boolean m144j(int i10) {
        return this.f99b == i10 || this.f100c == i10;
    }

    /* renamed from: k */
    public void m145k() {
        this.f106i++;
    }

    /* renamed from: l */
    public boolean m146l() {
        return Arrays.binarySearch(this.f109l, this.f105h) >= 0;
    }

    /* renamed from: m */
    public boolean m147m(InterfaceC12622l interfaceC12622l) {
        int i10 = this.f104g;
        int m41512f = i10 - this.f98a.m41512f(interfaceC12622l, i10, false);
        this.f104g = m41512f;
        boolean z10 = m41512f == 0;
        if (z10) {
            if (this.f103f > 0) {
                this.f98a.mo331b(m141f(), m146l() ? 1 : 0, this.f103f, 0, null);
            }
            m138a();
        }
        return z10;
    }

    /* renamed from: n */
    public void m148n(int i10) {
        this.f103f = i10;
        this.f104g = i10;
    }

    /* renamed from: o */
    public void m149o(long j10) {
        int i10;
        if (this.f107j == 0) {
            i10 = 0;
        } else {
            i10 = this.f109l[C11172r0.m34926i(this.f108k, j10, true, true)];
        }
        this.f105h = i10;
    }
}
