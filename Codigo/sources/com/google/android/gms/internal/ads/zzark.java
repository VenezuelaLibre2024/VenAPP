package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzark extends zzhgo {
    private static final zzhgv zza = zzhgv.zzb(zzark.class);

    public zzark(zzhgp zzhgpVar, zzarj zzarjVar) {
        zzf(zzhgpVar, zzhgpVar.zzc(), zzarjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.zzhgo
    public final String toString() {
        String obj = this.zzd.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 7);
        sb2.append("model(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
