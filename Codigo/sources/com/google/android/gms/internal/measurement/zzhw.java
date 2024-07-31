package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzhw extends zzhx {
    protected final byte[] zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhw(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhm) || zzb() != ((zzhm) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzhw)) {
            return obj.equals(this);
        }
        zzhw zzhwVar = (zzhw) obj;
        int zza = zza();
        int zza2 = zzhwVar.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzhwVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public byte zza(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final zzhm zza(int i10, int i11) {
        int zza = zzhm.zza(0, i11, zzb());
        return zza == 0 ? zzhm.zza : new zzhq(this.zzb, zze(), zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    protected final String zza(Charset charset) {
        return new String(this.zzb, zze(), zzb(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhm
    public final void zza(zzhn zzhnVar) {
        zzhnVar.zza(this.zzb, zze(), zzb());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhx
    public final boolean zza(zzhm zzhmVar, int i10, int i11) {
        if (i11 > zzhmVar.zzb()) {
            throw new IllegalArgumentException("Length too large: " + i11 + zzb());
        }
        if (i11 > zzhmVar.zzb()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i11 + ", " + zzhmVar.zzb());
        }
        if (!(zzhmVar instanceof zzhw)) {
            return zzhmVar.zza(0, i11).equals(zza(0, i11));
        }
        zzhw zzhwVar = (zzhw) zzhmVar;
        byte[] bArr = this.zzb;
        byte[] bArr2 = zzhwVar.zzb;
        int zze = zze() + i11;
        int zze2 = zze();
        int zze3 = zzhwVar.zze();
        while (zze2 < zze) {
            if (bArr[zze2] != bArr2[zze3]) {
                return false;
            }
            zze2++;
            zze3++;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhm
    public byte zzb(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    protected final int zzb(int i10, int i11, int i12) {
        return zziz.zza(i10, this.zzb, zze(), i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzhm
    public final boolean zzd() {
        int zze = zze();
        return zzmh.zzc(this.zzb, zze, zzb() + zze);
    }

    protected int zze() {
        return 0;
    }
}
