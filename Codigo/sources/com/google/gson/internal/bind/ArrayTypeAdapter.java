package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.v;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import nf.c;

/* loaded from: classes2.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final v f12821c = new v() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            Type type = aVar.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type g10 = com.google.gson.internal.b.g(type);
            return new ArrayTypeAdapter(gson, gson.k(com.google.gson.reflect.a.get(g10)), com.google.gson.internal.b.k(g10));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Class<E> f12822a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter<E> f12823b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f12823b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f12822a = cls;
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(nf.a aVar) {
        if (aVar.h0() == nf.b.NULL) {
            aVar.S();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.q()) {
            arrayList.add(this.f12823b.read(aVar));
        }
        aVar.i();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f12822a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, Object obj) {
        if (obj == null) {
            cVar.B();
            return;
        }
        cVar.e();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f12823b.write(cVar, Array.get(obj, i10));
        }
        cVar.i();
    }
}
