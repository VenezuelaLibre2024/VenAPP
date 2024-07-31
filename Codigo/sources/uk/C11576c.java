package uk;

import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: uk.c */
/* loaded from: classes3.dex */
public final class C11576c extends C11574a {

    /* renamed from: e */
    public static final a f30108e = new a(null);

    /* renamed from: f */
    private static final C11576c f30109f = new C11576c(1, 0);

    /* renamed from: uk.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C11576c(char c10, char c11) {
        super(c10, c11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11576c) {
            if (!isEmpty() || !((C11576c) obj).isEmpty()) {
                C11576c c11576c = (C11576c) obj;
                if (m36265c() != c11576c.m36265c() || m36266d() != c11576c.m36266d()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m36265c() * 31) + m36266d();
    }

    public boolean isEmpty() {
        return C9322n.m27782f(m36265c(), m36266d()) > 0;
    }

    public String toString() {
        return m36265c() + ".." + m36266d();
    }
}
