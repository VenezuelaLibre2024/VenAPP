package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;

/* loaded from: classes2.dex */
abstract class zzfxp extends zzfwj {
    final CharSequence zzb;
    final zzfwp zzc;
    int zzd = 0;
    int zze;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfxp(zzfxr zzfxrVar, CharSequence charSequence) {
        zzfwp zzfwpVar;
        zzfwpVar = zzfxrVar.zza;
        this.zzc = zzfwpVar;
        this.zze = a.e.API_PRIORITY_OTHER;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    protected final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i10 = this.zzd;
        while (true) {
            int i11 = this.zzd;
            if (i11 == -1) {
                zzb();
                return null;
            }
            int zzd = zzd(i11);
            if (zzd == -1) {
                zzd = this.zzb.length();
                this.zzd = -1;
                zzc = -1;
            } else {
                zzc = zzc(zzd);
                this.zzd = zzc;
            }
            if (zzc != i10) {
                if (i10 < zzd) {
                    this.zzb.charAt(i10);
                }
                if (i10 < zzd) {
                    this.zzb.charAt(zzd - 1);
                }
                int i12 = this.zze;
                if (i12 == 1) {
                    zzd = this.zzb.length();
                    this.zzd = -1;
                    if (zzd > i10) {
                        this.zzb.charAt(zzd - 1);
                    }
                } else {
                    this.zze = i12 - 1;
                }
                return this.zzb.subSequence(i10, zzd).toString();
            }
            int i13 = zzc + 1;
            this.zzd = i13;
            if (i13 > this.zzb.length()) {
                this.zzd = -1;
            }
        }
    }

    abstract int zzc(int i10);

    abstract int zzd(int i10);
}
