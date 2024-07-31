package g9;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        boolean z10 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
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
                    str5 = ea.b.q(parcel, E);
                    break;
                case 7:
                    str6 = ea.b.q(parcel, E);
                    break;
                case 8:
                    str7 = ea.b.q(parcel, E);
                    break;
                case 9:
                    intent = (Intent) ea.b.p(parcel, E, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = ea.b.F(parcel, E);
                    break;
                case 11:
                    z10 = ea.b.x(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new j(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
