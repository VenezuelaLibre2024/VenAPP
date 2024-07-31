package v9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import v9.b;

/* loaded from: classes.dex */
public final class s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 2:
                    str = ea.b.q(parcel, E);
                    break;
                case 3:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 4:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 5:
                    str3 = ea.b.q(parcel, E);
                    break;
                case 6:
                    arrayList = ea.b.s(parcel, E);
                    break;
                case 7:
                    z12 = ea.b.x(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new b.C0461b(z10, str, str2, z11, str3, arrayList, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b.C0461b[i10];
    }
}
