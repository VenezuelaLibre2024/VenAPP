package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzetn implements zzexq {
    private final zzfdk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzetn(zzfdk zzfdkVar) {
        this.zza = zzfdkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        zzfdk zzfdkVar = this.zza;
        zzexp zzexpVar = null;
        if (zzfdkVar != null && zzfdkVar.zza() != null && !zzfdkVar.zza().isEmpty()) {
            zzexpVar = new zzexp() { // from class: com.google.android.gms.internal.ads.zzetm
                @Override // com.google.android.gms.internal.ads.zzexp
                public final void zzj(Object obj) {
                    zzetn.this.zzc((Bundle) obj);
                }
            };
        }
        return zzgen.zzh(zzexpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
