package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.internal.C5276s;
import ee.InterfaceC7183b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.mlkit.vision.common.internal.a */
/* loaded from: classes2.dex */
public class C6558a {

    /* renamed from: a */
    private final Map f14420a = new HashMap();

    /* renamed from: com.google.mlkit.vision.common.internal.a$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private final Class f14421a;

        /* renamed from: b */
        private final InterfaceC7183b f14422b;

        /* renamed from: c */
        private final int f14423c;

        /* renamed from: a */
        final int m18369a() {
            return this.f14423c;
        }

        /* renamed from: b */
        final InterfaceC7183b m18370b() {
            return this.f14422b;
        }

        /* renamed from: c */
        final Class m18371c() {
            return this.f14421a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6558a(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            Class m18371c = aVar.m18371c();
            if (!this.f14420a.containsKey(m18371c) || aVar.m18369a() >= ((Integer) C5276s.m13324j((Integer) hashMap.get(m18371c))).intValue()) {
                this.f14420a.put(m18371c, aVar.m18370b());
                hashMap.put(m18371c, Integer.valueOf(aVar.m18369a()));
            }
        }
    }
}
