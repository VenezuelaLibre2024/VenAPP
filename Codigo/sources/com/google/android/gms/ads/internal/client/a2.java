package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: classes.dex */
public abstract class a2 extends zzayh implements c2 {
    public a2() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        c3 c3Var = (c3) zzayi.zza(parcel, c3.CREATOR);
        zzayi.zzc(parcel);
        zze(c3Var);
        parcel2.writeNoException();
        return true;
    }
}
