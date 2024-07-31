package com.google.android.gms.internal.p498firebaseauthapi;

import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzahz extends zzahw {
    protected final byte[] zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzahz(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahp
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzahp) || zzb() != ((zzahp) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzahz)) {
            return obj.equals(this);
        }
        zzahz zzahzVar = (zzahz) obj;
        int zza = zza();
        int zza2 = zzahzVar.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzahzVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahp
    public byte zza(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahp
    public final zzahp zza(int i10, int i11) {
        int zza = zzahp.zza(0, i11, zzb());
        return zza == 0 ? zzahp.zza : new zzaht(this.zzb, zzh(), zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahp
    protected final String zza(Charset charset) {
        return new String(this.zzb, zzh(), zzb(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahp
    public final void zza(zzahm zzahmVar) {
        zzahmVar.zza(this.zzb, zzh(), zzb());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahp
    protected void zza(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, 0, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahw
    final boolean zza(zzahp zzahpVar, int i10, int i11) {
        if (i11 > zzahpVar.zzb()) {
            throw new IllegalArgumentException("Length too large: " + i11 + zzb());
        }
        if (i11 > zzahpVar.zzb()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i11 + ", " + zzahpVar.zzb());
        }
        if (!(zzahpVar instanceof zzahz)) {
            return zzahpVar.zza(0, i11).equals(zza(0, i11));
        }
        zzahz zzahzVar = (zzahz) zzahpVar;
        byte[] bArr = this.zzb;
        byte[] bArr2 = zzahzVar.zzb;
        int zzh = zzh() + i11;
        int zzh2 = zzh();
        int zzh3 = zzahzVar.zzh();
        while (zzh2 < zzh) {
            if (bArr[zzh2] != bArr2[zzh3]) {
                return false;
            }
            zzh2++;
            zzh3++;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahp
    public byte zzb(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahp
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahp
    protected final int zzb(int i10, int i11, int i12) {
        return zzajf.zza(i10, this.zzb, zzh(), i12);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahp
    public final zzaia zzc() {
        return zzaia.zza(this.zzb, zzh(), zzb(), true);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahp
    public final boolean zzf() {
        int zzh = zzh();
        return zzaml.zzc(this.zzb, zzh, zzb() + zzh);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int zzh() {
        return 0;
    }
}
