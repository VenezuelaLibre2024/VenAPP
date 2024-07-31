package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.p3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbxj extends zzccp {
    final /* synthetic */ m9.b zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxj(zzbxk zzbxkVar, m9.b bVar) {
        this.zza = bVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzb(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzc(String str, String str2, Bundle bundle) {
        this.zza.onSuccess(new m9.a(new p3(str, bundle, str2)));
    }
}
