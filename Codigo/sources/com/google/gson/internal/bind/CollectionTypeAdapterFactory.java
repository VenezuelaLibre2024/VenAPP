package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.c;
import com.google.gson.internal.h;
import com.google.gson.v;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements v {

    /* renamed from: a, reason: collision with root package name */
    private final c f12824a;

    /* loaded from: classes2.dex */
    private static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        private final TypeAdapter<E> f12825a;

        /* renamed from: b, reason: collision with root package name */
        private final h<? extends Collection<E>> f12826b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, h<? extends Collection<E>> hVar) {
            this.f12825a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f12826b = hVar;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<E> read(nf.a aVar) {
            if (aVar.h0() == nf.b.NULL) {
                aVar.S();
                return null;
            }
            Collection<E> a10 = this.f12826b.a();
            aVar.a();
            while (aVar.q()) {
                a10.add(this.f12825a.read(aVar));
            }
            aVar.i();
            return a10;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(nf.c cVar, Collection<E> collection) {
            if (collection == null) {
                cVar.B();
                return;
            }
            cVar.e();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f12825a.write(cVar, it.next());
            }
            cVar.i();
        }
    }

    public CollectionTypeAdapterFactory(c cVar) {
        this.f12824a = cVar;
    }

    @Override // com.google.gson.v
    public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type h10 = com.google.gson.internal.b.h(type, rawType);
        return new Adapter(gson, h10, gson.k(com.google.gson.reflect.a.get(h10)), this.f12824a.a(aVar));
    }
}
