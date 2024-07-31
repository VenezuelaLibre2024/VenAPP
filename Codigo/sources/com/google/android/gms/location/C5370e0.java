package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.location.e0 */
/* loaded from: classes2.dex */
public final class C5370e0 extends AbstractC7138a {
    public static final Parcelable.Creator<C5370e0> CREATOR = new C5372f0();

    /* renamed from: a */
    private final int f10938a;

    /* renamed from: b */
    private final int f10939b;

    /* renamed from: c */
    private final int f10940c;

    /* renamed from: d */
    private final int f10941d;

    public C5370e0(int i10, int i11, int i12, int i13) {
        C5276s.m13329o(i10 >= 0 && i10 <= 23, "Start hour must be in range [0, 23].");
        C5276s.m13329o(i11 >= 0 && i11 <= 59, "Start minute must be in range [0, 59].");
        C5276s.m13329o(i12 >= 0 && i12 <= 23, "End hour must be in range [0, 23].");
        C5276s.m13329o(i13 >= 0 && i13 <= 59, "End minute must be in range [0, 59].");
        C5276s.m13329o(((i10 + i11) + i12) + i13 > 0, "Parameters can't be all 0.");
        this.f10938a = i10;
        this.f10939b = i11;
        this.f10940c = i12;
        this.f10941d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5370e0)) {
            return false;
        }
        C5370e0 c5370e0 = (C5370e0) obj;
        return this.f10938a == c5370e0.f10938a && this.f10939b == c5370e0.f10939b && this.f10940c == c5370e0.f10940c && this.f10941d == c5370e0.f10941d;
    }

    public final int hashCode() {
        return C5270q.m13305c(Integer.valueOf(this.f10938a), Integer.valueOf(this.f10939b), Integer.valueOf(this.f10940c), Integer.valueOf(this.f10941d));
    }

    public final String toString() {
        return "UserPreferredSleepWindow [startHour=" + this.f10938a + ", startMinute=" + this.f10939b + ", endHour=" + this.f10940c + ", endMinute=" + this.f10941d + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5276s.m13324j(parcel);
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f10938a);
        C7140c.m21229u(parcel, 2, this.f10939b);
        C7140c.m21229u(parcel, 3, this.f10940c);
        C7140c.m21229u(parcel, 4, this.f10941d);
        C7140c.m21210b(parcel, m21209a);
    }
}
