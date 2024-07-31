package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzcbq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
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
                    z10 = ea.b.x(parcel, E);
                    break;
                case 5:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 6:
                    arrayList = ea.b.s(parcel, E);
                    break;
                case 7:
                    z12 = ea.b.x(parcel, E);
                    break;
                case 8:
                    z13 = ea.b.x(parcel, E);
                    break;
                case 9:
                    arrayList2 = ea.b.s(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new zzcbp(str, str2, z10, z11, arrayList, z12, z13, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzcbp[i10];
    }
}
