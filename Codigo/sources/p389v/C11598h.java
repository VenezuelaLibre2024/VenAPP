package p389v;

import androidx.camera.camera2.internal.C0523n0;
import androidx.camera.core.impl.InterfaceC0602b0;
import androidx.core.util.C0984h;
import p407w.InterfaceC12028o;

/* renamed from: v.h */
/* loaded from: classes.dex */
public final class C11598h {

    /* renamed from: a */
    private final C0523n0 f30172a;

    public C11598h(C0523n0 c0523n0) {
        this.f30172a = c0523n0;
    }

    /* renamed from: a */
    public static C11598h m36364a(InterfaceC12028o interfaceC12028o) {
        InterfaceC0602b0 mo2982h = ((InterfaceC0602b0) interfaceC12028o).mo2982h();
        C0984h.m4824b(mo2982h instanceof C0523n0, "CameraInfo doesn't contain Camera2 implementation.");
        return ((C0523n0) mo2982h).m2567k();
    }

    /* renamed from: b */
    public String m36365b() {
        return this.f30172a.mo2559b();
    }
}
