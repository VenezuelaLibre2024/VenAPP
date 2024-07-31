package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC5204n;
import com.google.android.gms.common.api.Status;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.location.r */
/* loaded from: classes2.dex */
public final class C5395r extends AbstractC7138a implements InterfaceC5204n {
    public static final Parcelable.Creator<C5395r> CREATOR = new C5407x();

    /* renamed from: a */
    private final Status f10990a;

    /* renamed from: b */
    private final C5397s f10991b;

    public C5395r(Status status, C5397s c5397s) {
        this.f10990a = status;
        this.f10991b = c5397s;
    }

    @Override // com.google.android.gms.common.api.InterfaceC5204n
    public Status getStatus() {
        return this.f10990a;
    }

    /* renamed from: u1 */
    public C5397s m13537u1() {
        return this.f10991b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 1, getStatus(), i10, false);
        C7140c.m21198E(parcel, 2, m13537u1(), i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
