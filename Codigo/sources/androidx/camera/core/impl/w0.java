package androidx.camera.core.impl;

import android.view.Surface;
import androidx.camera.core.impl.r0;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a0.c<List<Surface>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2662a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f2663b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ScheduledFuture f2664c;

        a(boolean z10, c.a aVar, ScheduledFuture scheduledFuture) {
            this.f2662a = z10;
            this.f2663b = aVar;
            this.f2664c = scheduledFuture;
        }

        @Override // a0.c
        public void a(Throwable th2) {
            this.f2663b.c(Collections.unmodifiableList(Collections.emptyList()));
            this.f2664c.cancel(true);
        }

        @Override // a0.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Surface> list) {
            ArrayList arrayList = new ArrayList(list);
            if (this.f2662a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f2663b.c(arrayList);
            this.f2664c.cancel(true);
        }
    }

    public static void e(List<r0> list) {
        Iterator<r0> it = list.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public static void f(List<r0> list) {
        if (list.isEmpty()) {
            return;
        }
        int i10 = 0;
        do {
            try {
                list.get(i10).l();
                i10++;
            } catch (r0.a e10) {
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    list.get(i11).e();
                }
                throw e10;
            }
        } while (i10 < list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(com.google.common.util.concurrent.f fVar, c.a aVar, long j10) {
        if (fVar.isDone()) {
            return;
        }
        aVar.f(new TimeoutException("Cannot complete surfaceList within " + j10));
        fVar.cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Executor executor, final com.google.common.util.concurrent.f fVar, final c.a aVar, final long j10) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.impl.s0
            @Override // java.lang.Runnable
            public final void run() {
                w0.g(com.google.common.util.concurrent.f.this, aVar, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object j(List list, ScheduledExecutorService scheduledExecutorService, final Executor executor, final long j10, boolean z10, final c.a aVar) {
        final com.google.common.util.concurrent.f n10 = a0.f.n(list);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: androidx.camera.core.impl.u0
            @Override // java.lang.Runnable
            public final void run() {
                w0.h(executor, n10, aVar, j10);
            }
        }, j10, TimeUnit.MILLISECONDS);
        aVar.a(new Runnable() { // from class: androidx.camera.core.impl.v0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.common.util.concurrent.f.this.cancel(true);
            }
        }, executor);
        a0.f.b(n10, new a(z10, aVar, schedule), executor);
        return "surfaceList";
    }

    public static com.google.common.util.concurrent.f<List<Surface>> k(Collection<r0> collection, final boolean z10, final long j10, final Executor executor, final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        Iterator<r0> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(a0.f.j(it.next().j()));
        }
        return androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: androidx.camera.core.impl.t0
            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public final Object a(c.a aVar) {
                Object j11;
                j11 = w0.j(arrayList, scheduledExecutorService, executor, j10, z10, aVar);
                return j11;
            }
        });
    }
}
