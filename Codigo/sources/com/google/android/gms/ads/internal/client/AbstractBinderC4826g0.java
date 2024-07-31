package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;

/* renamed from: com.google.android.gms.ads.internal.client.g0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4826g0 extends zzayh implements InterfaceC4833h0 {
    public AbstractBinderC4826g0() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                zzd();
                break;
            case 2:
                int readInt = parcel.readInt();
                zzayi.zzc(parcel);
                zze(readInt);
                break;
            case 3:
                break;
            case 4:
                zzi();
                break;
            case 5:
                zzj();
                break;
            case 6:
                zzc();
                break;
            case 7:
                zzg();
                break;
            case 8:
                C4801c3 c4801c3 = (C4801c3) zzayi.zza(parcel, C4801c3.CREATOR);
                zzayi.zzc(parcel);
                zzf(c4801c3);
                break;
            case 9:
                zzk();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
