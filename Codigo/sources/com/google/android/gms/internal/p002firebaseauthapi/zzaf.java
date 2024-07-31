package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzaf extends zzae {
    private final /* synthetic */ zzp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaf(zzac zzacVar, zzab zzabVar, CharSequence charSequence, zzp zzpVar) {
        super(zzabVar, charSequence);
        this.zzb = zzpVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzae
    public final int zza(int i10) {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzae
    public final int zzb(int i10) {
        if (this.zzb.zza(i10)) {
            return this.zzb.zzb();
        }
        return -1;
    }
}
