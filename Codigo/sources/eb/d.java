package eb;

/* loaded from: classes2.dex */
public abstract class d implements p<Character> {

    /* loaded from: classes2.dex */
    static abstract class a extends d {
        a() {
        }

        @Override // eb.p
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.b(ch2);
        }
    }

    /* loaded from: classes2.dex */
    private static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        private final char f14589a;

        b(char c10) {
            this.f14589a = c10;
        }

        @Override // eb.d
        public boolean e(char c10) {
            return c10 == this.f14589a;
        }

        public String toString() {
            return "CharMatcher.is('" + d.g(this.f14589a) + "')";
        }
    }

    /* loaded from: classes2.dex */
    static abstract class c extends a {

        /* renamed from: a, reason: collision with root package name */
        private final String f14590a;

        c(String str) {
            this.f14590a = (String) o.o(str);
        }

        public final String toString() {
            return this.f14590a;
        }
    }

    /* renamed from: eb.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0224d extends c {

        /* renamed from: b, reason: collision with root package name */
        static final C0224d f14591b = new C0224d();

        private C0224d() {
            super("CharMatcher.none()");
        }

        @Override // eb.d
        public int c(CharSequence charSequence, int i10) {
            o.r(i10, charSequence.length());
            return -1;
        }

        @Override // eb.d
        public boolean e(char c10) {
            return false;
        }
    }

    /* loaded from: classes2.dex */
    static final class e extends c {

        /* renamed from: b, reason: collision with root package name */
        static final int f14592b = Integer.numberOfLeadingZeros(31);

        /* renamed from: c, reason: collision with root package name */
        static final e f14593c = new e();

        e() {
            super("CharMatcher.whitespace()");
        }

        @Override // eb.d
        public boolean e(char c10) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> f14592b) == c10;
        }
    }

    protected d() {
    }

    public static d d(char c10) {
        return new b(c10);
    }

    public static d f() {
        return C0224d.f14591b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(char c10) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static d h() {
        return e.f14593c;
    }

    @Deprecated
    public boolean b(Character ch2) {
        return e(ch2.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        o.r(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean e(char c10);
}
