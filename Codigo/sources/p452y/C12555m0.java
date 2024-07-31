package p452y;

import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.utils.C0688q;
import androidx.core.util.C0984h;
import androidx.core.util.InterfaceC0977a;
import java.util.Objects;
import p002a0.C0009f;
import p002a0.InterfaceC0006c;
import p452y.C12539e0;
import p452y.C12558o;
import p474z.C12747a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y.m0 */
/* loaded from: classes.dex */
public class C12555m0 {

    /* renamed from: a */
    C12541f0 f34052a;

    /* renamed from: b */
    private C12539e0.a f34053b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.m0$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0006c<Void> {

        /* renamed from: a */
        final /* synthetic */ C12541f0 f34054a;

        a(C12541f0 c12541f0) {
            this.f34054a = c12541f0;
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
            C0688q.m3339a();
            C12541f0 c12541f0 = this.f34054a;
            C12555m0 c12555m0 = C12555m0.this;
            if (c12541f0 == c12555m0.f34052a) {
                c12555m0.f34052a = null;
            }
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m41219c(InterfaceC0710o interfaceC0710o) {
        C0688q.m3339a();
        C0984h.m4835m(this.f34052a != null);
        Object m3071d = interfaceC0710o.mo2883e1().mo8852b().m3071d(this.f34052a.m41183h());
        Objects.requireNonNull(m3071d);
        C0984h.m4835m(((Integer) m3071d).intValue() == this.f34052a.m41182g().get(0).intValue());
        this.f34053b.mo41170a().accept(C12539e0.b.m41173c(this.f34052a, interfaceC0710o));
        this.f34052a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m41220e(C12541f0 c12541f0) {
        C0688q.m3339a();
        C0984h.m4836n(c12541f0.m41182g().size() == 1, "Cannot handle multi-image capture.");
        C0984h.m4836n(this.f34052a == null, "Already has an existing request.");
        this.f34052a = c12541f0;
        C0009f.m16b(c12541f0.m41176a(), new a(c12541f0), C12747a.m42280a());
    }

    /* renamed from: d */
    public void m41221d() {
    }

    /* renamed from: f */
    public C12539e0.a m41222f(C12558o.c cVar) {
        cVar.mo41144a().m22409a(new InterfaceC0977a() { // from class: y.k0
            @Override // androidx.core.util.InterfaceC0977a
            public final void accept(Object obj) {
                C12555m0.this.m41219c((InterfaceC0710o) obj);
            }
        });
        cVar.mo41147d().m22409a(new InterfaceC0977a() { // from class: y.l0
            @Override // androidx.core.util.InterfaceC0977a
            public final void accept(Object obj) {
                C12555m0.this.m41220e((C12541f0) obj);
            }
        });
        C12539e0.a m41169d = C12539e0.a.m41169d(cVar.mo41145b(), cVar.mo41146c());
        this.f34053b = m41169d;
        return m41169d;
    }
}
