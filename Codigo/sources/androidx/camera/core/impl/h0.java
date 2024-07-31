package androidx.camera.core.impl;

import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.h0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import x.a;

/* loaded from: classes.dex */
public final class h0 implements a.InterfaceC0488a {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f2493a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    private final Object f2494b;

    /* renamed from: c, reason: collision with root package name */
    private int f2495c;

    /* renamed from: d, reason: collision with root package name */
    private final x.a f2496d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<w.i, a> f2497e;

    /* renamed from: f, reason: collision with root package name */
    private int f2498f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private c0.a f2499a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f2500b;

        /* renamed from: c, reason: collision with root package name */
        private final b f2501c;

        /* renamed from: d, reason: collision with root package name */
        private final c f2502d;

        a(c0.a aVar, Executor executor, b bVar, c cVar) {
            this.f2499a = aVar;
            this.f2500b = executor;
            this.f2501c = bVar;
            this.f2502d = cVar;
        }

        c0.a a() {
            return this.f2499a;
        }

        void b() {
            try {
                Executor executor = this.f2500b;
                final b bVar = this.f2501c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        h0.b.this.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                w.o0.d("CameraStateRegistry", "Unable to notify camera to configure.", e10);
            }
        }

        void c() {
            try {
                Executor executor = this.f2500b;
                final c cVar = this.f2502d;
                Objects.requireNonNull(cVar);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        h0.c.this.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                w.o0.d("CameraStateRegistry", "Unable to notify camera to open.", e10);
            }
        }

        c0.a d(c0.a aVar) {
            c0.a aVar2 = this.f2499a;
            this.f2499a = aVar;
            return aVar2;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    public h0(x.a aVar, int i10) {
        Object obj = new Object();
        this.f2494b = obj;
        this.f2497e = new HashMap();
        this.f2495c = i10;
        synchronized (obj) {
            this.f2496d = aVar;
            this.f2498f = this.f2495c;
        }
    }

    private a b(String str) {
        for (w.i iVar : this.f2497e.keySet()) {
            if (str.equals(((b0) iVar.b()).b())) {
                return this.f2497e.get(iVar);
            }
        }
        return null;
    }

    private static boolean d(c0.a aVar) {
        return aVar != null && aVar.h();
    }

    private void f() {
        if (w.o0.f("CameraStateRegistry")) {
            this.f2493a.setLength(0);
            this.f2493a.append("Recalculating open cameras:\n");
            this.f2493a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f2493a.append("-------------------------------------------------------------------\n");
        }
        int i10 = 0;
        for (Map.Entry<w.i, a> entry : this.f2497e.entrySet()) {
            if (w.o0.f("CameraStateRegistry")) {
                this.f2493a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().a() != null ? entry.getValue().a().toString() : "UNKNOWN"));
            }
            if (d(entry.getValue().a())) {
                i10++;
            }
        }
        if (w.o0.f("CameraStateRegistry")) {
            this.f2493a.append("-------------------------------------------------------------------\n");
            this.f2493a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i10), Integer.valueOf(this.f2495c)));
            w.o0.a("CameraStateRegistry", this.f2493a.toString());
        }
        this.f2498f = Math.max(this.f2495c - i10, 0);
    }

    private c0.a j(w.i iVar) {
        a remove = this.f2497e.remove(iVar);
        if (remove == null) {
            return null;
        }
        f();
        return remove.a();
    }

    private c0.a k(w.i iVar, c0.a aVar) {
        c0.a d10 = ((a) androidx.core.util.h.l(this.f2497e.get(iVar), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).d(aVar);
        c0.a aVar2 = c0.a.OPENING;
        if (aVar == aVar2) {
            androidx.core.util.h.n(d(aVar) || d10 == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (d10 != aVar) {
            f();
        }
        return d10;
    }

    @Override // x.a.InterfaceC0488a
    public void a(int i10, int i11) {
        synchronized (this.f2494b) {
            boolean z10 = true;
            this.f2495c = i11 == 2 ? 2 : 1;
            boolean z11 = i10 != 2 && i11 == 2;
            if (i10 != 2 || i11 == 2) {
                z10 = false;
            }
            if (z11 || z10) {
                f();
            }
        }
    }

    public boolean c() {
        synchronized (this.f2494b) {
            Iterator<Map.Entry<w.i, a>> it = this.f2497e.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().a() == c0.a.CLOSING) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(w.i r7, androidx.camera.core.impl.c0.a r8, boolean r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2494b
            monitor-enter(r0)
            int r1 = r6.f2498f     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.c0$a r2 = androidx.camera.core.impl.c0.a.RELEASED     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r2) goto Le
            androidx.camera.core.impl.c0$a r2 = r6.j(r7)     // Catch: java.lang.Throwable -> Lbc
            goto L12
        Le:
            androidx.camera.core.impl.c0$a r2 = r6.k(r7, r8)     // Catch: java.lang.Throwable -> Lbc
        L12:
            if (r2 != r8) goto L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            return
        L16:
            x.a r2 = r6.f2496d     // Catch: java.lang.Throwable -> Lbc
            int r2 = r2.b()     // Catch: java.lang.Throwable -> Lbc
            r3 = 2
            r4 = 0
            if (r2 != r3) goto L3b
            androidx.camera.core.impl.c0$a r2 = androidx.camera.core.impl.c0.a.CONFIGURED     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r2) goto L3b
            w.o r2 = r7.b()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.b0 r2 = (androidx.camera.core.impl.b0) r2     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = r2.b()     // Catch: java.lang.Throwable -> Lbc
            x.a r3 = r6.f2496d     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = r3.a(r2)     // Catch: java.lang.Throwable -> Lbc
            if (r2 == 0) goto L3b
            androidx.camera.core.impl.h0$a r2 = r6.b(r2)     // Catch: java.lang.Throwable -> Lbc
            goto L3c
        L3b:
            r2 = r4
        L3c:
            r3 = 1
            if (r1 >= r3) goto L7c
            int r1 = r6.f2498f     // Catch: java.lang.Throwable -> Lbc
            if (r1 <= 0) goto L7c
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lbc
            r4.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map<w.i, androidx.camera.core.impl.h0$a> r8 = r6.f2497e     // Catch: java.lang.Throwable -> Lbc
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> Lbc
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lbc
        L52:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto L94
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.h0$a r3 = (androidx.camera.core.impl.h0.a) r3     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.c0$a r3 = r3.a()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.c0$a r5 = androidx.camera.core.impl.c0.a.PENDING_OPEN     // Catch: java.lang.Throwable -> Lbc
            if (r3 != r5) goto L52
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> Lbc
            w.i r3 = (w.i) r3     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.h0$a r1 = (androidx.camera.core.impl.h0.a) r1     // Catch: java.lang.Throwable -> Lbc
            r4.put(r3, r1)     // Catch: java.lang.Throwable -> Lbc
            goto L52
        L7c:
            androidx.camera.core.impl.c0$a r1 = androidx.camera.core.impl.c0.a.PENDING_OPEN     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r1) goto L94
            int r8 = r6.f2498f     // Catch: java.lang.Throwable -> Lbc
            if (r8 <= 0) goto L94
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lbc
            r4.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map<w.i, androidx.camera.core.impl.h0$a> r8 = r6.f2497e     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.h0$a r8 = (androidx.camera.core.impl.h0.a) r8     // Catch: java.lang.Throwable -> Lbc
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> Lbc
        L94:
            if (r4 == 0) goto L9b
            if (r9 != 0) goto L9b
            r4.remove(r7)     // Catch: java.lang.Throwable -> Lbc
        L9b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            if (r4 == 0) goto Lb6
            java.util.Collection r7 = r4.values()
            java.util.Iterator r7 = r7.iterator()
        La6:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb6
            java.lang.Object r8 = r7.next()
            androidx.camera.core.impl.h0$a r8 = (androidx.camera.core.impl.h0.a) r8
            r8.c()
            goto La6
        Lb6:
            if (r2 == 0) goto Lbb
            r2.b()
        Lbb:
            return
        Lbc:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.h0.e(w.i, androidx.camera.core.impl.c0$a, boolean):void");
    }

    public void g(w.i iVar, Executor executor, b bVar, c cVar) {
        synchronized (this.f2494b) {
            androidx.core.util.h.n(!this.f2497e.containsKey(iVar), "Camera is already registered: " + iVar);
            this.f2497e.put(iVar, new a(null, executor, bVar, cVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0052, B:9:0x0056, B:13:0x0069, B:15:0x0071, B:18:0x0080, B:21:0x0096, B:22:0x0099, B:26:0x0063), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0052, B:9:0x0056, B:13:0x0069, B:15:0x0071, B:18:0x0080, B:21:0x0096, B:22:0x0099, B:26:0x0063), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h(w.i r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f2494b
            monitor-enter(r0)
            java.util.Map<w.i, androidx.camera.core.impl.h0$a> r1 = r9.f2497e     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r1 = r1.get(r10)     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.h0$a r1 = (androidx.camera.core.impl.h0.a) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            java.lang.Object r1 = androidx.core.util.h.l(r1, r2)     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.h0$a r1 = (androidx.camera.core.impl.h0.a) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "CameraStateRegistry"
            boolean r2 = w.o0.f(r2)     // Catch: java.lang.Throwable -> L9b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L52
            java.lang.StringBuilder r2 = r9.f2493a     // Catch: java.lang.Throwable -> L9b
            r2.setLength(r4)     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r2 = r9.f2493a     // Catch: java.lang.Throwable -> L9b
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L9b
            r7[r4] = r10     // Catch: java.lang.Throwable -> L9b
            int r10 = r9.f2498f     // Catch: java.lang.Throwable -> L9b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L9b
            r7[r3] = r10     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.c0$a r10 = r1.a()     // Catch: java.lang.Throwable -> L9b
            boolean r10 = d(r10)     // Catch: java.lang.Throwable -> L9b
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L9b
            r8 = 2
            r7[r8] = r10     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.c0$a r10 = r1.a()     // Catch: java.lang.Throwable -> L9b
            r8 = 3
            r7[r8] = r10     // Catch: java.lang.Throwable -> L9b
            java.lang.String r10 = java.lang.String.format(r5, r6, r7)     // Catch: java.lang.Throwable -> L9b
            r2.append(r10)     // Catch: java.lang.Throwable -> L9b
        L52:
            int r10 = r9.f2498f     // Catch: java.lang.Throwable -> L9b
            if (r10 > 0) goto L63
            androidx.camera.core.impl.c0$a r10 = r1.a()     // Catch: java.lang.Throwable -> L9b
            boolean r10 = d(r10)     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L61
            goto L63
        L61:
            r10 = r4
            goto L69
        L63:
            androidx.camera.core.impl.c0$a r10 = androidx.camera.core.impl.c0.a.OPENING     // Catch: java.lang.Throwable -> L9b
            r1.d(r10)     // Catch: java.lang.Throwable -> L9b
            r10 = r3
        L69:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = w.o0.f(r1)     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L94
            java.lang.StringBuilder r1 = r9.f2493a     // Catch: java.lang.Throwable -> L9b
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = " --> %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L7e
            java.lang.String r6 = "SUCCESS"
            goto L80
        L7e:
            java.lang.String r6 = "FAIL"
        L80:
            r3[r4] = r6     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = java.lang.String.format(r2, r5, r3)     // Catch: java.lang.Throwable -> L9b
            r1.append(r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "CameraStateRegistry"
            java.lang.StringBuilder r2 = r9.f2493a     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9b
            w.o0.a(r1, r2)     // Catch: java.lang.Throwable -> L9b
        L94:
            if (r10 == 0) goto L99
            r9.f()     // Catch: java.lang.Throwable -> L9b
        L99:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            return r10
        L9b:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.h0.h(w.i):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean i(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f2494b
            monitor-enter(r0)
            x.a r1 = r5.f2496d     // Catch: java.lang.Throwable -> L5f
            int r1 = r1.b()     // Catch: java.lang.Throwable -> L5f
            r2 = 2
            r3 = 1
            if (r1 == r2) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            return r3
        Lf:
            androidx.camera.core.impl.h0$a r1 = r5.b(r6)     // Catch: java.lang.Throwable -> L5f
            r2 = 0
            if (r1 == 0) goto L1f
            androidx.camera.core.impl.h0$a r6 = r5.b(r6)     // Catch: java.lang.Throwable -> L5f
            androidx.camera.core.impl.c0$a r6 = r6.a()     // Catch: java.lang.Throwable -> L5f
            goto L20
        L1f:
            r6 = r2
        L20:
            if (r7 == 0) goto L30
            androidx.camera.core.impl.h0$a r1 = r5.b(r7)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L30
            androidx.camera.core.impl.h0$a r7 = r5.b(r7)     // Catch: java.lang.Throwable -> L5f
            androidx.camera.core.impl.c0$a r2 = r7.a()     // Catch: java.lang.Throwable -> L5f
        L30:
            androidx.camera.core.impl.c0$a r7 = androidx.camera.core.impl.c0.a.OPEN     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r7.equals(r6)     // Catch: java.lang.Throwable -> L5f
            r4 = 0
            if (r1 != 0) goto L44
            androidx.camera.core.impl.c0$a r1 = androidx.camera.core.impl.c0.a.CONFIGURED     // Catch: java.lang.Throwable -> L5f
            boolean r6 = r1.equals(r6)     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L42
            goto L44
        L42:
            r6 = r4
            goto L45
        L44:
            r6 = r3
        L45:
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L5f
            if (r7 != 0) goto L56
            androidx.camera.core.impl.c0$a r7 = androidx.camera.core.impl.c0.a.CONFIGURED     // Catch: java.lang.Throwable -> L5f
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L54
            goto L56
        L54:
            r7 = r4
            goto L57
        L56:
            r7 = r3
        L57:
            if (r6 == 0) goto L5c
            if (r7 == 0) goto L5c
            goto L5d
        L5c:
            r3 = r4
        L5d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            return r3
        L5f:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.h0.i(java.lang.String, java.lang.String):boolean");
    }
}
