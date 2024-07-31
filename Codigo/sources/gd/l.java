package gd;

import android.os.Parcel;
import android.os.Parcelable;
import gd.j;

/* loaded from: classes.dex */
public class l implements Parcelable.Creator<j.a> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(j.a aVar, Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, aVar.getMessage(), false);
        ea.c.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public j.a createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            if (ea.b.w(E) != 2) {
                ea.b.N(parcel, E);
            } else {
                str = ea.b.q(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new j.a(str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j.a[] newArray(int i10) {
        return new j.a[i10];
    }
}
