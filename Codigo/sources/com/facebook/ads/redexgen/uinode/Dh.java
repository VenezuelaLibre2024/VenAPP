package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.GeobFrame;

/* loaded from: assets/audience_network.dex */
public class Dh implements Parcelable.Creator<GeobFrame> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final GeobFrame createFromParcel(Parcel parcel) {
        return new GeobFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final GeobFrame[] newArray(int i10) {
        return new GeobFrame[i10];
    }
}
