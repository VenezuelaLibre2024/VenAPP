package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.p;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: j */
    public static final long f12477j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k */
    static final int[] f12478k = {2, 4, 8, 16, 32, 64, RecognitionOptions.ITF, RecognitionOptions.QR_CODE};

    /* renamed from: a */
    private final fe.f f12479a;

    /* renamed from: b */
    private final ee.b<cc.a> f12480b;

    /* renamed from: c */
    private final Executor f12481c;

    /* renamed from: d */
    private final la.f f12482d;

    /* renamed from: e */
    private final Random f12483e;

    /* renamed from: f */
    private final f f12484f;

    /* renamed from: g */
    private final ConfigFetchHttpClient f12485g;

    /* renamed from: h */
    private final p f12486h;

    /* renamed from: i */
    private final Map<String, String> f12487i;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private final Date f12488a;

        /* renamed from: b */
        private final int f12489b;

        /* renamed from: c */
        private final g f12490c;

        /* renamed from: d */
        private final String f12491d;

        private a(Date date, int i10, g gVar, String str) {
            this.f12488a = date;
            this.f12489b = i10;
            this.f12490c = gVar;
            this.f12491d = str;
        }

        public static a a(Date date, g gVar) {
            return new a(date, 1, gVar, null);
        }

        public static a b(g gVar, String str) {
            return new a(gVar.h(), 0, gVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public g d() {
            return this.f12490c;
        }

        String e() {
            return this.f12491d;
        }

        public int f() {
            return this.f12489b;
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String value;

        b(String str) {
            this.value = str;
        }

        String b() {
            return this.value;
        }
    }

    public m(fe.f fVar, ee.b<cc.a> bVar, Executor executor, la.f fVar2, Random random, f fVar3, ConfigFetchHttpClient configFetchHttpClient, p pVar, Map<String, String> map) {
        this.f12479a = fVar;
        this.f12480b = bVar;
        this.f12481c = executor;
        this.f12482d = fVar2;
        this.f12483e = random;
        this.f12484f = fVar3;
        this.f12485g = configFetchHttpClient;
        this.f12486h = pVar;
        this.f12487i = map;
    }

    private p.a A(int i10, Date date) {
        if (t(i10)) {
            B(date);
        }
        return this.f12486h.a();
    }

    private void B(Date date) {
        int b10 = this.f12486h.a().b() + 1;
        this.f12486h.k(b10, new Date(date.getTime() + q(b10)));
    }

    private void C(Task<a> task, Date date) {
        if (task.isSuccessful()) {
            this.f12486h.p(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof ze.j) {
            this.f12486h.q();
        } else {
            this.f12486h.o();
        }
    }

    private boolean f(long j10, Date date) {
        Date e10 = this.f12486h.e();
        if (e10.equals(p.f12502e)) {
            return false;
        }
        return date.before(new Date(e10.getTime() + TimeUnit.SECONDS.toMillis(j10)));
    }

    private ze.l g(ze.l lVar) {
        String str;
        int a10 = lVar.a();
        if (a10 == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a10 == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (a10 == 429) {
                throw new ze.h("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (a10 != 500) {
                switch (a10) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new ze.l(lVar.a(), "Fetch failed: " + str, lVar);
    }

    private String h(long j10) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j10)));
    }

    private a k(String str, String str2, Date date, Map<String, String> map) {
        try {
            a fetch = this.f12485g.fetch(this.f12485g.d(), str, str2, s(), this.f12486h.d(), map, p(), date);
            if (fetch.d() != null) {
                this.f12486h.m(fetch.d().k());
            }
            if (fetch.e() != null) {
                this.f12486h.l(fetch.e());
            }
            this.f12486h.i();
            return fetch;
        } catch (ze.l e10) {
            p.a A = A(e10.a(), date);
            if (z(A, e10.a())) {
                throw new ze.j(A.a().getTime());
            }
            throw g(e10);
        }
    }

    private Task<a> l(String str, String str2, Date date, Map<String, String> map) {
        try {
            a k10 = k(str, str2, date, map);
            return k10.f() != 0 ? Tasks.forResult(k10) : this.f12484f.k(k10.d()).onSuccessTask(this.f12481c, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.l
                public /* synthetic */ l() {
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    Task forResult;
                    forResult = Tasks.forResult(m.a.this);
                    return forResult;
                }
            });
        } catch (ze.i e10) {
            return Tasks.forException(e10);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.firebase.remoteconfig.internal.i.<init>(com.google.firebase.remoteconfig.internal.m, com.google.android.gms.tasks.Task, com.google.android.gms.tasks.Task, java.util.Date, java.util.Map):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: m */
    public com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.m.a> u(com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.g> r8, long r9, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r7 = this;
            java.util.Date r6 = new java.util.Date
            la.f r0 = r7.f12482d
            long r0 = r0.a()
            r6.<init>(r0)
            boolean r8 = r8.isSuccessful()
            if (r8 == 0) goto L20
            boolean r8 = r7.f(r9, r6)
            if (r8 == 0) goto L20
            com.google.firebase.remoteconfig.internal.m$a r8 = com.google.firebase.remoteconfig.internal.m.a.c(r6)
            com.google.android.gms.tasks.Task r8 = com.google.android.gms.tasks.Tasks.forResult(r8)
            return r8
        L20:
            java.util.Date r8 = r7.o(r6)
            if (r8 == 0) goto L41
            ze.j r9 = new ze.j
            long r10 = r8.getTime()
            long r0 = r6.getTime()
            long r10 = r10 - r0
            java.lang.String r10 = r7.h(r10)
            long r0 = r8.getTime()
            r9.<init>(r10, r0)
            com.google.android.gms.tasks.Task r8 = com.google.android.gms.tasks.Tasks.forException(r9)
            goto L69
        L41:
            fe.f r8 = r7.f12479a
            com.google.android.gms.tasks.Task r2 = r8.getId()
            fe.f r8 = r7.f12479a
            r9 = 0
            com.google.android.gms.tasks.Task r3 = r8.a(r9)
            r8 = 2
            com.google.android.gms.tasks.Task[] r8 = new com.google.android.gms.tasks.Task[r8]
            r8[r9] = r2
            r9 = 1
            r8[r9] = r3
            com.google.android.gms.tasks.Task r8 = com.google.android.gms.tasks.Tasks.whenAllComplete(r8)
            java.util.concurrent.Executor r9 = r7.f12481c
            com.google.firebase.remoteconfig.internal.i r10 = new com.google.firebase.remoteconfig.internal.i
            r0 = r10
            r1 = r7
            r4 = r6
            r5 = r11
            r0.<init>()
            com.google.android.gms.tasks.Task r8 = r8.continueWithTask(r9, r10)
        L69:
            java.util.concurrent.Executor r9 = r7.f12481c
            com.google.firebase.remoteconfig.internal.j r10 = new com.google.firebase.remoteconfig.internal.j
            r10.<init>()
            com.google.android.gms.tasks.Task r8 = r8.continueWithTask(r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.m.u(com.google.android.gms.tasks.Task, long, java.util.Map):com.google.android.gms.tasks.Task");
    }

    private Date o(Date date) {
        Date a10 = this.f12486h.a().a();
        if (date.before(a10)) {
            return a10;
        }
        return null;
    }

    private Long p() {
        cc.a aVar = this.f12480b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.d(true).get("_fot");
    }

    private long q(int i10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f12478k;
        return (timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]) / 2) + this.f12483e.nextInt((int) r0);
    }

    private Map<String, String> s() {
        HashMap hashMap = new HashMap();
        cc.a aVar = this.f12480b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : aVar.d(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    private boolean t(int i10) {
        return i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    public /* synthetic */ Task w(Task task, Task task2, Date date, Map map, Task task3) {
        return !task.isSuccessful() ? Tasks.forException(new ze.h("Firebase Installations failed to get installation ID for fetch.", task.getException())) : !task2.isSuccessful() ? Tasks.forException(new ze.h("Firebase Installations failed to get installation auth token for fetch.", task2.getException())) : l((String) task.getResult(), ((com.google.firebase.installations.g) task2.getResult()).b(), date, map);
    }

    public /* synthetic */ Task x(Date date, Task task) {
        C(task, date);
        return task;
    }

    public /* synthetic */ Task y(Map map, Task task) {
        return u(task, 0L, map);
    }

    private boolean z(p.a aVar, int i10) {
        return aVar.b() > 1 || i10 == 429;
    }

    public Task<a> i() {
        return j(this.f12486h.g());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.firebase.remoteconfig.internal.h.<init>(com.google.firebase.remoteconfig.internal.m, long, java.util.Map):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.m.a> j(long r5) {
        /*
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.f12487i
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.google.firebase.remoteconfig.internal.m$b r2 = com.google.firebase.remoteconfig.internal.m.b.BASE
            java.lang.String r2 = r2.b()
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            r2 = 1
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "X-Firebase-RC-Fetch-Type"
            r0.put(r2, r1)
            com.google.firebase.remoteconfig.internal.f r1 = r4.f12484f
            com.google.android.gms.tasks.Task r1 = r1.e()
            java.util.concurrent.Executor r2 = r4.f12481c
            com.google.firebase.remoteconfig.internal.h r3 = new com.google.firebase.remoteconfig.internal.h
            r3.<init>()
            com.google.android.gms.tasks.Task r5 = r1.continueWithTask(r2, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.m.j(long):com.google.android.gms.tasks.Task");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.firebase.remoteconfig.internal.k.<init>(com.google.firebase.remoteconfig.internal.m, java.util.Map):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.m.a> n(com.google.firebase.remoteconfig.internal.m.b r3, int r4) {
        /*
            r2 = this;
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.f12487i
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.b()
            r1.append(r3)
            java.lang.String r3 = "/"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = "X-Firebase-RC-Fetch-Type"
            r0.put(r4, r3)
            com.google.firebase.remoteconfig.internal.f r3 = r2.f12484f
            com.google.android.gms.tasks.Task r3 = r3.e()
            java.util.concurrent.Executor r4 = r2.f12481c
            com.google.firebase.remoteconfig.internal.k r1 = new com.google.firebase.remoteconfig.internal.k
            r1.<init>()
            com.google.android.gms.tasks.Task r3 = r3.continueWithTask(r4, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.m.n(com.google.firebase.remoteconfig.internal.m$b, int):com.google.android.gms.tasks.Task");
    }

    public long r() {
        return this.f12486h.f();
    }
}
