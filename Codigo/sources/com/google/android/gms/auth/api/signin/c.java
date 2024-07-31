package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 2:
                    str = ea.b.q(parcel, E);
                    break;
                case 3:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 4:
                    str3 = ea.b.q(parcel, E);
                    break;
                case 5:
                    str4 = ea.b.q(parcel, E);
                    break;
                case 6:
                    uri = (Uri) ea.b.p(parcel, E, Uri.CREATOR);
                    break;
                case 7:
                    str5 = ea.b.q(parcel, E);
                    break;
                case 8:
                    j10 = ea.b.J(parcel, E);
                    break;
                case 9:
                    str6 = ea.b.q(parcel, E);
                    break;
                case 10:
                    arrayList = ea.b.u(parcel, E, Scope.CREATOR);
                    break;
                case 11:
                    str7 = ea.b.q(parcel, E);
                    break;
                case 12:
                    str8 = ea.b.q(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
