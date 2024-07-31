package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.regex.Matcher;

/* loaded from: classes2.dex */
final class zzt extends zzp {
    private final Matcher zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(Matcher matcher) {
        this.zza = (Matcher) zzy.zza(matcher);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzp
    public final int zza() {
        return this.zza.end();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzp
    public final boolean zza(int i10) {
        return this.zza.find(i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzp
    public final int zzb() {
        return this.zza.start();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzp
    public final boolean zzc() {
        return this.zza.matches();
    }
}
