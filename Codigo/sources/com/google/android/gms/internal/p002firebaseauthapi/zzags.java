package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzags implements Parcelable.Creator<zzagt> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagt createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            switch (b.w(E)) {
                case 2:
                    str = b.q(parcel, E);
                    break;
                case 3:
                    str2 = b.q(parcel, E);
                    break;
                case 4:
                    str3 = b.q(parcel, E);
                    break;
                case 5:
                    str4 = b.q(parcel, E);
                    break;
                case 6:
                    str5 = b.q(parcel, E);
                    break;
                case 7:
                    str6 = b.q(parcel, E);
                    break;
                case 8:
                    str7 = b.q(parcel, E);
                    break;
                case 9:
                    str8 = b.q(parcel, E);
                    break;
                case 10:
                    z10 = b.x(parcel, E);
                    break;
                case 11:
                    z11 = b.x(parcel, E);
                    break;
                case 12:
                    str9 = b.q(parcel, E);
                    break;
                case 13:
                    str10 = b.q(parcel, E);
                    break;
                case 14:
                    str11 = b.q(parcel, E);
                    break;
                case 15:
                    str12 = b.q(parcel, E);
                    break;
                case 16:
                    z12 = b.x(parcel, E);
                    break;
                case 17:
                    str13 = b.q(parcel, E);
                    break;
                default:
                    b.N(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new zzagt(str, str2, str3, str4, str5, str6, str7, str8, z10, z11, str9, str10, str11, str12, z12, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagt[] newArray(int i10) {
        return new zzagt[i10];
    }
}
