package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzfmb {
    private final la.f zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();

    public zzfmb(la.f fVar) {
        this.zza = fVar;
    }

    private final void zzd(String str, String str2) {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, new ArrayList());
        }
        ((List) this.zzb.get(str)).add(str2);
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.zzb.entrySet()) {
            int i10 = 0;
            if (((List) entry.getValue()).size() > 1) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    i10++;
                    arrayList.add(new zzfma(((String) entry.getKey()) + "." + i10, (String) it.next()));
                }
            } else {
                arrayList.add(new zzfma((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    public final void zzb(String str) {
        if (!this.zzc.containsKey(str)) {
            this.zzc.put(str, Long.valueOf(this.zza.b()));
            return;
        }
        long b10 = this.zza.b() - ((Long) this.zzc.remove(str)).longValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b10);
        zzd(str, sb2.toString());
    }

    public final void zzc(String str, String str2) {
        if (!this.zzc.containsKey(str)) {
            this.zzc.put(str, Long.valueOf(this.zza.b()));
            return;
        }
        zzd(str, str2 + (this.zza.b() - ((Long) this.zzc.remove(str)).longValue()));
    }
}
