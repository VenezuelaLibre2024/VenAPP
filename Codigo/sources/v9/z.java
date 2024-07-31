package v9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        qa.t tVar = null;
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
                    uri = (Uri) ea.b.p(parcel, E, Uri.CREATOR);
                    break;
                case 6:
                    str5 = ea.b.q(parcel, E);
                    break;
                case 7:
                    str6 = ea.b.q(parcel, E);
                    break;
                case 8:
                    str7 = ea.b.q(parcel, E);
                    break;
                case 9:
                    tVar = (qa.t) ea.b.p(parcel, E, qa.t.CREATOR);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new i(str, str2, str3, str4, uri, str5, str6, str7, tVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
