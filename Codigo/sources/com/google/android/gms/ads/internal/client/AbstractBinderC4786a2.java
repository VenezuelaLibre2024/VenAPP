package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;

/* renamed from: com.google.android.gms.ads.internal.client.a2 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4786a2 extends zzayh implements InterfaceC4800c2 {
    public AbstractBinderC4786a2() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        C4801c3 c4801c3 = (C4801c3) zzayi.zza(parcel, C4801c3.CREATOR);
        zzayi.zzc(parcel);
        zze(c4801c3);
        parcel2.writeNoException();
        return true;
    }
}
