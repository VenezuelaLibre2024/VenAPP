package p459y6;

import p459y6.InterfaceC12636z;

/* renamed from: y6.d */
/* loaded from: classes.dex */
public class C12612d implements InterfaceC12636z {

    /* renamed from: a */
    private final long f34242a;

    /* renamed from: b */
    private final long f34243b;

    /* renamed from: c */
    private final int f34244c;

    /* renamed from: d */
    private final long f34245d;

    /* renamed from: e */
    private final int f34246e;

    /* renamed from: f */
    private final long f34247f;

    /* renamed from: g */
    private final boolean f34248g;

    public C12612d(long j10, long j11, int i10, int i11, boolean z10) {
        long m41519e;
        this.f34242a = j10;
        this.f34243b = j11;
        this.f34244c = i11 == -1 ? 1 : i11;
        this.f34246e = i10;
        this.f34248g = z10;
        if (j10 == -1) {
            this.f34245d = -1L;
            m41519e = -9223372036854775807L;
        } else {
            this.f34245d = j10 - j11;
            m41519e = m41519e(j10, j11, i10);
        }
        this.f34247f = m41519e;
    }

    /* renamed from: a */
    private long m41518a(long j10) {
        int i10 = this.f34244c;
        long j11 = (((j10 * this.f34246e) / 8000000) / i10) * i10;
        long j12 = this.f34245d;
        if (j12 != -1) {
            j11 = Math.min(j11, j12 - i10);
        }
        return this.f34243b + Math.max(j11, 0L);
    }

    /* renamed from: e */
    private static long m41519e(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / i10;
    }

    /* renamed from: b */
    public long m41520b(long j10) {
        return m41519e(j10, this.f34243b, this.f34246e);
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: d */
    public InterfaceC12636z.a mo125d(long j10) {
        if (this.f34245d == -1 && !this.f34248g) {
            return new InterfaceC12636z.a(new C12607a0(0L, this.f34243b));
        }
        long m41518a = m41518a(j10);
        long m41520b = m41520b(m41518a);
        C12607a0 c12607a0 = new C12607a0(m41520b, m41518a);
        if (this.f34245d != -1 && m41520b < j10) {
            int i10 = this.f34244c;
            if (i10 + m41518a < this.f34242a) {
                long j11 = m41518a + i10;
                return new InterfaceC12636z.a(c12607a0, new C12607a0(m41520b(j11), j11));
            }
        }
        return new InterfaceC12636z.a(c12607a0);
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: h */
    public boolean mo126h() {
        return this.f34245d != -1 || this.f34248g;
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: i */
    public long mo127i() {
        return this.f34247f;
    }
}
