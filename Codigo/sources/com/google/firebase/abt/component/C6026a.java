package com.google.firebase.abt.component;

import ac.C0097c;
import android.content.Context;
import cc.InterfaceC1940a;
import ee.InterfaceC7183b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.abt.component.a */
/* loaded from: classes.dex */
public class C6026a {

    /* renamed from: a */
    private final Map<String, C0097c> f12795a = new HashMap();

    /* renamed from: b */
    private final Context f12796b;

    /* renamed from: c */
    private final InterfaceC7183b<InterfaceC1940a> f12797c;

    /* JADX INFO: Access modifiers changed from: protected */
    public C6026a(Context context, InterfaceC7183b<InterfaceC1940a> interfaceC7183b) {
        this.f12796b = context;
        this.f12797c = interfaceC7183b;
    }

    /* renamed from: a */
    protected C0097c m16300a(String str) {
        return new C0097c(this.f12796b, this.f12797c, str);
    }

    /* renamed from: b */
    public synchronized C0097c m16301b(String str) {
        if (!this.f12795a.containsKey(str)) {
            this.f12795a.put(str, m16300a(str));
        }
        return this.f12795a.get(str);
    }
}
