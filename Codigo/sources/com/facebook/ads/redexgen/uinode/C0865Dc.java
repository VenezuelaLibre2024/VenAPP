package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame;

/* renamed from: com.facebook.ads.redexgen.X.Dc */
/* loaded from: assets/audience_network.dex */
public class C0865Dc implements Parcelable.Creator<ApicFrame> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final ApicFrame createFromParcel(Parcel parcel) {
        return new ApicFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final ApicFrame[] newArray(int i10) {
        return new ApicFrame[i10];
    }
}
