package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.measurement.internal.z */
/* loaded from: classes2.dex */
public final class C5742z extends AbstractC7138a implements Iterable<String> {
    public static final Parcelable.Creator<C5742z> CREATOR = new C5435b0();

    /* renamed from: a */
    private final Bundle f12090a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5742z(Bundle bundle) {
        this.f12090a = bundle;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C5448c0(this);
    }

    public final String toString() {
        return this.f12090a.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v1 */
    public final Double m14602v1(String str) {
        return Double.valueOf(this.f12090a.getDouble(str));
    }

    /* renamed from: w1 */
    public final Bundle m14603w1() {
        return new Bundle(this.f12090a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21218j(parcel, 2, m14603w1(), false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x1 */
    public final Long m14604x1(String str) {
        return Long.valueOf(this.f12090a.getLong(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y1 */
    public final Object m14605y1(String str) {
        return this.f12090a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z1 */
    public final String m14606z1(String str) {
        return this.f12090a.getString(str);
    }

    public final int zza() {
        return this.f12090a.size();
    }
}
