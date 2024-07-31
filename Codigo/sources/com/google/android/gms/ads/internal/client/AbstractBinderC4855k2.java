package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;

/* renamed from: com.google.android.gms.ads.internal.client.k2 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4855k2 extends zzayh implements InterfaceC4861l2 {
    public AbstractBinderC4855k2() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        String readString = parcel.readString();
        InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
        InterfaceC5312b m13410f22 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
        zzayi.zzc(parcel);
        zze(readString, m13410f2, m13410f22);
        parcel2.writeNoException();
        return true;
    }
}
