package p059d8;

import com.google.android.exoplayer2.source.rtsp.C4739h;
import p040c8.C1885a;
import p361t6.C11005b3;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11179x;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d8.d */
/* loaded from: classes.dex */
public final class C6857d implements InterfaceC6858e {

    /* renamed from: c */
    private final C4739h f15198c;

    /* renamed from: d */
    private InterfaceC12609b0 f15199d;

    /* renamed from: e */
    private int f15200e;

    /* renamed from: h */
    private int f15203h;

    /* renamed from: i */
    private long f15204i;

    /* renamed from: b */
    private final C11146e0 f15197b = new C11146e0(C11179x.f29069a);

    /* renamed from: a */
    private final C11146e0 f15196a = new C11146e0();

    /* renamed from: f */
    private long f15201f = -9223372036854775807L;

    /* renamed from: g */
    private int f15202g = -1;

    public C6857d(C4739h c4739h) {
        this.f15198c = c4739h;
    }

    /* renamed from: e */
    private static int m19828e(int i10) {
        return i10 == 5 ? 1 : 0;
    }

    /* renamed from: f */
    private void m19829f(C11146e0 c11146e0, int i10) {
        byte b10 = c11146e0.m34682e()[0];
        byte b11 = c11146e0.m34682e()[1];
        int i11 = (b10 & 224) | (b11 & 31);
        boolean z10 = (b11 & 128) > 0;
        boolean z11 = (b11 & 64) > 0;
        if (z10) {
            this.f15203h += m19833j();
            c11146e0.m34682e()[1] = (byte) i11;
            this.f15196a.m34674R(c11146e0.m34682e());
            this.f15196a.m34677U(1);
        } else {
            int m10010b = C1885a.m10010b(this.f15202g);
            if (i10 != m10010b) {
                C11173s.m34970i("RtpH264Reader", C11172r0.m34860C("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(m10010b), Integer.valueOf(i10)));
                return;
            } else {
                this.f15196a.m34674R(c11146e0.m34682e());
                this.f15196a.m34677U(2);
            }
        }
        int m34679a = this.f15196a.m34679a();
        this.f15199d.m41511a(this.f15196a, m34679a);
        this.f15203h += m34679a;
        if (z11) {
            this.f15200e = m19828e(i11 & 31);
        }
    }

    /* renamed from: g */
    private void m19830g(C11146e0 c11146e0) {
        int m34679a = c11146e0.m34679a();
        this.f15203h += m19833j();
        this.f15199d.m41511a(c11146e0, m34679a);
        this.f15203h += m34679a;
        this.f15200e = m19828e(c11146e0.m34682e()[0] & 31);
    }

    /* renamed from: h */
    private void m19831h(C11146e0 c11146e0) {
        c11146e0.m34664H();
        while (c11146e0.m34679a() > 4) {
            int m34670N = c11146e0.m34670N();
            this.f15203h += m19833j();
            this.f15199d.m41511a(c11146e0, m34670N);
            this.f15203h += m34670N;
        }
        this.f15200e = 0;
    }

    /* renamed from: i */
    private static long m19832i(long j10, long j11, long j12) {
        return j10 + C11172r0.m34885O0(j11 - j12, 1000000L, 90000L);
    }

    /* renamed from: j */
    private int m19833j() {
        this.f15197b.m34677U(0);
        int m34679a = this.f15197b.m34679a();
        ((InterfaceC12609b0) C11137a.m34603e(this.f15199d)).m41511a(this.f15197b, m34679a);
        return m34679a;
    }

    @Override // p059d8.InterfaceC6858e
    /* renamed from: a */
    public void mo19818a(long j10, long j11) {
        this.f15201f = j10;
        this.f15203h = 0;
        this.f15204i = j11;
    }

    @Override // p059d8.InterfaceC6858e
    /* renamed from: b */
    public void mo19819b(C11146e0 c11146e0, long j10, int i10, boolean z10) {
        try {
            int i11 = c11146e0.m34682e()[0] & 31;
            C11137a.m34607i(this.f15199d);
            if (i11 > 0 && i11 < 24) {
                m19830g(c11146e0);
            } else if (i11 == 24) {
                m19831h(c11146e0);
            } else {
                if (i11 != 28) {
                    throw C11005b3.m33717c(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i11)), null);
                }
                m19829f(c11146e0, i10);
            }
            if (z10) {
                if (this.f15201f == -9223372036854775807L) {
                    this.f15201f = j10;
                }
                this.f15199d.mo331b(m19832i(this.f15204i, j10, this.f15201f), this.f15200e, this.f15203h, 0, null);
                this.f15203h = 0;
            }
            this.f15202g = i10;
        } catch (IndexOutOfBoundsException e10) {
            throw C11005b3.m33717c(null, e10);
        }
    }

    @Override // p059d8.InterfaceC6858e
    /* renamed from: c */
    public void mo19820c(InterfaceC12623m interfaceC12623m, int i10) {
        InterfaceC12609b0 mo308d = interfaceC12623m.mo308d(i10, 2);
        this.f15199d = mo308d;
        ((InterfaceC12609b0) C11172r0.m34928j(mo308d)).mo332c(this.f15198c.f9394c);
    }

    @Override // p059d8.InterfaceC6858e
    /* renamed from: d */
    public void mo19821d(long j10, int i10) {
    }
}
