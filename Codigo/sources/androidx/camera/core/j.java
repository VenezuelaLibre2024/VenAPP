package androidx.camera.core;

import androidx.camera.core.impl.g1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j extends i {

    /* loaded from: classes.dex */
    class a implements a0.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f2694a;

        a(o oVar) {
            this.f2694a = oVar;
        }

        @Override // a0.c
        public void a(Throwable th2) {
            this.f2694a.close();
        }

        @Override // a0.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    @Override // androidx.camera.core.i
    o d(g1 g1Var) {
        return g1Var.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.core.i
    public void g() {
    }

    @Override // androidx.camera.core.i
    void o(o oVar) {
        a0.f.b(e(oVar), new a(oVar), z.a.a());
    }
}
