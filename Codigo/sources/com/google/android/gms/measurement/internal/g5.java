package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes2.dex */
public final class g5 {

    /* renamed from: a, reason: collision with root package name */
    final w5 f10194a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g5(va vaVar) {
        this.f10194a = vaVar.d0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a(String str, zzby zzbyVar) {
        this.f10194a.zzl().i();
        if (zzbyVar == null) {
            this.f10194a.zzj().G().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle zza = zzbyVar.zza(bundle);
            if (zza != null) {
                return zza;
            }
            this.f10194a.zzj().B().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e10) {
            this.f10194a.zzj().B().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        try {
            na.d a10 = na.e.a(this.f10194a.zza());
            if (a10 != null) {
                return a10.f("com.android.vending", RecognitionOptions.ITF).versionCode >= 80837300;
            }
            this.f10194a.zzj().F().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f10194a.zzj().F().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
