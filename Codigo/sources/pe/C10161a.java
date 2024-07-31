package pe;

import com.google.firebase.perf.config.C6277a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.C6344c;
import ee.InterfaceC7183b;
import p029bk.InterfaceC1806a;
import p098f6.InterfaceC7303g;
import p106fe.InterfaceC7337f;
import p144hi.C7741a;
import p144hi.C7742b;
import p274oe.C9933e;
import p274oe.C9935g;
import p312qe.C10467a;
import p312qe.C10468b;
import p312qe.C10469c;
import p312qe.C10470d;
import p312qe.C10471e;
import p312qe.C10472f;
import p312qe.C10473g;
import p312qe.C10474h;
import p485zb.C12867g;

/* renamed from: pe.a */
/* loaded from: classes.dex */
public final class C10161a implements InterfaceC10162b {

    /* renamed from: a */
    private InterfaceC1806a<C12867g> f24966a;

    /* renamed from: b */
    private InterfaceC1806a<InterfaceC7183b<C6344c>> f24967b;

    /* renamed from: c */
    private InterfaceC1806a<InterfaceC7337f> f24968c;

    /* renamed from: d */
    private InterfaceC1806a<InterfaceC7183b<InterfaceC7303g>> f24969d;

    /* renamed from: e */
    private InterfaceC1806a<RemoteConfigManager> f24970e;

    /* renamed from: f */
    private InterfaceC1806a<C6277a> f24971f;

    /* renamed from: g */
    private InterfaceC1806a<SessionManager> f24972g;

    /* renamed from: h */
    private InterfaceC1806a<C9933e> f24973h;

    /* renamed from: pe.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private C10467a f24974a;

        private b() {
        }

        /* renamed from: a */
        public InterfaceC10162b m30374a() {
            C7742b.m23638a(this.f24974a, C10467a.class);
            return new C10161a(this.f24974a);
        }

        /* renamed from: b */
        public b m30375b(C10467a c10467a) {
            this.f24974a = (C10467a) C7742b.m23639b(c10467a);
            return this;
        }
    }

    private C10161a(C10467a c10467a) {
        m30372c(c10467a);
    }

    /* renamed from: b */
    public static b m30371b() {
        return new b();
    }

    /* renamed from: c */
    private void m30372c(C10467a c10467a) {
        this.f24966a = C10469c.m31400a(c10467a);
        this.f24967b = C10471e.m31406a(c10467a);
        this.f24968c = C10470d.m31403a(c10467a);
        this.f24969d = C10474h.m31415a(c10467a);
        this.f24970e = C10472f.m31409a(c10467a);
        this.f24971f = C10468b.m31397a(c10467a);
        C10473g m31412a = C10473g.m31412a(c10467a);
        this.f24972g = m31412a;
        this.f24973h = C7741a.m23636a(C9935g.m29668a(this.f24966a, this.f24967b, this.f24968c, this.f24969d, this.f24970e, this.f24971f, m31412a));
    }

    @Override // pe.InterfaceC10162b
    /* renamed from: a */
    public C9933e mo30373a() {
        return this.f24973h.get();
    }
}
