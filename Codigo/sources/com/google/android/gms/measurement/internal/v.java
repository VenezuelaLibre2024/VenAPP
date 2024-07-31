package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.y6;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: f, reason: collision with root package name */
    public static final v f10684f = new v((Boolean) null, 100);

    /* renamed from: a, reason: collision with root package name */
    private final int f10685a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10686b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f10687c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10688d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumMap<y6.a, Boolean> f10689e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Boolean bool, int i10) {
        this(bool, i10, (Boolean) null, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap<y6.a, Boolean> enumMap = new EnumMap<>((Class<y6.a>) y6.a.class);
        this.f10689e = enumMap;
        enumMap.put((EnumMap<y6.a, Boolean>) y6.a.AD_USER_DATA, (y6.a) bool);
        this.f10685a = i10;
        this.f10686b = k();
        this.f10687c = bool2;
        this.f10688d = str;
    }

    private v(EnumMap<y6.a, Boolean> enumMap, int i10) {
        this(enumMap, i10, (Boolean) null, (String) null);
    }

    private v(EnumMap<y6.a, Boolean> enumMap, int i10, Boolean bool, String str) {
        EnumMap<y6.a, Boolean> enumMap2 = new EnumMap<>((Class<y6.a>) y6.a.class);
        this.f10689e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f10685a = i10;
        this.f10686b = k();
        this.f10687c = bool;
        this.f10688d = str;
    }

    public static v b(Bundle bundle, int i10) {
        if (bundle == null) {
            return new v((Boolean) null, i10);
        }
        EnumMap enumMap = new EnumMap(y6.a.class);
        for (y6.a aVar : x6.DMA.b()) {
            enumMap.put((EnumMap) aVar, (y6.a) y6.q(bundle.getString(aVar.zze)));
        }
        return new v((EnumMap<y6.a, Boolean>) enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static v c(String str) {
        if (str == null || str.length() <= 0) {
            return f10684f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(y6.a.class);
        y6.a[] b10 = x6.DMA.b();
        int length = b10.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            enumMap.put((EnumMap) b10[i11], (y6.a) y6.g(split[i10].charAt(0)));
            i11++;
            i10++;
        }
        return new v((EnumMap<y6.a, Boolean>) enumMap, parseInt);
    }

    public static Boolean d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return y6.q(bundle.getString("ad_personalization"));
    }

    private final String k() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10685a);
        for (y6.a aVar : x6.DMA.b()) {
            sb2.append(":");
            sb2.append(y6.a(this.f10689e.get(aVar)));
        }
        return sb2.toString();
    }

    public final int a() {
        return this.f10685a;
    }

    public final Bundle e() {
        Bundle bundle = new Bundle();
        for (Map.Entry<y6.a, Boolean> entry : this.f10689e.entrySet()) {
            Boolean value = entry.getValue();
            if (value != null) {
                bundle.putString(entry.getKey().zze, y6.j(value.booleanValue()));
            }
        }
        Boolean bool = this.f10687c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f10688d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f10686b.equalsIgnoreCase(vVar.f10686b) && wa.d.a(this.f10687c, vVar.f10687c)) {
            return wa.d.a(this.f10688d, vVar.f10688d);
        }
        return false;
    }

    public final Boolean f() {
        return this.f10689e.get(y6.a.AD_USER_DATA);
    }

    public final Boolean g() {
        return this.f10687c;
    }

    public final String h() {
        return this.f10688d;
    }

    public final int hashCode() {
        Boolean bool = this.f10687c;
        int i10 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f10688d;
        return this.f10686b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String i() {
        return this.f10686b;
    }

    public final boolean j() {
        Iterator<Boolean> it = this.f10689e.values().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(y6.h(this.f10685a));
        for (y6.a aVar : x6.DMA.b()) {
            sb2.append(",");
            sb2.append(aVar.zze);
            sb2.append("=");
            Boolean bool = this.f10689e.get(aVar);
            sb2.append(bool == null ? "uninitialized" : bool.booleanValue() ? "granted" : "denied");
        }
        if (this.f10687c != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(this.f10687c);
        }
        if (this.f10688d != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(this.f10688d);
        }
        return sb2.toString();
    }
}
