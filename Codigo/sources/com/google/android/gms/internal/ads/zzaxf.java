package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaxf extends zzaxx {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzaxf(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11) {
        super(zzawjVar, "J3qHQsXE9gxUWY3EQze3pD9LpRQkp3i0z4IBb3xvxMfPfsFZNBOU+l2pHi8zC3DO", "W1peSRrFFzj+W6DyflucA6CQWTsphM4X4AkhjKjRy/o=", zzasgVar, i10, 22);
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
            this.zze.zzy(zzi.longValue());
        }
    }
}
