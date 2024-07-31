package p084ef;

import android.util.Log;
import il.C8010c;
import il.InterfaceC8008a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p084ef.InterfaceC7185b;
import p124gk.Continuation;

/* renamed from: ef.a */
/* loaded from: classes2.dex */
public final class C7184a {

    /* renamed from: a */
    public static final C7184a f16067a = new C7184a();

    /* renamed from: b */
    private static final Map<InterfaceC7185b.a, a> f16068b = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ef.a$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final InterfaceC8008a f16069a;

        /* renamed from: b */
        private InterfaceC7185b f16070b;

        public a(InterfaceC8008a mutex, InterfaceC7185b interfaceC7185b) {
            C9322n.m27781e(mutex, "mutex");
            this.f16069a = mutex;
            this.f16070b = interfaceC7185b;
        }

        public /* synthetic */ a(InterfaceC8008a interfaceC8008a, InterfaceC7185b interfaceC7185b, int i10, C9315g c9315g) {
            this(interfaceC8008a, (i10 & 2) != 0 ? null : interfaceC7185b);
        }

        /* renamed from: a */
        public final InterfaceC8008a m21386a() {
            return this.f16069a;
        }

        /* renamed from: b */
        public final InterfaceC7185b m21387b() {
            return this.f16070b;
        }

        /* renamed from: c */
        public final void m21388c(InterfaceC7185b interfaceC7185b) {
            this.f16070b = interfaceC7185b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C9322n.m27777a(this.f16069a, aVar.f16069a) && C9322n.m27777a(this.f16070b, aVar.f16070b);
        }

        public int hashCode() {
            int hashCode = this.f16069a.hashCode() * 31;
            InterfaceC7185b interfaceC7185b = this.f16070b;
            return hashCode + (interfaceC7185b == null ? 0 : interfaceC7185b.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.f16069a + ", subscriber=" + this.f16070b + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", m27743f = "FirebaseSessionsDependencies.kt", m27744l = {123}, m27745m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
    /* renamed from: ef.a$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC9298d {

        /* renamed from: a */
        Object f16071a;

        /* renamed from: b */
        Object f16072b;

        /* renamed from: c */
        Object f16073c;

        /* renamed from: d */
        Object f16074d;

        /* renamed from: e */
        Object f16075e;

        /* renamed from: f */
        Object f16076f;

        /* renamed from: r */
        /* synthetic */ Object f16077r;

        /* renamed from: t */
        int f16079t;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f16077r = obj;
            this.f16079t |= Integer.MIN_VALUE;
            return C7184a.this.m21384c(this);
        }
    }

    private C7184a() {
    }

    /* renamed from: b */
    private final a m21381b(InterfaceC7185b.a aVar) {
        Map<InterfaceC7185b.a, a> dependencies = f16068b;
        C9322n.m27780d(dependencies, "dependencies");
        a aVar2 = dependencies.get(aVar);
        if (aVar2 != null) {
            C9322n.m27780d(aVar2, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return aVar2;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    /* renamed from: e */
    public static final void m21382e(InterfaceC7185b subscriber) {
        C9322n.m27781e(subscriber, "subscriber");
        InterfaceC7185b.a mo21391c = subscriber.mo21391c();
        a m21381b = f16067a.m21381b(mo21391c);
        if (m21381b.m21387b() != null) {
            Log.d("SessionsDependencies", "Subscriber " + mo21391c + " already registered.");
            return;
        }
        m21381b.m21388c(subscriber);
        Log.d("SessionsDependencies", "Subscriber " + mo21391c + " registered.");
        InterfaceC8008a.a.m24590a(m21381b.m21386a(), null, 1, null);
    }

    /* renamed from: a */
    public final void m21383a(InterfaceC7185b.a subscriberName) {
        StringBuilder sb2;
        String str;
        C9322n.m27781e(subscriberName, "subscriberName");
        if (subscriberName == InterfaceC7185b.a.PERFORMANCE) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map<InterfaceC7185b.a, a> dependencies = f16068b;
        if (dependencies.containsKey(subscriberName)) {
            sb2 = new StringBuilder();
            sb2.append("Dependency ");
            sb2.append(subscriberName);
            str = " already added.";
        } else {
            C9322n.m27780d(dependencies, "dependencies");
            dependencies.put(subscriberName, new a(C8010c.m24608a(true), null, 2, 0 == true ? 1 : 0));
            sb2 = new StringBuilder();
            sb2.append("Dependency to ");
            sb2.append(subscriberName);
            str = " added.";
        }
        sb2.append(str);
        Log.d("SessionsDependencies", sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a1 -> B:10:0x00a2). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m21384c(p124gk.Continuation<? super java.util.Map<p084ef.InterfaceC7185b.a, ? extends p084ef.InterfaceC7185b>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof p084ef.C7184a.b
            if (r0 == 0) goto L13
            r0 = r11
            ef.a$b r0 = (p084ef.C7184a.b) r0
            int r1 = r0.f16079t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16079t = r1
            goto L18
        L13:
            ef.a$b r0 = new ef.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f16077r
            java.lang.Object r1 = hk.C7750b.m23652c()
            int r2 = r0.f16079t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 != r4) goto L40
            java.lang.Object r2 = r0.f16076f
            java.lang.Object r5 = r0.f16075e
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f16074d
            il.a r6 = (il.InterfaceC8008a) r6
            java.lang.Object r7 = r0.f16073c
            ef.b$a r7 = (p084ef.InterfaceC7185b.a) r7
            java.lang.Object r8 = r0.f16072b
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f16071a
            java.util.Map r9 = (java.util.Map) r9
            ck.C2030o.m10349b(r11)
            goto La2
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            ck.C2030o.m10349b(r11)
            java.util.Map<ef.b$a, ef.a$a> r11 = p084ef.C7184a.f16068b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.C9322n.m27780d(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = dk.C7012h0.m20362e(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L6b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb5
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            ef.b$a r7 = (p084ef.InterfaceC7185b.a) r7
            java.lang.Object r11 = r11.getValue()
            ef.a$a r11 = (p084ef.C7184a.a) r11
            il.a r6 = r11.m21386a()
            r0.f16071a = r5
            r0.f16072b = r8
            r0.f16073c = r7
            r0.f16074d = r6
            r0.f16075e = r5
            r0.f16076f = r2
            r0.f16079t = r4
            java.lang.Object r11 = r6.mo24589c(r3, r0)
            if (r11 != r1) goto La1
            return r1
        La1:
            r9 = r5
        La2:
            ef.a r11 = p084ef.C7184a.f16067a     // Catch: java.lang.Throwable -> Lb0
            ef.b r11 = r11.m21385d(r7)     // Catch: java.lang.Throwable -> Lb0
            r6.mo24588b(r3)
            r5.put(r2, r11)
            r5 = r9
            goto L6b
        Lb0:
            r11 = move-exception
            r6.mo24588b(r3)
            throw r11
        Lb5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p084ef.C7184a.m21384c(gk.Continuation):java.lang.Object");
    }

    /* renamed from: d */
    public final InterfaceC7185b m21385d(InterfaceC7185b.a subscriberName) {
        C9322n.m27781e(subscriberName, "subscriberName");
        InterfaceC7185b m21387b = m21381b(subscriberName).m21387b();
        if (m21387b != null) {
            return m21387b;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }
}
