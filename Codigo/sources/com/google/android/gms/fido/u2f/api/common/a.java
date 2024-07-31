package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import ra.d;
import ra.e;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        Integer num = null;
        Double d10 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ra.a aVar = null;
        String str = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 2:
                    num = ea.b.H(parcel, E);
                    break;
                case 3:
                    d10 = ea.b.B(parcel, E);
                    break;
                case 4:
                    uri = (Uri) ea.b.p(parcel, E, Uri.CREATOR);
                    break;
                case 5:
                    arrayList = ea.b.u(parcel, E, d.CREATOR);
                    break;
                case 6:
                    arrayList2 = ea.b.u(parcel, E, e.CREATOR);
                    break;
                case 7:
                    aVar = (ra.a) ea.b.p(parcel, E, ra.a.CREATOR);
                    break;
                case 8:
                    str = ea.b.q(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new RegisterRequestParams(num, d10, uri, arrayList, arrayList2, aVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RegisterRequestParams[i10];
    }
}
