package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import p106fe.InterfaceC7337f;
import p485zb.C12867g;
import p488ze.InterfaceC13006c;

/* renamed from: com.google.firebase.remoteconfig.internal.q */
/* loaded from: classes2.dex */
public class C6361q {

    /* renamed from: a */
    private final Set<InterfaceC13006c> f13744a;

    /* renamed from: b */
    private final C6364t f13745b;

    /* renamed from: c */
    private final C6357m f13746c;

    /* renamed from: d */
    private final C12867g f13747d;

    /* renamed from: e */
    private final InterfaceC7337f f13748e;

    /* renamed from: f */
    private final C6350f f13749f;

    /* renamed from: g */
    private final Context f13750g;

    /* renamed from: h */
    private final String f13751h;

    /* renamed from: i */
    private final C6360p f13752i;

    /* renamed from: j */
    private final ScheduledExecutorService f13753j;

    public C6361q(C12867g c12867g, InterfaceC7337f interfaceC7337f, C6357m c6357m, C6350f c6350f, Context context, String str, C6360p c6360p, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f13744a = linkedHashSet;
        this.f13745b = new C6364t(c12867g, interfaceC7337f, c6357m, c6350f, context, str, linkedHashSet, c6360p, scheduledExecutorService);
        this.f13747d = c12867g;
        this.f13746c = c6357m;
        this.f13748e = interfaceC7337f;
        this.f13749f = c6350f;
        this.f13750g = context;
        this.f13751h = str;
        this.f13752i = c6360p;
        this.f13753j = scheduledExecutorService;
    }

    /* renamed from: a */
    private synchronized void m17712a() {
        if (!this.f13744a.isEmpty()) {
            this.f13745b.m17738C();
        }
    }

    /* renamed from: b */
    public synchronized void m17713b(boolean z10) {
        this.f13745b.m17743z(z10);
        if (!z10) {
            m17712a();
        }
    }
}
