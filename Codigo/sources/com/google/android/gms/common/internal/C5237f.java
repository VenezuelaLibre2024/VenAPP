package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.common.internal.f */
/* loaded from: classes.dex */
public class C5237f extends AbstractC7138a {
    public static final Parcelable.Creator<C5237f> CREATOR = new C5266o1();

    /* renamed from: a */
    private final C5282u f10666a;

    /* renamed from: b */
    private final boolean f10667b;

    /* renamed from: c */
    private final boolean f10668c;

    /* renamed from: d */
    private final int[] f10669d;

    /* renamed from: e */
    private final int f10670e;

    /* renamed from: f */
    private final int[] f10671f;

    public C5237f(C5282u c5282u, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f10666a = c5282u;
        this.f10667b = z10;
        this.f10668c = z11;
        this.f10669d = iArr;
        this.f10670e = i10;
        this.f10671f = iArr2;
    }

    /* renamed from: u1 */
    public int m13247u1() {
        return this.f10670e;
    }

    /* renamed from: v1 */
    public int[] m13248v1() {
        return this.f10669d;
    }

    /* renamed from: w1 */
    public int[] m13249w1() {
        return this.f10671f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 1, this.f10666a, i10, false);
        C7140c.m21215g(parcel, 2, m13250x1());
        C7140c.m21215g(parcel, 3, m13251y1());
        C7140c.m21230v(parcel, 4, m13248v1(), false);
        C7140c.m21229u(parcel, 5, m13247u1());
        C7140c.m21230v(parcel, 6, m13249w1(), false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public boolean m13250x1() {
        return this.f10667b;
    }

    /* renamed from: y1 */
    public boolean m13251y1() {
        return this.f10668c;
    }

    /* renamed from: z1 */
    public final C5282u m13252z1() {
        return this.f10666a;
    }
}
