package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class z extends ea.a implements Iterable<String> {
    public static final Parcelable.Creator<z> CREATOR = new b0();

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f10875a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(Bundle bundle) {
        this.f10875a = bundle;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new c0(this);
    }

    public final String toString() {
        return this.f10875a.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Double v1(String str) {
        return Double.valueOf(this.f10875a.getDouble(str));
    }

    public final Bundle w1() {
        return new Bundle(this.f10875a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.j(parcel, 2, w1(), false);
        ea.c.b(parcel, a10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long x1(String str) {
        return Long.valueOf(this.f10875a.getLong(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object y1(String str) {
        return this.f10875a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String z1(String str) {
        return this.f10875a.getString(str);
    }

    public final int zza() {
        return this.f10875a.size();
    }
}
