package qa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        y yVar = null;
        a0 a0Var = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        Double d10 = null;
        ArrayList arrayList2 = null;
        k kVar = null;
        Integer num = null;
        e0 e0Var = null;
        String str = null;
        d dVar = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 2:
                    yVar = (y) ea.b.p(parcel, E, y.CREATOR);
                    break;
                case 3:
                    a0Var = (a0) ea.b.p(parcel, E, a0.CREATOR);
                    break;
                case 4:
                    bArr = ea.b.g(parcel, E);
                    break;
                case 5:
                    arrayList = ea.b.u(parcel, E, w.CREATOR);
                    break;
                case 6:
                    d10 = ea.b.B(parcel, E);
                    break;
                case 7:
                    arrayList2 = ea.b.u(parcel, E, v.CREATOR);
                    break;
                case 8:
                    kVar = (k) ea.b.p(parcel, E, k.CREATOR);
                    break;
                case 9:
                    num = ea.b.H(parcel, E);
                    break;
                case 10:
                    e0Var = (e0) ea.b.p(parcel, E, e0.CREATOR);
                    break;
                case 11:
                    str = ea.b.q(parcel, E);
                    break;
                case 12:
                    dVar = (d) ea.b.p(parcel, E, d.CREATOR);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new u(yVar, a0Var, bArr, arrayList, d10, arrayList2, kVar, num, e0Var, str, dVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new u[i10];
    }
}
