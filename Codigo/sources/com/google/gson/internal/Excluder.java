package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.v;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Excluder implements v, Cloneable {

    /* renamed from: r, reason: collision with root package name */
    public static final Excluder f12801r = new Excluder();

    /* renamed from: d, reason: collision with root package name */
    private boolean f12805d;

    /* renamed from: a, reason: collision with root package name */
    private double f12802a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    private int f12803b = 136;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12804c = true;

    /* renamed from: e, reason: collision with root package name */
    private List<com.google.gson.a> f12806e = Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    private List<com.google.gson.a> f12807f = Collections.emptyList();

    private boolean c(Class<?> cls) {
        if (this.f12802a == -1.0d || l((kf.d) cls.getAnnotation(kf.d.class), (kf.e) cls.getAnnotation(kf.e.class))) {
            return (!this.f12804c && h(cls)) || g(cls);
        }
        return true;
    }

    private boolean d(Class<?> cls, boolean z10) {
        Iterator<com.google.gson.a> it = (z10 ? this.f12806e : this.f12807f).iterator();
        while (it.hasNext()) {
            if (it.next().b(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean g(Class<?> cls) {
        return (Enum.class.isAssignableFrom(cls) || i(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    private boolean h(Class<?> cls) {
        return cls.isMemberClass() && !i(cls);
    }

    private boolean i(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean j(kf.d dVar) {
        return dVar == null || dVar.value() <= this.f12802a;
    }

    private boolean k(kf.e eVar) {
        return eVar == null || eVar.value() > this.f12802a;
    }

    private boolean l(kf.d dVar, kf.e eVar) {
        return j(dVar) && k(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean b(Class<?> cls, boolean z10) {
        return c(cls) || d(cls, z10);
    }

    @Override // com.google.gson.v
    public <T> TypeAdapter<T> create(final Gson gson, final com.google.gson.reflect.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        boolean c10 = c(rawType);
        final boolean z10 = c10 || d(rawType, true);
        final boolean z11 = c10 || d(rawType, false);
        if (z10 || z11) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1

                /* renamed from: a, reason: collision with root package name */
                private TypeAdapter<T> f12808a;

                private TypeAdapter<T> a() {
                    TypeAdapter<T> typeAdapter = this.f12808a;
                    if (typeAdapter != null) {
                        return typeAdapter;
                    }
                    TypeAdapter<T> m10 = gson.m(Excluder.this, aVar);
                    this.f12808a = m10;
                    return m10;
                }

                @Override // com.google.gson.TypeAdapter
                public T read(nf.a aVar2) {
                    if (!z11) {
                        return a().read(aVar2);
                    }
                    aVar2.I0();
                    return null;
                }

                @Override // com.google.gson.TypeAdapter
                public void write(nf.c cVar, T t10) {
                    if (z10) {
                        cVar.B();
                    } else {
                        a().write(cVar, t10);
                    }
                }
            };
        }
        return null;
    }

    public boolean e(Field field, boolean z10) {
        kf.a aVar;
        if ((this.f12803b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f12802a != -1.0d && !l((kf.d) field.getAnnotation(kf.d.class), (kf.e) field.getAnnotation(kf.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f12805d && ((aVar = (kf.a) field.getAnnotation(kf.a.class)) == null || (!z10 ? aVar.deserialize() : aVar.serialize()))) {
            return true;
        }
        if ((!this.f12804c && h(field.getType())) || g(field.getType())) {
            return true;
        }
        List<com.google.gson.a> list = z10 ? this.f12806e : this.f12807f;
        if (list.isEmpty()) {
            return false;
        }
        com.google.gson.b bVar = new com.google.gson.b(field);
        Iterator<com.google.gson.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a(bVar)) {
                return true;
            }
        }
        return false;
    }
}
