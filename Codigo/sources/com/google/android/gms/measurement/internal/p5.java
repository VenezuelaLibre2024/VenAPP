package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

/* loaded from: classes2.dex */
final class p5 implements zzo {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f10495a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ i5 f10496b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p5(i5 i5Var, String str) {
        this.f10496b = i5Var;
        this.f10495a = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map;
        map = this.f10496b.f10264d;
        Map map2 = (Map) map.get(this.f10495a);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
