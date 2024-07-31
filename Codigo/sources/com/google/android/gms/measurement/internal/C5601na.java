package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.measurement.internal.na */
/* loaded from: classes2.dex */
public final class C5601na extends AbstractC7138a {
    public static final Parcelable.Creator<C5601na> CREATOR = new C5640qa();

    /* renamed from: a */
    public final String f11634a;

    /* renamed from: b */
    public final long f11635b;

    /* renamed from: c */
    public final int f11636c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5601na(String str, long j10, int i10) {
        this.f11634a = str;
        this.f11635b = j10;
        this.f11636c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, this.f11634a, false);
        C7140c.m21234z(parcel, 2, this.f11635b);
        C7140c.m21229u(parcel, 3, this.f11636c);
        C7140c.m21210b(parcel, m21209a);
    }
}
