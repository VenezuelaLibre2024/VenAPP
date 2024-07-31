package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public final class Scope extends ea.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    final int f9289a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9290b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i10, String str) {
        com.google.android.gms.common.internal.s.g(str, "scopeUri must not be null or empty");
        this.f9289a = i10;
        this.f9290b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f9290b.equals(((Scope) obj).f9290b);
        }
        return false;
    }

    public int hashCode() {
        return this.f9290b.hashCode();
    }

    public String toString() {
        return this.f9290b;
    }

    public String u1() {
        return this.f9290b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f9289a);
        ea.c.G(parcel, 2, u1(), false);
        ea.c.b(parcel, a10);
    }
}
