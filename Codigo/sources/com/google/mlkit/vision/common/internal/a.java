package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.internal.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f13146a = new HashMap();

    /* renamed from: com.google.mlkit.vision.common.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0187a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f13147a;

        /* renamed from: b, reason: collision with root package name */
        private final ee.b f13148b;

        /* renamed from: c, reason: collision with root package name */
        private final int f13149c;

        final int a() {
            return this.f13149c;
        }

        final ee.b b() {
            return this.f13148b;
        }

        final Class c() {
            return this.f13147a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C0187a c0187a = (C0187a) it.next();
            Class c10 = c0187a.c();
            if (!this.f13146a.containsKey(c10) || c0187a.a() >= ((Integer) s.j((Integer) hashMap.get(c10))).intValue()) {
                this.f13146a.put(c10, c0187a.b());
                hashMap.put(c10, Integer.valueOf(c0187a.a()));
            }
        }
    }
}
