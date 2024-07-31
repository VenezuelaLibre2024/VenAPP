package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaxs extends zzaxx {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzaxs(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11) {
        super(zzawjVar, "nKZwK8oioxkTwDfG9V2sR2xNb9GbO72JaQ9OaUpmWGl7ZX+EiCwiESnhzEGly7cm", "WIPKXsZv2l0NBmLvWdV3TkucPJ5dkfbRYYrTASAxFfQ=", zzasgVar, i10, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzV(zzi.longValue());
        }
    }
}
