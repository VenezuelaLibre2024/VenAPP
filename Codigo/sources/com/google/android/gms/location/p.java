package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class p extends ea.a {
    public static final Parcelable.Creator<p> CREATOR = new z0();

    /* renamed from: a, reason: collision with root package name */
    private final List f9869a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9870b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9871c;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f9872a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private boolean f9873b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9874c = false;

        public a a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f9872a.add(locationRequest);
            }
            return this;
        }

        public p b() {
            return new p(this.f9872a, this.f9873b, this.f9874c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(List list, boolean z10, boolean z11) {
        this.f9869a = list;
        this.f9870b = z10;
        this.f9871c = z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.K(parcel, 1, Collections.unmodifiableList(this.f9869a), false);
        ea.c.g(parcel, 2, this.f9870b);
        ea.c.g(parcel, 3, this.f9871c);
        ea.c.b(parcel, a10);
    }
}
