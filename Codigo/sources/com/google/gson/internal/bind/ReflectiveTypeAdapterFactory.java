package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.d;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.c;
import com.google.gson.internal.h;
import com.google.gson.internal.j;
import com.google.gson.r;
import com.google.gson.v;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements v {

    /* renamed from: a */
    private final c f12849a;

    /* renamed from: b */
    private final d f12850b;

    /* renamed from: c */
    private final Excluder f12851c;

    /* renamed from: d */
    private final JsonAdapterAnnotationTypeAdapterFactory f12852d;

    /* loaded from: classes2.dex */
    public static final class Adapter<T> extends TypeAdapter<T> {

        /* renamed from: a */
        private final h<T> f12853a;

        /* renamed from: b */
        private final Map<String, b> f12854b;

        Adapter(h<T> hVar, Map<String, b> map) {
            this.f12853a = hVar;
            this.f12854b = map;
        }

        @Override // com.google.gson.TypeAdapter
        public T read(nf.a aVar) {
            if (aVar.h0() == nf.b.NULL) {
                aVar.S();
                return null;
            }
            T a10 = this.f12853a.a();
            try {
                aVar.b();
                while (aVar.q()) {
                    b bVar = this.f12854b.get(aVar.Q());
                    if (bVar != null && bVar.f12864c) {
                        bVar.a(aVar, a10);
                    }
                    aVar.I0();
                }
                aVar.j();
                return a10;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (IllegalStateException e11) {
                throw new r(e11);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(nf.c cVar, T t10) {
            if (t10 == null) {
                cVar.B();
                return;
            }
            cVar.f();
            try {
                for (b bVar : this.f12854b.values()) {
                    if (bVar.c(t10)) {
                        cVar.r(bVar.f12862a);
                        bVar.b(cVar, t10);
                    }
                }
                cVar.j();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class a extends b {

        /* renamed from: d */
        final /* synthetic */ Field f12855d;

        /* renamed from: e */
        final /* synthetic */ boolean f12856e;

        /* renamed from: f */
        final /* synthetic */ TypeAdapter f12857f;

        /* renamed from: g */
        final /* synthetic */ Gson f12858g;

        /* renamed from: h */
        final /* synthetic */ com.google.gson.reflect.a f12859h;

        /* renamed from: i */
        final /* synthetic */ boolean f12860i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z10, boolean z11, Field field, boolean z12, TypeAdapter typeAdapter, Gson gson, com.google.gson.reflect.a aVar, boolean z13) {
            super(str, z10, z11);
            this.f12855d = field;
            this.f12856e = z12;
            this.f12857f = typeAdapter;
            this.f12858g = gson;
            this.f12859h = aVar;
            this.f12860i = z13;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void a(nf.a aVar, Object obj) {
            Object read = this.f12857f.read(aVar);
            if (read == null && this.f12860i) {
                return;
            }
            this.f12855d.set(obj, read);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void b(nf.c cVar, Object obj) {
            (this.f12856e ? this.f12857f : new TypeAdapterRuntimeTypeWrapper(this.f12858g, this.f12857f, this.f12859h.getType())).write(cVar, this.f12855d.get(obj));
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        public boolean c(Object obj) {
            return this.f12863b && this.f12855d.get(obj) != obj;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b {

        /* renamed from: a */
        final String f12862a;

        /* renamed from: b */
        final boolean f12863b;

        /* renamed from: c */
        final boolean f12864c;

        protected b(String str, boolean z10, boolean z11) {
            this.f12862a = str;
            this.f12863b = z10;
            this.f12864c = z11;
        }

        abstract void a(nf.a aVar, Object obj);

        abstract void b(nf.c cVar, Object obj);

        abstract boolean c(Object obj);
    }

    public ReflectiveTypeAdapterFactory(c cVar, d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f12849a = cVar;
        this.f12850b = dVar;
        this.f12851c = excluder;
        this.f12852d = jsonAdapterAnnotationTypeAdapterFactory;
    }

    private b a(Gson gson, Field field, String str, com.google.gson.reflect.a<?> aVar, boolean z10, boolean z11) {
        boolean a10 = j.a(aVar.getRawType());
        kf.b bVar = (kf.b) field.getAnnotation(kf.b.class);
        TypeAdapter<?> a11 = bVar != null ? this.f12852d.a(this.f12849a, gson, aVar, bVar) : null;
        boolean z12 = a11 != null;
        if (a11 == null) {
            a11 = gson.k(aVar);
        }
        return new a(str, z10, z11, field, z12, a11, gson, aVar, a10);
    }

    static boolean c(Field field, boolean z10, Excluder excluder) {
        return (excluder.b(field.getType(), z10) || excluder.e(field, z10)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    private Map<String, b> d(Gson gson, com.google.gson.reflect.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = aVar.getType();
        com.google.gson.reflect.a<?> aVar2 = aVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z10 = false;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean b10 = b(field, true);
                boolean b11 = b(field, z10);
                if (b10 || b11) {
                    mf.a.b(field);
                    Type p10 = com.google.gson.internal.b.p(aVar2.getType(), cls2, field.getGenericType());
                    List<String> e10 = e(field);
                    int size = e10.size();
                    b bVar = null;
                    ?? r22 = z10;
                    while (r22 < size) {
                        String str = e10.get(r22);
                        boolean z11 = r22 != 0 ? z10 : b10;
                        int i11 = r22;
                        b bVar2 = bVar;
                        int i12 = size;
                        List<String> list = e10;
                        Field field2 = field;
                        bVar = bVar2 == null ? (b) linkedHashMap.put(str, a(gson, field, str, com.google.gson.reflect.a.get(p10), z11, b11)) : bVar2;
                        b10 = z11;
                        e10 = list;
                        size = i12;
                        field = field2;
                        z10 = false;
                        r22 = i11 + 1;
                    }
                    b bVar3 = bVar;
                    if (bVar3 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + bVar3.f12862a);
                    }
                }
                i10++;
                z10 = false;
            }
            aVar2 = com.google.gson.reflect.a.get(com.google.gson.internal.b.p(aVar2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.getRawType();
        }
        return linkedHashMap;
    }

    private List<String> e(Field field) {
        kf.c cVar = (kf.c) field.getAnnotation(kf.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f12850b.b(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public boolean b(Field field, boolean z10) {
        return c(field, z10, this.f12851c);
    }

    @Override // com.google.gson.v
    public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        if (Object.class.isAssignableFrom(rawType)) {
            return new Adapter(this.f12849a.a(aVar), d(gson, aVar, rawType));
        }
        return null;
    }
}
