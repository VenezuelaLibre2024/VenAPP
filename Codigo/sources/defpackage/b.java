package defpackage;

import dk.q;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f5964b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f5965a;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final b a(List<? extends Object> list) {
            n.e(list, "list");
            return new b((Boolean) list.get(0));
        }
    }

    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public b(Boolean bool) {
        this.f5965a = bool;
    }

    public /* synthetic */ b(Boolean bool, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : bool);
    }

    public final List<Object> a() {
        List<Object> e10;
        e10 = q.e(this.f5965a);
        return e10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && n.a(this.f5965a, ((b) obj).f5965a);
    }

    public int hashCode() {
        Boolean bool = this.f5965a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "IsEnabledMessage(enabled=" + this.f5965a + ')';
    }
}
