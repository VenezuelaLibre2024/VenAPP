package gd;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import gd.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class k implements Parcelable.Creator<j> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(j jVar, Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 1, jVar.i0(), i10, false);
        ea.c.E(parcel, 2, jVar.U(), i10, false);
        ea.c.K(parcel, 3, jVar.h0(), false);
        ea.c.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public j createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                uri = (Uri) ea.b.p(parcel, E, Uri.CREATOR);
            } else if (w10 == 2) {
                uri2 = (Uri) ea.b.p(parcel, E, Uri.CREATOR);
            } else if (w10 != 3) {
                ea.b.N(parcel, E);
            } else {
                arrayList = ea.b.u(parcel, E, j.a.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new j(uri, uri2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j[] newArray(int i10) {
        return new j[i10];
    }
}
