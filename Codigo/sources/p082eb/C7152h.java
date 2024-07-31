package p082eb;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: eb.h */
/* loaded from: classes2.dex */
public class C7152h {

    /* renamed from: a */
    private final String f16023a;

    private C7152h(String str) {
        this.f16023a = (String) C7159o.m21312o(str);
    }

    /* renamed from: f */
    public static C7152h m21264f(char c10) {
        return new C7152h(String.valueOf(c10));
    }

    /* renamed from: g */
    public static C7152h m21265g(String str) {
        return new C7152h(str);
    }

    /* renamed from: a */
    public <A extends Appendable> A m21266a(A a10, Iterator<? extends Object> it) {
        C7159o.m21312o(a10);
        if (it.hasNext()) {
            while (true) {
                a10.append(m21271h(it.next()));
                if (!it.hasNext()) {
                    break;
                }
                a10.append(this.f16023a);
            }
        }
        return a10;
    }

    /* renamed from: b */
    public final StringBuilder m21267b(StringBuilder sb2, Iterable<? extends Object> iterable) {
        return m21268c(sb2, iterable.iterator());
    }

    /* renamed from: c */
    public final StringBuilder m21268c(StringBuilder sb2, Iterator<? extends Object> it) {
        try {
            m21266a(sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: d */
    public final String m21269d(Iterable<? extends Object> iterable) {
        return m21270e(iterable.iterator());
    }

    /* renamed from: e */
    public final String m21270e(Iterator<? extends Object> it) {
        return m21268c(new StringBuilder(), it).toString();
    }

    /* renamed from: h */
    CharSequence m21271h(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
