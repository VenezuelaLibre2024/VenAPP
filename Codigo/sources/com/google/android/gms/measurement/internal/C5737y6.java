package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.y6 */
/* loaded from: classes2.dex */
public final class C5737y6 {

    /* renamed from: c */
    public static final C5737y6 f12076c = new C5737y6(null, null, 100);

    /* renamed from: a */
    private final EnumMap<a, Boolean> f12077a;

    /* renamed from: b */
    private final int f12078b;

    /* renamed from: com.google.android.gms.measurement.internal.y6$a */
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

    public C5737y6(Boolean bool, Boolean bool2, int i10) {
        EnumMap<a, Boolean> enumMap = new EnumMap<>((Class<a>) a.class);
        this.f12077a = enumMap;
        enumMap.put((EnumMap<a, Boolean>) a.AD_STORAGE, (a) bool);
        enumMap.put((EnumMap<a, Boolean>) a.ANALYTICS_STORAGE, (a) bool2);
        this.f12078b = i10;
    }

    private C5737y6(EnumMap<a, Boolean> enumMap, int i10) {
        EnumMap<a, Boolean> enumMap2 = new EnumMap<>((Class<a>) a.class);
        this.f12077a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f12078b = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static char m14572a(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    /* renamed from: c */
    public static C5737y6 m14573c(Bundle bundle, int i10) {
        a[] aVarArr;
        if (bundle == null) {
            return new C5737y6(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = EnumC5725x6.STORAGE.zzd;
        for (a aVar : aVarArr) {
            enumMap.put((EnumMap) aVar, (a) m14582q(bundle.getString(aVar.zze)));
        }
        return new C5737y6(enumMap, i10);
    }

    /* renamed from: e */
    public static C5737y6 m14574e(String str) {
        return m14575f(str, 100);
    }

    /* renamed from: f */
    public static C5737y6 m14575f(String str, int i10) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str != null) {
            a[] m14539b = EnumC5725x6.STORAGE.m14539b();
            for (int i11 = 0; i11 < m14539b.length; i11++) {
                a aVar = m14539b[i11];
                int i12 = i11 + 2;
                if (i12 < str.length()) {
                    enumMap.put((EnumMap) aVar, (a) m14576g(str.charAt(i12)));
                }
            }
        }
        return new C5737y6(enumMap, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static Boolean m14576g(char c10) {
        if (c10 == '0') {
            return Boolean.FALSE;
        }
        if (c10 != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static String m14577h(int i10) {
        return i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API";
    }

    /* renamed from: i */
    public static String m14578i(Bundle bundle) {
        a[] aVarArr;
        String string;
        aVarArr = EnumC5725x6.STORAGE.zzd;
        for (a aVar : aVarArr) {
            if (bundle.containsKey(aVar.zze) && (string = bundle.getString(aVar.zze)) != null && m14582q(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static String m14579j(boolean z10) {
        return z10 ? "granted" : "denied";
    }

    /* renamed from: k */
    public static boolean m14580k(int i10, int i11) {
        return i10 <= i11;
    }

    /* renamed from: n */
    private static int m14581n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static Boolean m14582q(String str) {
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

    /* renamed from: b */
    public final int m14583b() {
        return this.f12078b;
    }

    /* renamed from: d */
    public final C5737y6 m14584d(C5737y6 c5737y6) {
        a[] aVarArr;
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = EnumC5725x6.STORAGE.zzd;
        for (a aVar : aVarArr) {
            Boolean bool = this.f12077a.get(aVar);
            Boolean bool2 = c5737y6.f12077a.get(aVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put((EnumMap) aVar, (a) bool);
        }
        return new C5737y6(enumMap, 100);
    }

    public final boolean equals(Object obj) {
        a[] aVarArr;
        if (!(obj instanceof C5737y6)) {
            return false;
        }
        C5737y6 c5737y6 = (C5737y6) obj;
        aVarArr = EnumC5725x6.STORAGE.zzd;
        for (a aVar : aVarArr) {
            if (m14581n(this.f12077a.get(aVar)) != m14581n(c5737y6.f12077a.get(aVar))) {
                return false;
            }
        }
        return this.f12078b == c5737y6.f12078b;
    }

    public final int hashCode() {
        int i10 = this.f12078b * 17;
        Iterator<Boolean> it = this.f12077a.values().iterator();
        while (it.hasNext()) {
            i10 = (i10 * 31) + m14581n(it.next());
        }
        return i10;
    }

    /* renamed from: l */
    public final boolean m14585l(a aVar) {
        Boolean bool = this.f12077a.get(aVar);
        return bool == null || bool.booleanValue();
    }

    /* renamed from: m */
    public final boolean m14586m(C5737y6 c5737y6, a... aVarArr) {
        for (a aVar : aVarArr) {
            if (!c5737y6.m14585l(aVar) && m14585l(aVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final Bundle m14587o() {
        Bundle bundle = new Bundle();
        for (Map.Entry<a, Boolean> entry : this.f12077a.entrySet()) {
            Boolean value = entry.getValue();
            if (value != null) {
                bundle.putString(entry.getKey().zze, m14579j(value.booleanValue()));
            }
        }
        return bundle;
    }

    /* renamed from: p */
    public final C5737y6 m14588p(C5737y6 c5737y6) {
        a[] aVarArr;
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = EnumC5725x6.STORAGE.zzd;
        for (a aVar : aVarArr) {
            Boolean bool = this.f12077a.get(aVar);
            if (bool == null) {
                bool = c5737y6.f12077a.get(aVar);
            }
            enumMap.put((EnumMap) aVar, (a) bool);
        }
        return new C5737y6(enumMap, this.f12078b);
    }

    /* renamed from: r */
    public final boolean m14589r(C5737y6 c5737y6, a... aVarArr) {
        for (a aVar : aVarArr) {
            Boolean bool = this.f12077a.get(aVar);
            Boolean bool2 = c5737y6.f12077a.get(aVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public final Boolean m14590s() {
        return this.f12077a.get(a.AD_STORAGE);
    }

    /* renamed from: t */
    public final boolean m14591t(C5737y6 c5737y6) {
        return m14589r(c5737y6, (a[]) this.f12077a.keySet().toArray(new a[0]));
    }

    public final String toString() {
        a[] aVarArr;
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(m14577h(this.f12078b));
        aVarArr = EnumC5725x6.STORAGE.zzd;
        for (a aVar : aVarArr) {
            sb2.append(",");
            sb2.append(aVar.zze);
            sb2.append("=");
            Boolean bool = this.f12077a.get(aVar);
            sb2.append(bool == null ? "uninitialized" : bool.booleanValue() ? "granted" : "denied");
        }
        return sb2.toString();
    }

    /* renamed from: u */
    public final Boolean m14592u() {
        return this.f12077a.get(a.ANALYTICS_STORAGE);
    }

    /* renamed from: v */
    public final String m14593v() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (a aVar : EnumC5725x6.STORAGE.m14539b()) {
            sb2.append(m14572a(this.f12077a.get(aVar)));
        }
        return sb2.toString();
    }

    /* renamed from: w */
    public final String m14594w() {
        StringBuilder sb2 = new StringBuilder("G2");
        for (a aVar : EnumC5725x6.STORAGE.m14539b()) {
            Boolean bool = this.f12077a.get(aVar);
            sb2.append(bool == null ? 'g' : bool.booleanValue() ? 'G' : 'D');
        }
        return sb2.toString();
    }

    /* renamed from: x */
    public final boolean m14595x() {
        return m14585l(a.AD_STORAGE);
    }

    /* renamed from: y */
    public final boolean m14596y() {
        return m14585l(a.ANALYTICS_STORAGE);
    }

    /* renamed from: z */
    public final boolean m14597z() {
        Iterator<Boolean> it = this.f12077a.values().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                return true;
            }
        }
        return false;
    }
}
