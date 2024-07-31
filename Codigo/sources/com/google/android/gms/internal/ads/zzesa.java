package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
final class zzesa implements zzexq {
    private final Set zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzesa(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzgen.zzh(new zzexp() { // from class: com.google.android.gms.internal.ads.zzerz
            @Override // com.google.android.gms.internal.ads.zzexp
            public final void zzj(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
