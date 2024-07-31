package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.w2;
import com.google.android.gms.ads.internal.client.z4;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzbyg implements Parcelable.Creator {
    public static final zzbyf zza(Parcel parcel) {
        int O = ea.b.O(parcel);
        Bundle bundle = null;
        u4 u4Var = null;
        z4 z4Var = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzcei zzceiVar = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        zzbjb zzbjbVar = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        w2 w2Var = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        zzbpp zzbppVar = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i16 = 0;
        boolean z14 = false;
        boolean z15 = false;
        int i17 = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        float f10 = 0.0f;
        float f11 = 0.0f;
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 2:
                    bundle = ea.b.f(parcel, E);
                    break;
                case 3:
                    u4Var = (u4) ea.b.p(parcel, E, u4.CREATOR);
                    break;
                case 4:
                    z4Var = (z4) ea.b.p(parcel, E, z4.CREATOR);
                    break;
                case 5:
                    str = ea.b.q(parcel, E);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) ea.b.p(parcel, E, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) ea.b.p(parcel, E, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 9:
                    str3 = ea.b.q(parcel, E);
                    break;
                case 10:
                    str4 = ea.b.q(parcel, E);
                    break;
                case 11:
                    zzceiVar = (zzcei) ea.b.p(parcel, E, zzcei.CREATOR);
                    break;
                case 12:
                    bundle2 = ea.b.f(parcel, E);
                    break;
                case 13:
                    i11 = ea.b.G(parcel, E);
                    break;
                case 14:
                    arrayList = ea.b.s(parcel, E);
                    break;
                case 15:
                    bundle3 = ea.b.f(parcel, E);
                    break;
                case 16:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 38:
                case 62:
                default:
                    ea.b.N(parcel, E);
                    break;
                case 18:
                    i12 = ea.b.G(parcel, E);
                    break;
                case 19:
                    i13 = ea.b.G(parcel, E);
                    break;
                case 20:
                    f10 = ea.b.C(parcel, E);
                    break;
                case 21:
                    str5 = ea.b.q(parcel, E);
                    break;
                case 25:
                    j10 = ea.b.J(parcel, E);
                    break;
                case 26:
                    str6 = ea.b.q(parcel, E);
                    break;
                case 27:
                    arrayList2 = ea.b.s(parcel, E);
                    break;
                case 28:
                    str7 = ea.b.q(parcel, E);
                    break;
                case 29:
                    zzbjbVar = (zzbjb) ea.b.p(parcel, E, zzbjb.CREATOR);
                    break;
                case 30:
                    arrayList3 = ea.b.s(parcel, E);
                    break;
                case 31:
                    j11 = ea.b.J(parcel, E);
                    break;
                case 33:
                    str8 = ea.b.q(parcel, E);
                    break;
                case 34:
                    f11 = ea.b.C(parcel, E);
                    break;
                case 35:
                    i14 = ea.b.G(parcel, E);
                    break;
                case 36:
                    i15 = ea.b.G(parcel, E);
                    break;
                case 37:
                    z12 = ea.b.x(parcel, E);
                    break;
                case 39:
                    str9 = ea.b.q(parcel, E);
                    break;
                case 40:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 41:
                    str10 = ea.b.q(parcel, E);
                    break;
                case 42:
                    z13 = ea.b.x(parcel, E);
                    break;
                case 43:
                    i16 = ea.b.G(parcel, E);
                    break;
                case 44:
                    bundle4 = ea.b.f(parcel, E);
                    break;
                case 45:
                    str11 = ea.b.q(parcel, E);
                    break;
                case 46:
                    w2Var = (w2) ea.b.p(parcel, E, w2.CREATOR);
                    break;
                case 47:
                    z14 = ea.b.x(parcel, E);
                    break;
                case 48:
                    bundle5 = ea.b.f(parcel, E);
                    break;
                case 49:
                    str12 = ea.b.q(parcel, E);
                    break;
                case 50:
                    str13 = ea.b.q(parcel, E);
                    break;
                case 51:
                    str14 = ea.b.q(parcel, E);
                    break;
                case 52:
                    z15 = ea.b.x(parcel, E);
                    break;
                case 53:
                    arrayList4 = ea.b.l(parcel, E);
                    break;
                case 54:
                    str15 = ea.b.q(parcel, E);
                    break;
                case 55:
                    arrayList5 = ea.b.s(parcel, E);
                    break;
                case 56:
                    i17 = ea.b.G(parcel, E);
                    break;
                case 57:
                    z16 = ea.b.x(parcel, E);
                    break;
                case 58:
                    z17 = ea.b.x(parcel, E);
                    break;
                case 59:
                    z18 = ea.b.x(parcel, E);
                    break;
                case 60:
                    arrayList6 = ea.b.s(parcel, E);
                    break;
                case 61:
                    str16 = ea.b.q(parcel, E);
                    break;
                case 63:
                    zzbppVar = (zzbpp) ea.b.p(parcel, E, zzbpp.CREATOR);
                    break;
                case 64:
                    str17 = ea.b.q(parcel, E);
                    break;
                case 65:
                    bundle6 = ea.b.f(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new zzbyf(i10, bundle, u4Var, z4Var, str, applicationInfo, packageInfo, str2, str3, str4, zzceiVar, bundle2, i11, arrayList, bundle3, z10, i12, i13, f10, str5, j10, str6, arrayList2, str7, zzbjbVar, arrayList3, j11, str8, f11, z11, i14, i15, z12, str9, str10, z13, i16, bundle4, str11, w2Var, z14, bundle5, str12, str13, str14, z15, arrayList4, str15, arrayList5, i17, z16, z17, z18, arrayList6, str16, zzbppVar, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbyf[i10];
    }
}
