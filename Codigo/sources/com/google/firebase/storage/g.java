package com.google.firebase.storage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a */
    private final Map<String, f> f12611a = new HashMap();

    /* renamed from: b */
    private final zb.g f12612b;

    /* renamed from: c */
    private final ee.b<oc.b> f12613c;

    /* renamed from: d */
    private final ee.b<jc.b> f12614d;

    public g(zb.g gVar, ee.b<oc.b> bVar, ee.b<jc.b> bVar2, @dc.b Executor executor, @dc.d Executor executor2) {
        this.f12612b = gVar;
        this.f12613c = bVar;
        this.f12614d = bVar2;
        g0.d(executor, executor2);
    }

    public synchronized f a(String str) {
        f fVar;
        fVar = this.f12611a.get(str);
        if (fVar == null) {
            fVar = new f(str, this.f12612b, this.f12613c, this.f12614d);
            this.f12611a.put(str, fVar);
        }
        return fVar;
    }
}
