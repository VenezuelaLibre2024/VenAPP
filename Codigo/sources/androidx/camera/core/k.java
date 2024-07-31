package androidx.camera.core;

import androidx.camera.core.e;
import androidx.camera.core.impl.g1;
import androidx.camera.core.k;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: t, reason: collision with root package name */
    final Executor f2696t;

    /* renamed from: u, reason: collision with root package name */
    private final Object f2697u = new Object();

    /* renamed from: v, reason: collision with root package name */
    o f2698v;

    /* renamed from: w, reason: collision with root package name */
    private b f2699w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a0.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f2700a;

        a(b bVar) {
            this.f2700a = bVar;
        }

        @Override // a0.c
        public void a(Throwable th2) {
            this.f2700a.close();
        }

        @Override // a0.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: d, reason: collision with root package name */
        final WeakReference<k> f2702d;

        b(o oVar, k kVar) {
            super(oVar);
            this.f2702d = new WeakReference<>(kVar);
            a(new e.a() { // from class: androidx.camera.core.l
                @Override // androidx.camera.core.e.a
                public final void a(o oVar2) {
                    k.b.this.i(oVar2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(o oVar) {
            final k kVar = this.f2702d.get();
            if (kVar != null) {
                kVar.f2696t.execute(new Runnable() { // from class: androidx.camera.core.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.this.z();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Executor executor) {
        this.f2696t = executor;
    }

    @Override // androidx.camera.core.i
    o d(g1 g1Var) {
        return g1Var.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.core.i
    public void g() {
        synchronized (this.f2697u) {
            o oVar = this.f2698v;
            if (oVar != null) {
                oVar.close();
                this.f2698v = null;
            }
        }
    }

    @Override // androidx.camera.core.i
    void o(o oVar) {
        synchronized (this.f2697u) {
            if (!this.f2435s) {
                oVar.close();
                return;
            }
            if (this.f2699w == null) {
                b bVar = new b(oVar, this);
                this.f2699w = bVar;
                a0.f.b(e(bVar), new a(bVar), z.a.a());
            } else {
                if (oVar.e1().c() <= this.f2699w.e1().c()) {
                    oVar.close();
                } else {
                    o oVar2 = this.f2698v;
                    if (oVar2 != null) {
                        oVar2.close();
                    }
                    this.f2698v = oVar;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        synchronized (this.f2697u) {
            this.f2699w = null;
            o oVar = this.f2698v;
            if (oVar != null) {
                this.f2698v = null;
                o(oVar);
            }
        }
    }
}
