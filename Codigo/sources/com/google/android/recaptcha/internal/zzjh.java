package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
final class zzjh extends zzjf {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* synthetic */ int zza(Object obj) {
        return ((zzjg) obj).zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzjg) obj).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzgo zzgoVar = (zzgo) obj;
        zzjg zzjgVar = zzgoVar.zzc;
        if (zzjgVar != zzjg.zzc()) {
            return zzjgVar;
        }
        zzjg zzf = zzjg.zzf();
        zzgoVar.zzc = zzf;
        return zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzgo) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (zzjg.zzc().equals(obj2)) {
            return obj;
        }
        zzjg zzjgVar = (zzjg) obj2;
        if (zzjg.zzc().equals(obj)) {
            return zzjg.zze((zzjg) obj, zzjgVar);
        }
        ((zzjg) obj).zzd(zzjgVar);
        return obj;
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    final /* synthetic */ Object zzf() {
        return zzjg.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    final /* synthetic */ Object zzg(Object obj) {
        ((zzjg) obj).zzh();
        return obj;
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    final /* bridge */ /* synthetic */ void zzh(Object obj, int i10, int i11) {
        ((zzjg) obj).zzj((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    final /* bridge */ /* synthetic */ void zzi(Object obj, int i10, long j10) {
        ((zzjg) obj).zzj((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.recaptcha.internal.zzjf
    final /* bridge */ /* synthetic */ void zzj(Object obj, int i10, Object obj2) {
        ((zzjg) obj).zzj((i10 << 3) | 3, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i10, zzez zzezVar) {
        ((zzjg) obj).zzj((i10 << 3) | 2, zzezVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* bridge */ /* synthetic */ void zzl(Object obj, int i10, long j10) {
        ((zzjg) obj).zzj(i10 << 3, Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzjf
    public final void zzm(Object obj) {
        ((zzgo) obj).zzc.zzh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzgo) obj).zzc = (zzjg) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzgo) obj).zzc = (zzjg) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* synthetic */ void zzp(Object obj, zzjx zzjxVar) {
        ((zzjg) obj).zzk(zzjxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzjf
    public final /* synthetic */ void zzq(Object obj, zzjx zzjxVar) {
        ((zzjg) obj).zzl(zzjxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzjf
    public final boolean zzs(zzik zzikVar) {
        return false;
    }
}
