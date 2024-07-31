package androidx.camera.camera2.internal;

import androidx.camera.core.impl.C0642l0;
import androidx.camera.core.impl.C0656p1;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.camera.core.impl.InterfaceC0649n0;
import p298q.C10214a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.p0 */
/* loaded from: classes.dex */
public class C0533p0 implements C0642l0.b {

    /* renamed from: a */
    static final C0533p0 f2469a = new C0533p0();

    @Override // androidx.camera.core.impl.C0642l0.b
    /* renamed from: a */
    public void mo2535a(InterfaceC0640k2<?> interfaceC0640k2, C0642l0.a aVar) {
        C0642l0 m3146s = interfaceC0640k2.m3146s(null);
        InterfaceC0649n0 m3210X = C0656p1.m3210X();
        int m3156h = C0642l0.m3149a().m3156h();
        if (m3146s != null) {
            m3156h = m3146s.m3156h();
            aVar.m3160a(m3146s.m3150b());
            m3210X = m3146s.m3153e();
        }
        aVar.m3174q(m3210X);
        C10214a c10214a = new C10214a(interfaceC0640k2);
        aVar.m3175r(c10214a.m30563a0(m3156h));
        aVar.m3162c(C0549s1.m2653d(c10214a.m30566d0(C0528o0.m2593c())));
        aVar.m3164e(c10214a.m30561Y());
    }
}
