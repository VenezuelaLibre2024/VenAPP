package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;
import p101f9.C7316a;

/* renamed from: com.google.android.gms.ads.internal.util.u0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5046u0 extends zzayh implements InterfaceC5049v0 {
    public AbstractBinderC5046u0() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i10, Parcel parcel, Parcel parcel2, int i11) {
        int i12;
        if (i10 == 1) {
            InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzayi.zzc(parcel);
            i12 = zzf(m13410f2, readString, readString2);
        } else {
            if (i10 == 2) {
                InterfaceC5312b m13410f22 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zze(m13410f22);
                parcel2.writeNoException();
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            InterfaceC5312b m13410f23 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
            C7316a c7316a = (C7316a) zzayi.zza(parcel, C7316a.CREATOR);
            zzayi.zzc(parcel);
            i12 = zzg(m13410f23, c7316a);
        }
        parcel2.writeNoException();
        parcel2.writeInt(i12);
        return true;
    }
}
