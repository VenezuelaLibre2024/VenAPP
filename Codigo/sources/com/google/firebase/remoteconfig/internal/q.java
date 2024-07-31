package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final Set<ze.c> f12512a;

    /* renamed from: b, reason: collision with root package name */
    private final t f12513b;

    /* renamed from: c, reason: collision with root package name */
    private final m f12514c;

    /* renamed from: d, reason: collision with root package name */
    private final zb.g f12515d;

    /* renamed from: e, reason: collision with root package name */
    private final fe.f f12516e;

    /* renamed from: f, reason: collision with root package name */
    private final f f12517f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f12518g;

    /* renamed from: h, reason: collision with root package name */
    private final String f12519h;

    /* renamed from: i, reason: collision with root package name */
    private final p f12520i;

    /* renamed from: j, reason: collision with root package name */
    private final ScheduledExecutorService f12521j;

    public q(zb.g gVar, fe.f fVar, m mVar, f fVar2, Context context, String str, p pVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f12512a = linkedHashSet;
        this.f12513b = new t(gVar, fVar, mVar, fVar2, context, str, linkedHashSet, pVar, scheduledExecutorService);
        this.f12515d = gVar;
        this.f12514c = mVar;
        this.f12516e = fVar;
        this.f12517f = fVar2;
        this.f12518g = context;
        this.f12519h = str;
        this.f12520i = pVar;
        this.f12521j = scheduledExecutorService;
    }

    private synchronized void a() {
        if (!this.f12512a.isEmpty()) {
            this.f12513b.C();
        }
    }

    public synchronized void b(boolean z10) {
        this.f12513b.z(z10);
        if (!z10) {
            a();
        }
    }
}
