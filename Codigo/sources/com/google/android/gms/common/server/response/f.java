package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends ea.a {
    public static final Parcelable.Creator<f> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    final int f9697a;

    /* renamed from: b, reason: collision with root package name */
    final String f9698b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f9699c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(int i10, String str, ArrayList arrayList) {
        this.f9697a = i10;
        this.f9698b = str;
        this.f9699c = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(String str, Map map) {
        ArrayList arrayList;
        this.f9697a = 1;
        this.f9698b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new g(str2, (a.C0150a) map.get(str2)));
            }
        }
        this.f9699c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f9697a);
        ea.c.G(parcel, 2, this.f9698b, false);
        ea.c.K(parcel, 3, this.f9699c, false);
        ea.c.b(parcel, a10);
    }
}
