package io.grpc.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p082eb.C7159o;
import vi.EnumC11938p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.grpc.internal.w */
/* loaded from: classes3.dex */
public final class C8907w {

    /* renamed from: a */
    private ArrayList<a> f20930a = new ArrayList<>();

    /* renamed from: b */
    private volatile EnumC11938p f20931b = EnumC11938p.IDLE;

    /* renamed from: io.grpc.internal.w$a */
    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a */
        final Runnable f20932a;

        /* renamed from: b */
        final Executor f20933b;

        /* renamed from: a */
        void m25874a() {
            this.f20933b.execute(this.f20932a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m25873a(EnumC11938p enumC11938p) {
        C7159o.m21313p(enumC11938p, "newState");
        if (this.f20931b == enumC11938p || this.f20931b == EnumC11938p.SHUTDOWN) {
            return;
        }
        this.f20931b = enumC11938p;
        if (this.f20930a.isEmpty()) {
            return;
        }
        ArrayList<a> arrayList = this.f20930a;
        this.f20930a = new ArrayList<>();
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m25874a();
        }
    }
}
