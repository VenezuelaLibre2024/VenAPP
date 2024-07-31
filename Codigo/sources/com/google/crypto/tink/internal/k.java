package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.q;
import jb.u;

/* loaded from: classes2.dex */
public abstract class k<ParametersT extends u, SerializationT extends q> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<ParametersT> f11301a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f11302b;

    /* loaded from: classes2.dex */
    class a extends k<ParametersT, SerializationT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f11303c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f11303c = bVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface b<ParametersT extends u, SerializationT extends q> {
    }

    private k(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.f11301a = cls;
        this.f11302b = cls2;
    }

    /* synthetic */ k(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <ParametersT extends u, SerializationT extends q> k<ParametersT, SerializationT> a(b<ParametersT, SerializationT> bVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<ParametersT> b() {
        return this.f11301a;
    }

    public Class<SerializationT> c() {
        return this.f11302b;
    }
}
