package oc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzafn;
import com.google.android.gms.internal.p002firebaseauthapi.zzafq;
import com.google.firebase.auth.d2;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        zzafn zzafnVar = null;
        y1 y1Var = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        f fVar = null;
        d2 d2Var = null;
        l0 l0Var = null;
        ArrayList arrayList3 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    zzafnVar = (zzafn) ea.b.p(parcel, E, zzafn.CREATOR);
                    break;
                case 2:
                    y1Var = (y1) ea.b.p(parcel, E, y1.CREATOR);
                    break;
                case 3:
                    str = ea.b.q(parcel, E);
                    break;
                case 4:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 5:
                    arrayList = ea.b.u(parcel, E, y1.CREATOR);
                    break;
                case 6:
                    arrayList2 = ea.b.s(parcel, E);
                    break;
                case 7:
                    str3 = ea.b.q(parcel, E);
                    break;
                case 8:
                    bool = ea.b.y(parcel, E);
                    break;
                case 9:
                    fVar = (f) ea.b.p(parcel, E, f.CREATOR);
                    break;
                case 10:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 11:
                    d2Var = (d2) ea.b.p(parcel, E, d2.CREATOR);
                    break;
                case 12:
                    l0Var = (l0) ea.b.p(parcel, E, l0.CREATOR);
                    break;
                case 13:
                    arrayList3 = ea.b.u(parcel, E, zzafq.CREATOR);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new d(zzafnVar, y1Var, str, str2, arrayList, arrayList2, str3, bool, fVar, z10, d2Var, l0Var, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i10) {
        return new d[i10];
    }
}
