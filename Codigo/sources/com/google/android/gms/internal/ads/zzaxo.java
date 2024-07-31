package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaxo extends zzaxx {
    private final boolean zzi;

    public zzaxo(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11) {
        super(zzawjVar, "JHENilgoa32pdW2+FQZfbiKa1To+b6hAFc5hyxP6u/LWvHbIhkfTDC3kQMR4mpq3", "JQeYWB/Ar5LqSSZ5i6IhxYZ+uXn8SEDYL9xPjgGTx2M=", zzasgVar, i10, 61);
        this.zzi = zzawjVar.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        long longValue = ((Long) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(this.zzi))).longValue();
        synchronized (this.zze) {
            this.zze.zzE(longValue);
        }
    }
}
