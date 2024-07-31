package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.measurement.internal.mb */
/* loaded from: classes2.dex */
public final class C5589mb implements Parcelable.Creator<C5576lb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5576lb createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i11 = 0;
        long j17 = -2147483648L;
        String str10 = "";
        String str11 = str10;
        String str12 = str11;
        int i12 = 100;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 2:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 3:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 4:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 5:
                    str4 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 6:
                    j10 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 7:
                    j11 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 8:
                    str5 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 9:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 10:
                    z12 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 11:
                    j17 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 12:
                    str6 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 13:
                    j12 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 14:
                    j13 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 15:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 16:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 17:
                case 20:
                case 33:
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
                case 18:
                    z13 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 19:
                    str7 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 21:
                    bool = C7139b.m21192y(parcel, m21155E);
                    break;
                case 22:
                    j14 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 23:
                    arrayList = C7139b.m21186s(parcel, m21155E);
                    break;
                case 24:
                    str8 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 25:
                    str10 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 26:
                    str11 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 27:
                    str9 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 28:
                    z14 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 29:
                    j15 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 30:
                    i12 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 31:
                    str12 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 32:
                    i11 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 34:
                    j16 = C7139b.m21160J(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5576lb(str, str2, str3, str4, j10, j11, str5, z10, z12, j17, str6, j12, j13, i10, z11, z13, str7, bool, j14, arrayList, str8, str10, str11, str9, z14, j15, i12, str12, i11, j16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5576lb[] newArray(int i10) {
        return new C5576lb[i10];
    }
}
