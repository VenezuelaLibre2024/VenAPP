package com.google.firebase.storage;

import ee.InterfaceC7183b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p063dc.InterfaceC6880b;
import p063dc.InterfaceC6882d;
import p180jc.InterfaceC9036b;
import p272oc.InterfaceC9835b;
import p485zb.C12867g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.storage.g */
/* loaded from: classes2.dex */
public class C6384g {

    /* renamed from: a */
    private final Map<String, C6382f> f13843a = new HashMap();

    /* renamed from: b */
    private final C12867g f13844b;

    /* renamed from: c */
    private final InterfaceC7183b<InterfaceC9835b> f13845c;

    /* renamed from: d */
    private final InterfaceC7183b<InterfaceC9036b> f13846d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6384g(C12867g c12867g, InterfaceC7183b<InterfaceC9835b> interfaceC7183b, InterfaceC7183b<InterfaceC9036b> interfaceC7183b2, @InterfaceC6880b Executor executor, @InterfaceC6882d Executor executor2) {
        this.f13844b = c12867g;
        this.f13845c = interfaceC7183b;
        this.f13846d = interfaceC7183b2;
        C6385g0.m17879d(executor, executor2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized C6382f m17877a(String str) {
        C6382f c6382f;
        c6382f = this.f13843a.get(str);
        if (c6382f == null) {
            c6382f = new C6382f(str, this.f13844b, this.f13845c, this.f13846d);
            this.f13843a.put(str, c6382f);
        }
        return c6382f;
    }
}
