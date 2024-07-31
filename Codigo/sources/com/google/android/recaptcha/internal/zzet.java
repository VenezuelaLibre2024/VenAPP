package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
final class zzet extends zzew {
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzet(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzez.zzk(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.recaptcha.internal.zzew, com.google.android.recaptcha.internal.zzez
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.zza[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzew, com.google.android.recaptcha.internal.zzez
    public final byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.recaptcha.internal.zzew
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzew, com.google.android.recaptcha.internal.zzez
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzew, com.google.android.recaptcha.internal.zzez
    protected final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }
}
