package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.common.server.response.AbstractC5300a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.common.server.response.h */
/* loaded from: classes.dex */
public final class C5307h extends AbstractC7138a {
    public static final Parcelable.Creator<C5307h> CREATOR = new C5308i();

    /* renamed from: a */
    final int f10818a;

    /* renamed from: b */
    private final HashMap f10819b;

    /* renamed from: c */
    private final String f10820c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5307h(int i10, ArrayList arrayList, String str) {
        this.f10818a = i10;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C5305f c5305f = (C5305f) arrayList.get(i11);
            String str2 = c5305f.f10813b;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) C5276s.m13324j(c5305f.f10814c)).size();
            for (int i12 = 0; i12 < size2; i12++) {
                C5306g c5306g = (C5306g) c5305f.f10814c.get(i12);
                hashMap2.put(c5306g.f10816b, c5306g.f10817c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f10819b = hashMap;
        this.f10820c = (String) C5276s.m13324j(str);
        m13394w1();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.f10819b.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map = (Map) this.f10819b.get(str);
            for (String str2 : map.keySet()) {
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map.get(str2));
            }
        }
        return sb2.toString();
    }

    /* renamed from: u1 */
    public final String m13392u1() {
        return this.f10820c;
    }

    /* renamed from: v1 */
    public final Map m13393v1(String str) {
        return (Map) this.f10819b.get(str);
    }

    /* renamed from: w1 */
    public final void m13394w1() {
        Iterator it = this.f10819b.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.f10819b.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((AbstractC5300a.a) map.get((String) it2.next())).m13383H1(this);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f10818a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f10819b.keySet()) {
            arrayList.add(new C5305f(str, (Map) this.f10819b.get(str)));
        }
        C7140c.m21204K(parcel, 2, arrayList, false);
        C7140c.m21200G(parcel, 3, this.f10820c, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
