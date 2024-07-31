package xk;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class f implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31411b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f31412a;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    private static final class b implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final a f31413c = new a(null);
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        private final String f31414a;

        /* renamed from: b, reason: collision with root package name */
        private final int f31415b;

        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public b(String pattern, int i10) {
            kotlin.jvm.internal.n.e(pattern, "pattern");
            this.f31414a = pattern;
            this.f31415b = i10;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f31414a, this.f31415b);
            kotlin.jvm.internal.n.d(compile, "compile(pattern, flags)");
            return new f(compile);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.n.e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.n.d(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xk.f.<init>(java.lang.String):void");
    }

    public f(Pattern nativePattern) {
        kotlin.jvm.internal.n.e(nativePattern, "nativePattern");
        this.f31412a = nativePattern;
    }

    private final Object writeReplace() {
        String pattern = this.f31412a.pattern();
        kotlin.jvm.internal.n.d(pattern, "nativePattern.pattern()");
        return new b(pattern, this.f31412a.flags());
    }

    public final boolean a(CharSequence input) {
        kotlin.jvm.internal.n.e(input, "input");
        return this.f31412a.matcher(input).matches();
    }

    public final String b(CharSequence input, String replacement) {
        kotlin.jvm.internal.n.e(input, "input");
        kotlin.jvm.internal.n.e(replacement, "replacement");
        String replaceAll = this.f31412a.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.n.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final List<String> c(CharSequence input, int i10) {
        List<String> e10;
        kotlin.jvm.internal.n.e(input, "input");
        q.p0(i10);
        Matcher matcher = this.f31412a.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            e10 = dk.q.e(input.toString());
            return e10;
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? uk.l.d(i10, 10) : 10);
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
        String pattern = this.f31412a.toString();
        kotlin.jvm.internal.n.d(pattern, "nativePattern.toString()");
        return pattern;
    }
}
