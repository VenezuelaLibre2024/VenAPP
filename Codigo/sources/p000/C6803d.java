package p000;

import dk.C7029q;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: d */
/* loaded from: classes2.dex */
public final class C6803d {

    /* renamed from: b */
    public static final a f15025b = new a(null);

    /* renamed from: a */
    private final Boolean f15026a;

    /* renamed from: d$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C6803d m19683a(List<? extends Object> list) {
            C9322n.m27781e(list, "list");
            return new C6803d((Boolean) list.get(0));
        }
    }

    public C6803d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C6803d(Boolean bool) {
        this.f15026a = bool;
    }

    public /* synthetic */ C6803d(Boolean bool, int i10, C9315g c9315g) {
        this((i10 & 1) != 0 ? null : bool);
    }

    /* renamed from: a */
    public final Boolean m19681a() {
        return this.f15026a;
    }

    /* renamed from: b */
    public final List<Object> m19682b() {
        List<Object> m20572e;
        m20572e = C7029q.m20572e(this.f15026a);
        return m20572e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6803d) && C9322n.m27777a(this.f15026a, ((C6803d) obj).f15026a);
    }

    public int hashCode() {
        Boolean bool = this.f15026a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "ToggleMessage(enable=" + this.f15026a + ')';
    }
}
