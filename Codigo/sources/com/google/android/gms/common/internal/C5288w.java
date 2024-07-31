package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.common.internal.w */
/* loaded from: classes.dex */
public class C5288w extends AbstractC7138a {
    public static final Parcelable.Creator<C5288w> CREATOR = new C5225b0();

    /* renamed from: a */
    private final int f10782a;

    /* renamed from: b */
    private List f10783b;

    public C5288w(int i10, List list) {
        this.f10782a = i10;
        this.f10783b = list;
    }

    /* renamed from: u1 */
    public final int m13357u1() {
        return this.f10782a;
    }

    /* renamed from: v1 */
    public final List m13358v1() {
        return this.f10783b;
    }

    /* renamed from: w1 */
    public final void m13359w1(C5267p c5267p) {
        if (this.f10783b == null) {
            this.f10783b = new ArrayList();
        }
        this.f10783b.add(c5267p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f10782a);
        C7140c.m21204K(parcel, 2, this.f10783b, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
