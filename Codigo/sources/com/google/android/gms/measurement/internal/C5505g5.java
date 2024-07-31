package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.libraries.barhopper.RecognitionOptions;
import na.C9695d;
import na.C9696e;

/* renamed from: com.google.android.gms.measurement.internal.g5 */
/* loaded from: classes2.dex */
public final class C5505g5 {

    /* renamed from: a */
    final C5712w5 f11366a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5505g5(C5705va c5705va) {
        this.f11366a = c5705va.m14458d0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle m13915a(String str, zzby zzbyVar) {
        this.f11366a.zzl().mo13687i();
        if (zzbyVar == null) {
            this.f11366a.zzj().m14187G().m14218a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle zza = zzbyVar.zza(bundle);
            if (zza != null) {
                return zza;
            }
            this.f11366a.zzj().m14182B().m14218a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e10) {
            this.f11366a.zzj().m14182B().m14219b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean m13916b() {
        try {
            C9695d m29080a = C9696e.m29080a(this.f11366a.zza());
            if (m29080a != null) {
                return m29080a.m29077f("com.android.vending", RecognitionOptions.ITF).versionCode >= 80837300;
            }
            this.f11366a.zzj().m14186F().m14218a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f11366a.zzj().m14186F().m14219b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
