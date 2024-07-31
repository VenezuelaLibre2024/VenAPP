package qa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        byte[] bArr = null;
        Double d10 = null;
        String str = null;
        ArrayList arrayList = null;
        Integer num = null;
        e0 e0Var = null;
        String str2 = null;
        d dVar = null;
        Long l10 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 2:
                    bArr = ea.b.g(parcel, E);
                    break;
                case 3:
                    d10 = ea.b.B(parcel, E);
                    break;
                case 4:
                    str = ea.b.q(parcel, E);
                    break;
                case 5:
                    arrayList = ea.b.u(parcel, E, v.CREATOR);
                    break;
                case 6:
                    num = ea.b.H(parcel, E);
                    break;
                case 7:
                    e0Var = (e0) ea.b.p(parcel, E, e0.CREATOR);
                    break;
                case 8:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 9:
                    dVar = (d) ea.b.p(parcel, E, d.CREATOR);
                    break;
                case 10:
                    l10 = ea.b.K(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new x(bArr, d10, str, arrayList, num, e0Var, str2, dVar, l10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new x[i10];
    }
}
