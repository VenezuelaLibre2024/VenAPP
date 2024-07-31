package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.c */
/* loaded from: classes.dex */
public final class C4611c {

    /* renamed from: a */
    public static final C4611c f8692a = new C4611c();

    /* renamed from: b */
    private static final Map<Class<?>, h> f8693b;

    /* renamed from: com.facebook.internal.c$a */
    /* loaded from: classes.dex */
    public static final class a implements h {
        a() {
        }

        @Override // com.facebook.internal.C4611c.h
        /* renamed from: a */
        public void mo11128a(Bundle bundle, String key, Object value) {
            C9322n.m27781e(bundle, "bundle");
            C9322n.m27781e(key, "key");
            C9322n.m27781e(value, "value");
            bundle.putBoolean(key, ((Boolean) value).booleanValue());
        }
    }

    /* renamed from: com.facebook.internal.c$b */
    /* loaded from: classes.dex */
    public static final class b implements h {
        b() {
        }

        @Override // com.facebook.internal.C4611c.h
        /* renamed from: a */
        public void mo11128a(Bundle bundle, String key, Object value) {
            C9322n.m27781e(bundle, "bundle");
            C9322n.m27781e(key, "key");
            C9322n.m27781e(value, "value");
            bundle.putInt(key, ((Integer) value).intValue());
        }
    }

    /* renamed from: com.facebook.internal.c$c */
    /* loaded from: classes.dex */
    public static final class c implements h {
        c() {
        }

        @Override // com.facebook.internal.C4611c.h
        /* renamed from: a */
        public void mo11128a(Bundle bundle, String key, Object value) {
            C9322n.m27781e(bundle, "bundle");
            C9322n.m27781e(key, "key");
            C9322n.m27781e(value, "value");
            bundle.putLong(key, ((Long) value).longValue());
        }
    }

    /* renamed from: com.facebook.internal.c$d */
    /* loaded from: classes.dex */
    public static final class d implements h {
        d() {
        }

        @Override // com.facebook.internal.C4611c.h
        /* renamed from: a */
        public void mo11128a(Bundle bundle, String key, Object value) {
            C9322n.m27781e(bundle, "bundle");
            C9322n.m27781e(key, "key");
            C9322n.m27781e(value, "value");
            bundle.putDouble(key, ((Double) value).doubleValue());
        }
    }

    /* renamed from: com.facebook.internal.c$e */
    /* loaded from: classes.dex */
    public static final class e implements h {
        e() {
        }

        @Override // com.facebook.internal.C4611c.h
        /* renamed from: a */
        public void mo11128a(Bundle bundle, String key, Object value) {
            C9322n.m27781e(bundle, "bundle");
            C9322n.m27781e(key, "key");
            C9322n.m27781e(value, "value");
            bundle.putString(key, (String) value);
        }
    }

    /* renamed from: com.facebook.internal.c$f */
    /* loaded from: classes.dex */
    public static final class f implements h {
        f() {
        }

        @Override // com.facebook.internal.C4611c.h
        /* renamed from: a */
        public void mo11128a(Bundle bundle, String key, Object value) {
            C9322n.m27781e(bundle, "bundle");
            C9322n.m27781e(key, "key");
            C9322n.m27781e(value, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* renamed from: com.facebook.internal.c$g */
    /* loaded from: classes.dex */
    public static final class g implements h {
        g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.internal.C4611c.h
        /* renamed from: a */
        public void mo11128a(Bundle bundle, String key, Object value) {
            C9322n.m27781e(bundle, "bundle");
            C9322n.m27781e(key, "key");
            C9322n.m27781e(value, "value");
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
                        throw new IllegalArgumentException(C9322n.m27787k("Unexpected type in an array: ", obj.getClass()));
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

    /* renamed from: com.facebook.internal.c$h */
    /* loaded from: classes.dex */
    public interface h {
        /* renamed from: a */
        void mo11128a(Bundle bundle, String str, Object obj);
    }

    static {
        HashMap hashMap = new HashMap();
        f8693b = hashMap;
        hashMap.put(Boolean.class, new a());
        hashMap.put(Integer.class, new b());
        hashMap.put(Long.class, new c());
        hashMap.put(Double.class, new d());
        hashMap.put(String.class, new e());
        hashMap.put(String[].class, new f());
        hashMap.put(JSONArray.class, new g());
    }

    private C4611c() {
    }

    /* renamed from: a */
    public static final Bundle m11127a(JSONObject jsonObject) {
        C9322n.m27781e(jsonObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object value = jsonObject.get(key);
            if (value != JSONObject.NULL) {
                if (value instanceof JSONObject) {
                    bundle.putBundle(key, m11127a((JSONObject) value));
                } else {
                    h hVar = f8693b.get(value.getClass());
                    if (hVar == null) {
                        throw new IllegalArgumentException(C9322n.m27787k("Unsupported type: ", value.getClass()));
                    }
                    C9322n.m27780d(key, "key");
                    C9322n.m27780d(value, "value");
                    hVar.mo11128a(bundle, key, value);
                }
            }
        }
        return bundle;
    }
}
