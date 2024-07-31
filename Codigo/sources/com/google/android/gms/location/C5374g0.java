package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.location.g0 */
/* loaded from: classes2.dex */
public final class C5374g0 extends AbstractC7138a {
    public static final Parcelable.Creator<C5374g0> CREATOR = new C5376h0();

    /* renamed from: a */
    private final long f10942a;

    /* renamed from: b */
    private final boolean f10943b;

    /* renamed from: c */
    private final WorkSource f10944c;

    /* renamed from: d */
    private final String f10945d;

    /* renamed from: e */
    private final int[] f10946e;

    /* renamed from: f */
    private final boolean f10947f;

    /* renamed from: r */
    private final String f10948r;

    /* renamed from: s */
    private final long f10949s;

    /* renamed from: t */
    private String f10950t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5374g0(long j10, boolean z10, WorkSource workSource, String str, int[] iArr, boolean z11, String str2, long j11, String str3) {
        this.f10942a = j10;
        this.f10943b = z10;
        this.f10944c = workSource;
        this.f10945d = str;
        this.f10946e = iArr;
        this.f10947f = z11;
        this.f10948r = str2;
        this.f10949s = j11;
        this.f10950t = str3;
    }

    /* renamed from: u1 */
    public final C5374g0 m13519u1(String str) {
        this.f10950t = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5276s.m13324j(parcel);
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21234z(parcel, 1, this.f10942a);
        C7140c.m21215g(parcel, 2, this.f10943b);
        C7140c.m21198E(parcel, 3, this.f10944c, i10, false);
        C7140c.m21200G(parcel, 4, this.f10945d, false);
        C7140c.m21230v(parcel, 5, this.f10946e, false);
        C7140c.m21215g(parcel, 6, this.f10947f);
        C7140c.m21200G(parcel, 7, this.f10948r, false);
        C7140c.m21234z(parcel, 8, this.f10949s);
        C7140c.m21200G(parcel, 9, this.f10950t, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
