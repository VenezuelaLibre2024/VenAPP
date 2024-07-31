package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaxi extends zzaxx {
    private final zzavm zzi;
    private final long zzj;
    private final long zzk;

    public zzaxi(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11, zzavm zzavmVar, long j10, long j11) {
        super(zzawjVar, "ChMYhePBDqkXl5DeRTg9cgSXXNPVEcIqgEVciYHEVlkZyx/HkVQXSnen8aw33G2s", "tJ+SvALjKnpAv9FF8u56pKKRS55/vzUDe+m9ct97Lx4=", zzasgVar, i10, 11);
        this.zzi = zzavmVar;
        this.zzj = j10;
        this.zzk = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        zzavm zzavmVar = this.zzi;
        if (zzavmVar != null) {
            zzavk zzavkVar = new zzavk((String) this.zzf.invoke(null, zzavmVar.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)));
            synchronized (this.zze) {
                this.zze.zzz(zzavkVar.zza.longValue());
                if (zzavkVar.zzb.longValue() >= 0) {
                    this.zze.zzQ(zzavkVar.zzb.longValue());
                }
                if (zzavkVar.zzc.longValue() >= 0) {
                    this.zze.zzf(zzavkVar.zzc.longValue());
                }
            }
        }
    }
}
