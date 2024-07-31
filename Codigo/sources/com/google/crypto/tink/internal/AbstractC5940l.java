package com.google.crypto.tink.internal;

import p179jb.AbstractC9015g;

/* renamed from: com.google.crypto.tink.internal.l */
/* loaded from: classes2.dex */
public abstract class AbstractC5940l<KeyT extends AbstractC9015g, PrimitiveT> {

    /* renamed from: a */
    private final Class<KeyT> f12519a;

    /* renamed from: b */
    private final Class<PrimitiveT> f12520b;

    /* renamed from: com.google.crypto.tink.internal.l$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5940l<KeyT, PrimitiveT> {

        /* renamed from: c */
        final /* synthetic */ b f12521c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f12521c = bVar;
        }

        @Override // com.google.crypto.tink.internal.AbstractC5940l
        /* renamed from: a */
        public PrimitiveT mo15248a(KeyT keyt) {
            return (PrimitiveT) this.f12521c.mo15251a(keyt);
        }
    }

    /* renamed from: com.google.crypto.tink.internal.l$b */
    /* loaded from: classes2.dex */
    public interface b<KeyT extends AbstractC9015g, PrimitiveT> {
        /* renamed from: a */
        PrimitiveT mo15251a(KeyT keyt);
    }

    private AbstractC5940l(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.f12519a = cls;
        this.f12520b = cls2;
    }

    /* synthetic */ AbstractC5940l(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    /* renamed from: b */
    public static <KeyT extends AbstractC9015g, PrimitiveT> AbstractC5940l<KeyT, PrimitiveT> m15247b(b<KeyT, PrimitiveT> bVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new a(cls, cls2, bVar);
    }

    /* renamed from: a */
    public abstract PrimitiveT mo15248a(KeyT keyt);

    /* renamed from: c */
    public Class<KeyT> m15249c() {
        return this.f12519a;
    }

    /* renamed from: d */
    public Class<PrimitiveT> m15250d() {
        return this.f12520b;
    }
}
