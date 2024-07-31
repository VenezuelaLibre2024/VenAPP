package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        h hVar = null;
        g gVar = null;
        i iVar = null;
        e eVar = null;
        String str3 = null;
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
                    bArr = ea.b.g(parcel, E);
                    break;
                case 4:
                    hVar = (h) ea.b.p(parcel, E, h.CREATOR);
                    break;
                case 5:
                    gVar = (g) ea.b.p(parcel, E, g.CREATOR);
                    break;
                case 6:
                    iVar = (i) ea.b.p(parcel, E, i.CREATOR);
                    break;
                case 7:
                    eVar = (e) ea.b.p(parcel, E, e.CREATOR);
                    break;
                case 8:
                    str3 = ea.b.q(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new t(str, str2, bArr, hVar, gVar, iVar, eVar, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new t[i10];
    }
}
