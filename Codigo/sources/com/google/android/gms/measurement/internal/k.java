package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.y6;
import java.util.EnumMap;

/* loaded from: classes2.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap<y6.a, j> f10323a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k() {
        this.f10323a = new EnumMap<>(y6.a.class);
    }

    private k(EnumMap<y6.a, j> enumMap) {
        EnumMap<y6.a, j> enumMap2 = new EnumMap<>((Class<y6.a>) y6.a.class);
        this.f10323a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static k b(String str) {
        EnumMap enumMap = new EnumMap(y6.a.class);
        if (str.length() >= y6.a.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                y6.a[] values = y6.a.values();
                int length = values.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put((EnumMap) values[i10], (y6.a) j.h(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new k(enumMap);
            }
        }
        return new k();
    }

    public final j a(y6.a aVar) {
        j jVar = this.f10323a.get(aVar);
        return jVar == null ? j.UNSET : jVar;
    }

    public final void c(y6.a aVar, int i10) {
        j jVar = j.UNSET;
        if (i10 != -20) {
            if (i10 == -10) {
                jVar = j.MANIFEST;
            } else if (i10 != 0) {
                if (i10 == 30) {
                    jVar = j.INITIALIZATION;
                }
            }
            this.f10323a.put((EnumMap<y6.a, j>) aVar, (y6.a) jVar);
        }
        jVar = j.API;
        this.f10323a.put((EnumMap<y6.a, j>) aVar, (y6.a) jVar);
    }

    public final void d(y6.a aVar, j jVar) {
        this.f10323a.put((EnumMap<y6.a, j>) aVar, (y6.a) jVar);
    }

    public final String toString() {
        char c10;
        StringBuilder sb2 = new StringBuilder("1");
        for (y6.a aVar : y6.a.values()) {
            j jVar = this.f10323a.get(aVar);
            if (jVar == null) {
                jVar = j.UNSET;
            }
            c10 = jVar.zzj;
            sb2.append(c10);
        }
        return sb2.toString();
    }
}
