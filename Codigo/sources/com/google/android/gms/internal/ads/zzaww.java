package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzaww extends zzaxx {
    private static final zzaxy zzi = new zzaxy();
    private final Context zzj;

    public zzaww(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11, Context context) {
        super(zzawjVar, "F0+pSvx9GtXcjR12oFzzp5apK08MRky74IYez805WxvZBZTjFs672zxMax8w5kp9", "69psxaRqrIVZzPpt4pN0wGmA/kc6O8gjOJlblyEzW1E=", zzasgVar, i10, 29);
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        this.zze.zzn("E");
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                if (zza.get() == null) {
                    zza.set((String) this.zzf.invoke(null, this.zzj));
                }
            }
        }
        String str = (String) zza.get();
        synchronized (this.zze) {
            this.zze.zzn(zzatt.zza(str.getBytes(), true));
        }
    }
}
