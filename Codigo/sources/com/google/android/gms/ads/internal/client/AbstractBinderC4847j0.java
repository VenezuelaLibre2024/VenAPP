package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;

/* renamed from: com.google.android.gms.ads.internal.client.j0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4847j0 extends zzayh implements InterfaceC4853k0 {
    public AbstractBinderC4847j0() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzc();
        } else {
            if (i10 != 2) {
                return false;
            }
            C4801c3 c4801c3 = (C4801c3) zzayi.zza(parcel, C4801c3.CREATOR);
            zzayi.zzc(parcel);
            zzb(c4801c3);
        }
        parcel2.writeNoException();
        return true;
    }
}
