package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.common.internal.u */
/* loaded from: classes.dex */
public class C5282u extends AbstractC7138a {
    public static final Parcelable.Creator<C5282u> CREATOR = new C5239f1();

    /* renamed from: a */
    private final int f10761a;

    /* renamed from: b */
    private final boolean f10762b;

    /* renamed from: c */
    private final boolean f10763c;

    /* renamed from: d */
    private final int f10764d;

    /* renamed from: e */
    private final int f10765e;

    public C5282u(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f10761a = i10;
        this.f10762b = z10;
        this.f10763c = z11;
        this.f10764d = i11;
        this.f10765e = i12;
    }

    /* renamed from: u1 */
    public int m13344u1() {
        return this.f10764d;
    }

    /* renamed from: v1 */
    public int m13345v1() {
        return this.f10765e;
    }

    /* renamed from: w1 */
    public boolean m13346w1() {
        return this.f10762b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, m13348y1());
        C7140c.m21215g(parcel, 2, m13346w1());
        C7140c.m21215g(parcel, 3, m13347x1());
        C7140c.m21229u(parcel, 4, m13344u1());
        C7140c.m21229u(parcel, 5, m13345v1());
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public boolean m13347x1() {
        return this.f10763c;
    }

    /* renamed from: y1 */
    public int m13348y1() {
        return this.f10761a;
    }
}
