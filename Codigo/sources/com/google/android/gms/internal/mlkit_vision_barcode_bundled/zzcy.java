package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public class zzcy extends zzcx {
    protected final byte[] zza;

    public zzcy(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdb) || zzd() != ((zzdb) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzcy)) {
            return obj.equals(this);
        }
        zzcy zzcyVar = (zzcy) obj;
        int zzp = zzp();
        int zzp2 = zzcyVar.zzp();
        if (zzp == 0 || zzp2 == 0 || zzp == zzp2) {
            return zzg(zzcyVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, i10, bArr, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcx
    public final boolean zzg(zzdb zzdbVar, int i10, int i11) {
        if (i11 > zzdbVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i11 + zzd());
        }
        int i12 = i10 + i11;
        if (i12 > zzdbVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + zzdbVar.zzd());
        }
        if (!(zzdbVar instanceof zzcy)) {
            return zzdbVar.zzk(i10, i12).equals(zzk(0, i11));
        }
        zzcy zzcyVar = (zzcy) zzdbVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzcyVar.zza;
        int zzc = zzc() + i11;
        int zzc2 = zzc();
        int zzc3 = zzcyVar.zzc() + i10;
        while (zzc2 < zzc) {
            if (bArr[zzc2] != bArr2[zzc3]) {
                return false;
            }
            zzc2++;
            zzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzi(int i10, int i11, int i12) {
        return zzem.zzb(i10, this.zza, zzc() + i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzj(int i10, int i11, int i12) {
        int zzc = zzc() + i11;
        return zzhn.zzf(i10, this.zza, zzc, i12 + zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final zzdb zzk(int i10, int i11) {
        int zzo = zzdb.zzo(i10, i11, zzd());
        return zzo == 0 ? zzdb.zzb : new zzcv(this.zza, zzc() + i10, zzo);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    protected final String zzl(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final void zzm(zzcr zzcrVar) {
        ((zzdg) zzcrVar).zzc(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean zzn() {
        int zzc = zzc();
        return zzhn.zzh(this.zza, zzc, zzd() + zzc);
    }
}
