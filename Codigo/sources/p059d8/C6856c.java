package p059d8;

import com.google.android.exoplayer2.source.rtsp.C4739h;
import p363t8.C11137a;
import p363t8.C11144d0;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p396v6.C11633b;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;

/* renamed from: d8.c */
/* loaded from: classes.dex */
public final class C6856c implements InterfaceC6858e {

    /* renamed from: a */
    private final C4739h f15189a;

    /* renamed from: c */
    private InterfaceC12609b0 f15191c;

    /* renamed from: d */
    private int f15192d;

    /* renamed from: f */
    private long f15194f;

    /* renamed from: g */
    private long f15195g;

    /* renamed from: b */
    private final C11144d0 f15190b = new C11144d0();

    /* renamed from: e */
    private long f15193e = -9223372036854775807L;

    public C6856c(C4739h c4739h) {
        this.f15189a = c4739h;
    }

    /* renamed from: e */
    private void m19822e() {
        if (this.f15192d > 0) {
            m19823f();
        }
    }

    /* renamed from: f */
    private void m19823f() {
        ((InterfaceC12609b0) C11172r0.m34928j(this.f15191c)).mo331b(this.f15194f, 1, this.f15192d, 0, null);
        this.f15192d = 0;
    }

    /* renamed from: g */
    private void m19824g(C11146e0 c11146e0, boolean z10, int i10, long j10) {
        int m34679a = c11146e0.m34679a();
        ((InterfaceC12609b0) C11137a.m34603e(this.f15191c)).m41511a(c11146e0, m34679a);
        this.f15192d += m34679a;
        this.f15194f = j10;
        if (z10 && i10 == 3) {
            m19823f();
        }
    }

    /* renamed from: h */
    private void m19825h(C11146e0 c11146e0, int i10, long j10) {
        this.f15190b.m34638n(c11146e0.m34682e());
        this.f15190b.m34643s(2);
        for (int i11 = 0; i11 < i10; i11++) {
            C11633b.b m36474f = C11633b.m36474f(this.f15190b);
            ((InterfaceC12609b0) C11137a.m34603e(this.f15191c)).m41511a(c11146e0, m36474f.f30279e);
            ((InterfaceC12609b0) C11172r0.m34928j(this.f15191c)).mo331b(j10, 1, m36474f.f30279e, 0, null);
            j10 += (m36474f.f30280f / m36474f.f30277c) * 1000000;
            this.f15190b.m34643s(m36474f.f30279e);
        }
    }

    /* renamed from: i */
    private void m19826i(C11146e0 c11146e0, long j10) {
        int m34679a = c11146e0.m34679a();
        ((InterfaceC12609b0) C11137a.m34603e(this.f15191c)).m41511a(c11146e0, m34679a);
        ((InterfaceC12609b0) C11172r0.m34928j(this.f15191c)).mo331b(j10, 1, m34679a, 0, null);
    }

    /* renamed from: j */
    private static long m19827j(long j10, long j11, long j12, int i10) {
        return j10 + C11172r0.m34885O0(j11 - j12, 1000000L, i10);
    }

    @Override // p059d8.InterfaceC6858e
    /* renamed from: a */
    public void mo19818a(long j10, long j11) {
        this.f15193e = j10;
        this.f15195g = j11;
    }

    @Override // p059d8.InterfaceC6858e
    /* renamed from: b */
    public void mo19819b(C11146e0 c11146e0, long j10, int i10, boolean z10) {
        int m34664H = c11146e0.m34664H() & 3;
        int m34664H2 = c11146e0.m34664H() & 255;
        long m19827j = m19827j(this.f15195g, j10, this.f15193e, this.f15189a.f9393b);
        if (m34664H == 0) {
            m19822e();
            if (m34664H2 == 1) {
                m19826i(c11146e0, m19827j);
                return;
            } else {
                m19825h(c11146e0, m34664H2, m19827j);
                return;
            }
        }
        if (m34664H == 1 || m34664H == 2) {
            m19822e();
        } else if (m34664H != 3) {
            throw new IllegalArgumentException(String.valueOf(m34664H));
        }
        m19824g(c11146e0, z10, m34664H, m19827j);
    }

    @Override // p059d8.InterfaceC6858e
    /* renamed from: c */
    public void mo19820c(InterfaceC12623m interfaceC12623m, int i10) {
        InterfaceC12609b0 mo308d = interfaceC12623m.mo308d(i10, 1);
        this.f15191c = mo308d;
        mo308d.mo332c(this.f15189a.f9394c);
    }

    @Override // p059d8.InterfaceC6858e
    /* renamed from: d */
    public void mo19821d(long j10, int i10) {
        C11137a.m34605g(this.f15193e == -9223372036854775807L);
        this.f15193e = j10;
    }
}
