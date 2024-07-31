package com.google.android.gms.location;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class j0 implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        com.google.android.gms.common.internal.s.j(cVar);
        com.google.android.gms.common.internal.s.j(cVar2);
        int u12 = cVar.u1();
        int u13 = cVar2.u1();
        if (u12 != u13) {
            return u12 >= u13 ? 1 : -1;
        }
        int v12 = cVar.v1();
        int v13 = cVar2.v1();
        if (v12 == v13) {
            return 0;
        }
        return v12 < v13 ? -1 : 1;
    }
}
