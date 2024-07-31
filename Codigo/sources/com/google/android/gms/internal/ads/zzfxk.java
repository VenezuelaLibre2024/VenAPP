package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfxk extends zzfxp {
    final /* synthetic */ zzfxl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxk(zzfxl zzfxlVar, zzfxr zzfxrVar, CharSequence charSequence) {
        super(zzfxrVar, charSequence);
        this.zza = zzfxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxp
    final int zzc(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfxp
    final int zzd(int i10) {
        CharSequence charSequence = ((zzfxp) this).zzb;
        int length = charSequence.length();
        zzfxe.zzb(i10, length, "index");
        while (i10 < length) {
            zzfxl zzfxlVar = this.zza;
            if (zzfxlVar.zza.zzb(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
