package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaxq extends zzaxx {
    public zzaxq(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11) {
        super(zzawjVar, "U5Ngb8pPuPEbyAEAeNCt0wgGFK4YAtkNGCrOQKfD/ONzQcV8GTtSZ6EoO3NY8V1s", "GZJYAQ87uqT/39Vw1xO4VkKaUA+BZKFiVkKasBC0VSw=", zzasgVar, i10, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        synchronized (this.zze) {
            zzawe zzaweVar = new zzawe((String) this.zzf.invoke(null, new Object[0]));
            this.zze.zzp(zzaweVar.zza.longValue());
            this.zze.zzq(zzaweVar.zzb.longValue());
        }
    }
}
