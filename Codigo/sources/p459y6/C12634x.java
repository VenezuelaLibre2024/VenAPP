package p459y6;

import p363t8.C11137a;
import p363t8.C11172r0;
import p459y6.InterfaceC12636z;

/* renamed from: y6.x */
/* loaded from: classes.dex */
public final class C12634x implements InterfaceC12636z {

    /* renamed from: a */
    private final long[] f34327a;

    /* renamed from: b */
    private final long[] f34328b;

    /* renamed from: c */
    private final long f34329c;

    /* renamed from: d */
    private final boolean f34330d;

    public C12634x(long[] jArr, long[] jArr2, long j10) {
        C11137a.m34599a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f34330d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f34327a = jArr;
            this.f34328b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f34327a = jArr3;
            long[] jArr4 = new long[i10];
            this.f34328b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f34329c = j10;
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: d */
    public InterfaceC12636z.a mo125d(long j10) {
        if (!this.f34330d) {
            return new InterfaceC12636z.a(C12607a0.f34222c);
        }
        int m34926i = C11172r0.m34926i(this.f34328b, j10, true, true);
        C12607a0 c12607a0 = new C12607a0(this.f34328b[m34926i], this.f34327a[m34926i]);
        if (c12607a0.f34223a == j10 || m34926i == this.f34328b.length - 1) {
            return new InterfaceC12636z.a(c12607a0);
        }
        int i10 = m34926i + 1;
        return new InterfaceC12636z.a(c12607a0, new C12607a0(this.f34328b[i10], this.f34327a[i10]));
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: h */
    public boolean mo126h() {
        return this.f34330d;
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: i */
    public long mo127i() {
        return this.f34329c;
    }
}
