package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;

/* loaded from: assets/audience_network.dex */
public class BV implements Parcelable.Creator<DrmInitData> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final DrmInitData createFromParcel(Parcel parcel) {
        return new DrmInitData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final DrmInitData[] newArray(int i10) {
        return new DrmInitData[i10];
    }
}
