package com.dexterous.flutterlocalnotifications;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;

@Keep
/* loaded from: classes.dex */
public final class RuntimeTypeAdapterFactory<T> implements com.google.gson.v {
    private final Class<?> baseType;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type");
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str);
    }

    @Override // com.google.gson.v
    public <R> TypeAdapter<R> create(Gson gson, com.google.gson.reflect.a<R> aVar) {
        if (aVar.getRawType() != this.baseType) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            TypeAdapter<T> m10 = gson.m(this, com.google.gson.reflect.a.get((Class) entry.getValue()));
            linkedHashMap.put(entry.getKey(), m10);
            linkedHashMap2.put(entry.getValue(), m10);
        }
        return new TypeAdapter<R>() { // from class: com.dexterous.flutterlocalnotifications.RuntimeTypeAdapterFactory.1
            @Override // com.google.gson.TypeAdapter
            public R read(nf.a aVar2) {
                com.google.gson.j a10 = com.google.gson.internal.k.a(aVar2);
                com.google.gson.j t10 = a10.d().t(RuntimeTypeAdapterFactory.this.typeFieldName);
                if (t10 == null) {
                    throw new com.google.gson.n("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                String k10 = t10.k();
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap.get(k10);
                if (typeAdapter != null) {
                    return (R) typeAdapter.fromJsonTree(a10);
                }
                throw new com.google.gson.n("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " subtype named " + k10 + "; did you forget to register a subtype?");
            }

            @Override // com.google.gson.TypeAdapter
            public void write(nf.c cVar, R r10) {
                Class<?> cls = r10.getClass();
                String str = (String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls);
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap2.get(cls);
                if (typeAdapter == null) {
                    throw new com.google.gson.n("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
                }
                com.google.gson.m d10 = typeAdapter.toJsonTree(r10).d();
                if (d10.s(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                    throw new com.google.gson.n("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                com.google.gson.m mVar = new com.google.gson.m();
                mVar.p(RuntimeTypeAdapterFactory.this.typeFieldName, new com.google.gson.o(str));
                for (Map.Entry<String, com.google.gson.j> entry2 : d10.q()) {
                    mVar.p(entry2.getKey(), entry2.getValue());
                }
                com.google.gson.internal.k.b(mVar, cVar);
            }
        }.nullSafe();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        }
        this.labelToSubtype.put(str, cls);
        this.subtypeToLabel.put(cls, str);
        return this;
    }
}
