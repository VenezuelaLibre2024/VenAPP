package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzakc implements zzakk {
    private zzakk[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakc(zzakk... zzakkVarArr) {
        this.zza = zzakkVarArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final zzakl zza(Class<?> cls) {
        for (zzakk zzakkVar : this.zza) {
            if (zzakkVar.zzb(cls)) {
                return zzakkVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final boolean zzb(Class<?> cls) {
        for (zzakk zzakkVar : this.zza) {
            if (zzakkVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
