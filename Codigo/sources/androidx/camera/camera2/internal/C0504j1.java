package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.camera.core.impl.C0647m1;
import androidx.camera.core.impl.C0656p1;
import androidx.camera.core.impl.C0662r1;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.camera.core.impl.InterfaceC0649n0;
import p298q.C10214a;
import p298q.C10216c;
import p354t.C10951p;

/* renamed from: androidx.camera.camera2.internal.j1 */
/* loaded from: classes.dex */
final class C0504j1 implements C0701y1.d {

    /* renamed from: a */
    static final C0504j1 f2402a = new C0504j1();

    @Override // androidx.camera.core.impl.C0701y1.d
    /* renamed from: a */
    public void mo2534a(Size size, InterfaceC0640k2<?> interfaceC0640k2, C0701y1.b bVar) {
        C0701y1 m3144o = interfaceC0640k2.m3144o(null);
        InterfaceC0649n0 m3210X = C0656p1.m3210X();
        int m3390l = C0701y1.m3379a().m3390l();
        if (m3144o != null) {
            m3390l = m3144o.m3390l();
            bVar.m3392a(m3144o.m3380b());
            bVar.m3394c(m3144o.m3387i());
            bVar.m3393b(m3144o.m3385g());
            m3210X = m3144o.m3382d();
        }
        bVar.m3408r(m3210X);
        if (interfaceC0640k2 instanceof C0662r1) {
            C10951p.m33432b(size, bVar);
        }
        C10214a c10214a = new C10214a(interfaceC0640k2);
        bVar.m3410t(c10214a.m30563a0(m3390l));
        bVar.m3396e(c10214a.m30564b0(C0524n1.m2576b()));
        bVar.m3402k(c10214a.m30567e0(C0519m1.m2555b()));
        bVar.m3395d(C0549s1.m2653d(c10214a.m30566d0(C0528o0.m2593c())));
        C0647m1 m3184a0 = C0647m1.m3184a0();
        m3184a0.mo3178r(C10214a.f25250M, c10214a.m30560X(C10216c.m30577e()));
        m3184a0.mo3178r(C10214a.f25252O, c10214a.m30565c0(null));
        m3184a0.mo3178r(C10214a.f25246I, Long.valueOf(c10214a.m30568f0(-1L)));
        bVar.m3398g(m3184a0);
        bVar.m3398g(c10214a.m30561Y());
    }
}
