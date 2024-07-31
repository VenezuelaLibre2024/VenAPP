package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.AbstractC5300a;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.common.server.response.g */
/* loaded from: classes.dex */
public final class C5306g extends AbstractC7138a {
    public static final Parcelable.Creator<C5306g> CREATOR = new C5304e();

    /* renamed from: a */
    final int f10815a;

    /* renamed from: b */
    final String f10816b;

    /* renamed from: c */
    final AbstractC5300a.a f10817c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5306g(int i10, String str, AbstractC5300a.a aVar) {
        this.f10815a = i10;
        this.f10816b = str;
        this.f10817c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5306g(String str, AbstractC5300a.a aVar) {
        this.f10815a = 1;
        this.f10816b = str;
        this.f10817c = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f10815a);
        C7140c.m21200G(parcel, 2, this.f10816b, false);
        C7140c.m21198E(parcel, 3, this.f10817c, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
