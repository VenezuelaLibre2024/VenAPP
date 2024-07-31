package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.q;
import jb.g;

/* loaded from: classes2.dex */
public abstract class c<KeyT extends jb.g, SerializationT extends q> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<KeyT> f11277a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f11278b;

    /* loaded from: classes2.dex */
    class a extends c<KeyT, SerializationT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f11279c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f11279c = bVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface b<KeyT extends jb.g, SerializationT extends q> {
    }

    private c(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.f11277a = cls;
        this.f11278b = cls2;
    }

    /* synthetic */ c(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <KeyT extends jb.g, SerializationT extends q> c<KeyT, SerializationT> a(b<KeyT, SerializationT> bVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<KeyT> b() {
        return this.f11277a;
    }

    public Class<SerializationT> c() {
        return this.f11278b;
    }
}
