package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhv {
    private final zzig zza;
    private final byte[] zzb;

    private zzhv(int i10) {
        byte[] bArr = new byte[i10];
        this.zzb = bArr;
        this.zza = zzig.zzb(bArr);
    }

    public final zzhm zza() {
        this.zza.zzb();
        return new zzhw(this.zzb);
    }

    public final zzig zzb() {
        return this.zza;
    }
}
