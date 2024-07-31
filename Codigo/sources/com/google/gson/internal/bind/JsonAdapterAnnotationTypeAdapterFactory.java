package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.i;
import com.google.gson.internal.c;
import com.google.gson.q;
import com.google.gson.v;

/* loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements v {

    /* renamed from: a, reason: collision with root package name */
    private final c f12833a;

    public JsonAdapterAnnotationTypeAdapterFactory(c cVar) {
        this.f12833a = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TypeAdapter<?> a(c cVar, Gson gson, com.google.gson.reflect.a<?> aVar, kf.b bVar) {
        TypeAdapter<?> treeTypeAdapter;
        Object a10 = cVar.a(com.google.gson.reflect.a.get((Class) bVar.value())).a();
        if (a10 instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) a10;
        } else if (a10 instanceof v) {
            treeTypeAdapter = ((v) a10).create(gson, aVar);
        } else {
            boolean z10 = a10 instanceof q;
            if (!z10 && !(a10 instanceof i)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a10.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z10 ? (q) a10 : null, a10 instanceof i ? (i) a10 : null, gson, aVar, null);
        }
        return (treeTypeAdapter == null || !bVar.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.nullSafe();
    }

    @Override // com.google.gson.v
    public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
        kf.b bVar = (kf.b) aVar.getRawType().getAnnotation(kf.b.class);
        if (bVar == null) {
            return null;
        }
        return (TypeAdapter<T>) a(this.f12833a, gson, aVar, bVar);
    }
}
