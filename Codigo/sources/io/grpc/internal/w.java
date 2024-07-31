package io.grpc.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<a> f19183a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private volatile vi.p f19184b = vi.p.IDLE;

    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f19185a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f19186b;

        void a() {
            this.f19186b.execute(this.f19185a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(vi.p pVar) {
        eb.o.p(pVar, "newState");
        if (this.f19184b == pVar || this.f19184b == vi.p.SHUTDOWN) {
            return;
        }
        this.f19184b = pVar;
        if (this.f19183a.isEmpty()) {
            return;
        }
        ArrayList<a> arrayList = this.f19183a;
        this.f19183a = new ArrayList<>();
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}
