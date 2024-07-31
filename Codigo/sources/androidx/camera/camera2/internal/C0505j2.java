package androidx.camera.camera2.internal;

import androidx.camera.core.impl.C0611d1;
import androidx.camera.core.impl.C0642l0;
import androidx.camera.core.impl.InterfaceC0640k2;
import p298q.C10214a;
import p354t.C10946k;

/* renamed from: androidx.camera.camera2.internal.j2 */
/* loaded from: classes.dex */
final class C0505j2 extends C0533p0 {

    /* renamed from: c */
    static final C0505j2 f2403c = new C0505j2(new C10946k());

    /* renamed from: b */
    private final C10946k f2404b;

    private C0505j2(C10946k c10946k) {
        this.f2404b = c10946k;
    }

    @Override // androidx.camera.camera2.internal.C0533p0, androidx.camera.core.impl.C0642l0.b
    /* renamed from: a */
    public void mo2535a(InterfaceC0640k2<?> interfaceC0640k2, C0642l0.a aVar) {
        super.mo2535a(interfaceC0640k2, aVar);
        if (!(interfaceC0640k2 instanceof C0611d1)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        C0611d1 c0611d1 = (C0611d1) interfaceC0640k2;
        C10214a.a aVar2 = new C10214a.a();
        if (c0611d1.m3025c0()) {
            this.f2404b.m33423a(c0611d1.m3020X(), aVar2);
        }
        aVar.m3164e(aVar2.m30569c());
    }
}
