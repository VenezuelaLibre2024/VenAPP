package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public class zzew extends zzev {
    protected final byte[] zza;

    public zzew(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzez
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzez) || zzd() != ((zzez) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzew)) {
            return obj.equals(this);
        }
        zzew zzewVar = (zzew) obj;
        int zzl = zzl();
        int zzl2 = zzewVar.zzl();
        if (zzl != 0 && zzl2 != 0 && zzl != zzl2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzewVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzewVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzewVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzewVar.zza;
        zzewVar.zzc();
        int i10 = 0;
        int i11 = 0;
        while (i10 < zzd) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzez
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.recaptcha.internal.zzez
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzez
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.recaptcha.internal.zzez
    protected void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }

    @Override // com.google.android.recaptcha.internal.zzez
    protected final int zzf(int i10, int i11, int i12) {
        return zzgw.zzb(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.recaptcha.internal.zzez
    public final zzez zzg(int i10, int i11) {
        int zzk = zzez.zzk(0, i11, zzd());
        return zzk == 0 ? zzez.zzb : new zzet(this.zza, 0, zzk);
    }

    @Override // com.google.android.recaptcha.internal.zzez
    protected final String zzh(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.recaptcha.internal.zzez
    public final void zzi(zzep zzepVar) {
        ((zzfh) zzepVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.recaptcha.internal.zzez
    public final boolean zzj() {
        return zzju.zzf(this.zza, 0, zzd());
    }
}
