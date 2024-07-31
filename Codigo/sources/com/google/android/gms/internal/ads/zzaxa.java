package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaxa extends zzaxx {
    private final long zzi;

    public zzaxa(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, long j10, int i10, int i11) {
        super(zzawjVar, "hIbo0WHjc5N2XBD7HI+Mwh9BXu/nIzOhdTaHZ1DPjeizuR48SZNCpBdtOxY4cHlb", "mLbfRIQxtPVbZphUgAhWqMeuqa25Ale/5rz8vv9YVkc=", zzasgVar, i10, 25);
        this.zzi = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        long longValue = ((Long) this.zzf.invoke(null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzt(longValue);
            long j10 = this.zzi;
            if (j10 != 0) {
                this.zze.zzT(longValue - j10);
                this.zze.zzU(this.zzi);
            }
        }
    }
}
