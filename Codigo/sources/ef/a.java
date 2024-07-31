package ef;

import android.util.Log;
import ef.b;
import gk.Continuation;
import il.a;
import il.c;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public static final a f14644a = new a();

    /* renamed from: b */
    private static final Map<b.a, C0228a> f14645b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: ef.a$a */
    /* loaded from: classes2.dex */
    public static final class C0228a {

        /* renamed from: a */
        private final il.a f14646a;

        /* renamed from: b */
        private ef.b f14647b;

        public C0228a(il.a mutex, ef.b bVar) {
            n.e(mutex, "mutex");
            this.f14646a = mutex;
            this.f14647b = bVar;
        }

        public /* synthetic */ C0228a(il.a aVar, ef.b bVar, int i10, g gVar) {
            this(aVar, (i10 & 2) != 0 ? null : bVar);
        }

        public final il.a a() {
            return this.f14646a;
        }

        public final ef.b b() {
            return this.f14647b;
        }

        public final void c(ef.b bVar) {
            this.f14647b = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0228a)) {
                return false;
            }
            C0228a c0228a = (C0228a) obj;
            return n.a(this.f14646a, c0228a.f14646a) && n.a(this.f14647b, c0228a.f14647b);
        }

        public int hashCode() {
            int hashCode = this.f14646a.hashCode() * 31;
            ef.b bVar = this.f14647b;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.f14646a + ", subscriber=" + this.f14647b + ')';
        }
    }

    @f(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {123}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
    /* loaded from: classes2.dex */
    public static final class b extends d {

        /* renamed from: a */
        Object f14648a;

        /* renamed from: b */
        Object f14649b;

        /* renamed from: c */
        Object f14650c;

        /* renamed from: d */
        Object f14651d;

        /* renamed from: e */
        Object f14652e;

        /* renamed from: f */
        Object f14653f;

        /* renamed from: r */
        /* synthetic */ Object f14654r;

        /* renamed from: t */
        int f14656t;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14654r = obj;
            this.f14656t |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    private a() {
    }

    private final C0228a b(b.a aVar) {
        Map<b.a, C0228a> dependencies = f14645b;
        n.d(dependencies, "dependencies");
        C0228a c0228a = dependencies.get(aVar);
        if (c0228a != null) {
            n.d(c0228a, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return c0228a;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    public static final void e(ef.b subscriber) {
        n.e(subscriber, "subscriber");
        b.a c10 = subscriber.c();
        C0228a b10 = f14644a.b(c10);
        if (b10.b() != null) {
            Log.d("SessionsDependencies", "Subscriber " + c10 + " already registered.");
            return;
        }
        b10.c(subscriber);
        Log.d("SessionsDependencies", "Subscriber " + c10 + " registered.");
        a.C0289a.a(b10.a(), null, 1, null);
    }

    public final void a(b.a subscriberName) {
        StringBuilder sb2;
        String str;
        n.e(subscriberName, "subscriberName");
        if (subscriberName == b.a.PERFORMANCE) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map<b.a, C0228a> dependencies = f14645b;
        if (dependencies.containsKey(subscriberName)) {
            sb2 = new StringBuilder();
            sb2.append("Dependency ");
            sb2.append(subscriberName);
            str = " already added.";
        } else {
            n.d(dependencies, "dependencies");
            dependencies.put(subscriberName, new C0228a(c.a(true), null, 2, null));
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(gk.Continuation<? super java.util.Map<ef.b.a, ? extends ef.b>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ef.a.b
            if (r0 == 0) goto L13
            r0 = r11
            ef.a$b r0 = (ef.a.b) r0
            int r1 = r0.f14656t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14656t = r1
            goto L18
        L13:
            ef.a$b r0 = new ef.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f14654r
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.f14656t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 != r4) goto L40
            java.lang.Object r2 = r0.f14653f
            java.lang.Object r5 = r0.f14652e
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f14651d
            il.a r6 = (il.a) r6
            java.lang.Object r7 = r0.f14650c
            ef.b$a r7 = (ef.b.a) r7
            java.lang.Object r8 = r0.f14649b
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f14648a
            java.util.Map r9 = (java.util.Map) r9
            ck.o.b(r11)
            goto La2
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            ck.o.b(r11)
            java.util.Map<ef.b$a, ef.a$a> r11 = ef.a.f14645b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.n.d(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = dk.h0.e(r5)
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
            ef.b$a r7 = (ef.b.a) r7
            java.lang.Object r11 = r11.getValue()
            ef.a$a r11 = (ef.a.C0228a) r11
            il.a r6 = r11.a()
            r0.f14648a = r5
            r0.f14649b = r8
            r0.f14650c = r7
            r0.f14651d = r6
            r0.f14652e = r5
            r0.f14653f = r2
            r0.f14656t = r4
            java.lang.Object r11 = r6.c(r3, r0)
            if (r11 != r1) goto La1
            return r1
        La1:
            r9 = r5
        La2:
            ef.a r11 = ef.a.f14644a     // Catch: java.lang.Throwable -> Lb0
            ef.b r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lb0
            r6.b(r3)
            r5.put(r2, r11)
            r5 = r9
            goto L6b
        Lb0:
            r11 = move-exception
            r6.b(r3)
            throw r11
        Lb5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.a.c(gk.Continuation):java.lang.Object");
    }

    public final ef.b d(b.a subscriberName) {
        n.e(subscriberName, "subscriberName");
        ef.b b10 = b(subscriberName).b();
        if (b10 != null) {
            return b10;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }
}
