package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame;

/* renamed from: com.facebook.ads.redexgen.X.Dg */
/* loaded from: assets/audience_network.dex */
public class C0869Dg implements Parcelable.Creator<CommentFrame> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final CommentFrame createFromParcel(Parcel parcel) {
        return new CommentFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final CommentFrame[] newArray(int i10) {
        return new CommentFrame[i10];
    }
}
