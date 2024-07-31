package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdk implements zzhq {
    private final zzdj zza;

    private zzdk(zzdj zzdjVar) {
        byte[] bArr = zzem.zzd;
        this.zza = zzdjVar;
        zzdjVar.zza = this;
    }

    public static zzdk zza(zzdj zzdjVar) {
        zzdk zzdkVar = zzdjVar.zza;
        return zzdkVar != null ? zzdkVar : new zzdk(zzdjVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzA(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzi(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzB(int i10, int i11) {
        this.zza.zzp(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzC(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                zzdj zzdjVar = this.zza;
                int intValue = ((Integer) list.get(i11)).intValue();
                zzdjVar.zzp(i10, (intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int intValue2 = ((Integer) list.get(i13)).intValue();
            i12 += zzdj.zzy((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            zzdj zzdjVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i11)).intValue();
            zzdjVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzD(int i10, long j10) {
        this.zza.zzr(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzE(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                zzdj zzdjVar = this.zza;
                long longValue = ((Long) list.get(i11)).longValue();
                zzdjVar.zzr(i10, (longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue2 = ((Long) list.get(i13)).longValue();
            i12 += zzdj.zzz((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            zzdj zzdjVar2 = this.zza;
            long longValue3 = ((Long) list.get(i11)).longValue();
            zzdjVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    @Deprecated
    public final void zzF(int i10) {
        this.zza.zzo(i10, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzG(int i10, String str) {
        this.zza.zzm(i10, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzH(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof zzew)) {
            while (i11 < list.size()) {
                this.zza.zzm(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzew zzewVar = (zzew) list;
        while (i11 < list.size()) {
            Object zzf = zzewVar.zzf(i11);
            if (zzf instanceof String) {
                this.zza.zzm(i10, (String) zzf);
            } else {
                this.zza.zze(i10, (zzdb) zzf);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzI(int i10, int i11) {
        this.zza.zzp(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzJ(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzp(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzdj.zzy(((Integer) list.get(i13)).intValue());
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzq(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzK(int i10, long j10) {
        this.zza.zzr(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzL(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzdj.zzz(((Long) list.get(i13)).longValue());
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzs(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzb(int i10, boolean z10) {
        this.zza.zzd(i10, z10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzc(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).booleanValue();
            i12++;
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzd(int i10, zzdb zzdbVar) {
        this.zza.zze(i10, zzdbVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zze(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zze(i10, (zzdb) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzf(int i10, double d10) {
        this.zza.zzh(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzg(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).doubleValue();
            i12 += 8;
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    @Deprecated
    public final void zzh(int i10) {
        this.zza.zzo(i10, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzi(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzj(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzdj.zzu(((Integer) list.get(i13)).intValue());
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzk(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzk(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzl(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzg(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzm(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzn(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzi(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzo(int i10, float f10) {
        this.zza.zzf(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzp(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzf(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).floatValue();
            i12 += 4;
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzq(int i10, Object obj, zzgh zzghVar) {
        zzdj zzdjVar = this.zza;
        zzdjVar.zzo(i10, 3);
        zzghVar.zzi((zzfo) obj, zzdjVar.zza);
        zzdjVar.zzo(i10, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzr(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzs(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzdj.zzu(((Integer) list.get(i13)).intValue());
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzk(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzt(int i10, long j10) {
        this.zza.zzr(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzu(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += zzdj.zzz(((Long) list.get(i13)).longValue());
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzs(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzv(int i10, Object obj, zzgh zzghVar) {
        zzfo zzfoVar = (zzfo) obj;
        zzdg zzdgVar = (zzdg) this.zza;
        zzdgVar.zzq((i10 << 3) | 2);
        zzdgVar.zzq(((zzck) zzfoVar).zzB(zzghVar));
        zzghVar.zzi(zzfoVar, zzdgVar.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzw(int i10, Object obj) {
        if (obj instanceof zzdb) {
            zzdg zzdgVar = (zzdg) this.zza;
            zzdgVar.zzq(11);
            zzdgVar.zzp(2, i10);
            zzdgVar.zze(3, (zzdb) obj);
            zzdgVar.zzq(12);
            return;
        }
        zzdj zzdjVar = this.zza;
        zzfo zzfoVar = (zzfo) obj;
        zzdg zzdgVar2 = (zzdg) zzdjVar;
        zzdgVar2.zzq(11);
        zzdgVar2.zzp(2, i10);
        zzdgVar2.zzq(26);
        zzdgVar2.zzq(zzfoVar.zzE());
        zzfoVar.zzaa(zzdjVar);
        zzdgVar2.zzq(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzx(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzy(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.zza.zzq(i12);
        while (i11 < list.size()) {
            this.zza.zzg(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzz(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }
}
