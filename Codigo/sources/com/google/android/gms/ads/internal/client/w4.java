package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        k4 k4Var = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        a1 a1Var = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        String str6 = null;
        long j10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 2:
                    j10 = ea.b.J(parcel, E);
                    break;
                case 3:
                    bundle = ea.b.f(parcel, E);
                    break;
                case 4:
                    i11 = ea.b.G(parcel, E);
                    break;
                case 5:
                    arrayList = ea.b.s(parcel, E);
                    break;
                case 6:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 7:
                    i12 = ea.b.G(parcel, E);
                    break;
                case 8:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 9:
                    str = ea.b.q(parcel, E);
                    break;
                case 10:
                    k4Var = (k4) ea.b.p(parcel, E, k4.CREATOR);
                    break;
                case 11:
                    location = (Location) ea.b.p(parcel, E, Location.CREATOR);
                    break;
                case 12:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 13:
                    bundle2 = ea.b.f(parcel, E);
                    break;
                case 14:
                    bundle3 = ea.b.f(parcel, E);
                    break;
                case 15:
                    arrayList2 = ea.b.s(parcel, E);
                    break;
                case 16:
                    str3 = ea.b.q(parcel, E);
                    break;
                case 17:
                    str4 = ea.b.q(parcel, E);
                    break;
                case 18:
                    z12 = ea.b.x(parcel, E);
                    break;
                case 19:
                    a1Var = (a1) ea.b.p(parcel, E, a1.CREATOR);
                    break;
                case 20:
                    i13 = ea.b.G(parcel, E);
                    break;
                case 21:
                    str5 = ea.b.q(parcel, E);
                    break;
                case 22:
                    arrayList3 = ea.b.s(parcel, E);
                    break;
                case 23:
                    i14 = ea.b.G(parcel, E);
                    break;
                case 24:
                    str6 = ea.b.q(parcel, E);
                    break;
                case 25:
                    i15 = ea.b.G(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new u4(i10, j10, bundle, i11, arrayList, z10, i12, z11, str, k4Var, location, str2, bundle2, bundle3, arrayList2, str3, str4, z12, a1Var, i13, str5, arrayList3, i14, str6, i15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new u4[i10];
    }
}
