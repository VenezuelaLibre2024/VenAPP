package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfxm extends zzfxp {
    final /* synthetic */ zzfxn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxm(zzfxn zzfxnVar, zzfxr zzfxrVar, CharSequence charSequence) {
        super(zzfxrVar, charSequence);
        this.zza = zzfxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxp
    public final int zzc(int i10) {
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfxp
    public final int zzd(int i10) {
        int i11 = i10 + 4000;
        if (i11 < ((zzfxp) this).zzb.length()) {
            return i11;
        }
        return -1;
    }
}
