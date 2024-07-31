package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaxd extends zzaxx {
    private final zzawk zzi;

    public zzaxd(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11, zzawk zzawkVar) {
        super(zzawjVar, "Srq4/7DDafVhhxKPQvFzGwPCcbAxjsRhBUoTZMyZ8i1elMwCHCPiECib9I+dpg+U", "+ExOXtPxYV6dYowx9W8QaGOBr19dRESYWAuzCGJGeu8=", zzasgVar, i10, 85);
        this.zzi = zzawkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        long[] jArr = (long[]) this.zzf.invoke(null, Long.valueOf(this.zzi.zzd()), Long.valueOf(this.zzi.zzh()), Long.valueOf(this.zzi.zzb()), Long.valueOf(this.zzi.zzf()));
        synchronized (this.zze) {
            this.zze.zzv(jArr[0]);
            this.zze.zzu(jArr[1]);
        }
    }
}
