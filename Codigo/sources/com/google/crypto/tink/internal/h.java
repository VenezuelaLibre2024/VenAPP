package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.n;
import java.util.concurrent.atomic.AtomicReference;
import jb.v;
import jb.w;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: b */
    private static h f11294b = new h();

    /* renamed from: a */
    private final AtomicReference<n> f11295a = new AtomicReference<>(new n.b().c());

    h() {
    }

    public static h c() {
        return f11294b;
    }

    public <WrapperPrimitiveT> Class<?> a(Class<WrapperPrimitiveT> cls) {
        return this.f11295a.get().c(cls);
    }

    public <KeyT extends jb.g, PrimitiveT> PrimitiveT b(KeyT keyt, Class<PrimitiveT> cls) {
        return (PrimitiveT) this.f11295a.get().d(keyt, cls);
    }

    public synchronized <KeyT extends jb.g, PrimitiveT> void d(l<KeyT, PrimitiveT> lVar) {
        this.f11295a.set(new n.b(this.f11295a.get()).d(lVar).c());
    }

    public synchronized <InputPrimitiveT, WrapperPrimitiveT> void e(w<InputPrimitiveT, WrapperPrimitiveT> wVar) {
        this.f11295a.set(new n.b(this.f11295a.get()).e(wVar).c());
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT f(v<InputPrimitiveT> vVar, Class<WrapperPrimitiveT> cls) {
        return (WrapperPrimitiveT) this.f11295a.get().e(vVar, cls);
    }
}
