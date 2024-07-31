package com.google.crypto.tink.internal;

import jb.g;

/* loaded from: classes2.dex */
public abstract class l<KeyT extends jb.g, PrimitiveT> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<KeyT> f11304a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<PrimitiveT> f11305b;

    /* loaded from: classes2.dex */
    class a extends l<KeyT, PrimitiveT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f11306c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f11306c = bVar;
        }

        @Override // com.google.crypto.tink.internal.l
        public PrimitiveT a(KeyT keyt) {
            return (PrimitiveT) this.f11306c.a(keyt);
        }
    }

    /* loaded from: classes2.dex */
    public interface b<KeyT extends jb.g, PrimitiveT> {
        PrimitiveT a(KeyT keyt);
    }

    private l(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.f11304a = cls;
        this.f11305b = cls2;
    }

    /* synthetic */ l(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <KeyT extends jb.g, PrimitiveT> l<KeyT, PrimitiveT> b(b<KeyT, PrimitiveT> bVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public abstract PrimitiveT a(KeyT keyt);

    public Class<KeyT> c() {
        return this.f11304a;
    }

    public Class<PrimitiveT> d() {
        return this.f11305b;
    }
}
