package com.google.android.gms.internal.ads;

import java.util.Set;
import x8.b0;

/* loaded from: classes2.dex */
public final class zzdjk extends zzdgl {
    private boolean zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdjk(Set set) {
        super(set);
    }

    public final void zza() {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdjh
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((b0.a) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdjg
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((b0.a) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzu(zzdji.zza);
            this.zzb = true;
        }
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdjj
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((b0.a) obj).onVideoPlay();
            }
        });
    }

    public final synchronized void zzd() {
        zzu(zzdji.zza);
        this.zzb = true;
    }
}
