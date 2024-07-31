package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdav extends zzdgl implements com.google.android.gms.ads.internal.client.a {
    public zzdav(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.client.a
    public final void onAdClicked() {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdau
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.a) obj).onAdClicked();
            }
        });
    }
}
