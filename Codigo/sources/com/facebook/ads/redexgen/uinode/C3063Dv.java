package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.TimeSignalCommand;

/* renamed from: com.facebook.ads.redexgen.X.Dv */
/* loaded from: assets/audience_network.dex */
public class C3063Dv implements Parcelable.Creator<TimeSignalCommand> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final TimeSignalCommand createFromParcel(Parcel parcel) {
        return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final TimeSignalCommand[] newArray(int i10) {
        return new TimeSignalCommand[i10];
    }
}
