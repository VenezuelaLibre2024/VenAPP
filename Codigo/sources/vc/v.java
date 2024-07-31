package vc;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class v implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final a f28922a;

    /* renamed from: b, reason: collision with root package name */
    private final cd.i f28923b;

    /* renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f28924c;

    /* renamed from: d, reason: collision with root package name */
    private final sc.a f28925d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f28926e = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    interface a {
        void a(cd.i iVar, Thread thread, Throwable th2);
    }

    public v(a aVar, cd.i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, sc.a aVar2) {
        this.f28922a = aVar;
        this.f28923b = iVar;
        this.f28924c = uncaughtExceptionHandler;
        this.f28925d = aVar2;
    }

    private boolean b(Thread thread, Throwable th2) {
        if (thread == null) {
            sc.g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th2 == null) {
            sc.g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f28925d.b()) {
            return true;
        }
        sc.g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f28926e.get();
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
        this.f28926e.set(true);
        try {
            try {
                if (b(thread, th2)) {
                    this.f28922a.a(this.f28923b, thread, th2);
                } else {
                    sc.g.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e10) {
                sc.g.f().e("An error occurred in the uncaught exception handler", e10);
            }
        } finally {
            sc.g.f().b(r02);
            this.f28924c.uncaughtException(thread, th2);
            this.f28926e.set(false);
        }
    }
}
