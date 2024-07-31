package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame;

/* loaded from: assets/audience_network.dex */
public class Dk implements Parcelable.Creator<InternalFrame> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final InternalFrame createFromParcel(Parcel parcel) {
        return new InternalFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final InternalFrame[] newArray(int i10) {
        return new InternalFrame[i10];
    }
}
