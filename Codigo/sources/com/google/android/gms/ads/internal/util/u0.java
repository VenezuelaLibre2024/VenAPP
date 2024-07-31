package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: classes.dex */
public abstract class u0 extends zzayh implements v0 {
    public u0() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        int i12;
        if (i10 == 1) {
            com.google.android.gms.dynamic.b f22 = b.a.f2(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzayi.zzc(parcel);
            i12 = zzf(f22, readString, readString2);
        } else {
            if (i10 == 2) {
                com.google.android.gms.dynamic.b f23 = b.a.f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zze(f23);
                parcel2.writeNoException();
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            com.google.android.gms.dynamic.b f24 = b.a.f2(parcel.readStrongBinder());
            f9.a aVar = (f9.a) zzayi.zza(parcel, f9.a.CREATOR);
            zzayi.zzc(parcel);
            i12 = zzg(f24, aVar);
        }
        parcel2.writeNoException();
        parcel2.writeInt(i12);
        return true;
    }
}
