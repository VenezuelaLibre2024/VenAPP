package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class zzhgl extends zzhgo implements zzarm {
    zzarn zza;
    protected final String zzb = "moov";

    public zzhgl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void zzb(zzhgp zzhgpVar, ByteBuffer byteBuffer, long j10, zzarj zzarjVar) {
        zzhgpVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzd = zzhgpVar;
        this.zzf = zzhgpVar.zzb();
        zzhgpVar.zze(zzhgpVar.zzb() + j10);
        this.zzg = zzhgpVar.zzb();
        this.zzc = zzarjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void zzc(zzarn zzarnVar) {
        this.zza = zzarnVar;
    }
}
