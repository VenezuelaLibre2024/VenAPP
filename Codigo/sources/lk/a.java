package lk;

import sk.c;

/* loaded from: classes3.dex */
public class a extends kk.a {

    /* renamed from: lk.a$a */
    /* loaded from: classes3.dex */
    public static final class C0336a {

        /* renamed from: a */
        public static final C0336a f21277a = new C0336a();

        /* renamed from: b */
        public static final Integer f21278b;

        /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
        static {
            /*
                lk.a$a r0 = new lk.a$a
                r0.<init>()
                lk.a.C0336a.f21277a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L1f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L20
            L1f:
                r1 = r0
            L20:
                if (r1 == 0) goto L2e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2a
                r2 = 1
                goto L2b
            L2a:
                r2 = 0
            L2b:
                if (r2 == 0) goto L2e
                r0 = r1
            L2e:
                lk.a.C0336a.f21278b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lk.a.C0336a.<clinit>():void");
        }

        private C0336a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0336a.f21278b;
        return num == null || num.intValue() >= i10;
    }

    @Override // jk.a
    public c b() {
        return c(34) ? new tk.a() : super.b();
    }
}
