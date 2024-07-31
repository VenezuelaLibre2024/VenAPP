package vc;

import cd.InterfaceC1952i;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import sc.C10889g;
import sc.InterfaceC10883a;

/* renamed from: vc.v */
/* loaded from: classes.dex */
class C11865v implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final a f31356a;

    /* renamed from: b */
    private final InterfaceC1952i f31357b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f31358c;

    /* renamed from: d */
    private final InterfaceC10883a f31359d;

    /* renamed from: e */
    private final AtomicBoolean f31360e = new AtomicBoolean(false);

    /* renamed from: vc.v$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        void mo37832a(InterfaceC1952i interfaceC1952i, Thread thread, Throwable th2);
    }

    public C11865v(a aVar, InterfaceC1952i interfaceC1952i, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC10883a interfaceC10883a) {
        this.f31356a = aVar;
        this.f31357b = interfaceC1952i;
        this.f31358c = uncaughtExceptionHandler;
        this.f31359d = interfaceC10883a;
    }

    /* renamed from: b */
    private boolean m37927b(Thread thread, Throwable th2) {
        if (thread == null) {
            C10889g.m33216f().m33219d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th2 == null) {
            C10889g.m33216f().m33219d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f31359d.mo33193b()) {
            return true;
        }
        C10889g.m33216f().m33217b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m37928a() {
        return this.f31360e.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r2v3, types: [sc.g] */
    /* JADX WARN: Type inference failed for: r3v1, types: [sc.g] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        ?? r02 = "Completed exception processing. Invoking default exception handler.";
        this.f31360e.set(true);
        try {
            try {
                if (m37927b(thread, th2)) {
                    this.f31356a.mo37832a(this.f31357b, thread, th2);
                } else {
                    C10889g.m33216f().m33217b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e10) {
                C10889g.m33216f().m33220e("An error occurred in the uncaught exception handler", e10);
            }
        } finally {
            C10889g.m33216f().m33217b(r02);
            this.f31358c.uncaughtException(thread, th2);
            this.f31360e.set(false);
        }
    }
}
