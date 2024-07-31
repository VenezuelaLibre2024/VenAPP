package p000;

import dk.C7029q;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: b */
/* loaded from: classes2.dex */
public final class C1589b {

    /* renamed from: b */
    public static final a f6819b = new a(null);

    /* renamed from: a */
    private final Boolean f6820a;

    /* renamed from: b$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C1589b m8828a(List<? extends Object> list) {
            C9322n.m27781e(list, "list");
            return new C1589b((Boolean) list.get(0));
        }
    }

    public C1589b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C1589b(Boolean bool) {
        this.f6820a = bool;
    }

    public /* synthetic */ C1589b(Boolean bool, int i10, C9315g c9315g) {
        this((i10 & 1) != 0 ? null : bool);
    }

    /* renamed from: a */
    public final List<Object> m8827a() {
        List<Object> m20572e;
        m20572e = C7029q.m20572e(this.f6820a);
        return m20572e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1589b) && C9322n.m27777a(this.f6820a, ((C1589b) obj).f6820a);
    }

    public int hashCode() {
        Boolean bool = this.f6820a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "IsEnabledMessage(enabled=" + this.f6820a + ')';
    }
}
