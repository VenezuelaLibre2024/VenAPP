package uk;

import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class c extends uk.a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f27785e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final c f27786f = new c(1, 0);

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public c(char c10, char c11) {
        super(c10, c11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (c() != cVar.c() || d() != cVar.d()) {
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
        return (c() * 31) + d();
    }

    public boolean isEmpty() {
        return n.f(c(), d()) > 0;
    }

    public String toString() {
        return c() + ".." + d();
    }
}
