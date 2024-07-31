package y;

import androidx.camera.core.n;
import androidx.concurrent.futures.c;
import java.util.Objects;
import y.v0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    private final v0 f31504a;

    /* renamed from: b, reason: collision with root package name */
    private final v0.a f31505b;

    /* renamed from: e, reason: collision with root package name */
    private c.a<Void> f31508e;

    /* renamed from: f, reason: collision with root package name */
    private c.a<Void> f31509f;

    /* renamed from: h, reason: collision with root package name */
    private com.google.common.util.concurrent.f<Void> f31511h;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31510g = false;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.f<Void> f31506c = androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: y.g0
        @Override // androidx.concurrent.futures.c.InterfaceC0032c
        public final Object a(c.a aVar) {
            Object n10;
            n10 = i0.this.n(aVar);
            return n10;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    private final com.google.common.util.concurrent.f<Void> f31507d = androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: y.h0
        @Override // androidx.concurrent.futures.c.InterfaceC0032c
        public final Object a(c.a aVar) {
            Object o10;
            o10 = i0.this.o(aVar);
            return o10;
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(v0 v0Var, v0.a aVar) {
        this.f31504a = v0Var;
        this.f31505b = aVar;
    }

    private void h(w.g0 g0Var) {
        androidx.camera.core.impl.utils.q.a();
        this.f31510g = true;
        com.google.common.util.concurrent.f<Void> fVar = this.f31511h;
        Objects.requireNonNull(fVar);
        fVar.cancel(true);
        this.f31508e.f(g0Var);
        this.f31509f.c(null);
    }

    private void k() {
        androidx.core.util.h.n(this.f31506c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(c.a aVar) {
        this.f31508e = aVar;
        return "CaptureCompleteFuture";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(c.a aVar) {
        this.f31509f = aVar;
        return "RequestCompleteFuture";
    }

    private void p() {
        androidx.core.util.h.n(!this.f31507d.isDone(), "The callback can only complete once.");
        this.f31509f.c(null);
    }

    private void q(w.g0 g0Var) {
        androidx.camera.core.impl.utils.q.a();
        this.f31504a.r(g0Var);
    }

    @Override // y.n0
    public void a(w.g0 g0Var) {
        androidx.camera.core.impl.utils.q.a();
        if (this.f31510g) {
            return;
        }
        k();
        p();
        q(g0Var);
    }

    @Override // y.n0
    public void b(n.h hVar) {
        androidx.camera.core.impl.utils.q.a();
        if (this.f31510g) {
            return;
        }
        k();
        p();
        this.f31504a.s(hVar);
    }

    @Override // y.n0
    public void c(androidx.camera.core.o oVar) {
        androidx.camera.core.impl.utils.q.a();
        if (this.f31510g) {
            return;
        }
        k();
        p();
        this.f31504a.t(oVar);
    }

    @Override // y.n0
    public void d() {
        androidx.camera.core.impl.utils.q.a();
        if (this.f31510g) {
            return;
        }
        this.f31508e.c(null);
    }

    @Override // y.n0
    public void e(w.g0 g0Var) {
        androidx.camera.core.impl.utils.q.a();
        if (this.f31510g) {
            return;
        }
        boolean d10 = this.f31504a.d();
        if (!d10) {
            q(g0Var);
        }
        p();
        this.f31508e.f(g0Var);
        if (d10) {
            this.f31505b.b(this.f31504a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(w.g0 g0Var) {
        androidx.camera.core.impl.utils.q.a();
        if (this.f31507d.isDone()) {
            return;
        }
        h(g0Var);
        q(g0Var);
    }

    @Override // y.n0
    public boolean isAborted() {
        return this.f31510g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        androidx.camera.core.impl.utils.q.a();
        if (this.f31507d.isDone()) {
            return;
        }
        h(new w.g0(3, "The request is aborted silently and retried.", null));
        this.f31505b.b(this.f31504a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.common.util.concurrent.f<Void> l() {
        androidx.camera.core.impl.utils.q.a();
        return this.f31506c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.common.util.concurrent.f<Void> m() {
        androidx.camera.core.impl.utils.q.a();
        return this.f31507d;
    }

    public void r(com.google.common.util.concurrent.f<Void> fVar) {
        androidx.camera.core.impl.utils.q.a();
        androidx.core.util.h.n(this.f31511h == null, "CaptureRequestFuture can only be set once.");
        this.f31511h = fVar;
    }
}
