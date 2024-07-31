package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class z1 implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    str = ea.b.q(parcel, E);
                    break;
                case 2:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 3:
                    str3 = ea.b.q(parcel, E);
                    break;
                case 4:
                    str4 = ea.b.q(parcel, E);
                    break;
                case 5:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 6:
                    str5 = ea.b.q(parcel, E);
                    break;
                case 7:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 8:
                    str6 = ea.b.q(parcel, E);
                    break;
                case 9:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 10:
                    str7 = ea.b.q(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new e(str, str2, str3, str4, z10, str5, z11, str6, i10, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e[] newArray(int i10) {
        return new e[i10];
    }
}
