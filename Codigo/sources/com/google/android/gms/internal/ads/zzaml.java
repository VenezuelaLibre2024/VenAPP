package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
final class zzaml implements zzakm {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzaml(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzama zzamaVar = (zzama) list.get(i10);
            long[] jArr = this.zzb;
            int i11 = i10 + i10;
            jArr[i11] = zzamaVar.zzb;
            jArr[i11 + 1] = zzamaVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final long zzb(int i10) {
        zzek.zzd(i10 >= 0);
        zzek.zzd(i10 < this.zzc.length);
        return this.zzc[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final List zzc(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            long[] jArr = this.zzb;
            int i11 = i10 + i10;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                zzama zzamaVar = (zzama) this.zza.get(i10);
                zzec zzecVar = zzamaVar.zza;
                if (zzecVar.zzg == -3.4028235E38f) {
                    arrayList2.add(zzamaVar);
                } else {
                    arrayList.add(zzecVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzamk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((zzama) obj).zzb, ((zzama) obj2).zzb);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            zzea zzb = ((zzama) arrayList2.get(i12)).zza.zzb();
            zzb.zze((-1) - i12, 1);
            arrayList.add(zzb.zzp());
        }
        return arrayList;
    }
}
