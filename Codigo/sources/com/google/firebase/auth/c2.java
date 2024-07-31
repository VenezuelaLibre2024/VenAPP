package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzagt;

/* loaded from: classes.dex */
public final class c2 implements Parcelable.Creator<d2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d2 createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzagt zzagtVar = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    zzagtVar = (zzagt) ea.b.p(parcel, E, zzagt.CREATOR);
                    break;
                case 5:
                    str4 = ea.b.q(parcel, E);
                    break;
                case 6:
                    str5 = ea.b.q(parcel, E);
                    break;
                case 7:
                    str6 = ea.b.q(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new d2(str, str2, str3, zzagtVar, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d2[] newArray(int i10) {
        return new d2[i10];
    }
}
