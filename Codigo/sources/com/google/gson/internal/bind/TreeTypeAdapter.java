package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.k;
import com.google.gson.j;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.v;
import nf.c;

/* loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends TypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    private final q<T> f12865a;

    /* renamed from: b, reason: collision with root package name */
    private final i<T> f12866b;

    /* renamed from: c, reason: collision with root package name */
    final Gson f12867c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.gson.reflect.a<T> f12868d;

    /* renamed from: e, reason: collision with root package name */
    private final v f12869e;

    /* renamed from: f, reason: collision with root package name */
    private final TreeTypeAdapter<T>.b f12870f = new b();

    /* renamed from: g, reason: collision with root package name */
    private volatile TypeAdapter<T> f12871g;

    /* loaded from: classes2.dex */
    private static final class SingleTypeFactory implements v {

        /* renamed from: a, reason: collision with root package name */
        private final com.google.gson.reflect.a<?> f12872a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f12873b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<?> f12874c;

        /* renamed from: d, reason: collision with root package name */
        private final q<?> f12875d;

        /* renamed from: e, reason: collision with root package name */
        private final i<?> f12876e;

        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            com.google.gson.reflect.a<?> aVar2 = this.f12872a;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.f12873b && this.f12872a.getType() == aVar.getRawType()) : this.f12874c.isAssignableFrom(aVar.getRawType())) {
                return new TreeTypeAdapter(this.f12875d, this.f12876e, gson, aVar, this);
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    private final class b implements p, h {
        private b() {
        }
    }

    public TreeTypeAdapter(q<T> qVar, i<T> iVar, Gson gson, com.google.gson.reflect.a<T> aVar, v vVar) {
        this.f12865a = qVar;
        this.f12866b = iVar;
        this.f12867c = gson;
        this.f12868d = aVar;
        this.f12869e = vVar;
    }

    private TypeAdapter<T> a() {
        TypeAdapter<T> typeAdapter = this.f12871g;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> m10 = this.f12867c.m(this.f12869e, this.f12868d);
        this.f12871g = m10;
        return m10;
    }

    @Override // com.google.gson.TypeAdapter
    public T read(nf.a aVar) {
        if (this.f12866b == null) {
            return a().read(aVar);
        }
        j a10 = k.a(aVar);
        if (a10.m()) {
            return null;
        }
        return this.f12866b.a(a10, this.f12868d.getType(), this.f12870f);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, T t10) {
        q<T> qVar = this.f12865a;
        if (qVar == null) {
            a().write(cVar, t10);
        } else if (t10 == null) {
            cVar.B();
        } else {
            k.b(qVar.a(t10, this.f12868d.getType(), this.f12870f), cVar);
        }
    }
}
