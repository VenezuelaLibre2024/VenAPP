package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.BinaryFrame;

/* renamed from: com.facebook.ads.redexgen.X.Dd */
/* loaded from: assets/audience_network.dex */
public class C0866Dd implements Parcelable.Creator<BinaryFrame> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final BinaryFrame createFromParcel(Parcel parcel) {
        return new BinaryFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final BinaryFrame[] newArray(int i10) {
        return new BinaryFrame[i10];
    }
}
