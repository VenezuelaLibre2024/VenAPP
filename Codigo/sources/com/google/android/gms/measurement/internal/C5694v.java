package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C5737y6;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import p418wa.C12099d;

/* renamed from: com.google.android.gms.measurement.internal.v */
/* loaded from: classes2.dex */
public final class C5694v {

    /* renamed from: f */
    public static final C5694v f11882f = new C5694v((Boolean) null, 100);

    /* renamed from: a */
    private final int f11883a;

    /* renamed from: b */
    private final String f11884b;

    /* renamed from: c */
    private final Boolean f11885c;

    /* renamed from: d */
    private final String f11886d;

    /* renamed from: e */
    private final EnumMap<C5737y6.a, Boolean> f11887e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5694v(Boolean bool, int i10) {
        this(bool, i10, (Boolean) null, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5694v(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap<C5737y6.a, Boolean> enumMap = new EnumMap<>((Class<C5737y6.a>) C5737y6.a.class);
        this.f11887e = enumMap;
        enumMap.put((EnumMap<C5737y6.a, Boolean>) C5737y6.a.AD_USER_DATA, (C5737y6.a) bool);
        this.f11883a = i10;
        this.f11884b = m14367k();
        this.f11885c = bool2;
        this.f11886d = str;
    }

    private C5694v(EnumMap<C5737y6.a, Boolean> enumMap, int i10) {
        this(enumMap, i10, (Boolean) null, (String) null);
    }

    private C5694v(EnumMap<C5737y6.a, Boolean> enumMap, int i10, Boolean bool, String str) {
        EnumMap<C5737y6.a, Boolean> enumMap2 = new EnumMap<>((Class<C5737y6.a>) C5737y6.a.class);
        this.f11887e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f11883a = i10;
        this.f11884b = m14367k();
        this.f11885c = bool;
        this.f11886d = str;
    }

    /* renamed from: b */
    public static C5694v m14364b(Bundle bundle, int i10) {
        if (bundle == null) {
            return new C5694v((Boolean) null, i10);
        }
        EnumMap enumMap = new EnumMap(C5737y6.a.class);
        for (C5737y6.a aVar : EnumC5725x6.DMA.m14539b()) {
            enumMap.put((EnumMap) aVar, (C5737y6.a) C5737y6.m14582q(bundle.getString(aVar.zze)));
        }
        return new C5694v((EnumMap<C5737y6.a, Boolean>) enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    /* renamed from: c */
    public static C5694v m14365c(String str) {
        if (str == null || str.length() <= 0) {
            return f11882f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(C5737y6.a.class);
        C5737y6.a[] m14539b = EnumC5725x6.DMA.m14539b();
        int length = m14539b.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            enumMap.put((EnumMap) m14539b[i11], (C5737y6.a) C5737y6.m14576g(split[i10].charAt(0)));
            i11++;
            i10++;
        }
        return new C5694v((EnumMap<C5737y6.a, Boolean>) enumMap, parseInt);
    }

    /* renamed from: d */
    public static Boolean m14366d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return C5737y6.m14582q(bundle.getString("ad_personalization"));
    }

    /* renamed from: k */
    private final String m14367k() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11883a);
        for (C5737y6.a aVar : EnumC5725x6.DMA.m14539b()) {
            sb2.append(":");
            sb2.append(C5737y6.m14572a(this.f11887e.get(aVar)));
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public final int m14368a() {
        return this.f11883a;
    }

    /* renamed from: e */
    public final Bundle m14369e() {
        Bundle bundle = new Bundle();
        for (Map.Entry<C5737y6.a, Boolean> entry : this.f11887e.entrySet()) {
            Boolean value = entry.getValue();
            if (value != null) {
                bundle.putString(entry.getKey().zze, C5737y6.m14579j(value.booleanValue()));
            }
        }
        Boolean bool = this.f11885c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f11886d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5694v)) {
            return false;
        }
        C5694v c5694v = (C5694v) obj;
        if (this.f11884b.equalsIgnoreCase(c5694v.f11884b) && C12099d.m38847a(this.f11885c, c5694v.f11885c)) {
            return C12099d.m38847a(this.f11886d, c5694v.f11886d);
        }
        return false;
    }

    /* renamed from: f */
    public final Boolean m14370f() {
        return this.f11887e.get(C5737y6.a.AD_USER_DATA);
    }

    /* renamed from: g */
    public final Boolean m14371g() {
        return this.f11885c;
    }

    /* renamed from: h */
    public final String m14372h() {
        return this.f11886d;
    }

    public final int hashCode() {
        Boolean bool = this.f11885c;
        int i10 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f11886d;
        return this.f11884b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    /* renamed from: i */
    public final String m14373i() {
        return this.f11884b;
    }

    /* renamed from: j */
    public final boolean m14374j() {
        Iterator<Boolean> it = this.f11887e.values().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(C5737y6.m14577h(this.f11883a));
        for (C5737y6.a aVar : EnumC5725x6.DMA.m14539b()) {
            sb2.append(",");
            sb2.append(aVar.zze);
            sb2.append("=");
            Boolean bool = this.f11887e.get(aVar);
            sb2.append(bool == null ? "uninitialized" : bool.booleanValue() ? "granted" : "denied");
        }
        if (this.f11885c != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(this.f11885c);
        }
        if (this.f11886d != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(this.f11886d);
        }
        return sb2.toString();
    }
}
