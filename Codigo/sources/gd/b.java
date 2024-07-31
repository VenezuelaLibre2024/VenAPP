package gd;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class b implements Parcelable.Creator<a> {
    public static void c(a aVar, Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, aVar.w1(), false);
        ea.c.G(parcel, 2, aVar.v1(), false);
        ea.c.u(parcel, 3, aVar.y1());
        ea.c.z(parcel, 4, aVar.u1());
        ea.c.j(parcel, 5, aVar.x1(), false);
        ea.c.E(parcel, 6, aVar.z1(), i10, false);
        ea.c.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public a createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        Uri uri = null;
        int i10 = 0;
        long j10 = 0;
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
                    i10 = ea.b.G(parcel, E);
                    break;
                case 4:
                    j10 = ea.b.J(parcel, E);
                    break;
                case 5:
                    bundle = ea.b.f(parcel, E);
                    break;
                case 6:
                    uri = (Uri) ea.b.p(parcel, E, Uri.CREATOR);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new a(str, str2, i10, j10, bundle, uri);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public a[] newArray(int i10) {
        return new a[i10];
    }
}
