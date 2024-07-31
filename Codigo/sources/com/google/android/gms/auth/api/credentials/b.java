package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        String str3 = null;
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
                    uri = (Uri) ea.b.p(parcel, E, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = ea.b.u(parcel, E, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = ea.b.q(parcel, E);
                    break;
                case 6:
                    str4 = ea.b.q(parcel, E);
                    break;
                case 7:
                case 8:
                default:
                    ea.b.N(parcel, E);
                    break;
                case 9:
                    str5 = ea.b.q(parcel, E);
                    break;
                case 10:
                    str6 = ea.b.q(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Credential[i10];
    }
}
