package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class r extends ea.a implements com.google.android.gms.common.api.n {
    public static final Parcelable.Creator<r> CREATOR = new x();

    /* renamed from: a, reason: collision with root package name */
    private final Status f9875a;

    /* renamed from: b, reason: collision with root package name */
    private final s f9876b;

    public r(Status status, s sVar) {
        this.f9875a = status;
        this.f9876b = sVar;
    }

    @Override // com.google.android.gms.common.api.n
    public Status getStatus() {
        return this.f9875a;
    }

    public s u1() {
        return this.f9876b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 1, getStatus(), i10, false);
        ea.c.E(parcel, 2, u1(), i10, false);
        ea.c.b(parcel, a10);
    }
}
