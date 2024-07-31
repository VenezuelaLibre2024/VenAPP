package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.AbstractC5300a;
import java.util.ArrayList;
import java.util.Map;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.common.server.response.f */
/* loaded from: classes.dex */
public final class C5305f extends AbstractC7138a {
    public static final Parcelable.Creator<C5305f> CREATOR = new C5309j();

    /* renamed from: a */
    final int f10812a;

    /* renamed from: b */
    final String f10813b;

    /* renamed from: c */
    final ArrayList f10814c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5305f(int i10, String str, ArrayList arrayList) {
        this.f10812a = i10;
        this.f10813b = str;
        this.f10814c = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5305f(String str, Map map) {
        ArrayList arrayList;
        this.f10812a = 1;
        this.f10813b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new C5306g(str2, (AbstractC5300a.a) map.get(str2)));
            }
        }
        this.f10814c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f10812a);
        C7140c.m21200G(parcel, 2, this.f10813b, false);
        C7140c.m21204K(parcel, 3, this.f10814c, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
