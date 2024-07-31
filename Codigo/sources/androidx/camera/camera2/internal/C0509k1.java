package androidx.camera.camera2.internal;

import android.content.Context;
import androidx.camera.core.impl.C0642l0;
import androidx.camera.core.impl.C0647m1;
import androidx.camera.core.impl.C0656p1;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0619f1;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.camera.core.impl.InterfaceC0644l2;
import androidx.camera.core.impl.InterfaceC0649n0;

/* renamed from: androidx.camera.camera2.internal.k1 */
/* loaded from: classes.dex */
public final class C0509k1 implements InterfaceC0644l2 {

    /* renamed from: b */
    final C0416c2 f2417b;

    public C0509k1(Context context) {
        this.f2417b = C0416c2.m2195c(context);
    }

    @Override // androidx.camera.core.impl.InterfaceC0644l2
    /* renamed from: a */
    public InterfaceC0649n0 mo2542a(InterfaceC0644l2.b bVar, int i10) {
        C0647m1 m3184a0 = C0647m1.m3184a0();
        C0701y1.b bVar2 = new C0701y1.b();
        bVar2.m3410t(C0516l3.m2552b(bVar, i10));
        m3184a0.mo3178r(InterfaceC0640k2.f2865r, bVar2.m3406o());
        m3184a0.mo3178r(InterfaceC0640k2.f2867t, C0504j1.f2402a);
        C0642l0.a aVar = new C0642l0.a();
        aVar.m3175r(C0516l3.m2551a(bVar, i10));
        m3184a0.mo3178r(InterfaceC0640k2.f2866s, aVar.m3167h());
        m3184a0.mo3178r(InterfaceC0640k2.f2868u, bVar == InterfaceC0644l2.b.IMAGE_CAPTURE ? C0505j2.f2403c : C0533p0.f2469a);
        if (bVar == InterfaceC0644l2.b.PREVIEW) {
            m3184a0.mo3178r(InterfaceC0619f1.f2806n, this.f2417b.m2198f());
        }
        m3184a0.mo3178r(InterfaceC0619f1.f2801i, Integer.valueOf(this.f2417b.m2197d(true).getRotation()));
        if (bVar == InterfaceC0644l2.b.VIDEO_CAPTURE || bVar == InterfaceC0644l2.b.STREAM_SHARING) {
            m3184a0.mo3178r(InterfaceC0640k2.f2872y, Boolean.TRUE);
        }
        return C0656p1.m3211Y(m3184a0);
    }
}
