package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.c;
import com.google.gson.internal.e;
import com.google.gson.internal.h;
import com.google.gson.internal.k;
import com.google.gson.j;
import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.v;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MapTypeAdapterFactory implements v {

    /* renamed from: a, reason: collision with root package name */
    private final c f12834a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f12835b;

    /* loaded from: classes2.dex */
    private final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private final TypeAdapter<K> f12836a;

        /* renamed from: b, reason: collision with root package name */
        private final TypeAdapter<V> f12837b;

        /* renamed from: c, reason: collision with root package name */
        private final h<? extends Map<K, V>> f12838c;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, h<? extends Map<K, V>> hVar) {
            this.f12836a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f12837b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f12838c = hVar;
        }

        private String a(j jVar) {
            if (!jVar.o()) {
                if (jVar.m()) {
                    return "null";
                }
                throw new AssertionError();
            }
            o f10 = jVar.f();
            if (f10.v()) {
                return String.valueOf(f10.s());
            }
            if (f10.t()) {
                return Boolean.toString(f10.p());
            }
            if (f10.w()) {
                return f10.k();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map<K, V> read(nf.a aVar) {
            nf.b h02 = aVar.h0();
            if (h02 == nf.b.NULL) {
                aVar.S();
                return null;
            }
            Map<K, V> a10 = this.f12838c.a();
            if (h02 == nf.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.q()) {
                    aVar.a();
                    K read = this.f12836a.read(aVar);
                    if (a10.put(read, this.f12837b.read(aVar)) != null) {
                        throw new r("duplicate key: " + read);
                    }
                    aVar.i();
                }
                aVar.i();
            } else {
                aVar.b();
                while (aVar.q()) {
                    e.f12960a.a(aVar);
                    K read2 = this.f12836a.read(aVar);
                    if (a10.put(read2, this.f12837b.read(aVar)) != null) {
                        throw new r("duplicate key: " + read2);
                    }
                }
                aVar.j();
            }
            return a10;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(nf.c cVar, Map<K, V> map) {
            if (map == null) {
                cVar.B();
                return;
            }
            if (!MapTypeAdapterFactory.this.f12835b) {
                cVar.f();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.r(String.valueOf(entry.getKey()));
                    this.f12837b.write(cVar, entry.getValue());
                }
                cVar.j();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                j jsonTree = this.f12836a.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z10 |= jsonTree.l() || jsonTree.n();
            }
            if (!z10) {
                cVar.f();
                int size = arrayList.size();
                while (i10 < size) {
                    cVar.r(a((j) arrayList.get(i10)));
                    this.f12837b.write(cVar, arrayList2.get(i10));
                    i10++;
                }
                cVar.j();
                return;
            }
            cVar.e();
            int size2 = arrayList.size();
            while (i10 < size2) {
                cVar.e();
                k.b((j) arrayList.get(i10), cVar);
                this.f12837b.write(cVar, arrayList2.get(i10));
                cVar.i();
                i10++;
            }
            cVar.i();
        }
    }

    public MapTypeAdapterFactory(c cVar, boolean z10) {
        this.f12834a = cVar;
        this.f12835b = z10;
    }

    private TypeAdapter<?> a(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f12886f : gson.k(com.google.gson.reflect.a.get(type));
    }

    @Override // com.google.gson.v
    public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
        Type type = aVar.getType();
        if (!Map.class.isAssignableFrom(aVar.getRawType())) {
            return null;
        }
        Type[] j10 = com.google.gson.internal.b.j(type, com.google.gson.internal.b.k(type));
        return new Adapter(gson, j10[0], a(gson, j10[0]), j10[1], gson.k(com.google.gson.reflect.a.get(j10[1])), this.f12834a.a(aVar));
    }
}
