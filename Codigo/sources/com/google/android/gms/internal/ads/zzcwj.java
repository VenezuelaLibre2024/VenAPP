package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcwj implements zzcwk {
    private final Map zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcwj(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcwk
    public final zzein zza(int i10, String str) {
        return (zzein) this.zza.get(str);
    }
}