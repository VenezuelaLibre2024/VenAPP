package p155i7;

import p155i7.InterfaceC7879i0;
import p363t8.C11146e0;
import p396v6.C11635c;
import p459y6.C12635y;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12626p;
import p459y6.InterfaceC12636z;

/* renamed from: i7.e */
/* loaded from: classes.dex */
public final class C7870e implements InterfaceC12621k {

    /* renamed from: d */
    public static final InterfaceC12626p f18887d = new InterfaceC12626p() { // from class: i7.d
        @Override // p459y6.InterfaceC12626p
        /* renamed from: c */
        public final InterfaceC12621k[] mo9153c() {
            InterfaceC12621k[] m24197d;
            m24197d = C7870e.m24197d();
            return m24197d;
        }
    };

    /* renamed from: a */
    private final C7872f f18888a = new C7872f();

    /* renamed from: b */
    private final C11146e0 f18889b = new C11146e0(16384);

    /* renamed from: c */
    private boolean f18890c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ InterfaceC12621k[] m24197d() {
        return new InterfaceC12621k[]{new C7870e()};
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        this.f18890c = false;
        this.f18888a.mo24187c();
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f18888a.mo24188d(interfaceC12623m, new InterfaceC7879i0.d(0, 1));
        interfaceC12623m.mo324q();
        interfaceC12623m.mo323p(new InterfaceC12636z.b(-9223372036854775807L));
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public boolean mo123e(InterfaceC12622l interfaceC12622l) {
        C11146e0 c11146e0 = new C11146e0(10);
        int i10 = 0;
        while (true) {
            interfaceC12622l.mo41540q(c11146e0.m34682e(), 0, 10);
            c11146e0.m34677U(0);
            if (c11146e0.m34667K() != 4801587) {
                break;
            }
            c11146e0.m34678V(3);
            int m34663G = c11146e0.m34663G();
            i10 += m34663G + 10;
            interfaceC12622l.mo41536k(m34663G);
        }
        interfaceC12622l.mo41534f();
        interfaceC12622l.mo41536k(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            interfaceC12622l.mo41540q(c11146e0.m34682e(), 0, 7);
            c11146e0.m34677U(0);
            int m34670N = c11146e0.m34670N();
            if (m34670N == 44096 || m34670N == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int m36484e = C11635c.m36484e(c11146e0.m34682e(), m34670N);
                if (m36484e == -1) {
                    return false;
                }
                interfaceC12622l.mo41536k(m36484e - 7);
            } else {
                interfaceC12622l.mo41534f();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                interfaceC12622l.mo41536k(i12);
                i11 = 0;
            }
        }
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        int read = interfaceC12622l.read(this.f18889b.m34682e(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f18889b.m34677U(0);
        this.f18889b.m34676T(read);
        if (!this.f18890c) {
            this.f18888a.mo24190f(0L, 4);
            this.f18890c = true;
        }
        this.f18888a.mo24186b(this.f18889b);
        return 0;
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
    }
}
