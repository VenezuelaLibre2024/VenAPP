package p059d8;

import com.google.android.exoplayer2.source.rtsp.C4739h;
import p082eb.C7147c;
import p363t8.C11137a;
import p363t8.C11144d0;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d8.b */
/* loaded from: classes.dex */
public final class C6855b implements InterfaceC6858e {

    /* renamed from: a */
    private final C4739h f15180a;

    /* renamed from: b */
    private final C11144d0 f15181b = new C11144d0();

    /* renamed from: c */
    private final int f15182c;

    /* renamed from: d */
    private final int f15183d;

    /* renamed from: e */
    private final int f15184e;

    /* renamed from: f */
    private final int f15185f;

    /* renamed from: g */
    private long f15186g;

    /* renamed from: h */
    private InterfaceC12609b0 f15187h;

    /* renamed from: i */
    private long f15188i;

    public C6855b(C4739h c4739h) {
        int i10;
        this.f15180a = c4739h;
        this.f15182c = c4739h.f9393b;
        String str = (String) C11137a.m34603e(c4739h.f9395d.get("mode"));
        if (C7147c.m21249a(str, "AAC-hbr")) {
            this.f15183d = 13;
            i10 = 3;
        } else {
            if (!C7147c.m21249a(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f15183d = 6;
            i10 = 2;
        }
        this.f15184e = i10;
        this.f15185f = this.f15184e + this.f15183d;
    }

    /* renamed from: e */
    private static void m19816e(InterfaceC12609b0 interfaceC12609b0, long j10, int i10) {
        interfaceC12609b0.mo331b(j10, 1, i10, 0, null);
    }

    /* renamed from: f */
    private static long m19817f(long j10, long j11, long j12, int i10) {
        return j10 + C11172r0.m34885O0(j11 - j12, 1000000L, i10);
    }

    @Override // p059d8.InterfaceC6858e
    /* renamed from: a */
    public void mo19818a(long j10, long j11) {
        this.f15186g = j10;
        this.f15188i = j11;
    }

    @Override // p059d8.InterfaceC6858e
    /* renamed from: b */
    public void mo19819b(C11146e0 c11146e0, long j10, int i10, boolean z10) {
        C11137a.m34603e(this.f15187h);
        short m34660D = c11146e0.m34660D();
        int i11 = m34660D / this.f15185f;
        long m19817f = m19817f(this.f15188i, j10, this.f15186g, this.f15182c);
        this.f15181b.m34637m(c11146e0);
        if (i11 == 1) {
            int m34632h = this.f15181b.m34632h(this.f15183d);
            this.f15181b.m34642r(this.f15184e);
            this.f15187h.m41511a(c11146e0, c11146e0.m34679a());
            if (z10) {
                m19816e(this.f15187h, m19817f, m34632h);
                return;
            }
            return;
        }
        c11146e0.m34678V((m34660D + 7) / 8);
        for (int i12 = 0; i12 < i11; i12++) {
            int m34632h2 = this.f15181b.m34632h(this.f15183d);
            this.f15181b.m34642r(this.f15184e);
            this.f15187h.m41511a(c11146e0, m34632h2);
            m19816e(this.f15187h, m19817f, m34632h2);
            m19817f += C11172r0.m34885O0(i11, 1000000L, this.f15182c);
        }
    }

    @Override // p059d8.InterfaceC6858e
    /* renamed from: c */
    public void mo19820c(InterfaceC12623m interfaceC12623m, int i10) {
        InterfaceC12609b0 mo308d = interfaceC12623m.mo308d(i10, 1);
        this.f15187h = mo308d;
        mo308d.mo332c(this.f15180a.f9394c);
    }

    @Override // p059d8.InterfaceC6858e
    /* renamed from: d */
    public void mo19821d(long j10, int i10) {
        this.f15186g = j10;
    }
}
