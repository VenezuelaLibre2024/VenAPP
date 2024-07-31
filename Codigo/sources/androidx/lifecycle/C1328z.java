package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.C0943b;
import androidx.savedstate.C1418a;
import ck.C2033r;
import cl.InterfaceC2048k;
import dk.C7018k0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: androidx.lifecycle.z */
/* loaded from: classes.dex */
public final class C1328z {

    /* renamed from: f */
    public static final a f5740f = new a(null);

    /* renamed from: g */
    private static final Class<? extends Object>[] f5741g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    private final Map<String, Object> f5742a;

    /* renamed from: b */
    private final Map<String, C1418a.c> f5743b;

    /* renamed from: c */
    private final Map<String, Object> f5744c;

    /* renamed from: d */
    private final Map<String, InterfaceC2048k<Object>> f5745d;

    /* renamed from: e */
    private final C1418a.c f5746e;

    /* renamed from: androidx.lifecycle.z$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C1328z m7409a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new C1328z();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    C9322n.m27780d(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new C1328z(hashMap);
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
                C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new C1328z(linkedHashMap);
        }

        /* renamed from: b */
        public final boolean m7410b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : C1328z.f5741g) {
                C9322n.m27778b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C1328z() {
        this.f5742a = new LinkedHashMap();
        this.f5743b = new LinkedHashMap();
        this.f5744c = new LinkedHashMap();
        this.f5745d = new LinkedHashMap();
        this.f5746e = new C1418a.c() { // from class: androidx.lifecycle.y
            @Override // androidx.savedstate.C1418a.c
            /* renamed from: a */
            public final Bundle mo804a() {
                Bundle m7406d;
                m7406d = C1328z.m7406d(C1328z.this);
                return m7406d;
            }
        };
    }

    public C1328z(Map<String, ? extends Object> initialState) {
        C9322n.m27781e(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f5742a = linkedHashMap;
        this.f5743b = new LinkedHashMap();
        this.f5744c = new LinkedHashMap();
        this.f5745d = new LinkedHashMap();
        this.f5746e = new C1418a.c() { // from class: androidx.lifecycle.y
            @Override // androidx.savedstate.C1418a.c
            /* renamed from: a */
            public final Bundle mo804a() {
                Bundle m7406d;
                m7406d = C1328z.m7406d(C1328z.this);
                return m7406d;
            }
        };
        linkedHashMap.putAll(initialState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final Bundle m7406d(C1328z this$0) {
        Map m20432s;
        C9322n.m27781e(this$0, "this$0");
        m20432s = C7018k0.m20432s(this$0.f5743b);
        for (Map.Entry entry : m20432s.entrySet()) {
            this$0.m7408e((String) entry.getKey(), ((C1418a.c) entry.getValue()).mo804a());
        }
        Set<String> keySet = this$0.f5742a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f5742a.get(str));
        }
        return C0943b.m4701a(C2033r.m10353a("keys", arrayList), C2033r.m10353a("values", arrayList2));
    }

    /* renamed from: c */
    public final C1418a.c m7407c() {
        return this.f5746e;
    }

    /* renamed from: e */
    public final <T> void m7408e(String key, T t10) {
        C9322n.m27781e(key, "key");
        if (!f5740f.m7410b(t10)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't put value with type ");
            C9322n.m27778b(t10);
            sb2.append(t10.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString());
        }
        Object obj = this.f5744c.get(key);
        C1320r c1320r = obj instanceof C1320r ? (C1320r) obj : null;
        if (c1320r != null) {
            c1320r.setValue(t10);
        } else {
            this.f5742a.put(key, t10);
        }
        InterfaceC2048k<Object> interfaceC2048k = this.f5745d.get(key);
        if (interfaceC2048k == null) {
            return;
        }
        interfaceC2048k.setValue(t10);
    }
}
