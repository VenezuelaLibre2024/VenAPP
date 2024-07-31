package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.q;

/* loaded from: classes2.dex */
public abstract class j<SerializationT extends q> {

    /* renamed from: a, reason: collision with root package name */
    private final xb.a f11298a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f11299b;

    /* loaded from: classes2.dex */
    class a extends j<SerializationT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f11300c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f11300c = bVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface b<SerializationT extends q> {
    }

    private j(xb.a aVar, Class<SerializationT> cls) {
        this.f11298a = aVar;
        this.f11299b = cls;
    }

    /* synthetic */ j(xb.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static <SerializationT extends q> j<SerializationT> a(b<SerializationT> bVar, xb.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, bVar);
    }

    public final xb.a b() {
        return this.f11298a;
    }

    public final Class<SerializationT> c() {
        return this.f11299b;
    }
}
