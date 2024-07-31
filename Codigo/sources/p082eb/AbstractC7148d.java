package p082eb;

/* renamed from: eb.d */
/* loaded from: classes2.dex */
public abstract class AbstractC7148d implements InterfaceC7160p<Character> {

    /* renamed from: eb.d$a */
    /* loaded from: classes2.dex */
    static abstract class a extends AbstractC7148d {
        a() {
        }

        @Override // p082eb.InterfaceC7160p
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.m21261b(ch2);
        }
    }

    /* renamed from: eb.d$b */
    /* loaded from: classes2.dex */
    private static final class b extends a {

        /* renamed from: a */
        private final char f16012a;

        b(char c10) {
            this.f16012a = c10;
        }

        @Override // p082eb.AbstractC7148d
        /* renamed from: e */
        public boolean mo21263e(char c10) {
            return c10 == this.f16012a;
        }

        public String toString() {
            return "CharMatcher.is('" + AbstractC7148d.m21259g(this.f16012a) + "')";
        }
    }

    /* renamed from: eb.d$c */
    /* loaded from: classes2.dex */
    static abstract class c extends a {

        /* renamed from: a */
        private final String f16013a;

        c(String str) {
            this.f16013a = (String) C7159o.m21312o(str);
        }

        public final String toString() {
            return this.f16013a;
        }
    }

    /* renamed from: eb.d$d */
    /* loaded from: classes2.dex */
    private static final class d extends c {

        /* renamed from: b */
        static final d f16014b = new d();

        private d() {
            super("CharMatcher.none()");
        }

        @Override // p082eb.AbstractC7148d
        /* renamed from: c */
        public int mo21262c(CharSequence charSequence, int i10) {
            C7159o.m21315r(i10, charSequence.length());
            return -1;
        }

        @Override // p082eb.AbstractC7148d
        /* renamed from: e */
        public boolean mo21263e(char c10) {
            return false;
        }
    }

    /* renamed from: eb.d$e */
    /* loaded from: classes2.dex */
    static final class e extends c {

        /* renamed from: b */
        static final int f16015b = Integer.numberOfLeadingZeros(31);

        /* renamed from: c */
        static final e f16016c = new e();

        e() {
            super("CharMatcher.whitespace()");
        }

        @Override // p082eb.AbstractC7148d
        /* renamed from: e */
        public boolean mo21263e(char c10) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> f16015b) == c10;
        }
    }

    protected AbstractC7148d() {
    }

    /* renamed from: d */
    public static AbstractC7148d m21257d(char c10) {
        return new b(c10);
    }

    /* renamed from: f */
    public static AbstractC7148d m21258f() {
        return d.f16014b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static String m21259g(char c10) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* renamed from: h */
    public static AbstractC7148d m21260h() {
        return e.f16016c;
    }

    @Deprecated
    /* renamed from: b */
    public boolean m21261b(Character ch2) {
        return mo21263e(ch2.charValue());
    }

    /* renamed from: c */
    public int mo21262c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        C7159o.m21315r(i10, length);
        while (i10 < length) {
            if (mo21263e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: e */
    public abstract boolean mo21263e(char c10);
}
