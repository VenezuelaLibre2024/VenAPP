package com.google.mlkit.common.sdkinternal;

import ee.InterfaceC7183b;
import java.util.concurrent.Executor;

/* renamed from: com.google.mlkit.common.sdkinternal.d */
/* loaded from: classes2.dex */
public class C6514d {

    /* renamed from: a */
    private final InterfaceC7183b f14294a;

    public C6514d(InterfaceC7183b interfaceC7183b) {
        this.f14294a = interfaceC7183b;
    }

    /* renamed from: a */
    public Executor m18305a(Executor executor) {
        return executor != null ? executor : (Executor) this.f14294a.get();
    }
}
