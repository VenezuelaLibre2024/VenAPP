package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.C5942n;
import java.util.concurrent.atomic.AtomicReference;
import p179jb.AbstractC9015g;
import p179jb.C9030v;
import p179jb.InterfaceC9031w;

/* renamed from: com.google.crypto.tink.internal.h */
/* loaded from: classes2.dex */
public final class C5936h {

    /* renamed from: b */
    private static C5936h f12509b = new C5936h();

    /* renamed from: a */
    private final AtomicReference<C5942n> f12510a = new AtomicReference<>(new C5942n.b().m15261c());

    C5936h() {
    }

    /* renamed from: c */
    public static C5936h m15227c() {
        return f12509b;
    }

    /* renamed from: a */
    public <WrapperPrimitiveT> Class<?> m15228a(Class<WrapperPrimitiveT> cls) {
        return this.f12510a.get().m15256c(cls);
    }

    /* renamed from: b */
    public <KeyT extends AbstractC9015g, PrimitiveT> PrimitiveT m15229b(KeyT keyt, Class<PrimitiveT> cls) {
        return (PrimitiveT) this.f12510a.get().m15257d(keyt, cls);
    }

    /* renamed from: d */
    public synchronized <KeyT extends AbstractC9015g, PrimitiveT> void m15230d(AbstractC5940l<KeyT, PrimitiveT> abstractC5940l) {
        this.f12510a.set(new C5942n.b(this.f12510a.get()).m15262d(abstractC5940l).m15261c());
    }

    /* renamed from: e */
    public synchronized <InputPrimitiveT, WrapperPrimitiveT> void m15231e(InterfaceC9031w<InputPrimitiveT, WrapperPrimitiveT> interfaceC9031w) {
        this.f12510a.set(new C5942n.b(this.f12510a.get()).m15263e(interfaceC9031w).m15261c());
    }

    /* renamed from: f */
    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT m15232f(C9030v<InputPrimitiveT> c9030v, Class<WrapperPrimitiveT> cls) {
        return (WrapperPrimitiveT) this.f12510a.get().m15258e(c9030v, cls);
    }
}
