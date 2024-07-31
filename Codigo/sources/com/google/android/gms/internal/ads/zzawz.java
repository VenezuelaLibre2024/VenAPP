package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzawz extends zzaxx {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzawz(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11) {
        super(zzawjVar, "L1KomYFd7sBH8JLOTR3glPup1jq/oqWyQJNU/5dJtxixjKQHD3ZBhAic9dH4TZgA", "m4uJd6hJYeAUgFAUB1OT370Awen8YINd4hKC7XM/6ec=", zzasgVar, i10, 44);
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
            this.zze.zzo(zzi.longValue());
        }
    }
}
