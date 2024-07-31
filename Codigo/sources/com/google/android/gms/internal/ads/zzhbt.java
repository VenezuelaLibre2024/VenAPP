package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhbt {
    private final ArrayDeque zza = new ArrayDeque();

    private zzhbt() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhbt(zzhbs zzhbsVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzgyl zza(zzhbt zzhbtVar, zzgyl zzgylVar, zzgyl zzgylVar2) {
        zzhbtVar.zzb(zzgylVar);
        zzhbtVar.zzb(zzgylVar2);
        zzgyl zzgylVar3 = (zzgyl) zzhbtVar.zza.pop();
        while (!zzhbtVar.zza.isEmpty()) {
            zzgylVar3 = new zzhbx((zzgyl) zzhbtVar.zza.pop(), zzgylVar3);
        }
        return zzgylVar3;
    }

    private final void zzb(zzgyl zzgylVar) {
        zzhbw zzhbwVar;
        if (!zzgylVar.zzh()) {
            if (!(zzgylVar instanceof zzhbx)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgylVar.getClass())));
            }
            zzhbx zzhbxVar = (zzhbx) zzgylVar;
            zzb(zzhbx.zzg(zzhbxVar));
            zzb(zzhbx.zzB(zzhbxVar));
            return;
        }
        int zzc = zzc(zzgylVar.zzd());
        ArrayDeque arrayDeque = this.zza;
        int zzc2 = zzhbx.zzc(zzc + 1);
        if (arrayDeque.isEmpty() || ((zzgyl) this.zza.peek()).zzd() >= zzc2) {
            this.zza.push(zzgylVar);
            return;
        }
        int zzc3 = zzhbx.zzc(zzc);
        zzgyl zzgylVar2 = (zzgyl) this.zza.pop();
        while (true) {
            zzhbwVar = null;
            if (this.zza.isEmpty() || ((zzgyl) this.zza.peek()).zzd() >= zzc3) {
                break;
            } else {
                zzgylVar2 = new zzhbx((zzgyl) this.zza.pop(), zzgylVar2);
            }
        }
        zzhbx zzhbxVar2 = new zzhbx(zzgylVar2, zzgylVar);
        while (!this.zza.isEmpty()) {
            int zzc4 = zzc(zzhbxVar2.zzd()) + 1;
            ArrayDeque arrayDeque2 = this.zza;
            if (((zzgyl) arrayDeque2.peek()).zzd() >= zzhbx.zzc(zzc4)) {
                break;
            } else {
                zzhbxVar2 = new zzhbx((zzgyl) this.zza.pop(), zzhbxVar2);
            }
        }
        this.zza.push(zzhbxVar2);
    }

    private static final int zzc(int i10) {
        int binarySearch = Arrays.binarySearch(zzhbx.zza, i10);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
