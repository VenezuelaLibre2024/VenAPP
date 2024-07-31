package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzagr;

/* loaded from: classes.dex */
public final class w1 implements Parcelable.Creator<y0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y0 createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        zzagr zzagrVar = null;
        long j10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                str = ea.b.q(parcel, E);
            } else if (w10 == 2) {
                str2 = ea.b.q(parcel, E);
            } else if (w10 == 3) {
                j10 = ea.b.J(parcel, E);
            } else if (w10 != 4) {
                ea.b.N(parcel, E);
            } else {
                zzagrVar = (zzagr) ea.b.p(parcel, E, zzagr.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new y0(str, str2, j10, zzagrVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y0[] newArray(int i10) {
        return new y0[i10];
    }
}
