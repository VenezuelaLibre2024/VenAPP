package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzij implements zzmw {
    private final zzig zza;

    private zzij(zzig zzigVar) {
        zzig zzigVar2 = (zzig) zziz.zza(zzigVar, "output");
        this.zza = zzigVar2;
        zzigVar2.zza = this;
    }

    public static zzij zza(zzig zzigVar) {
        zzij zzijVar = zzigVar.zza;
        return zzijVar != null ? zzijVar : new zzij(zzigVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final int zza() {
        return zzmz.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    @Deprecated
    public final void zza(int i10) {
        this.zza.zzc(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int i10, double d10) {
        this.zza.zzb(i10, d10);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int i10, float f10) {
        this.zza.zzb(i10, f10);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int i10, int i11) {
        this.zza.zzb(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int i10, long j10) {
        this.zza.zza(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int i10, zzhm zzhmVar) {
        this.zza.zza(i10, zzhmVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final <K, V> void zza(int i10, zzke<K, V> zzkeVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzc(i10, 2);
            this.zza.zzc(zzkb.zza(zzkeVar, entry.getKey(), entry.getValue()));
            zzkb.zza(this.zza, zzkeVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int i10, Object obj) {
        if (obj instanceof zzhm) {
            this.zza.zzb(i10, (zzhm) obj);
        } else {
            this.zza.zza(i10, (zzkj) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int i10, Object obj, zzlb zzlbVar) {
        zzig zzigVar = this.zza;
        zzigVar.zzc(i10, 3);
        zzlbVar.zza((zzlb) obj, (zzmw) zzigVar.zza);
        zzigVar.zzc(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int i10, String str) {
        this.zza.zza(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int i10, List<zzhm> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zza(i10, list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int i10, List<?> list, zzlb zzlbVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zza(i10, list.get(i11), zzlbVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzig.zza(list.get(i13).booleanValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int i10, boolean z10) {
        this.zza.zza(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    @Deprecated
    public final void zzb(int i10) {
        this.zza.zzc(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzb(int i10, int i11) {
        this.zza.zza(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzb(int i10, long j10) {
        this.zza.zzb(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzb(int i10, Object obj, zzlb zzlbVar) {
        this.zza.zza(i10, (zzkj) obj, zzlbVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzb(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof zzjp)) {
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11));
                i11++;
            }
            return;
        }
        zzjp zzjpVar = (zzjp) list;
        while (i11 < list.size()) {
            Object zzb = zzjpVar.zzb(i11);
            if (zzb instanceof String) {
                this.zza.zza(i10, (String) zzb);
            } else {
                this.zza.zza(i10, (zzhm) zzb);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzb(int i10, List<?> list, zzlb zzlbVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzb(i10, list.get(i11), zzlbVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzb(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzig.zza(list.get(i13).doubleValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzc(int i10, int i11) {
        this.zza.zzb(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzc(int i10, long j10) {
        this.zza.zza(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzc(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzig.zzd(list.get(i13).intValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzd(int i10, int i11) {
        this.zza.zza(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzd(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzd(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzig.zze(list.get(i13).intValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zza(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zze(int i10, int i11) {
        this.zza.zzk(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zze(int i10, long j10) {
        this.zza.zzb(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zze(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzig.zzc(list.get(i13).longValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zza(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzf(int i10, int i11) {
        this.zza.zzd(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzf(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzig.zza(list.get(i13).floatValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzg(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzig.zzf(list.get(i13).intValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzh(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzig.zzd(list.get(i13).longValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzi(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzig.zzg(list.get(i13).intValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zza(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzj(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzig.zze(list.get(i13).longValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zza(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzk(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzk(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzig.zzh(list.get(i13).intValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzk(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzl(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzig.zzf(list.get(i13).longValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzh(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzm(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzd(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzig.zzj(list.get(i13).intValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzc(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzn(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzc(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzig.zzg(list.get(i13).longValue());
        }
        this.zza.zzc(i12);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).longValue());
            i11++;
        }
    }
}
