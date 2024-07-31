package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f7717a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Class<?>, h> f7718b;

    /* loaded from: classes.dex */
    public static final class a implements h {
        a() {
        }

        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String key, Object value) {
            kotlin.jvm.internal.n.e(bundle, "bundle");
            kotlin.jvm.internal.n.e(key, "key");
            kotlin.jvm.internal.n.e(value, "value");
            bundle.putBoolean(key, ((Boolean) value).booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements h {
        b() {
        }

        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String key, Object value) {
            kotlin.jvm.internal.n.e(bundle, "bundle");
            kotlin.jvm.internal.n.e(key, "key");
            kotlin.jvm.internal.n.e(value, "value");
            bundle.putInt(key, ((Integer) value).intValue());
        }
    }

    /* renamed from: com.facebook.internal.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0137c implements h {
        C0137c() {
        }

        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String key, Object value) {
            kotlin.jvm.internal.n.e(bundle, "bundle");
            kotlin.jvm.internal.n.e(key, "key");
            kotlin.jvm.internal.n.e(value, "value");
            bundle.putLong(key, ((Long) value).longValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements h {
        d() {
        }

        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String key, Object value) {
            kotlin.jvm.internal.n.e(bundle, "bundle");
            kotlin.jvm.internal.n.e(key, "key");
            kotlin.jvm.internal.n.e(value, "value");
            bundle.putDouble(key, ((Double) value).doubleValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements h {
        e() {
        }

        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String key, Object value) {
            kotlin.jvm.internal.n.e(bundle, "bundle");
            kotlin.jvm.internal.n.e(key, "key");
            kotlin.jvm.internal.n.e(value, "value");
            bundle.putString(key, (String) value);
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements h {
        f() {
        }

        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String key, Object value) {
            kotlin.jvm.internal.n.e(bundle, "bundle");
            kotlin.jvm.internal.n.e(key, "key");
            kotlin.jvm.internal.n.e(value, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements h {
        g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String key, Object value) {
            kotlin.jvm.internal.n.e(bundle, "bundle");
            kotlin.jvm.internal.n.e(key, "key");
            kotlin.jvm.internal.n.e(value, "value");
            JSONArray jSONArray = (JSONArray) value;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(key, arrayList);
                return;
            }
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    Object obj = jSONArray.get(i10);
                    if (!(obj instanceof String)) {
                        throw new IllegalArgumentException(kotlin.jvm.internal.n.k("Unexpected type in an array: ", obj.getClass()));
                    }
                    arrayList.add(obj);
                    if (i11 >= length) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            bundle.putStringArrayList(key, arrayList);
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        void a(Bundle bundle, String str, Object obj);
    }

    static {
        HashMap hashMap = new HashMap();
        f7718b = hashMap;
        hashMap.put(Boolean.class, new a());
        hashMap.put(Integer.class, new b());
        hashMap.put(Long.class, new C0137c());
        hashMap.put(Double.class, new d());
        hashMap.put(String.class, new e());
        hashMap.put(String[].class, new f());
        hashMap.put(JSONArray.class, new g());
    }

    private c() {
    }

    public static final Bundle a(JSONObject jsonObject) {
        kotlin.jvm.internal.n.e(jsonObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object value = jsonObject.get(key);
            if (value != JSONObject.NULL) {
                if (value instanceof JSONObject) {
                    bundle.putBundle(key, a((JSONObject) value));
                } else {
                    h hVar = f7718b.get(value.getClass());
                    if (hVar == null) {
                        throw new IllegalArgumentException(kotlin.jvm.internal.n.k("Unsupported type: ", value.getClass()));
                    }
                    kotlin.jvm.internal.n.d(key, "key");
                    kotlin.jvm.internal.n.d(value, "value");
                    hVar.a(bundle, key, value);
                }
            }
        }
        return bundle;
    }
}
