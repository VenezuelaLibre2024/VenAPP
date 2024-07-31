package v9;

import android.os.Parcel;
import android.os.Parcelable;
import v9.b;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        b.e eVar = null;
        b.C0461b c0461b = null;
        String str = null;
        b.d dVar = null;
        b.c cVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    eVar = (b.e) ea.b.p(parcel, E, b.e.CREATOR);
                    break;
                case 2:
                    c0461b = (b.C0461b) ea.b.p(parcel, E, b.C0461b.CREATOR);
                    break;
                case 3:
                    str = ea.b.q(parcel, E);
                    break;
                case 4:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 5:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 6:
                    dVar = (b.d) ea.b.p(parcel, E, b.d.CREATOR);
                    break;
                case 7:
                    cVar = (b.c) ea.b.p(parcel, E, b.c.CREATOR);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new b(eVar, c0461b, str, z10, i10, dVar, cVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
