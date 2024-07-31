package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.r0;

/* loaded from: classes2.dex */
public abstract class m<PrimitiveT, KeyProtoT extends r0> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<PrimitiveT> f11307a;

    public m(Class<PrimitiveT> cls) {
        this.f11307a = cls;
    }

    public abstract PrimitiveT a(KeyProtoT keyprotot);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<PrimitiveT> b() {
        return this.f11307a;
    }
}
