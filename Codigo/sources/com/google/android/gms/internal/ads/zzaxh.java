package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaxh extends zzaxx {
    private final zzawb zzi;

    public zzaxh(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11, zzawb zzawbVar) {
        super(zzawjVar, "ouo6/s5NPxZlxezvpiuAYZ73R/AsqpZljIGTfLgJpzrsB+84nXU0ZzhmetmfkBrN", "5BsC37pqFx3Fp5Qtv0y+RSU8LVttAMXjX8aFccLrzxg=", zzasgVar, i10, 94);
        this.zzi = zzawbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        int intValue = ((Integer) this.zzf.invoke(null, this.zzi.zza())).intValue();
        synchronized (this.zze) {
            this.zze.zzae(zzasu.zza(intValue));
        }
    }
}
