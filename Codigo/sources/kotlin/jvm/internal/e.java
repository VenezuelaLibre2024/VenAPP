package kotlin.jvm.internal;

import dk.j0;
import dk.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class e implements vk.c<Object>, d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20745b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Class<? extends ck.c<?>>, Integer> f20746c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap<String, String> f20747d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap<String, String> f20748e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<String, String> f20749f;

    /* renamed from: r, reason: collision with root package name */
    private static final Map<String, String> f20750r;

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f20751a;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
        
            if (r2 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String a(java.lang.Class<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.n.e(r8, r0)
                boolean r0 = r8.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb3
            Le:
                boolean r0 = r8.isLocalClass()
                if (r0 == 0) goto L69
                java.lang.String r0 = r8.getSimpleName()
                java.lang.reflect.Method r2 = r8.getEnclosingMethod()
                r3 = 2
                r4 = 36
                java.lang.String r5 = "name"
                if (r2 == 0) goto L43
                kotlin.jvm.internal.n.d(r0, r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = r2.getName()
                r6.append(r2)
                r6.append(r4)
                java.lang.String r2 = r6.toString()
                java.lang.String r2 = xk.g.D0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L40
                goto L43
            L40:
                r1 = r2
                goto Lb3
            L43:
                java.lang.reflect.Constructor r8 = r8.getEnclosingConstructor()
                kotlin.jvm.internal.n.d(r0, r5)
                if (r8 == 0) goto L64
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r8 = r8.getName()
                r2.append(r8)
                r2.append(r4)
                java.lang.String r8 = r2.toString()
                java.lang.String r1 = xk.g.D0(r0, r8, r1, r3, r1)
                goto Lb3
            L64:
                java.lang.String r1 = xk.g.C0(r0, r4, r1, r3, r1)
                goto Lb3
            L69:
                boolean r0 = r8.isArray()
                if (r0 == 0) goto L9e
                java.lang.Class r8 = r8.getComponentType()
                boolean r0 = r8.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9b
                java.util.Map r0 = kotlin.jvm.internal.e.d()
                java.lang.String r8 = r8.getName()
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L9b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                r0.append(r2)
                java.lang.String r8 = r0.toString()
                r1 = r8
            L9b:
                if (r1 != 0) goto Lb3
                goto L40
            L9e:
                java.util.Map r0 = kotlin.jvm.internal.e.d()
                java.lang.String r1 = r8.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb3
                java.lang.String r1 = r8.getSimpleName()
            Lb3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.e.a.a(java.lang.Class):java.lang.String");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List l10;
        int r10;
        Map<Class<? extends ck.c<?>>, Integer> q10;
        int e10;
        String F0;
        String F02;
        int i10 = 0;
        l10 = dk.r.l(ok.a.class, ok.l.class, ok.p.class, ok.q.class, ok.r.class, ok.s.class, ok.t.class, ok.u.class, ok.v.class, ok.w.class, ok.b.class, ok.c.class, ok.d.class, ok.e.class, ok.f.class, ok.g.class, ok.h.class, ok.i.class, ok.j.class, ok.k.class, ok.m.class, ok.n.class, ok.o.class);
        List list = l10;
        r10 = dk.s.r(list, 10);
        ArrayList arrayList = new ArrayList(r10);
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                dk.r.q();
            }
            arrayList.add(ck.r.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        q10 = k0.q(arrayList);
        f20746c = q10;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f20747d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f20748e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        n.d(values, "primitiveFqNames.values");
        for (String kotlinName : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            n.d(kotlinName, "kotlinName");
            F02 = xk.q.F0(kotlinName, '.', null, 2, null);
            sb2.append(F02);
            sb2.append("CompanionObject");
            ck.m a10 = ck.r.a(sb2.toString(), kotlinName + ".Companion");
            hashMap3.put(a10.c(), a10.d());
        }
        for (Map.Entry<Class<? extends ck.c<?>>, Integer> entry : f20746c.entrySet()) {
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f20749f = hashMap3;
        e10 = j0.e(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(e10);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            F0 = xk.q.F0((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, F0);
        }
        f20750r = linkedHashMap;
    }

    public e(Class<?> jClass) {
        n.e(jClass, "jClass");
        this.f20751a = jClass;
    }

    @Override // kotlin.jvm.internal.d
    public Class<?> a() {
        return this.f20751a;
    }

    @Override // vk.c
    public String c() {
        return f20745b.a(a());
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && n.a(nk.a.b(this), nk.a.b((vk.c) obj));
    }

    public int hashCode() {
        return nk.a.b(this).hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
