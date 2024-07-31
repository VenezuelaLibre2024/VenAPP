package p018b0;

import androidx.camera.core.impl.InterfaceC0649n0;
import androidx.camera.core.impl.InterfaceC0671u1;

/* renamed from: b0.j */
/* loaded from: classes.dex */
public interface InterfaceC1602j<T> extends InterfaceC0671u1 {

    /* renamed from: C */
    public static final InterfaceC0649n0.a<String> f6863C = InterfaceC0649n0.a.m3199a("camerax.core.target.name", String.class);

    /* renamed from: D */
    public static final InterfaceC0649n0.a<Class<?>> f6864D = InterfaceC0649n0.a.m3199a("camerax.core.target.class", Class.class);

    /* renamed from: P */
    default String m8925P() {
        return (String) mo3191a(f6863C);
    }

    /* renamed from: u */
    default String m8926u(String str) {
        return (String) mo3197g(f6863C, str);
    }
}
