package com.google.android.gms.common.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.q */
/* loaded from: classes.dex */
public final class C5270q {

    /* renamed from: com.google.android.gms.common.internal.q$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final List f10738a;

        /* renamed from: b */
        private final Object f10739b;

        /* synthetic */ a(Object obj, C5236e1 c5236e1) {
            C5276s.m13324j(obj);
            this.f10739b = obj;
            this.f10738a = new ArrayList();
        }

        /* renamed from: a */
        public a m13307a(String str, Object obj) {
            List list = this.f10738a;
            C5276s.m13324j(str);
            list.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f10739b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f10738a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f10738a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public static boolean m13303a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!m13304b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m13304b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: c */
    public static int m13305c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: d */
    public static a m13306d(Object obj) {
        return new a(obj, null);
    }
}
