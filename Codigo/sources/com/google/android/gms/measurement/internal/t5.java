package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t5 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final Object f10644a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<u5<?>> f10645b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10646c = false;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ q5 f10647d;

    public t5(q5 q5Var, String str, BlockingQueue<u5<?>> blockingQueue) {
        this.f10647d = q5Var;
        com.google.android.gms.common.internal.s.j(str);
        com.google.android.gms.common.internal.s.j(blockingQueue);
        this.f10644a = new Object();
        this.f10645b = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        this.f10647d.zzj().G().b(getName() + " was interrupted", interruptedException);
    }

    private final void c() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        t5 t5Var;
        t5 t5Var2;
        obj = this.f10647d.f10547i;
        synchronized (obj) {
            if (!this.f10646c) {
                semaphore = this.f10647d.f10548j;
                semaphore.release();
                obj2 = this.f10647d.f10547i;
                obj2.notifyAll();
                t5Var = this.f10647d.f10541c;
                if (this == t5Var) {
                    this.f10647d.f10541c = null;
                } else {
                    t5Var2 = this.f10647d.f10542d;
                    if (this == t5Var2) {
                        this.f10647d.f10542d = null;
                    } else {
                        this.f10647d.zzj().B().a("Current scheduler thread is neither worker nor network");
                    }
                }
                this.f10646c = true;
            }
        }
    }

    public final void a() {
        synchronized (this.f10644a) {
            this.f10644a.notifyAll();
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
                semaphore = this.f10647d.f10548j;
                semaphore.acquire();
                z11 = true;
            } catch (InterruptedException e10) {
                b(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                u5<?> poll = this.f10645b.poll();
                if (poll != null) {
                    Process.setThreadPriority(poll.f10671b ? threadPriority : 10);
                    poll.run();
                } else {
                    synchronized (this.f10644a) {
                        if (this.f10645b.peek() == null) {
                            z10 = this.f10647d.f10549k;
                            if (!z10) {
                                try {
                                    this.f10644a.wait(30000L);
                                } catch (InterruptedException e11) {
                                    b(e11);
                                }
                            }
                        }
                    }
                    obj = this.f10647d.f10547i;
                    synchronized (obj) {
                        if (this.f10645b.peek() == null) {
                            c();
                            return;
                        }
                    }
                }
            }
        } finally {
            c();
        }
    }
}
