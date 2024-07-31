package p397v7;

import android.net.Uri;
import com.google.common.collect.AbstractC5907w;
import p082eb.C7153i;
import p351s8.C10835n;
import p351s8.C10844v;
import p351s8.InterfaceC10811b;
import p351s8.InterfaceC10816d0;
import p351s8.InterfaceC10827j;
import p351s8.InterfaceC10834m0;
import p361t6.AbstractC11018d4;
import p361t6.C11010c2;
import p361t6.C11108u1;
import p363t8.C11137a;
import p397v7.InterfaceC11684a0;

/* renamed from: v7.a1 */
/* loaded from: classes.dex */
public final class C11685a1 extends AbstractC11683a {

    /* renamed from: A */
    private InterfaceC10834m0 f30612A;

    /* renamed from: s */
    private final C10835n f30613s;

    /* renamed from: t */
    private final InterfaceC10827j.a f30614t;

    /* renamed from: u */
    private final C11108u1 f30615u;

    /* renamed from: v */
    private final long f30616v;

    /* renamed from: w */
    private final InterfaceC10816d0 f30617w;

    /* renamed from: x */
    private final boolean f30618x;

    /* renamed from: y */
    private final AbstractC11018d4 f30619y;

    /* renamed from: z */
    private final C11010c2 f30620z;

    /* renamed from: v7.a1$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final InterfaceC10827j.a f30621a;

        /* renamed from: b */
        private InterfaceC10816d0 f30622b = new C10844v();

        /* renamed from: c */
        private boolean f30623c = true;

        /* renamed from: d */
        private Object f30624d;

        /* renamed from: e */
        private String f30625e;

        public b(InterfaceC10827j.a aVar) {
            this.f30621a = (InterfaceC10827j.a) C11137a.m34603e(aVar);
        }

        /* renamed from: a */
        public C11685a1 m36821a(C11010c2.l lVar, long j10) {
            return new C11685a1(this.f30625e, lVar, this.f30621a, j10, this.f30622b, this.f30623c, this.f30624d);
        }

        /* renamed from: b */
        public b m36822b(InterfaceC10816d0 interfaceC10816d0) {
            if (interfaceC10816d0 == null) {
                interfaceC10816d0 = new C10844v();
            }
            this.f30622b = interfaceC10816d0;
            return this;
        }
    }

    private C11685a1(String str, C11010c2.l lVar, InterfaceC10827j.a aVar, long j10, InterfaceC10816d0 interfaceC10816d0, boolean z10, Object obj) {
        this.f30614t = aVar;
        this.f30616v = j10;
        this.f30617w = interfaceC10816d0;
        this.f30618x = z10;
        C11010c2 m33728a = new C11010c2.c().m33734g(Uri.EMPTY).m33731d(lVar.f28116a.toString()).m33732e(AbstractC5907w.m15082w(lVar)).m33733f(obj).m33728a();
        this.f30620z = m33728a;
        C11108u1.b m34542W = new C11108u1.b().m34552g0((String) C7153i.m21272a(lVar.f28117b, "text/x-unknown")).m34543X(lVar.f28118c).m34554i0(lVar.f28119d).m34550e0(lVar.f28120e).m34542W(lVar.f28121f);
        String str2 = lVar.f28122g;
        this.f30615u = m34542W.m34540U(str2 == null ? str : str2).m34526G();
        this.f30613s = new C10835n.b().m33038i(lVar.f28116a).m33031b(1).m33030a();
        this.f30619y = new C11740y0(j10, true, false, false, null, m33728a);
    }

    @Override // p397v7.AbstractC11683a
    /* renamed from: C */
    protected void mo11833C(InterfaceC10834m0 interfaceC10834m0) {
        this.f30612A = interfaceC10834m0;
        m36802D(this.f30619y);
    }

    @Override // p397v7.AbstractC11683a
    /* renamed from: E */
    protected void mo11834E() {
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: d */
    public C11010c2 mo11842d() {
        return this.f30620z;
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: e */
    public InterfaceC11739y mo11843e(InterfaceC11684a0.b bVar, InterfaceC10811b interfaceC10811b, long j10) {
        return new C11742z0(this.f30613s, this.f30614t, this.f30612A, this.f30615u, this.f30616v, this.f30617w, m36814w(bVar), this.f30618x);
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: l */
    public void mo11844l(InterfaceC11739y interfaceC11739y) {
        ((C11742z0) interfaceC11739y).m37111q();
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: n */
    public void mo11845n() {
    }
}
