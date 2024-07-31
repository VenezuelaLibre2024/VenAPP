package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Dt */
/* loaded from: assets/audience_network.dex */
public final class C3061Dt {
    public final int A00;
    public final long A01;

    public C3061Dt(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public /* synthetic */ C3061Dt(int i10, long j10, C3060Ds c3060Ds) {
        this(i10, j10);
    }

    public static C3061Dt A00(Parcel parcel) {
        return new C3061Dt(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
