package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0;

/* renamed from: com.google.crypto.tink.internal.m */
/* loaded from: classes2.dex */
public abstract class AbstractC5941m<PrimitiveT, KeyProtoT extends InterfaceC6001r0> {

    /* renamed from: a */
    private final Class<PrimitiveT> f12522a;

    public AbstractC5941m(Class<PrimitiveT> cls) {
        this.f12522a = cls;
    }

    /* renamed from: a */
    public abstract PrimitiveT mo15252a(KeyProtoT keyprotot);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Class<PrimitiveT> m15253b() {
        return this.f12522a;
    }
}
