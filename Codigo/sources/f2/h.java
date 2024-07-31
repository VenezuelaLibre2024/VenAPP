package f2;

/* loaded from: classes.dex */
public abstract class h {

    /* loaded from: classes.dex */
    class a extends h {
        a() {
        }

        @Override // f2.h
        public g a(String str) {
            return null;
        }
    }

    public static h c() {
        return new a();
    }

    public abstract g a(String str);

    public final g b(String str) {
        g a10 = a(str);
        return a10 == null ? g.a(str) : a10;
    }
}
