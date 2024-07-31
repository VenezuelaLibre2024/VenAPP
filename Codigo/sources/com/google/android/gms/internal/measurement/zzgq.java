package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgq extends zzgn<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgq(zzgv zzgvVar, String str, Boolean bool, boolean z10) {
        super(zzgvVar, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.zzgn
    final /* synthetic */ Boolean zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzfr.zzb.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzfr.zzc.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.zzb() + ": " + String.valueOf(obj));
        return null;
    }
}
