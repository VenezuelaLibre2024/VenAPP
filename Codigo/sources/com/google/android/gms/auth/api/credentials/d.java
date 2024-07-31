package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 != 1000) {
                switch (w10) {
                    case 1:
                        z10 = ea.b.x(parcel, E);
                        break;
                    case 2:
                        strArr = ea.b.r(parcel, E);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) ea.b.p(parcel, E, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) ea.b.p(parcel, E, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z11 = ea.b.x(parcel, E);
                        break;
                    case 6:
                        str = ea.b.q(parcel, E);
                        break;
                    case 7:
                        str2 = ea.b.q(parcel, E);
                        break;
                    case 8:
                        z12 = ea.b.x(parcel, E);
                        break;
                    default:
                        ea.b.N(parcel, E);
                        break;
                }
            } else {
                i10 = ea.b.G(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new a(i10, z10, strArr, credentialPickerConfig, credentialPickerConfig2, z11, str, str2, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
