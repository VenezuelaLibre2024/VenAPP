package com.google.mlkit.common.sdkinternal;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final ee.b f13020a;

    public d(ee.b bVar) {
        this.f13020a = bVar;
    }

    public Executor a(Executor executor) {
        return executor != null ? executor : (Executor) this.f13020a.get();
    }
}
