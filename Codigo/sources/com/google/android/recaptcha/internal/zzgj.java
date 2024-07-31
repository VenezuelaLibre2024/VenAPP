package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public class zzgj extends zzgi implements zzhz {
    /* JADX INFO: Access modifiers changed from: protected */
    public zzgj(zzgk zzgkVar) {
        super(zzgkVar);
    }

    @Override // com.google.android.recaptcha.internal.zzgi, com.google.android.recaptcha.internal.zzhx
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzgk zzk() {
        zzgo zzk;
        if (((zzgk) this.zza).zzF()) {
            ((zzgk) this.zza).zzb.zzg();
            zzk = super.zzk();
        } else {
            zzk = this.zza;
        }
        return (zzgk) zzk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.recaptcha.internal.zzgi
    public final void zzn() {
        super.zzn();
        if (((zzgk) this.zza).zzb != zzge.zzd()) {
            zzgk zzgkVar = (zzgk) this.zza;
            zzgkVar.zzb = zzgkVar.zzb.clone();
        }
    }
}
