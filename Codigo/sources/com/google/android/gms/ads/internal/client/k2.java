package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: classes.dex */
public abstract class k2 extends zzayh implements l2 {
    public k2() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        String readString = parcel.readString();
        com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
        com.google.android.gms.dynamic.b f23 = b.a.f2(parcel.readStrongBinder());
        zzayi.zzc(parcel);
        zze(readString, f22, f23);
        parcel2.writeNoException();
        return true;
    }
}
