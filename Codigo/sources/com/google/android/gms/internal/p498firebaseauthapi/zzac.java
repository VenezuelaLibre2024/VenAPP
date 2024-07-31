package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzac implements zzah {
    private final /* synthetic */ zzs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzac(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzah
    public final /* synthetic */ Iterator zza(zzab zzabVar, CharSequence charSequence) {
        return new zzaf(this, zzabVar, charSequence, this.zza.zza(charSequence));
    }
}
