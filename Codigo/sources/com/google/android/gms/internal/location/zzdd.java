package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.location.LocationRequest;
import ea.a;
import ea.c;
import java.util.Iterator;
import java.util.List;
import la.v;

@Deprecated
/* loaded from: classes2.dex */
public final class zzdd extends a {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();
    LocationRequest zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdd(LocationRequest locationRequest, List list, boolean z10, boolean z11, String str, boolean z12, boolean z13, String str2, long j10) {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    v.a(workSource, dVar.f9530a, dVar.f9531b);
                }
            }
            aVar.m(workSource);
        }
        if (z10) {
            aVar.c(1);
        }
        if (z11) {
            aVar.l(2);
        }
        if (str != null) {
            aVar.k(str);
        } else if (str2 != null) {
            aVar.k(str2);
        }
        if (z12) {
            aVar.j(true);
        }
        if (z13) {
            aVar.i(true);
        }
        if (j10 != Long.MAX_VALUE) {
            aVar.e(j10);
        }
        this.zza = aVar.a();
    }

    @Deprecated
    public static zzdd zza(String str, LocationRequest locationRequest) {
        return new zzdd(locationRequest, null, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzdd) {
            return q.b(this.zza, ((zzdd) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.E(parcel, 1, this.zza, i10, false);
        c.b(parcel, a10);
    }
}
