package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzahu {
    private final zzaik zza;
    private final byte[] zzb;

    private zzahu(int i10) {
        byte[] bArr = new byte[i10];
        this.zzb = bArr;
        this.zza = zzaik.zzb(bArr);
    }

    public final zzahp zza() {
        this.zza.zzb();
        return new zzahz(this.zzb);
    }

    public final zzaik zzb() {
        return this.zza;
    }
}
