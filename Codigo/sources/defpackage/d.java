package defpackage;

import dk.q;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f13671b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f13672a;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final d a(List<? extends Object> list) {
            n.e(list, "list");
            return new d((Boolean) list.get(0));
        }
    }

    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public d(Boolean bool) {
        this.f13672a = bool;
    }

    public /* synthetic */ d(Boolean bool, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : bool);
    }

    public final Boolean a() {
        return this.f13672a;
    }

    public final List<Object> b() {
        List<Object> e10;
        e10 = q.e(this.f13672a);
        return e10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && n.a(this.f13672a, ((d) obj).f13672a);
    }

    public int hashCode() {
        Boolean bool = this.f13672a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "ToggleMessage(enable=" + this.f13672a + ')';
    }
}
