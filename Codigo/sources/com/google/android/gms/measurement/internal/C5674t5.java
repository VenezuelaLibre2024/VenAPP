package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.C5276s;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t5 */
/* loaded from: classes2.dex */
public final class C5674t5 extends Thread {

    /* renamed from: a */
    private final Object f11842a;

    /* renamed from: b */
    private final BlockingQueue<C5687u5<?>> f11843b;

    /* renamed from: c */
    private boolean f11844c = false;

    /* renamed from: d */
    private final /* synthetic */ C5635q5 f11845d;

    public C5674t5(C5635q5 c5635q5, String str, BlockingQueue<C5687u5<?>> blockingQueue) {
        this.f11845d = c5635q5;
        C5276s.m13324j(str);
        C5276s.m13324j(blockingQueue);
        this.f11842a = new Object();
        this.f11843b = blockingQueue;
        setName(str);
    }

    /* renamed from: b */
    private final void m14342b(InterruptedException interruptedException) {
        this.f11845d.zzj().m14187G().m14219b(getName() + " was interrupted", interruptedException);
    }

    /* renamed from: c */
    private final void m14343c() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        C5674t5 c5674t5;
        C5674t5 c5674t52;
        obj = this.f11845d.f11734i;
        synchronized (obj) {
            if (!this.f11844c) {
                semaphore = this.f11845d.f11735j;
                semaphore.release();
                obj2 = this.f11845d.f11734i;
                obj2.notifyAll();
                c5674t5 = this.f11845d.f11728c;
                if (this == c5674t5) {
                    this.f11845d.f11728c = null;
                } else {
                    c5674t52 = this.f11845d.f11729d;
                    if (this == c5674t52) {
                        this.f11845d.f11729d = null;
                    } else {
                        this.f11845d.zzj().m14182B().m14218a("Current scheduler thread is neither worker nor network");
                    }
                }
                this.f11844c = true;
            }
        }
    }

    /* renamed from: a */
    public final void m14344a() {
        synchronized (this.f11842a) {
            this.f11842a.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z10;
        boolean z11 = false;
        while (!z11) {
            try {
                semaphore = this.f11845d.f11735j;
                semaphore.acquire();
                z11 = true;
            } catch (InterruptedException e10) {
                m14342b(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C5687u5<?> poll = this.f11843b.poll();
                if (poll != null) {
                    Process.setThreadPriority(poll.f11869b ? threadPriority : 10);
                    poll.run();
                } else {
                    synchronized (this.f11842a) {
                        if (this.f11843b.peek() == null) {
                            z10 = this.f11845d.f11736k;
                            if (!z10) {
                                try {
                                    this.f11842a.wait(30000L);
                                } catch (InterruptedException e11) {
                                    m14342b(e11);
                                }
                            }
                        }
                    }
                    obj = this.f11845d.f11734i;
                    synchronized (obj) {
                        if (this.f11843b.peek() == null) {
                            m14343c();
                            return;
                        }
                    }
                }
            }
        } finally {
            m14343c();
        }
    }
}
