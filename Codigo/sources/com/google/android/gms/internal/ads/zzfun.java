package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class zzfun extends zzayh implements zzfuo {
    public zzfun() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
        zzayi.zzc(parcel);
        zzb(bundle);
        return true;
    }
}
