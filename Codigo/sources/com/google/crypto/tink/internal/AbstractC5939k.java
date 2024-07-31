package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.InterfaceC5945q;
import p179jb.AbstractC9029u;

/* renamed from: com.google.crypto.tink.internal.k */
/* loaded from: classes2.dex */
public abstract class AbstractC5939k<ParametersT extends AbstractC9029u, SerializationT extends InterfaceC5945q> {

    /* renamed from: a */
    private final Class<ParametersT> f12516a;

    /* renamed from: b */
    private final Class<SerializationT> f12517b;

    /* renamed from: com.google.crypto.tink.internal.k$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5939k<ParametersT, SerializationT> {

        /* renamed from: c */
        final /* synthetic */ b f12518c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f12518c = bVar;
        }
    }

    /* renamed from: com.google.crypto.tink.internal.k$b */
    /* loaded from: classes2.dex */
    public interface b<ParametersT extends AbstractC9029u, SerializationT extends InterfaceC5945q> {
    }

    private AbstractC5939k(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.f12516a = cls;
        this.f12517b = cls2;
    }

    /* synthetic */ AbstractC5939k(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    /* renamed from: a */
    public static <ParametersT extends AbstractC9029u, SerializationT extends InterfaceC5945q> AbstractC5939k<ParametersT, SerializationT> m15244a(b<ParametersT, SerializationT> bVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    /* renamed from: b */
    public Class<ParametersT> m15245b() {
        return this.f12516a;
    }

    /* renamed from: c */
    public Class<SerializationT> m15246c() {
        return this.f12517b;
    }
}
