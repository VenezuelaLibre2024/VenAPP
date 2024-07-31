package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzewb implements zzexq {
    private final Bundle zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzewb(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return zzgen.zzh(new zzewc(this.zza));
    }
}
