package com.google.android.gms.common.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class q {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final List f9623a;

        /* renamed from: b */
        private final Object f9624b;

        /* synthetic */ a(Object obj, e1 e1Var) {
            s.j(obj);
            this.f9624b = obj;
            this.f9623a = new ArrayList();
        }

        public a a(String str, Object obj) {
            List list = this.f9623a;
            s.j(str);
            list.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f9624b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f9623a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f9623a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
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
            if (!b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a d(Object obj) {
        return new a(obj, null);
    }
}
