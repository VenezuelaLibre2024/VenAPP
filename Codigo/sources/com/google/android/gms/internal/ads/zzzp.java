package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class zzzp {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzzl
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzzo) obj).zza - ((zzzo) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzzm
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzzo) obj).zzc, ((zzzo) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzzo[] zzd = new zzzo[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzzp(int i10) {
    }

    public final float zza(float f10) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f11 = this.zzg;
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzc.size(); i11++) {
            float f12 = 0.5f * f11;
            zzzo zzzoVar = (zzzo) this.zzc.get(i11);
            i10 += zzzoVar.zzb;
            if (i10 >= f12) {
                return zzzoVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        return ((zzzo) this.zzc.get(r6.size() - 1)).zzc;
    }

    public final void zzb(int i10, float f10) {
        zzzo zzzoVar;
        int i11;
        zzzo zzzoVar2;
        int i12;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i13 = this.zzh;
        if (i13 > 0) {
            zzzo[] zzzoVarArr = this.zzd;
            int i14 = i13 - 1;
            this.zzh = i14;
            zzzoVar = zzzoVarArr[i14];
        } else {
            zzzoVar = new zzzo(null);
        }
        int i15 = this.zzf;
        this.zzf = i15 + 1;
        zzzoVar.zza = i15;
        zzzoVar.zzb = i10;
        zzzoVar.zzc = f10;
        this.zzc.add(zzzoVar);
        int i16 = this.zzg + i10;
        while (true) {
            this.zzg = i16;
            while (true) {
                int i17 = this.zzg;
                if (i17 <= 2000) {
                    return;
                }
                i11 = i17 - 2000;
                zzzoVar2 = (zzzo) this.zzc.get(0);
                i12 = zzzoVar2.zzb;
                if (i12 <= i11) {
                    this.zzg -= i12;
                    this.zzc.remove(0);
                    int i18 = this.zzh;
                    if (i18 < 5) {
                        zzzo[] zzzoVarArr2 = this.zzd;
                        this.zzh = i18 + 1;
                        zzzoVarArr2[i18] = zzzoVar2;
                    }
                }
            }
            zzzoVar2.zzb = i12 - i11;
            i16 = this.zzg - i11;
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
