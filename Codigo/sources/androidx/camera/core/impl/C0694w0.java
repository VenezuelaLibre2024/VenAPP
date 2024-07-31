package androidx.camera.core.impl;

import android.view.Surface;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.concurrent.futures.C0742c;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
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
import p002a0.C0009f;
import p002a0.InterfaceC0006c;

/* renamed from: androidx.camera.core.impl.w0 */
/* loaded from: classes.dex */
public final class C0694w0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.impl.w0$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0006c<List<Surface>> {

        /* renamed from: a */
        final /* synthetic */ boolean f3006a;

        /* renamed from: b */
        final /* synthetic */ C0742c.a f3007b;

        /* renamed from: c */
        final /* synthetic */ ScheduledFuture f3008c;

        a(boolean z10, C0742c.a aVar, ScheduledFuture scheduledFuture) {
            this.f3006a = z10;
            this.f3007b = aVar;
            this.f3008c = scheduledFuture;
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
            this.f3007b.m3756c(Collections.unmodifiableList(Collections.emptyList()));
            this.f3008c.cancel(true);
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Surface> list) {
            ArrayList arrayList = new ArrayList(list);
            if (this.f3006a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f3007b.m3756c(arrayList);
            this.f3008c.cancel(true);
        }
    }

    /* renamed from: e */
    public static void m3367e(List<AbstractC0661r0> list) {
        Iterator<AbstractC0661r0> it = list.iterator();
        while (it.hasNext()) {
            it.next().m3224e();
        }
    }

    /* renamed from: f */
    public static void m3368f(List<AbstractC0661r0> list) {
        if (list.isEmpty()) {
            return;
        }
        int i10 = 0;
        do {
            try {
                list.get(i10).m3231l();
                i10++;
            } catch (AbstractC0661r0.a e10) {
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    list.get(i11).m3224e();
                }
                throw e10;
            }
        } while (i10 < list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m3369g(InterfaceFutureC5920f interfaceFutureC5920f, C0742c.a aVar, long j10) {
        if (interfaceFutureC5920f.isDone()) {
            return;
        }
        aVar.m3758f(new TimeoutException("Cannot complete surfaceList within " + j10));
        interfaceFutureC5920f.cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m3370h(Executor executor, final InterfaceFutureC5920f interfaceFutureC5920f, final C0742c.a aVar, final long j10) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.impl.s0
            @Override // java.lang.Runnable
            public final void run() {
                C0694w0.m3369g(InterfaceFutureC5920f.this, aVar, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ Object m3372j(List list, ScheduledExecutorService scheduledExecutorService, final Executor executor, final long j10, boolean z10, final C0742c.a aVar) {
        final InterfaceFutureC5920f m28n = C0009f.m28n(list);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: androidx.camera.core.impl.u0
            @Override // java.lang.Runnable
            public final void run() {
                C0694w0.m3370h(executor, m28n, aVar, j10);
            }
        }, j10, TimeUnit.MILLISECONDS);
        aVar.m3754a(new Runnable() { // from class: androidx.camera.core.impl.v0
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceFutureC5920f.this.cancel(true);
            }
        }, executor);
        C0009f.m16b(m28n, new a(z10, aVar, schedule), executor);
        return "surfaceList";
    }

    /* renamed from: k */
    public static InterfaceFutureC5920f<List<Surface>> m3373k(Collection<AbstractC0661r0> collection, final boolean z10, final long j10, final Executor executor, final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        Iterator<AbstractC0661r0> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(C0009f.m24j(it.next().m3229j()));
        }
        return C0742c.m3752a(new C0742c.c() { // from class: androidx.camera.core.impl.t0
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar) {
                Object m3372j;
                m3372j = C0694w0.m3372j(arrayList, scheduledExecutorService, executor, j10, z10, aVar);
                return m3372j;
            }
        });
    }
}
