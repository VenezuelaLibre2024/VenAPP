package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzdh;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class k extends ea.a {
    public static final Parcelable.Creator<k> CREATOR = new n0();

    /* renamed from: a, reason: collision with root package name */
    private final List f9836a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9837b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9838c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9839d;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f9840a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private int f9841b = 5;

        /* renamed from: c, reason: collision with root package name */
        private String f9842c = "";

        public a a(h hVar) {
            com.google.android.gms.common.internal.s.k(hVar, "geofence can't be null.");
            com.google.android.gms.common.internal.s.b(hVar instanceof zzdh, "Geofence must be created using Geofence.Builder.");
            this.f9840a.add((zzdh) hVar);
            return this;
        }

        public a b(List<h> list) {
            if (list != null && !list.isEmpty()) {
                for (h hVar : list) {
                    if (hVar != null) {
                        a(hVar);
                    }
                }
            }
            return this;
        }

        public k c() {
            com.google.android.gms.common.internal.s.b(!this.f9840a.isEmpty(), "No geofence has been added to this request.");
            return new k(this.f9840a, this.f9841b, this.f9842c, null);
        }

        public a d(int i10) {
            this.f9841b = i10 & 7;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(List list, int i10, String str, String str2) {
        this.f9836a = list;
        this.f9837b = i10;
        this.f9838c = str;
        this.f9839d = str2;
    }

    public String toString() {
        return "GeofencingRequest[geofences=" + this.f9836a + ", initialTrigger=" + this.f9837b + ", tag=" + this.f9838c + ", attributionTag=" + this.f9839d + "]";
    }

    public int u1() {
        return this.f9837b;
    }

    public final k v1(String str) {
        return new k(this.f9836a, this.f9837b, this.f9838c, str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.K(parcel, 1, this.f9836a, false);
        ea.c.u(parcel, 2, u1());
        ea.c.G(parcel, 3, this.f9838c, false);
        ea.c.G(parcel, 4, this.f9839d, false);
        ea.c.b(parcel, a10);
    }
}
