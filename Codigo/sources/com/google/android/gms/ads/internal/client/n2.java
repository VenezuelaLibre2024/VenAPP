package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n2 extends zzayg implements p2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.p2
    public final Bundle zze() {
        Parcel zzbl = zzbl(5, zza());
        Bundle bundle = (Bundle) zzayi.zza(zzbl, Bundle.CREATOR);
        zzbl.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.p2
    public final d5 zzf() {
        Parcel zzbl = zzbl(4, zza());
        d5 d5Var = (d5) zzayi.zza(zzbl, d5.CREATOR);
        zzbl.recycle();
        return d5Var;
    }

    @Override // com.google.android.gms.ads.internal.client.p2
    public final String zzg() {
        Parcel zzbl = zzbl(1, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.p2
    public final String zzh() {
        Parcel zzbl = zzbl(6, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.p2
    public final String zzi() {
        Parcel zzbl = zzbl(2, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.p2
    public final List zzj() {
        Parcel zzbl = zzbl(3, zza());
        ArrayList createTypedArrayList = zzbl.createTypedArrayList(d5.CREATOR);
        zzbl.recycle();
        return createTypedArrayList;
    }
}
