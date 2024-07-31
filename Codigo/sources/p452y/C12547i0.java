package p452y;

import androidx.camera.core.C0709n;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.utils.C0688q;
import androidx.concurrent.futures.C0742c;
import androidx.core.util.C0984h;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.Objects;
import p407w.C12008g0;
import p452y.AbstractC12573v0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y.i0 */
/* loaded from: classes.dex */
public class C12547i0 implements InterfaceC12557n0 {

    /* renamed from: a */
    private final AbstractC12573v0 f34024a;

    /* renamed from: b */
    private final AbstractC12573v0.a f34025b;

    /* renamed from: e */
    private C0742c.a<Void> f34028e;

    /* renamed from: f */
    private C0742c.a<Void> f34029f;

    /* renamed from: h */
    private InterfaceFutureC5920f<Void> f34031h;

    /* renamed from: g */
    private boolean f34030g = false;

    /* renamed from: c */
    private final InterfaceFutureC5920f<Void> f34026c = C0742c.m3752a(new C0742c.c() { // from class: y.g0
        @Override // androidx.concurrent.futures.C0742c.c
        /* renamed from: a */
        public final Object mo14a(C0742c.a aVar) {
            Object m41198n;
            m41198n = C12547i0.this.m41198n(aVar);
            return m41198n;
        }
    });

    /* renamed from: d */
    private final InterfaceFutureC5920f<Void> f34027d = C0742c.m3752a(new C0742c.c() { // from class: y.h0
        @Override // androidx.concurrent.futures.C0742c.c
        /* renamed from: a */
        public final Object mo14a(C0742c.a aVar) {
            Object m41199o;
            m41199o = C12547i0.this.m41199o(aVar);
            return m41199o;
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12547i0(AbstractC12573v0 abstractC12573v0, AbstractC12573v0.a aVar) {
        this.f34024a = abstractC12573v0;
        this.f34025b = aVar;
    }

    /* renamed from: h */
    private void m41196h(C12008g0 c12008g0) {
        C0688q.m3339a();
        this.f34030g = true;
        InterfaceFutureC5920f<Void> interfaceFutureC5920f = this.f34031h;
        Objects.requireNonNull(interfaceFutureC5920f);
        interfaceFutureC5920f.cancel(true);
        this.f34028e.m3758f(c12008g0);
        this.f34029f.m3756c(null);
    }

    /* renamed from: k */
    private void m41197k() {
        C0984h.m4836n(this.f34026c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m41198n(C0742c.a aVar) {
        this.f34028e = aVar;
        return "CaptureCompleteFuture";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m41199o(C0742c.a aVar) {
        this.f34029f = aVar;
        return "RequestCompleteFuture";
    }

    /* renamed from: p */
    private void m41200p() {
        C0984h.m4836n(!this.f34027d.isDone(), "The callback can only complete once.");
        this.f34029f.m3756c(null);
    }

    /* renamed from: q */
    private void m41201q(C12008g0 c12008g0) {
        C0688q.m3339a();
        this.f34024a.m41313r(c12008g0);
    }

    @Override // p452y.InterfaceC12557n0
    /* renamed from: a */
    public void mo41202a(C12008g0 c12008g0) {
        C0688q.m3339a();
        if (this.f34030g) {
            return;
        }
        m41197k();
        m41200p();
        m41201q(c12008g0);
    }

    @Override // p452y.InterfaceC12557n0
    /* renamed from: b */
    public void mo41203b(C0709n.h hVar) {
        C0688q.m3339a();
        if (this.f34030g) {
            return;
        }
        m41197k();
        m41200p();
        this.f34024a.m41314s(hVar);
    }

    @Override // p452y.InterfaceC12557n0
    /* renamed from: c */
    public void mo41204c(InterfaceC0710o interfaceC0710o) {
        C0688q.m3339a();
        if (this.f34030g) {
            return;
        }
        m41197k();
        m41200p();
        this.f34024a.m41315t(interfaceC0710o);
    }

    @Override // p452y.InterfaceC12557n0
    /* renamed from: d */
    public void mo41205d() {
        C0688q.m3339a();
        if (this.f34030g) {
            return;
        }
        this.f34028e.m3756c(null);
    }

    @Override // p452y.InterfaceC12557n0
    /* renamed from: e */
    public void mo41206e(C12008g0 c12008g0) {
        C0688q.m3339a();
        if (this.f34030g) {
            return;
        }
        boolean m41302d = this.f34024a.m41302d();
        if (!m41302d) {
            m41201q(c12008g0);
        }
        m41200p();
        this.f34028e.m3758f(c12008g0);
        if (m41302d) {
            this.f34025b.mo41268b(this.f34024a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m41207i(C12008g0 c12008g0) {
        C0688q.m3339a();
        if (this.f34027d.isDone()) {
            return;
        }
        m41196h(c12008g0);
        m41201q(c12008g0);
    }

    @Override // p452y.InterfaceC12557n0
    public boolean isAborted() {
        return this.f34030g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m41208j() {
        C0688q.m3339a();
        if (this.f34027d.isDone()) {
            return;
        }
        m41196h(new C12008g0(3, "The request is aborted silently and retried.", null));
        this.f34025b.mo41268b(this.f34024a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public InterfaceFutureC5920f<Void> m41209l() {
        C0688q.m3339a();
        return this.f34026c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public InterfaceFutureC5920f<Void> m41210m() {
        C0688q.m3339a();
        return this.f34027d;
    }

    /* renamed from: r */
    public void m41211r(InterfaceFutureC5920f<Void> interfaceFutureC5920f) {
        C0688q.m3339a();
        C0984h.m4836n(this.f34031h == null, "CaptureRequestFuture can only be set once.");
        this.f34031h = interfaceFutureC5920f;
    }
}
