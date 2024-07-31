package androidx.camera.core.impl;

import androidx.camera.core.impl.C0626h0;
import androidx.camera.core.impl.InterfaceC0606c0;
import androidx.core.util.C0984h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p407w.C12029o0;
import p407w.InterfaceC12013i;
import p429x.InterfaceC12249a;

/* renamed from: androidx.camera.core.impl.h0 */
/* loaded from: classes.dex */
public final class C0626h0 implements InterfaceC12249a.a {

    /* renamed from: a */
    private final StringBuilder f2831a = new StringBuilder();

    /* renamed from: b */
    private final Object f2832b;

    /* renamed from: c */
    private int f2833c;

    /* renamed from: d */
    private final InterfaceC12249a f2834d;

    /* renamed from: e */
    private final Map<InterfaceC12013i, a> f2835e;

    /* renamed from: f */
    private int f2836f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.core.impl.h0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private InterfaceC0606c0.a f2837a;

        /* renamed from: b */
        private final Executor f2838b;

        /* renamed from: c */
        private final b f2839c;

        /* renamed from: d */
        private final c f2840d;

        a(InterfaceC0606c0.a aVar, Executor executor, b bVar, c cVar) {
            this.f2837a = aVar;
            this.f2838b = executor;
            this.f2839c = bVar;
            this.f2840d = cVar;
        }

        /* renamed from: a */
        InterfaceC0606c0.a m3096a() {
            return this.f2837a;
        }

        /* renamed from: b */
        void m3097b() {
            try {
                Executor executor = this.f2838b;
                final b bVar = this.f2839c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0626h0.b.this.mo2514a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                C12029o0.m38641d("CameraStateRegistry", "Unable to notify camera to configure.", e10);
            }
        }

        /* renamed from: c */
        void m3098c() {
            try {
                Executor executor = this.f2838b;
                final c cVar = this.f2840d;
                Objects.requireNonNull(cVar);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0626h0.c.this.mo2512a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                C12029o0.m38641d("CameraStateRegistry", "Unable to notify camera to open.", e10);
            }
        }

        /* renamed from: d */
        InterfaceC0606c0.a m3099d(InterfaceC0606c0.a aVar) {
            InterfaceC0606c0.a aVar2 = this.f2837a;
            this.f2837a = aVar;
            return aVar2;
        }
    }

    /* renamed from: androidx.camera.core.impl.h0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo2514a();
    }

    /* renamed from: androidx.camera.core.impl.h0$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo2512a();
    }

    public C0626h0(InterfaceC12249a interfaceC12249a, int i10) {
        Object obj = new Object();
        this.f2832b = obj;
        this.f2835e = new HashMap();
        this.f2833c = i10;
        synchronized (obj) {
            this.f2834d = interfaceC12249a;
            this.f2836f = this.f2833c;
        }
    }

    /* renamed from: b */
    private a m3085b(String str) {
        for (InterfaceC12013i interfaceC12013i : this.f2835e.keySet()) {
            if (str.equals(((InterfaceC0602b0) interfaceC12013i.mo2999b()).mo2559b())) {
                return this.f2835e.get(interfaceC12013i);
            }
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m3086d(InterfaceC0606c0.a aVar) {
        return aVar != null && aVar.m3003h();
    }

    /* renamed from: f */
    private void m3087f() {
        if (C12029o0.m38643f("CameraStateRegistry")) {
            this.f2831a.setLength(0);
            this.f2831a.append("Recalculating open cameras:\n");
            this.f2831a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f2831a.append("-------------------------------------------------------------------\n");
        }
        int i10 = 0;
        for (Map.Entry<InterfaceC12013i, a> entry : this.f2835e.entrySet()) {
            if (C12029o0.m38643f("CameraStateRegistry")) {
                this.f2831a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().m3096a() != null ? entry.getValue().m3096a().toString() : "UNKNOWN"));
            }
            if (m3086d(entry.getValue().m3096a())) {
                i10++;
            }
        }
        if (C12029o0.m38643f("CameraStateRegistry")) {
            this.f2831a.append("-------------------------------------------------------------------\n");
            this.f2831a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i10), Integer.valueOf(this.f2833c)));
            C12029o0.m38638a("CameraStateRegistry", this.f2831a.toString());
        }
        this.f2836f = Math.max(this.f2833c - i10, 0);
    }

    /* renamed from: j */
    private InterfaceC0606c0.a m3088j(InterfaceC12013i interfaceC12013i) {
        a remove = this.f2835e.remove(interfaceC12013i);
        if (remove == null) {
            return null;
        }
        m3087f();
        return remove.m3096a();
    }

    /* renamed from: k */
    private InterfaceC0606c0.a m3089k(InterfaceC12013i interfaceC12013i, InterfaceC0606c0.a aVar) {
        InterfaceC0606c0.a m3099d = ((a) C0984h.m4834l(this.f2835e.get(interfaceC12013i), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).m3099d(aVar);
        InterfaceC0606c0.a aVar2 = InterfaceC0606c0.a.OPENING;
        if (aVar == aVar2) {
            C0984h.m4836n(m3086d(aVar) || m3099d == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (m3099d != aVar) {
            m3087f();
        }
        return m3099d;
    }

    @Override // p429x.InterfaceC12249a.a
    /* renamed from: a */
    public void mo3090a(int i10, int i11) {
        synchronized (this.f2832b) {
            boolean z10 = true;
            this.f2833c = i11 == 2 ? 2 : 1;
            boolean z11 = i10 != 2 && i11 == 2;
            if (i10 != 2 || i11 == 2) {
                z10 = false;
            }
            if (z11 || z10) {
                m3087f();
            }
        }
    }

    /* renamed from: c */
    public boolean m3091c() {
        synchronized (this.f2832b) {
            Iterator<Map.Entry<InterfaceC12013i, a>> it = this.f2835e.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().m3096a() == InterfaceC0606c0.a.CLOSING) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m3092e(p407w.InterfaceC12013i r7, androidx.camera.core.impl.InterfaceC0606c0.a r8, boolean r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2832b
            monitor-enter(r0)
            int r1 = r6.f2836f     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.c0$a r2 = androidx.camera.core.impl.InterfaceC0606c0.a.RELEASED     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r2) goto Le
            androidx.camera.core.impl.c0$a r2 = r6.m3088j(r7)     // Catch: java.lang.Throwable -> Lbc
            goto L12
        Le:
            androidx.camera.core.impl.c0$a r2 = r6.m3089k(r7, r8)     // Catch: java.lang.Throwable -> Lbc
        L12:
            if (r2 != r8) goto L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            return
        L16:
            x.a r2 = r6.f2834d     // Catch: java.lang.Throwable -> Lbc
            int r2 = r2.mo35289b()     // Catch: java.lang.Throwable -> Lbc
            r3 = 2
            r4 = 0
            if (r2 != r3) goto L3b
            androidx.camera.core.impl.c0$a r2 = androidx.camera.core.impl.InterfaceC0606c0.a.CONFIGURED     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r2) goto L3b
            w.o r2 = r7.mo2999b()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.b0 r2 = (androidx.camera.core.impl.InterfaceC0602b0) r2     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = r2.mo2559b()     // Catch: java.lang.Throwable -> Lbc
            x.a r3 = r6.f2834d     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = r3.mo35288a(r2)     // Catch: java.lang.Throwable -> Lbc
            if (r2 == 0) goto L3b
            androidx.camera.core.impl.h0$a r2 = r6.m3085b(r2)     // Catch: java.lang.Throwable -> Lbc
            goto L3c
        L3b:
            r2 = r4
        L3c:
            r3 = 1
            if (r1 >= r3) goto L7c
            int r1 = r6.f2836f     // Catch: java.lang.Throwable -> Lbc
            if (r1 <= 0) goto L7c
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lbc
            r4.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map<w.i, androidx.camera.core.impl.h0$a> r8 = r6.f2835e     // Catch: java.lang.Throwable -> Lbc
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> Lbc
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lbc
        L52:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto L94
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.h0$a r3 = (androidx.camera.core.impl.C0626h0.a) r3     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.c0$a r3 = r3.m3096a()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.c0$a r5 = androidx.camera.core.impl.InterfaceC0606c0.a.PENDING_OPEN     // Catch: java.lang.Throwable -> Lbc
            if (r3 != r5) goto L52
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> Lbc
            w.i r3 = (p407w.InterfaceC12013i) r3     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.h0$a r1 = (androidx.camera.core.impl.C0626h0.a) r1     // Catch: java.lang.Throwable -> Lbc
            r4.put(r3, r1)     // Catch: java.lang.Throwable -> Lbc
            goto L52
        L7c:
            androidx.camera.core.impl.c0$a r1 = androidx.camera.core.impl.InterfaceC0606c0.a.PENDING_OPEN     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r1) goto L94
            int r8 = r6.f2836f     // Catch: java.lang.Throwable -> Lbc
            if (r8 <= 0) goto L94
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lbc
            r4.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map<w.i, androidx.camera.core.impl.h0$a> r8 = r6.f2835e     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.h0$a r8 = (androidx.camera.core.impl.C0626h0.a) r8     // Catch: java.lang.Throwable -> Lbc
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
            androidx.camera.core.impl.h0$a r8 = (androidx.camera.core.impl.C0626h0.a) r8
            r8.m3098c()
            goto La6
        Lb6:
            if (r2 == 0) goto Lbb
            r2.m3097b()
        Lbb:
            return
        Lbc:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C0626h0.m3092e(w.i, androidx.camera.core.impl.c0$a, boolean):void");
    }

    /* renamed from: g */
    public void m3093g(InterfaceC12013i interfaceC12013i, Executor executor, b bVar, c cVar) {
        synchronized (this.f2832b) {
            C0984h.m4836n(!this.f2835e.containsKey(interfaceC12013i), "Camera is already registered: " + interfaceC12013i);
            this.f2835e.put(interfaceC12013i, new a(null, executor, bVar, cVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0052, B:9:0x0056, B:13:0x0069, B:15:0x0071, B:18:0x0080, B:21:0x0096, B:22:0x0099, B:26:0x0063), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0052, B:9:0x0056, B:13:0x0069, B:15:0x0071, B:18:0x0080, B:21:0x0096, B:22:0x0099, B:26:0x0063), top: B:3:0x0003 }] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m3094h(p407w.InterfaceC12013i r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f2832b
            monitor-enter(r0)
            java.util.Map<w.i, androidx.camera.core.impl.h0$a> r1 = r9.f2835e     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r1 = r1.get(r10)     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.h0$a r1 = (androidx.camera.core.impl.C0626h0.a) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            java.lang.Object r1 = androidx.core.util.C0984h.m4834l(r1, r2)     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.h0$a r1 = (androidx.camera.core.impl.C0626h0.a) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "CameraStateRegistry"
            boolean r2 = p407w.C12029o0.m38643f(r2)     // Catch: java.lang.Throwable -> L9b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L52
            java.lang.StringBuilder r2 = r9.f2831a     // Catch: java.lang.Throwable -> L9b
            r2.setLength(r4)     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r2 = r9.f2831a     // Catch: java.lang.Throwable -> L9b
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L9b
            r7[r4] = r10     // Catch: java.lang.Throwable -> L9b
            int r10 = r9.f2836f     // Catch: java.lang.Throwable -> L9b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L9b
            r7[r3] = r10     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.c0$a r10 = r1.m3096a()     // Catch: java.lang.Throwable -> L9b
            boolean r10 = m3086d(r10)     // Catch: java.lang.Throwable -> L9b
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L9b
            r8 = 2
            r7[r8] = r10     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.impl.c0$a r10 = r1.m3096a()     // Catch: java.lang.Throwable -> L9b
            r8 = 3
            r7[r8] = r10     // Catch: java.lang.Throwable -> L9b
            java.lang.String r10 = java.lang.String.format(r5, r6, r7)     // Catch: java.lang.Throwable -> L9b
            r2.append(r10)     // Catch: java.lang.Throwable -> L9b
        L52:
            int r10 = r9.f2836f     // Catch: java.lang.Throwable -> L9b
            if (r10 > 0) goto L63
            androidx.camera.core.impl.c0$a r10 = r1.m3096a()     // Catch: java.lang.Throwable -> L9b
            boolean r10 = m3086d(r10)     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L61
            goto L63
        L61:
            r10 = r4
            goto L69
        L63:
            androidx.camera.core.impl.c0$a r10 = androidx.camera.core.impl.InterfaceC0606c0.a.OPENING     // Catch: java.lang.Throwable -> L9b
            r1.m3099d(r10)     // Catch: java.lang.Throwable -> L9b
            r10 = r3
        L69:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = p407w.C12029o0.m38643f(r1)     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L94
            java.lang.StringBuilder r1 = r9.f2831a     // Catch: java.lang.Throwable -> L9b
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
            java.lang.StringBuilder r2 = r9.f2831a     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9b
            p407w.C12029o0.m38638a(r1, r2)     // Catch: java.lang.Throwable -> L9b
        L94:
            if (r10 == 0) goto L99
            r9.m3087f()     // Catch: java.lang.Throwable -> L9b
        L99:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            return r10
        L9b:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C0626h0.m3094h(w.i):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[ADDED_TO_REGION] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m3095i(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f2832b
            monitor-enter(r0)
            x.a r1 = r5.f2834d     // Catch: java.lang.Throwable -> L5f
            int r1 = r1.mo35289b()     // Catch: java.lang.Throwable -> L5f
            r2 = 2
            r3 = 1
            if (r1 == r2) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            return r3
        Lf:
            androidx.camera.core.impl.h0$a r1 = r5.m3085b(r6)     // Catch: java.lang.Throwable -> L5f
            r2 = 0
            if (r1 == 0) goto L1f
            androidx.camera.core.impl.h0$a r6 = r5.m3085b(r6)     // Catch: java.lang.Throwable -> L5f
            androidx.camera.core.impl.c0$a r6 = r6.m3096a()     // Catch: java.lang.Throwable -> L5f
            goto L20
        L1f:
            r6 = r2
        L20:
            if (r7 == 0) goto L30
            androidx.camera.core.impl.h0$a r1 = r5.m3085b(r7)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L30
            androidx.camera.core.impl.h0$a r7 = r5.m3085b(r7)     // Catch: java.lang.Throwable -> L5f
            androidx.camera.core.impl.c0$a r2 = r7.m3096a()     // Catch: java.lang.Throwable -> L5f
        L30:
            androidx.camera.core.impl.c0$a r7 = androidx.camera.core.impl.InterfaceC0606c0.a.OPEN     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r7.equals(r6)     // Catch: java.lang.Throwable -> L5f
            r4 = 0
            if (r1 != 0) goto L44
            androidx.camera.core.impl.c0$a r1 = androidx.camera.core.impl.InterfaceC0606c0.a.CONFIGURED     // Catch: java.lang.Throwable -> L5f
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
            androidx.camera.core.impl.c0$a r7 = androidx.camera.core.impl.InterfaceC0606c0.a.CONFIGURED     // Catch: java.lang.Throwable -> L5f
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C0626h0.m3095i(java.lang.String, java.lang.String):boolean");
    }
}
