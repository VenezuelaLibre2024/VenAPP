package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterFrame;

/* renamed from: com.facebook.ads.redexgen.X.De */
/* loaded from: assets/audience_network.dex */
public class C0867De implements Parcelable.Creator<ChapterFrame> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final ChapterFrame createFromParcel(Parcel parcel) {
        return new ChapterFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final ChapterFrame[] newArray(int i10) {
        return new ChapterFrame[i10];
    }
}
