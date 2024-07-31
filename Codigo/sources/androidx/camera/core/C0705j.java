package androidx.camera.core;

import androidx.camera.core.impl.InterfaceC0623g1;
import p002a0.C0009f;
import p002a0.InterfaceC0006c;
import p474z.C12747a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.j */
/* loaded from: classes.dex */
public final class C0705j extends AbstractC0596i {

    /* renamed from: androidx.camera.core.j$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC0006c<Void> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0710o f3039a;

        a(InterfaceC0710o interfaceC0710o) {
            this.f3039a = interfaceC0710o;
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
            this.f3039a.close();
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    @Override // androidx.camera.core.AbstractC0596i
    /* renamed from: d */
    InterfaceC0710o mo2957d(InterfaceC0623g1 interfaceC0623g1) {
        return interfaceC0623g1.mo2899g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.core.AbstractC0596i
    /* renamed from: g */
    public void mo2960g() {
    }

    @Override // androidx.camera.core.AbstractC0596i
    /* renamed from: o */
    void mo2962o(InterfaceC0710o interfaceC0710o) {
        C0009f.m16b(m2958e(interfaceC0710o), new a(interfaceC0710o), C12747a.m42280a());
    }
}
