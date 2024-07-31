package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;

/* renamed from: com.google.android.gms.ads.internal.client.d0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4805d0 extends zzayh implements InterfaceC4812e0 {
    public AbstractBinderC4805d0() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
