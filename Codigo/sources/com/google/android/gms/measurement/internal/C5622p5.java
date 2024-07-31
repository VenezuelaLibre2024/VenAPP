package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.p5 */
/* loaded from: classes2.dex */
final class C5622p5 implements zzo {

    /* renamed from: a */
    private final /* synthetic */ String f11682a;

    /* renamed from: b */
    private final /* synthetic */ C5531i5 f11683b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5622p5(C5531i5 c5531i5, String str) {
        this.f11683b = c5531i5;
        this.f11682a = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map;
        map = this.f11683b.f11436d;
        Map map2 = (Map) map.get(this.f11682a);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
