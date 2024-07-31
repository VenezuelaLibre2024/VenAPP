package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 != 1000) {
                switch (w10) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) ea.b.p(parcel, E, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z10 = ea.b.x(parcel, E);
                        break;
                    case 3:
                        z11 = ea.b.x(parcel, E);
                        break;
                    case 4:
                        strArr = ea.b.r(parcel, E);
                        break;
                    case 5:
                        z12 = ea.b.x(parcel, E);
                        break;
                    case 6:
                        str = ea.b.q(parcel, E);
                        break;
                    case 7:
                        str2 = ea.b.q(parcel, E);
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
        return new HintRequest(i10, credentialPickerConfig, z10, z11, strArr, z12, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new HintRequest[i10];
    }
}
