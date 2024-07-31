package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhav implements zzhbc {
    private final zzhbc[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhav(zzhbc... zzhbcVarArr) {
        this.zza = zzhbcVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final zzhbb zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzhbc zzhbcVar = this.zza[i10];
            if (zzhbcVar.zzc(cls)) {
                return zzhbcVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzhbc
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
