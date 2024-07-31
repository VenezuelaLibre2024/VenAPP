package com.google.android.gms.internal.auth;

/* loaded from: classes2.dex */
final class zzfi extends zzfk {
    private zzfi() {
        super(null);
    }

    public /* synthetic */ zzfi(zzfh zzfhVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    public final void zza(Object obj, long j10) {
        ((zzey) zzhi.zzf(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    public final void zzb(Object obj, Object obj2, long j10) {
        zzey zzeyVar = (zzey) zzhi.zzf(obj, j10);
        zzey zzeyVar2 = (zzey) zzhi.zzf(obj2, j10);
        int size = zzeyVar.size();
        int size2 = zzeyVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzeyVar.zzc()) {
                zzeyVar = zzeyVar.zzd(size2 + size);
            }
            zzeyVar.addAll(zzeyVar2);
        }
        if (size > 0) {
            zzeyVar2 = zzeyVar;
        }
        zzhi.zzp(obj, j10, zzeyVar2);
    }
}
