package jk;

import java.lang.reflect.Method;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public class a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jk.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0313a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0313a f19985a = new C0313a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f19986b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f19987c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[LOOP:0: B:2:0x0015->B:10:0x003f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[EDGE_INSN: B:11:0x0043->B:12:0x0043 BREAK  A[LOOP:0: B:2:0x0015->B:10:0x003f], SYNTHETIC] */
        static {
            /*
                jk.a$a r0 = new jk.a$a
                r0.<init>()
                jk.a.C0313a.f19985a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.n.d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L15:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.n.a(r7, r8)
                if (r7 == 0) goto L3b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.n.d(r7, r8)
                java.lang.Object r7 = dk.i.V(r7)
                boolean r7 = kotlin.jvm.internal.n.a(r7, r0)
                if (r7 == 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = r3
            L3c:
                if (r7 == 0) goto L3f
                goto L43
            L3f:
                int r4 = r4 + 1
                goto L15
            L42:
                r6 = r5
            L43:
                jk.a.C0313a.f19986b = r6
                int r0 = r1.length
            L46:
                if (r3 >= r0) goto L5b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.n.a(r4, r6)
                if (r4 == 0) goto L58
                r5 = r2
                goto L5b
            L58:
                int r3 = r3 + 1
                goto L46
            L5b:
                jk.a.C0313a.f19987c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jk.a.C0313a.<clinit>():void");
        }

        private C0313a() {
        }
    }

    public void a(Throwable cause, Throwable exception) {
        n.e(cause, "cause");
        n.e(exception, "exception");
        Method method = C0313a.f19986b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public sk.c b() {
        return new sk.b();
    }
}
