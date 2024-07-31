package com.google.android.gms.location;

import com.google.android.gms.common.internal.C5276s;
import java.util.Comparator;

/* renamed from: com.google.android.gms.location.j0 */
/* loaded from: classes2.dex */
final class C5380j0 implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C5365c c5365c = (C5365c) obj;
        C5365c c5365c2 = (C5365c) obj2;
        C5276s.m13324j(c5365c);
        C5276s.m13324j(c5365c2);
        int m13508u1 = c5365c.m13508u1();
        int m13508u12 = c5365c2.m13508u1();
        if (m13508u1 != m13508u12) {
            return m13508u1 >= m13508u12 ? 1 : -1;
        }
        int m13509v1 = c5365c.m13509v1();
        int m13509v12 = c5365c2.m13509v1();
        if (m13509v1 == m13509v12) {
            return 0;
        }
        return m13509v1 < m13509v12 ? -1 : 1;
    }
}
