package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.location.s */
/* loaded from: classes2.dex */
public final class C5397s extends AbstractC7138a {
    public static final Parcelable.Creator<C5397s> CREATOR = new C5409y();

    /* renamed from: a */
    private final boolean f10992a;

    /* renamed from: b */
    private final boolean f10993b;

    /* renamed from: c */
    private final boolean f10994c;

    /* renamed from: d */
    private final boolean f10995d;

    /* renamed from: e */
    private final boolean f10996e;

    /* renamed from: f */
    private final boolean f10997f;

    public C5397s(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f10992a = z10;
        this.f10993b = z11;
        this.f10994c = z12;
        this.f10995d = z13;
        this.f10996e = z14;
        this.f10997f = z15;
    }

    /* renamed from: u1 */
    public boolean m13538u1() {
        return this.f10997f;
    }

    /* renamed from: v1 */
    public boolean m13539v1() {
        return this.f10994c;
    }

    /* renamed from: w1 */
    public boolean m13540w1() {
        return this.f10995d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21215g(parcel, 1, m13541x1());
        C7140c.m21215g(parcel, 2, m13543z1());
        C7140c.m21215g(parcel, 3, m13539v1());
        C7140c.m21215g(parcel, 4, m13540w1());
        C7140c.m21215g(parcel, 5, m13542y1());
        C7140c.m21215g(parcel, 6, m13538u1());
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public boolean m13541x1() {
        return this.f10992a;
    }

    /* renamed from: y1 */
    public boolean m13542y1() {
        return this.f10996e;
    }

    /* renamed from: z1 */
    public boolean m13543z1() {
        return this.f10993b;
    }
}
