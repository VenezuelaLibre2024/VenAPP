package p155i7;

import p155i7.InterfaceC7879i0;
import p363t8.C11146e0;
import p396v6.C11633b;
import p459y6.C12635y;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12626p;
import p459y6.InterfaceC12636z;

/* renamed from: i7.b */
/* loaded from: classes.dex */
public final class C7864b implements InterfaceC12621k {

    /* renamed from: d */
    public static final InterfaceC12626p f18863d = new InterfaceC12626p() { // from class: i7.a
        @Override // p459y6.InterfaceC12626p
        /* renamed from: c */
        public final InterfaceC12621k[] mo9153c() {
            InterfaceC12621k[] m24180d;
            m24180d = C7864b.m24180d();
            return m24180d;
        }
    };

    /* renamed from: a */
    private final C7866c f18864a = new C7866c();

    /* renamed from: b */
    private final C11146e0 f18865b = new C11146e0(2786);

    /* renamed from: c */
    private boolean f18866c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ InterfaceC12621k[] m24180d() {
        return new InterfaceC12621k[]{new C7864b()};
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        this.f18866c = false;
        this.f18864a.mo24187c();
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f18864a.mo24188d(interfaceC12623m, new InterfaceC7879i0.d(0, 1));
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
            interfaceC12622l.mo41540q(c11146e0.m34682e(), 0, 6);
            c11146e0.m34677U(0);
            if (c11146e0.m34670N() != 2935) {
                interfaceC12622l.mo41534f();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                interfaceC12622l.mo41536k(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int m36475g = C11633b.m36475g(c11146e0.m34682e());
                if (m36475g == -1) {
                    return false;
                }
                interfaceC12622l.mo41536k(m36475g - 6);
            }
        }
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        int read = interfaceC12622l.read(this.f18865b.m34682e(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f18865b.m34677U(0);
        this.f18865b.m34676T(read);
        if (!this.f18866c) {
            this.f18864a.mo24190f(0L, 4);
            this.f18866c = true;
        }
        this.f18864a.mo24186b(this.f18865b);
        return 0;
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
    }
}
