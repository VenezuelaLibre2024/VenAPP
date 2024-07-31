package androidx.camera.core.impl;

import androidx.camera.core.impl.InterfaceC0649n0;
import androidx.core.util.C0984h;
import p407w.C12048y;

/* renamed from: androidx.camera.core.impl.e1 */
/* loaded from: classes.dex */
public interface InterfaceC0615e1 extends InterfaceC0671u1 {

    /* renamed from: f */
    public static final InterfaceC0649n0.a<Integer> f2794f = InterfaceC0649n0.a.m3199a("camerax.core.imageInput.inputFormat", Integer.TYPE);

    /* renamed from: g */
    public static final InterfaceC0649n0.a<C12048y> f2795g = InterfaceC0649n0.a.m3199a("camerax.core.imageInput.inputDynamicRange", C12048y.class);

    /* renamed from: G */
    default C12048y m3039G() {
        return (C12048y) C0984h.m4833k((C12048y) mo3197g(f2795g, C12048y.f32039c));
    }

    /* renamed from: n */
    default int mo3010n() {
        return ((Integer) mo3191a(f2794f)).intValue();
    }
}
