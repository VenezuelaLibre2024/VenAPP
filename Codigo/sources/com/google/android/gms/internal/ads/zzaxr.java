package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaxr extends zzaxx {
    private final zzawq zzi;
    private long zzj;

    public zzaxr(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11, zzawq zzawqVar) {
        super(zzawjVar, "2ZUgS25mCfmBpvNAAnoop42ZvK9H4E17vIqHMHWBgDSruAgpJ0/PRWhyN3sqcUbC", "ZqqofhkB4+yK9ARzF+IbcECpWBtuTXlqWFDkC/AVdcM=", zzasgVar, i10, 53);
        this.zzi = zzawqVar;
        if (zzawqVar != null) {
            this.zzj = zzawqVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        if (this.zzi != null) {
            this.zze.zzP(((Long) this.zzf.invoke(null, Long.valueOf(this.zzj))).longValue());
        }
    }
}
