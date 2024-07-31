package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.C5737y6;
import java.util.EnumMap;

/* renamed from: com.google.android.gms.measurement.internal.k */
/* loaded from: classes2.dex */
final class C5551k {

    /* renamed from: a */
    private final EnumMap<C5737y6.a, EnumC5538j> f11495a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5551k() {
        this.f11495a = new EnumMap<>(C5737y6.a.class);
    }

    private C5551k(EnumMap<C5737y6.a, EnumC5538j> enumMap) {
        EnumMap<C5737y6.a, EnumC5538j> enumMap2 = new EnumMap<>((Class<C5737y6.a>) C5737y6.a.class);
        this.f11495a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    /* renamed from: b */
    public static C5551k m14063b(String str) {
        EnumMap enumMap = new EnumMap(C5737y6.a.class);
        if (str.length() >= C5737y6.a.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                C5737y6.a[] values = C5737y6.a.values();
                int length = values.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put((EnumMap) values[i10], (C5737y6.a) EnumC5538j.m14055h(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new C5551k(enumMap);
            }
        }
        return new C5551k();
    }

    /* renamed from: a */
    public final EnumC5538j m14064a(C5737y6.a aVar) {
        EnumC5538j enumC5538j = this.f11495a.get(aVar);
        return enumC5538j == null ? EnumC5538j.UNSET : enumC5538j;
    }

    /* renamed from: c */
    public final void m14065c(C5737y6.a aVar, int i10) {
        EnumC5538j enumC5538j = EnumC5538j.UNSET;
        if (i10 != -20) {
            if (i10 == -10) {
                enumC5538j = EnumC5538j.MANIFEST;
            } else if (i10 != 0) {
                if (i10 == 30) {
                    enumC5538j = EnumC5538j.INITIALIZATION;
                }
            }
            this.f11495a.put((EnumMap<C5737y6.a, EnumC5538j>) aVar, (C5737y6.a) enumC5538j);
        }
        enumC5538j = EnumC5538j.API;
        this.f11495a.put((EnumMap<C5737y6.a, EnumC5538j>) aVar, (C5737y6.a) enumC5538j);
    }

    /* renamed from: d */
    public final void m14066d(C5737y6.a aVar, EnumC5538j enumC5538j) {
        this.f11495a.put((EnumMap<C5737y6.a, EnumC5538j>) aVar, (C5737y6.a) enumC5538j);
    }

    public final String toString() {
        char c10;
        StringBuilder sb2 = new StringBuilder("1");
        for (C5737y6.a aVar : C5737y6.a.values()) {
            EnumC5538j enumC5538j = this.f11495a.get(aVar);
            if (enumC5538j == null) {
                enumC5538j = EnumC5538j.UNSET;
            }
            c10 = enumC5538j.zzj;
            sb2.append(c10);
        }
        return sb2.toString();
    }
}
