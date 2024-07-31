package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import nf.c;

/* loaded from: classes2.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Gson f12878a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter<T> f12879b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f12880c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f12878a = gson;
        this.f12879b = typeAdapter;
        this.f12880c = type;
    }

    private Type a(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // com.google.gson.TypeAdapter
    public T read(nf.a aVar) {
        return this.f12879b.read(aVar);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, T t10) {
        TypeAdapter<T> typeAdapter = this.f12879b;
        Type a10 = a(this.f12880c, t10);
        if (a10 != this.f12880c) {
            typeAdapter = this.f12878a.k(com.google.gson.reflect.a.get(a10));
            if (typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter<T> typeAdapter2 = this.f12879b;
                if (!(typeAdapter2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    typeAdapter = typeAdapter2;
                }
            }
        }
        typeAdapter.write(cVar, t10);
    }
}
