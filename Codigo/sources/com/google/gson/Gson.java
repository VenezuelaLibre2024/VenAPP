package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes2.dex */
public final class Gson {

    /* renamed from: y */
    static final String f12748y = null;

    /* renamed from: a */
    private final ThreadLocal<Map<com.google.gson.reflect.a<?>, FutureTypeAdapter<?>>> f12750a;

    /* renamed from: b */
    private final Map<com.google.gson.reflect.a<?>, TypeAdapter<?>> f12751b;

    /* renamed from: c */
    private final com.google.gson.internal.c f12752c;

    /* renamed from: d */
    private final JsonAdapterAnnotationTypeAdapterFactory f12753d;

    /* renamed from: e */
    final List<v> f12754e;

    /* renamed from: f */
    final Excluder f12755f;

    /* renamed from: g */
    final d f12756g;

    /* renamed from: h */
    final Map<Type, f<?>> f12757h;

    /* renamed from: i */
    final boolean f12758i;

    /* renamed from: j */
    final boolean f12759j;

    /* renamed from: k */
    final boolean f12760k;

    /* renamed from: l */
    final boolean f12761l;

    /* renamed from: m */
    final boolean f12762m;

    /* renamed from: n */
    final boolean f12763n;

    /* renamed from: o */
    final boolean f12764o;

    /* renamed from: p */
    final boolean f12765p;

    /* renamed from: q */
    final String f12766q;

    /* renamed from: r */
    final int f12767r;

    /* renamed from: s */
    final int f12768s;

    /* renamed from: t */
    final s f12769t;

    /* renamed from: u */
    final List<v> f12770u;

    /* renamed from: v */
    final List<v> f12771v;

    /* renamed from: w */
    final u f12772w;

    /* renamed from: x */
    final u f12773x;

    /* renamed from: z */
    static final d f12749z = c.IDENTITY;
    static final u A = t.DOUBLE;
    static final u B = t.LAZILY_PARSED_NUMBER;
    private static final com.google.gson.reflect.a<?> C = com.google.gson.reflect.a.get(Object.class);

    /* renamed from: com.google.gson.Gson$1 */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends TypeAdapter<Number> {
        AnonymousClass1() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Double read(nf.a aVar) {
            if (aVar.h0() != nf.b.NULL) {
                return Double.valueOf(aVar.H());
            }
            aVar.S();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(nf.c cVar, Number number) {
            if (number == null) {
                cVar.B();
            } else {
                Gson.d(number.doubleValue());
                cVar.i0(number);
            }
        }
    }

    /* renamed from: com.google.gson.Gson$2 */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends TypeAdapter<Number> {
        AnonymousClass2() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Float read(nf.a aVar) {
            if (aVar.h0() != nf.b.NULL) {
                return Float.valueOf((float) aVar.H());
            }
            aVar.S();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(nf.c cVar, Number number) {
            if (number == null) {
                cVar.B();
            } else {
                Gson.d(number.floatValue());
                cVar.i0(number);
            }
        }
    }

    /* renamed from: com.google.gson.Gson$3 */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 extends TypeAdapter<Number> {
        AnonymousClass3() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Number read(nf.a aVar) {
            if (aVar.h0() != nf.b.NULL) {
                return Long.valueOf(aVar.O());
            }
            aVar.S();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(nf.c cVar, Number number) {
            if (number == null) {
                cVar.B();
            } else {
                cVar.j0(number.toString());
            }
        }
    }

    /* renamed from: com.google.gson.Gson$4 */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 extends TypeAdapter<AtomicLong> {
        AnonymousClass4() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public AtomicLong read(nf.a aVar) {
            return new AtomicLong(((Number) TypeAdapter.this.read(aVar)).longValue());
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(nf.c cVar, AtomicLong atomicLong) {
            TypeAdapter.this.write(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: com.google.gson.Gson$5 */
    /* loaded from: classes2.dex */
    public class AnonymousClass5 extends TypeAdapter<AtomicLongArray> {
        AnonymousClass5() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public AtomicLongArray read(nf.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.q()) {
                arrayList.add(Long.valueOf(((Number) TypeAdapter.this.read(aVar)).longValue()));
            }
            aVar.i();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(nf.c cVar, AtomicLongArray atomicLongArray) {
            cVar.e();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                TypeAdapter.this.write(cVar, Long.valueOf(atomicLongArray.get(i10)));
            }
            cVar.i();
        }
    }

    /* loaded from: classes2.dex */
    public static class FutureTypeAdapter<T> extends TypeAdapter<T> {

        /* renamed from: a */
        private TypeAdapter<T> f12778a;

        FutureTypeAdapter() {
        }

        public void a(TypeAdapter<T> typeAdapter) {
            if (this.f12778a != null) {
                throw new AssertionError();
            }
            this.f12778a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public T read(nf.a aVar) {
            TypeAdapter<T> typeAdapter = this.f12778a;
            if (typeAdapter != null) {
                return typeAdapter.read(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.TypeAdapter
        public void write(nf.c cVar, T t10) {
            TypeAdapter<T> typeAdapter = this.f12778a;
            if (typeAdapter == null) {
                throw new IllegalStateException();
            }
            typeAdapter.write(cVar, t10);
        }
    }

    public Gson() {
        this(Excluder.f12801r, f12749z, Collections.emptyMap(), false, false, false, true, false, false, false, true, s.DEFAULT, f12748y, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), A, B);
    }

    public Gson(Excluder excluder, d dVar, Map<Type, f<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, s sVar, String str, int i10, int i11, List<v> list, List<v> list2, List<v> list3, u uVar, u uVar2) {
        this.f12750a = new ThreadLocal<>();
        this.f12751b = new ConcurrentHashMap();
        this.f12755f = excluder;
        this.f12756g = dVar;
        this.f12757h = map;
        com.google.gson.internal.c cVar = new com.google.gson.internal.c(map, z17);
        this.f12752c = cVar;
        this.f12758i = z10;
        this.f12759j = z11;
        this.f12760k = z12;
        this.f12761l = z13;
        this.f12762m = z14;
        this.f12763n = z15;
        this.f12764o = z16;
        this.f12765p = z17;
        this.f12769t = sVar;
        this.f12766q = str;
        this.f12767r = i10;
        this.f12768s = i11;
        this.f12770u = list;
        this.f12771v = list2;
        this.f12772w = uVar;
        this.f12773x = uVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.W);
        arrayList.add(ObjectTypeAdapter.a(uVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.C);
        arrayList.add(TypeAdapters.f12893m);
        arrayList.add(TypeAdapters.f12887g);
        arrayList.add(TypeAdapters.f12889i);
        arrayList.add(TypeAdapters.f12891k);
        TypeAdapter<Number> n10 = n(sVar);
        arrayList.add(TypeAdapters.b(Long.TYPE, Long.class, n10));
        arrayList.add(TypeAdapters.b(Double.TYPE, Double.class, e(z16)));
        arrayList.add(TypeAdapters.b(Float.TYPE, Float.class, f(z16)));
        arrayList.add(NumberTypeAdapter.a(uVar2));
        arrayList.add(TypeAdapters.f12895o);
        arrayList.add(TypeAdapters.f12897q);
        arrayList.add(TypeAdapters.a(AtomicLong.class, b(n10)));
        arrayList.add(TypeAdapters.a(AtomicLongArray.class, c(n10)));
        arrayList.add(TypeAdapters.f12899s);
        arrayList.add(TypeAdapters.f12904x);
        arrayList.add(TypeAdapters.E);
        arrayList.add(TypeAdapters.G);
        arrayList.add(TypeAdapters.a(BigDecimal.class, TypeAdapters.f12906z));
        arrayList.add(TypeAdapters.a(BigInteger.class, TypeAdapters.A));
        arrayList.add(TypeAdapters.a(com.google.gson.internal.f.class, TypeAdapters.B));
        arrayList.add(TypeAdapters.I);
        arrayList.add(TypeAdapters.K);
        arrayList.add(TypeAdapters.O);
        arrayList.add(TypeAdapters.Q);
        arrayList.add(TypeAdapters.U);
        arrayList.add(TypeAdapters.M);
        arrayList.add(TypeAdapters.f12884d);
        arrayList.add(DateTypeAdapter.f12827b);
        arrayList.add(TypeAdapters.S);
        if (com.google.gson.internal.sql.a.f13000a) {
            arrayList.add(com.google.gson.internal.sql.a.f13004e);
            arrayList.add(com.google.gson.internal.sql.a.f13003d);
            arrayList.add(com.google.gson.internal.sql.a.f13005f);
        }
        arrayList.add(ArrayTypeAdapter.f12821c);
        arrayList.add(TypeAdapters.f12882b);
        arrayList.add(new CollectionTypeAdapterFactory(cVar));
        arrayList.add(new MapTypeAdapterFactory(cVar, z11));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(cVar);
        this.f12753d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.X);
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar, dVar, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f12754e = Collections.unmodifiableList(arrayList);
    }

    private static void a(Object obj, nf.a aVar) {
        if (obj != null) {
            try {
                if (aVar.h0() == nf.b.END_DOCUMENT) {
                } else {
                    throw new k("JSON document was not fully consumed.");
                }
            } catch (nf.d e10) {
                throw new r(e10);
            } catch (IOException e11) {
                throw new k(e11);
            }
        }
    }

    private static TypeAdapter<AtomicLong> b(TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLong>() { // from class: com.google.gson.Gson.4
            AnonymousClass4() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicLong read(nf.a aVar) {
                return new AtomicLong(((Number) TypeAdapter.this.read(aVar)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(nf.c cVar, AtomicLong atomicLong) {
                TypeAdapter.this.write(cVar, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe();
    }

    private static TypeAdapter<AtomicLongArray> c(TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLongArray>() { // from class: com.google.gson.Gson.5
            AnonymousClass5() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicLongArray read(nf.a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.q()) {
                    arrayList.add(Long.valueOf(((Number) TypeAdapter.this.read(aVar)).longValue()));
                }
                aVar.i();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(nf.c cVar, AtomicLongArray atomicLongArray) {
                cVar.e();
                int length = atomicLongArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    TypeAdapter.this.write(cVar, Long.valueOf(atomicLongArray.get(i10)));
                }
                cVar.i();
            }
        }.nullSafe();
    }

    static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private TypeAdapter<Number> e(boolean z10) {
        return z10 ? TypeAdapters.f12902v : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.1
            AnonymousClass1() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Double read(nf.a aVar) {
                if (aVar.h0() != nf.b.NULL) {
                    return Double.valueOf(aVar.H());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(nf.c cVar, Number number) {
                if (number == null) {
                    cVar.B();
                } else {
                    Gson.d(number.doubleValue());
                    cVar.i0(number);
                }
            }
        };
    }

    private TypeAdapter<Number> f(boolean z10) {
        return z10 ? TypeAdapters.f12901u : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.2
            AnonymousClass2() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Float read(nf.a aVar) {
                if (aVar.h0() != nf.b.NULL) {
                    return Float.valueOf((float) aVar.H());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(nf.c cVar, Number number) {
                if (number == null) {
                    cVar.B();
                } else {
                    Gson.d(number.floatValue());
                    cVar.i0(number);
                }
            }
        };
    }

    private static TypeAdapter<Number> n(s sVar) {
        return sVar == s.DEFAULT ? TypeAdapters.f12900t : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
            AnonymousClass3() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(nf.a aVar) {
                if (aVar.h0() != nf.b.NULL) {
                    return Long.valueOf(aVar.O());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(nf.c cVar, Number number) {
                if (number == null) {
                    cVar.B();
                } else {
                    cVar.j0(number.toString());
                }
            }
        };
    }

    public <T> T g(Reader reader, Type type) {
        nf.a o10 = o(reader);
        T t10 = (T) j(o10, type);
        a(t10, o10);
        return t10;
    }

    public <T> T h(String str, Class<T> cls) {
        return (T) com.google.gson.internal.j.b(cls).cast(i(str, cls));
    }

    public <T> T i(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) g(new StringReader(str), type);
    }

    public <T> T j(nf.a aVar, Type type) {
        boolean r10 = aVar.r();
        boolean z10 = true;
        aVar.z0(true);
        try {
            try {
                try {
                    aVar.h0();
                    z10 = false;
                    return k(com.google.gson.reflect.a.get(type)).read(aVar);
                } catch (EOFException e10) {
                    if (!z10) {
                        throw new r(e10);
                    }
                    aVar.z0(r10);
                    return null;
                } catch (IOException e11) {
                    throw new r(e11);
                }
            } catch (AssertionError e12) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e12.getMessage());
                assertionError.initCause(e12);
                throw assertionError;
            } catch (IllegalStateException e13) {
                throw new r(e13);
            }
        } finally {
            aVar.z0(r10);
        }
    }

    public <T> TypeAdapter<T> k(com.google.gson.reflect.a<T> aVar) {
        boolean z10;
        TypeAdapter<T> typeAdapter = (TypeAdapter) this.f12751b.get(aVar == null ? C : aVar);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map<com.google.gson.reflect.a<?>, FutureTypeAdapter<?>> map = this.f12750a.get();
        if (map == null) {
            map = new HashMap<>();
            this.f12750a.set(map);
            z10 = true;
        } else {
            z10 = false;
        }
        FutureTypeAdapter<?> futureTypeAdapter = map.get(aVar);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter<?> futureTypeAdapter2 = new FutureTypeAdapter<>();
            map.put(aVar, futureTypeAdapter2);
            Iterator<v> it = this.f12754e.iterator();
            while (it.hasNext()) {
                TypeAdapter<T> create = it.next().create(this, aVar);
                if (create != null) {
                    futureTypeAdapter2.a(create);
                    this.f12751b.put(aVar, create);
                    return create;
                }
            }
            throw new IllegalArgumentException("GSON (2.9.0) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z10) {
                this.f12750a.remove();
            }
        }
    }

    public <T> TypeAdapter<T> l(Class<T> cls) {
        return k(com.google.gson.reflect.a.get((Class) cls));
    }

    public <T> TypeAdapter<T> m(v vVar, com.google.gson.reflect.a<T> aVar) {
        if (!this.f12754e.contains(vVar)) {
            vVar = this.f12753d;
        }
        boolean z10 = false;
        for (v vVar2 : this.f12754e) {
            if (z10) {
                TypeAdapter<T> create = vVar2.create(this, aVar);
                if (create != null) {
                    return create;
                }
            } else if (vVar2 == vVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public nf.a o(Reader reader) {
        nf.a aVar = new nf.a(reader);
        aVar.z0(this.f12763n);
        return aVar;
    }

    public nf.c p(Writer writer) {
        if (this.f12760k) {
            writer.write(")]}'\n");
        }
        nf.c cVar = new nf.c(writer);
        if (this.f12762m) {
            cVar.R("  ");
        }
        cVar.Q(this.f12761l);
        cVar.S(this.f12763n);
        cVar.U(this.f12758i);
        return cVar;
    }

    public String q(j jVar) {
        StringWriter stringWriter = new StringWriter();
        t(jVar, stringWriter);
        return stringWriter.toString();
    }

    public String r(Object obj) {
        return obj == null ? q(l.f13006a) : s(obj, obj.getClass());
    }

    public String s(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        v(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void t(j jVar, Appendable appendable) {
        try {
            u(jVar, p(com.google.gson.internal.k.c(appendable)));
        } catch (IOException e10) {
            throw new k(e10);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f12758i + ",factories:" + this.f12754e + ",instanceCreators:" + this.f12752c + "}";
    }

    public void u(j jVar, nf.c cVar) {
        boolean o10 = cVar.o();
        cVar.S(true);
        boolean n10 = cVar.n();
        cVar.Q(this.f12761l);
        boolean l10 = cVar.l();
        cVar.U(this.f12758i);
        try {
            try {
                com.google.gson.internal.k.b(jVar, cVar);
            } catch (IOException e10) {
                throw new k(e10);
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } finally {
            cVar.S(o10);
            cVar.Q(n10);
            cVar.U(l10);
        }
    }

    public void v(Object obj, Type type, Appendable appendable) {
        try {
            w(obj, type, p(com.google.gson.internal.k.c(appendable)));
        } catch (IOException e10) {
            throw new k(e10);
        }
    }

    public void w(Object obj, Type type, nf.c cVar) {
        TypeAdapter k10 = k(com.google.gson.reflect.a.get(type));
        boolean o10 = cVar.o();
        cVar.S(true);
        boolean n10 = cVar.n();
        cVar.Q(this.f12761l);
        boolean l10 = cVar.l();
        cVar.U(this.f12758i);
        try {
            try {
                k10.write(cVar, obj);
            } catch (IOException e10) {
                throw new k(e10);
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } finally {
            cVar.S(o10);
            cVar.Q(n10);
            cVar.U(l10);
        }
    }
}
