package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: f, reason: collision with root package name */
    public static final a f4986f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Class<? extends Object>[] f4987g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f4988a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, a.c> f4989b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f4990c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, cl.k<Object>> f4991d;

    /* renamed from: e, reason: collision with root package name */
    private final a.c f4992e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final z a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new z();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    kotlin.jvm.internal.n.d(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new z(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new z(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : z.f4987g) {
                kotlin.jvm.internal.n.b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public z() {
        this.f4988a = new LinkedHashMap();
        this.f4989b = new LinkedHashMap();
        this.f4990c = new LinkedHashMap();
        this.f4991d = new LinkedHashMap();
        this.f4992e = new a.c() { // from class: androidx.lifecycle.y
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle d10;
                d10 = z.d(z.this);
                return d10;
            }
        };
    }

    public z(Map<String, ? extends Object> initialState) {
        kotlin.jvm.internal.n.e(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4988a = linkedHashMap;
        this.f4989b = new LinkedHashMap();
        this.f4990c = new LinkedHashMap();
        this.f4991d = new LinkedHashMap();
        this.f4992e = new a.c() { // from class: androidx.lifecycle.y
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle d10;
                d10 = z.d(z.this);
                return d10;
            }
        };
        linkedHashMap.putAll(initialState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(z this$0) {
        Map s10;
        kotlin.jvm.internal.n.e(this$0, "this$0");
        s10 = dk.k0.s(this$0.f4989b);
        for (Map.Entry entry : s10.entrySet()) {
            this$0.e((String) entry.getKey(), ((a.c) entry.getValue()).a());
        }
        Set<String> keySet = this$0.f4988a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f4988a.get(str));
        }
        return androidx.core.os.b.a(ck.r.a("keys", arrayList), ck.r.a("values", arrayList2));
    }

    public final a.c c() {
        return this.f4992e;
    }

    public final <T> void e(String key, T t10) {
        kotlin.jvm.internal.n.e(key, "key");
        if (!f4986f.b(t10)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't put value with type ");
            kotlin.jvm.internal.n.b(t10);
            sb2.append(t10.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString());
        }
        Object obj = this.f4990c.get(key);
        r rVar = obj instanceof r ? (r) obj : null;
        if (rVar != null) {
            rVar.setValue(t10);
        } else {
            this.f4988a.put(key, t10);
        }
        cl.k<Object> kVar = this.f4991d.get(key);
        if (kVar == null) {
            return;
        }
        kVar.setValue(t10);
    }
}
