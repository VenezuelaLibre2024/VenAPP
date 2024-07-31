package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.client.n2 */
/* loaded from: classes.dex */
public final class C4873n2 extends zzayg implements InterfaceC4885p2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4873n2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4885p2
    public final Bundle zze() {
        Parcel zzbl = zzbl(5, zza());
        Bundle bundle = (Bundle) zzayi.zza(zzbl, Bundle.CREATOR);
        zzbl.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4885p2
    public final C4810d5 zzf() {
        Parcel zzbl = zzbl(4, zza());
        C4810d5 c4810d5 = (C4810d5) zzayi.zza(zzbl, C4810d5.CREATOR);
        zzbl.recycle();
        return c4810d5;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4885p2
    public final String zzg() {
        Parcel zzbl = zzbl(1, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4885p2
    public final String zzh() {
        Parcel zzbl = zzbl(6, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4885p2
    public final String zzi() {
        Parcel zzbl = zzbl(2, zza());
        String readString = zzbl.readString();
        zzbl.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4885p2
    public final List zzj() {
        Parcel zzbl = zzbl(3, zza());
        ArrayList createTypedArrayList = zzbl.createTypedArrayList(C4810d5.CREATOR);
        zzbl.recycle();
        return createTypedArrayList;
    }
}
