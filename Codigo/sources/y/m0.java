package y;

import java.util.Objects;
import y.e0;
import y.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    f0 f31532a;

    /* renamed from: b, reason: collision with root package name */
    private e0.a f31533b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a0.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f0 f31534a;

        a(f0 f0Var) {
            this.f31534a = f0Var;
        }

        @Override // a0.c
        public void a(Throwable th2) {
            androidx.camera.core.impl.utils.q.a();
            f0 f0Var = this.f31534a;
            m0 m0Var = m0.this;
            if (f0Var == m0Var.f31532a) {
                m0Var.f31532a = null;
            }
        }

        @Override // a0.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(androidx.camera.core.o oVar) {
        androidx.camera.core.impl.utils.q.a();
        androidx.core.util.h.m(this.f31532a != null);
        Object d10 = oVar.e1().b().d(this.f31532a.h());
        Objects.requireNonNull(d10);
        androidx.core.util.h.m(((Integer) d10).intValue() == this.f31532a.g().get(0).intValue());
        this.f31533b.a().accept(e0.b.c(this.f31532a, oVar));
        this.f31532a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(f0 f0Var) {
        androidx.camera.core.impl.utils.q.a();
        androidx.core.util.h.n(f0Var.g().size() == 1, "Cannot handle multi-image capture.");
        androidx.core.util.h.n(this.f31532a == null, "Already has an existing request.");
        this.f31532a = f0Var;
        a0.f.b(f0Var.a(), new a(f0Var), z.a.a());
    }

    public void d() {
    }

    public e0.a f(o.c cVar) {
        cVar.a().a(new androidx.core.util.a() { // from class: y.k0
            @Override // androidx.core.util.a
            public final void accept(Object obj) {
                m0.this.c((androidx.camera.core.o) obj);
            }
        });
        cVar.d().a(new androidx.core.util.a() { // from class: y.l0
            @Override // androidx.core.util.a
            public final void accept(Object obj) {
                m0.this.e((f0) obj);
            }
        });
        e0.a d10 = e0.a.d(cVar.b(), cVar.c());
        this.f31533b = d10;
        return d10;
    }
}
