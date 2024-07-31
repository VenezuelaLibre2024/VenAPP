package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.facebook.ads.AdError;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzawh implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzawj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawh(zzawj zzawjVar, int i10, boolean z10) {
        this.zzb = zzawjVar;
        this.zza = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzatd zzatdVar;
        int i10 = this.zza;
        zzawj zzawjVar = this.zzb;
        if (i10 > 0) {
            try {
                Thread.sleep(i10 * AdError.NETWORK_ERROR_CODE);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzawjVar.zza.getPackageManager().getPackageInfo(zzawjVar.zza.getPackageName(), 0);
            Context context = zzawjVar.zza;
            zzatdVar = zzfqz.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzatdVar = null;
        }
        this.zzb.zzm = zzatdVar;
        if (this.zza < 4) {
            if (zzatdVar != null && zzatdVar.zzaj() && !zzatdVar.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzatdVar.zzak() && zzatdVar.zzf().zze() && zzatdVar.zzf().zza() != -2) {
                return;
            }
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}
