package p450xk;

import dk.C7029q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import uk.C11585l;

/* renamed from: xk.f */
/* loaded from: classes3.dex */
public final class C12514f implements Serializable {

    /* renamed from: b */
    public static final a f33931b = new a(null);

    /* renamed from: a */
    private final Pattern f33932a;

    /* renamed from: xk.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: xk.f$b */
    /* loaded from: classes3.dex */
    private static final class b implements Serializable {

        /* renamed from: c */
        public static final a f33933c = new a(null);
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final String f33934a;

        /* renamed from: b */
        private final int f33935b;

        /* renamed from: xk.f$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9315g c9315g) {
                this();
            }
        }

        public b(String pattern, int i10) {
            C9322n.m27781e(pattern, "pattern");
            this.f33934a = pattern;
            this.f33935b = i10;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f33934a, this.f33935b);
            C9322n.m27780d(compile, "compile(pattern, flags)");
            return new C12514f(compile);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C12514f(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C9322n.m27781e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.C9322n.m27780d(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p450xk.C12514f.<init>(java.lang.String):void");
    }

    public C12514f(Pattern nativePattern) {
        C9322n.m27781e(nativePattern, "nativePattern");
        this.f33932a = nativePattern;
    }

    private final Object writeReplace() {
        String pattern = this.f33932a.pattern();
        C9322n.m27780d(pattern, "nativePattern.pattern()");
        return new b(pattern, this.f33932a.flags());
    }

    /* renamed from: a */
    public final boolean m40969a(CharSequence input) {
        C9322n.m27781e(input, "input");
        return this.f33932a.matcher(input).matches();
    }

    /* renamed from: b */
    public final String m40970b(CharSequence input, String replacement) {
        C9322n.m27781e(input, "input");
        C9322n.m27781e(replacement, "replacement");
        String replaceAll = this.f33932a.matcher(input).replaceAll(replacement);
        C9322n.m27780d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    /* renamed from: c */
    public final List<String> m40971c(CharSequence input, int i10) {
        List<String> m20572e;
        C9322n.m27781e(input, "input");
        C12525q.m41093p0(i10);
        Matcher matcher = this.f33932a.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            m20572e = C7029q.m20572e(input.toString());
            return m20572e;
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? C11585l.m36295d(i10, 10) : 10);
        int i11 = i10 - 1;
        int i12 = 0;
        do {
            arrayList.add(input.subSequence(i12, matcher.start()).toString());
            i12 = matcher.end();
            if (i11 >= 0 && arrayList.size() == i11) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(i12, input.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.f33932a.toString();
        C9322n.m27780d(pattern, "nativePattern.toString()");
        return pattern;
    }
}
