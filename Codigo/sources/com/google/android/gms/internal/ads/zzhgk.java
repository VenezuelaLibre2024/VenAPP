package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class zzhgk implements zzarm {
    private static final zzhgv zza = zzhgv.zzb(zzhgk.class);
    protected final String zzb;
    long zze;
    zzhgp zzg;
    private zzarn zzh;
    private ByteBuffer zzi;
    long zzf = -1;
    private ByteBuffer zzj = null;
    boolean zzd = true;
    boolean zzc = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzhgk(String str) {
        this.zzb = str;
    }

    private final synchronized void zzd() {
        if (this.zzd) {
            return;
        }
        try {
            zzhgv zzhgvVar = zza;
            String str = this.zzb;
            zzhgvVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.zzi = this.zzg.zzd(this.zze, this.zzf);
            this.zzd = true;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void zzb(zzhgp zzhgpVar, ByteBuffer byteBuffer, long j10, zzarj zzarjVar) {
        this.zze = zzhgpVar.zzb();
        byteBuffer.remaining();
        this.zzf = j10;
        this.zzg = zzhgpVar;
        zzhgpVar.zze(zzhgpVar.zzb() + j10);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void zzc(zzarn zzarnVar) {
        this.zzh = zzarnVar;
    }

    protected abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        zzd();
        zzhgv zzhgvVar = zza;
        String str = this.zzb;
        zzhgvVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}
