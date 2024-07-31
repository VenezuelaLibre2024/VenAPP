package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.q;
import jb.y;

/* loaded from: classes2.dex */
public abstract class b<SerializationT extends q> {

    /* renamed from: a, reason: collision with root package name */
    private final xb.a f11274a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f11275b;

    /* loaded from: classes2.dex */
    class a extends b<SerializationT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC0169b f11276c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.a aVar, Class cls, InterfaceC0169b interfaceC0169b) {
            super(aVar, cls, null);
            this.f11276c = interfaceC0169b;
        }

        @Override // com.google.crypto.tink.internal.b
        public jb.g d(SerializationT serializationt, y yVar) {
            return this.f11276c.a(serializationt, yVar);
        }
    }

    /* renamed from: com.google.crypto.tink.internal.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0169b<SerializationT extends q> {
        jb.g a(SerializationT serializationt, y yVar);
    }

    private b(xb.a aVar, Class<SerializationT> cls) {
        this.f11274a = aVar;
        this.f11275b = cls;
    }

    /* synthetic */ b(xb.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static <SerializationT extends q> b<SerializationT> a(InterfaceC0169b<SerializationT> interfaceC0169b, xb.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, interfaceC0169b);
    }

    public final xb.a b() {
        return this.f11274a;
    }

    public final Class<SerializationT> c() {
        return this.f11275b;
    }

    public abstract jb.g d(SerializationT serializationt, y yVar);
}
