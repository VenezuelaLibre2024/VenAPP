package com.google.android.gms.internal.p498firebaseauthapi;

/* loaded from: classes2.dex */
final class zzaht extends zzahz {
    private final int zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaht(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzahp.zza(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahz, com.google.android.gms.internal.p498firebaseauthapi.zzahp
    public final byte zza(int i10) {
        int zzb = zzb();
        if (((zzb - (i10 + 1)) | i10) >= 0) {
            return this.zzb[this.zzc + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + zzb);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahz, com.google.android.gms.internal.p498firebaseauthapi.zzahp
    protected final void zza(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, zzh(), bArr, 0, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahz, com.google.android.gms.internal.p498firebaseauthapi.zzahp
    public final byte zzb(int i10) {
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahz, com.google.android.gms.internal.p498firebaseauthapi.zzahp
    public final int zzb() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahz
    public final int zzh() {
        return this.zzc;
    }
}
