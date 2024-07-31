package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzbzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        boolean z10 = false;
        boolean z11 = false;
        Bundle bundle = null;
        zzcei zzceiVar = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        zzfjc zzfjcVar = null;
        String str4 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    bundle = ea.b.f(parcel, E);
                    break;
                case 2:
                    zzceiVar = (zzcei) ea.b.p(parcel, E, zzcei.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) ea.b.p(parcel, E, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = ea.b.q(parcel, E);
                    break;
                case 5:
                    arrayList = ea.b.s(parcel, E);
                    break;
                case 6:
                    packageInfo = (PackageInfo) ea.b.p(parcel, E, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 8:
                default:
                    ea.b.N(parcel, E);
                    break;
                case 9:
                    str3 = ea.b.q(parcel, E);
                    break;
                case 10:
                    zzfjcVar = (zzfjc) ea.b.p(parcel, E, zzfjc.CREATOR);
                    break;
                case 11:
                    str4 = ea.b.q(parcel, E);
                    break;
                case 12:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 13:
                    z11 = ea.b.x(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new zzbze(bundle, zzceiVar, applicationInfo, str, arrayList, packageInfo, str2, str3, zzfjcVar, str4, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbze[i10];
    }
}
