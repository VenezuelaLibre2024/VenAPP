package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzain implements zzana {
    private final zzaik zza;

    private zzain(zzaik zzaikVar) {
        zzaik zzaikVar2 = (zzaik) zzajf.zza(zzaikVar, "output");
        this.zza = zzaikVar2;
        zzaikVar2.zze = this;
    }

    public static zzain zza(zzaik zzaikVar) {
        zzain zzainVar = zzaikVar.zze;
        return zzainVar != null ? zzainVar : new zzain(zzaikVar);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final int zza() {
        return zzand.zza;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    @Deprecated
    public final void zza(int i10) {
        this.zza.zzk(i10, 4);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zza(int i10, double d10) {
        this.zza.zzb(i10, d10);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zza(int i10, float f10) {
        this.zza.zzb(i10, f10);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zza(int i10, int i11) {
        this.zza.zzi(i10, i11);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zza(int i10, long j10) {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zza(int i10, zzahp zzahpVar) {
        this.zza.zzc(i10, zzahpVar);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final <K, V> void zza(int i10, zzake<K, V> zzakeVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzk(i10, 2);
            this.zza.zzn(zzakf.zza(zzakeVar, entry.getKey(), entry.getValue()));
            zzakf.zza(this.zza, zzakeVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zza(int i10, Object obj) {
        if (obj instanceof zzahp) {
            this.zza.zzd(i10, (zzahp) obj);
        } else {
            this.zza.zzb(i10, (zzakn) obj);
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zza(int i10, Object obj, zzalf zzalfVar) {
        zzaik zzaikVar = this.zza;
        zzaikVar.zzk(i10, 3);
        zzalfVar.zza((zzalf) obj, (zzana) zzaikVar.zze);
        zzaikVar.zzk(i10, 4);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zza(int i10, String str) {
        this.zza.zzb(i10, str);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zza(int i10, List<zzahp> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzc(i10, list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zza(int i10, List<?> list, zzalf zzalfVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zza(i10, list.get(i11), zzalfVar);
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zza(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzaik.zza(list.get(i13).booleanValue());
        }
        this.zza.zzn(i12);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zza(int i10, boolean z10) {
        this.zza.zzb(i10, z10);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    @Deprecated
    public final void zzb(int i10) {
        this.zza.zzk(i10, 3);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzb(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzb(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzb(int i10, Object obj, zzalf zzalfVar) {
        this.zza.zzc(i10, (zzakn) obj, zzalfVar);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzb(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof zzajt)) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11));
                i11++;
            }
            return;
        }
        zzajt zzajtVar = (zzajt) list;
        while (i11 < list.size()) {
            Object zzb = zzajtVar.zzb(i11);
            if (zzb instanceof String) {
                this.zza.zzb(i10, (String) zzb);
            } else {
                this.zza.zzc(i10, (zzahp) zzb);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzb(int i10, List<?> list, zzalf zzalfVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzb(i10, list.get(i11), zzalfVar);
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzb(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzaik.zza(list.get(i13).doubleValue());
        }
        this.zza.zzn(i12);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzc(int i10, int i11) {
        this.zza.zzi(i10, i11);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzc(int i10, long j10) {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzc(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzi(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzaik.zzc(list.get(i13).intValue());
        }
        this.zza.zzn(i12);
        while (i11 < list.size()) {
            this.zza.zzl(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzd(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzd(int i10, long j10) {
        this.zza.zzg(i10, j10);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzd(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzaik.zzd(list.get(i13).intValue());
        }
        this.zza.zzn(i12);
        while (i11 < list.size()) {
            this.zza.zzk(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zze(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zze(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zze(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzf(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzaik.zzc(list.get(i13).longValue());
        }
        this.zza.zzn(i12);
        while (i11 < list.size()) {
            this.zza.zzh(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzf(int i10, int i11) {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzf(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzaik.zza(list.get(i13).floatValue());
        }
        this.zza.zzn(i12);
        while (i11 < list.size()) {
            this.zza.zzb(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzg(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzi(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzaik.zze(list.get(i13).intValue());
        }
        this.zza.zzn(i12);
        while (i11 < list.size()) {
            this.zza.zzl(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzh(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzaik.zzd(list.get(i13).longValue());
        }
        this.zza.zzn(i12);
        while (i11 < list.size()) {
            this.zza.zzj(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzi(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzaik.zzg(list.get(i13).intValue());
        }
        this.zza.zzn(i12);
        while (i11 < list.size()) {
            this.zza.zzk(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzj(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzf(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzaik.zze(list.get(i13).longValue());
        }
        this.zza.zzn(i12);
        while (i11 < list.size()) {
            this.zza.zzh(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzk(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzj(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzaik.zzh(list.get(i13).intValue());
        }
        this.zza.zzn(i12);
        while (i11 < list.size()) {
            this.zza.zzm(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzl(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzg(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzaik.zzf(list.get(i13).longValue());
        }
        this.zza.zzn(i12);
        while (i11 < list.size()) {
            this.zza.zzi(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzm(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzl(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzaik.zzj(list.get(i13).intValue());
        }
        this.zza.zzn(i12);
        while (i11 < list.size()) {
            this.zza.zzn(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzana
    public final void zzn(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzaik.zzg(list.get(i13).longValue());
        }
        this.zza.zzn(i12);
        while (i11 < list.size()) {
            this.zza.zzj(list.get(i11).longValue());
            i11++;
        }
    }
}
