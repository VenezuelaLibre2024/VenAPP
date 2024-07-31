package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* loaded from: classes2.dex */
public final class zzazu {
    private final int zza;
    private final zzazr zzb = new zzazw();

    public zzazu(int i10) {
        this.zza = i10;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] split = sb2.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzazt zzaztVar = new zzazt();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzazs(this));
        for (String str : split) {
            String[] zzb = zzazv.zzb(str, false);
            if (zzb.length != 0) {
                zzazz.zzc(zzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzaztVar.zzb.write(this.zzb.zzb(((zzazy) it.next()).zzb));
            } catch (IOException e10) {
                zzcec.zzh("Error while writing hash to byteStream", e10);
            }
        }
        return zzaztVar.toString();
    }
}
