package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h extends ea.a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    final int f9703a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f9704b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9705c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(int i10, ArrayList arrayList, String str) {
        this.f9703a = i10;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = (f) arrayList.get(i11);
            String str2 = fVar.f9698b;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) s.j(fVar.f9699c)).size();
            for (int i12 = 0; i12 < size2; i12++) {
                g gVar = (g) fVar.f9699c.get(i12);
                hashMap2.put(gVar.f9701b, gVar.f9702c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f9704b = hashMap;
        this.f9705c = (String) s.j(str);
        w1();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.f9704b.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map = (Map) this.f9704b.get(str);
            for (String str2 : map.keySet()) {
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map.get(str2));
            }
        }
        return sb2.toString();
    }

    public final String u1() {
        return this.f9705c;
    }

    public final Map v1(String str) {
        return (Map) this.f9704b.get(str);
    }

    public final void w1() {
        Iterator it = this.f9704b.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.f9704b.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((a.C0150a) map.get((String) it2.next())).H1(this);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f9703a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f9704b.keySet()) {
            arrayList.add(new f(str, (Map) this.f9704b.get(str)));
        }
        ea.c.K(parcel, 2, arrayList, false);
        ea.c.G(parcel, 3, this.f9705c, false);
        ea.c.b(parcel, a10);
    }
}
