package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.j;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzur implements zzek {
    final /* synthetic */ zzpk zza;
    final /* synthetic */ float zzb;
    final /* synthetic */ zzuv zzc;
    final /* synthetic */ float zzd;
    final /* synthetic */ zzus zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzur(zzus zzusVar, zzpk zzpkVar, float f10, zzuv zzuvVar, float f11) {
        this.zze = zzusVar;
        this.zza = zzpkVar;
        this.zzb = f10;
        this.zzc = zzuvVar;
        this.zzd = f11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzek
    public final void zza(Throwable th2) {
        j jVar;
        AtomicBoolean atomicBoolean;
        jVar = zzus.zzf;
        jVar.h("AutoZoom", "Unable to set zoom to " + this.zzd, th2);
        atomicBoolean = this.zze.zzg;
        atomicBoolean.set(false);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzek
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AtomicBoolean atomicBoolean;
        Float f10 = (Float) obj;
        if (f10.floatValue() >= 1.0f) {
            zzus.zzg(this.zze, f10.floatValue());
            this.zze.zzq(this.zza, this.zzb, f10.floatValue(), this.zzc);
        }
        atomicBoolean = this.zze.zzg;
        atomicBoolean.set(false);
    }
}
