package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class y6 {

    /* renamed from: c, reason: collision with root package name */
    public static final y6 f10861c = new y6(null, null, 100);

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap<a, Boolean> f10862a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10863b;

    /* loaded from: classes2.dex */
    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");

        public final String zze;

        a(String str) {
            this.zze = str;
        }
    }

    public y6(Boolean bool, Boolean bool2, int i10) {
        EnumMap<a, Boolean> enumMap = new EnumMap<>((Class<a>) a.class);
        this.f10862a = enumMap;
        enumMap.put((EnumMap<a, Boolean>) a.AD_STORAGE, (a) bool);
        enumMap.put((EnumMap<a, Boolean>) a.ANALYTICS_STORAGE, (a) bool2);
        this.f10863b = i10;
    }

    private y6(EnumMap<a, Boolean> enumMap, int i10) {
        EnumMap<a, Boolean> enumMap2 = new EnumMap<>((Class<a>) a.class);
        this.f10862a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f10863b = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static char a(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    public static y6 c(Bundle bundle, int i10) {
        a[] aVarArr;
        if (bundle == null) {
            return new y6(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = x6.STORAGE.zzd;
        for (a aVar : aVarArr) {
            enumMap.put((EnumMap) aVar, (a) q(bundle.getString(aVar.zze)));
        }
        return new y6(enumMap, i10);
    }

    public static y6 e(String str) {
        return f(str, 100);
    }

    public static y6 f(String str, int i10) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str != null) {
            a[] b10 = x6.STORAGE.b();
            for (int i11 = 0; i11 < b10.length; i11++) {
                a aVar = b10[i11];
                int i12 = i11 + 2;
                if (i12 < str.length()) {
                    enumMap.put((EnumMap) aVar, (a) g(str.charAt(i12)));
                }
            }
        }
        return new y6(enumMap, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean g(char c10) {
        if (c10 == '0') {
            return Boolean.FALSE;
        }
        if (c10 != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h(int i10) {
        return i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API";
    }

    public static String i(Bundle bundle) {
        a[] aVarArr;
        String string;
        aVarArr = x6.STORAGE.zzd;
        for (a aVar : aVarArr) {
            if (bundle.containsKey(aVar.zze) && (string = bundle.getString(aVar.zze)) != null && q(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String j(boolean z10) {
        return z10 ? "granted" : "denied";
    }

    public static boolean k(int i10, int i11) {
        return i10 <= i11;
    }

    private static int n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean q(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final int b() {
        return this.f10863b;
    }

    public final y6 d(y6 y6Var) {
        a[] aVarArr;
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = x6.STORAGE.zzd;
        for (a aVar : aVarArr) {
            Boolean bool = this.f10862a.get(aVar);
            Boolean bool2 = y6Var.f10862a.get(aVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put((EnumMap) aVar, (a) bool);
        }
        return new y6(enumMap, 100);
    }

    public final boolean equals(Object obj) {
        a[] aVarArr;
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        aVarArr = x6.STORAGE.zzd;
        for (a aVar : aVarArr) {
            if (n(this.f10862a.get(aVar)) != n(y6Var.f10862a.get(aVar))) {
                return false;
            }
        }
        return this.f10863b == y6Var.f10863b;
    }

    public final int hashCode() {
        int i10 = this.f10863b * 17;
        Iterator<Boolean> it = this.f10862a.values().iterator();
        while (it.hasNext()) {
            i10 = (i10 * 31) + n(it.next());
        }
        return i10;
    }

    public final boolean l(a aVar) {
        Boolean bool = this.f10862a.get(aVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean m(y6 y6Var, a... aVarArr) {
        for (a aVar : aVarArr) {
            if (!y6Var.l(aVar) && l(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        for (Map.Entry<a, Boolean> entry : this.f10862a.entrySet()) {
            Boolean value = entry.getValue();
            if (value != null) {
                bundle.putString(entry.getKey().zze, j(value.booleanValue()));
            }
        }
        return bundle;
    }

    public final y6 p(y6 y6Var) {
        a[] aVarArr;
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = x6.STORAGE.zzd;
        for (a aVar : aVarArr) {
            Boolean bool = this.f10862a.get(aVar);
            if (bool == null) {
                bool = y6Var.f10862a.get(aVar);
            }
            enumMap.put((EnumMap) aVar, (a) bool);
        }
        return new y6(enumMap, this.f10863b);
    }

    public final boolean r(y6 y6Var, a... aVarArr) {
        for (a aVar : aVarArr) {
            Boolean bool = this.f10862a.get(aVar);
            Boolean bool2 = y6Var.f10862a.get(aVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final Boolean s() {
        return this.f10862a.get(a.AD_STORAGE);
    }

    public final boolean t(y6 y6Var) {
        return r(y6Var, (a[]) this.f10862a.keySet().toArray(new a[0]));
    }

    public final String toString() {
        a[] aVarArr;
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(h(this.f10863b));
        aVarArr = x6.STORAGE.zzd;
        for (a aVar : aVarArr) {
            sb2.append(",");
            sb2.append(aVar.zze);
            sb2.append("=");
            Boolean bool = this.f10862a.get(aVar);
            sb2.append(bool == null ? "uninitialized" : bool.booleanValue() ? "granted" : "denied");
        }
        return sb2.toString();
    }

    public final Boolean u() {
        return this.f10862a.get(a.ANALYTICS_STORAGE);
    }

    public final String v() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (a aVar : x6.STORAGE.b()) {
            sb2.append(a(this.f10862a.get(aVar)));
        }
        return sb2.toString();
    }

    public final String w() {
        StringBuilder sb2 = new StringBuilder("G2");
        for (a aVar : x6.STORAGE.b()) {
            Boolean bool = this.f10862a.get(aVar);
            sb2.append(bool == null ? 'g' : bool.booleanValue() ? 'G' : 'D');
        }
        return sb2.toString();
    }

    public final boolean x() {
        return l(a.AD_STORAGE);
    }

    public final boolean y() {
        return l(a.ANALYTICS_STORAGE);
    }

    public final boolean z() {
        Iterator<Boolean> it = this.f10862a.values().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                return true;
            }
        }
        return false;
    }
}
