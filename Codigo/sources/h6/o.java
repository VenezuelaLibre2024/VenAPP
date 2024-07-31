package h6;

import h6.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class o {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract o a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a b(f6.b bVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a c(f6.c<?> cVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a d(f6.e<?, byte[]> eVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract f6.b b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract f6.c<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract f6.e<?, byte[]> e();

    public abstract p f();

    public abstract String g();
}
