package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzbyj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        ApplicationInfo applicationInfo = null;
        String str = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    applicationInfo = (ApplicationInfo) ea.b.p(parcel, E, ApplicationInfo.CREATOR);
                    break;
                case 2:
                    str = ea.b.q(parcel, E);
                    break;
                case 3:
                    packageInfo = (PackageInfo) ea.b.p(parcel, E, PackageInfo.CREATOR);
                    break;
                case 4:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 5:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 6:
                    str3 = ea.b.q(parcel, E);
                    break;
                case 7:
                    arrayList = ea.b.s(parcel, E);
                    break;
                case 8:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 9:
                    z11 = ea.b.x(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new zzbyi(applicationInfo, str, packageInfo, str2, i10, str3, arrayList, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbyi[i10];
    }
}
