package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzcx extends zzbu implements zzcv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void zza(Bundle bundle) {
        Parcel a_ = a_();
        zzbw.zza(a_, bundle);
        zzb(1, a_);
    }
}