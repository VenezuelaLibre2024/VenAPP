package com.google.firebase.abt.component;

import ac.c;
import android.content.Context;
import ee.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, c> f11580a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f11581b;

    /* renamed from: c, reason: collision with root package name */
    private final b<cc.a> f11582c;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Context context, b<cc.a> bVar) {
        this.f11581b = context;
        this.f11582c = bVar;
    }

    protected c a(String str) {
        return new c(this.f11581b, this.f11582c, str);
    }

    public synchronized c b(String str) {
        if (!this.f11580a.containsKey(str)) {
            this.f11580a.put(str, a(str));
        }
        return this.f11580a.get(str);
    }
}
