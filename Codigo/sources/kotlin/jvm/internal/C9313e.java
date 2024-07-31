package kotlin.jvm.internal;

import ck.C2028m;
import ck.C2033r;
import ck.InterfaceC2018c;
import dk.C7016j0;
import dk.C7018k0;
import dk.C7031r;
import dk.C7033s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p257nk.C9728a;
import p280ok.InterfaceC10000n;
import p280ok.InterfaceC10001o;
import p280ok.InterfaceC10002p;
import p280ok.InterfaceC10003q;
import p280ok.InterfaceC10004r;
import p280ok.InterfaceC10005s;
import p280ok.InterfaceC10006t;
import p280ok.InterfaceC10007u;
import p280ok.InterfaceC10008v;
import p280ok.InterfaceC10009w;
import p280ok.InterfaceC9987a;
import p280ok.InterfaceC9988b;
import p280ok.InterfaceC9989c;
import p280ok.InterfaceC9990d;
import p280ok.InterfaceC9991e;
import p280ok.InterfaceC9992f;
import p280ok.InterfaceC9993g;
import p280ok.InterfaceC9994h;
import p280ok.InterfaceC9995i;
import p280ok.InterfaceC9996j;
import p280ok.InterfaceC9997k;
import p280ok.InterfaceC9998l;
import p280ok.InterfaceC9999m;
import p405vk.InterfaceC11966c;
import p450xk.C12525q;

/* renamed from: kotlin.jvm.internal.e */
/* loaded from: classes3.dex */
public final class C9313e implements InterfaceC11966c<Object>, InterfaceC9312d {

    /* renamed from: b */
    public static final a f22567b = new a(null);

    /* renamed from: c */
    private static final Map<Class<? extends InterfaceC2018c<?>>, Integer> f22568c;

    /* renamed from: d */
    private static final HashMap<String, String> f22569d;

    /* renamed from: e */
    private static final HashMap<String, String> f22570e;

    /* renamed from: f */
    private static final HashMap<String, String> f22571f;

    /* renamed from: r */
    private static final Map<String, String> f22572r;

    /* renamed from: a */
    private final Class<?> f22573a;

    /* renamed from: kotlin.jvm.internal.e$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
        
            if (r2 == null) goto L13;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String m27772a(java.lang.Class<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.C9322n.m27781e(r8, r0)
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
                kotlin.jvm.internal.C9322n.m27780d(r0, r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = r2.getName()
                r6.append(r2)
                r6.append(r4)
                java.lang.String r2 = r6.toString()
                java.lang.String r2 = p450xk.C12515g.m40977D0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L40
                goto L43
            L40:
                r1 = r2
                goto Lb3
            L43:
                java.lang.reflect.Constructor r8 = r8.getEnclosingConstructor()
                kotlin.jvm.internal.C9322n.m27780d(r0, r5)
                if (r8 == 0) goto L64
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r8 = r8.getName()
                r2.append(r8)
                r2.append(r4)
                java.lang.String r8 = r2.toString()
                java.lang.String r1 = p450xk.C12515g.m40977D0(r0, r8, r1, r3, r1)
                goto Lb3
            L64:
                java.lang.String r1 = p450xk.C12515g.m40975C0(r0, r4, r1, r3, r1)
                goto Lb3
            L69:
                boolean r0 = r8.isArray()
                if (r0 == 0) goto L9e
                java.lang.Class r8 = r8.getComponentType()
                boolean r0 = r8.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9b
                java.util.Map r0 = kotlin.jvm.internal.C9313e.m27770d()
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
                java.util.Map r0 = kotlin.jvm.internal.C9313e.m27770d()
                java.lang.String r1 = r8.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb3
                java.lang.String r1 = r8.getSimpleName()
            Lb3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C9313e.a.m27772a(java.lang.Class):java.lang.String");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List m20584l;
        int m20590r;
        Map<Class<? extends InterfaceC2018c<?>>, Integer> m20430q;
        int m20418e;
        String m41052F0;
        String m41052F02;
        int i10 = 0;
        m20584l = C7031r.m20584l(InterfaceC9987a.class, InterfaceC9998l.class, InterfaceC10002p.class, InterfaceC10003q.class, InterfaceC10004r.class, InterfaceC10005s.class, InterfaceC10006t.class, InterfaceC10007u.class, InterfaceC10008v.class, InterfaceC10009w.class, InterfaceC9988b.class, InterfaceC9989c.class, InterfaceC9990d.class, InterfaceC9991e.class, InterfaceC9992f.class, InterfaceC9993g.class, InterfaceC9994h.class, InterfaceC9995i.class, InterfaceC9996j.class, InterfaceC9997k.class, InterfaceC9999m.class, InterfaceC10000n.class, InterfaceC10001o.class);
        List list = m20584l;
        m20590r = C7033s.m20590r(list, 10);
        ArrayList arrayList = new ArrayList(m20590r);
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C7031r.m20589q();
            }
            arrayList.add(C2033r.m10353a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        m20430q = C7018k0.m20430q(arrayList);
        f22568c = m20430q;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f22569d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f22570e = hashMap2;
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
        C9322n.m27780d(values, "primitiveFqNames.values");
        for (String kotlinName : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            C9322n.m27780d(kotlinName, "kotlinName");
            m41052F02 = C12525q.m41052F0(kotlinName, '.', null, 2, null);
            sb2.append(m41052F02);
            sb2.append("CompanionObject");
            C2028m m10353a = C2033r.m10353a(sb2.toString(), kotlinName + ".Companion");
            hashMap3.put(m10353a.m10337c(), m10353a.m10338d());
        }
        for (Map.Entry<Class<? extends InterfaceC2018c<?>>, Integer> entry : f22568c.entrySet()) {
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f22571f = hashMap3;
        m20418e = C7016j0.m20418e(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(m20418e);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            m41052F0 = C12525q.m41052F0((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, m41052F0);
        }
        f22572r = linkedHashMap;
    }

    public C9313e(Class<?> jClass) {
        C9322n.m27781e(jClass, "jClass");
        this.f22573a = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC9312d
    /* renamed from: a */
    public Class<?> mo27769a() {
        return this.f22573a;
    }

    @Override // p405vk.InterfaceC11966c
    /* renamed from: c */
    public String mo27771c() {
        return f22567b.m27772a(mo27769a());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9313e) && C9322n.m27777a(C9728a.m29161b(this), C9728a.m29161b((InterfaceC11966c) obj));
    }

    public int hashCode() {
        return C9728a.m29161b(this).hashCode();
    }

    public String toString() {
        return mo27769a().toString() + " (Kotlin reflection is not available)";
    }
}
