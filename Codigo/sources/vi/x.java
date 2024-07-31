package vi;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vi.a;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final a.c<String> f29239d = a.c.a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: a, reason: collision with root package name */
    private final List<SocketAddress> f29240a;

    /* renamed from: b, reason: collision with root package name */
    private final a f29241b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29242c;

    public x(SocketAddress socketAddress) {
        this(socketAddress, a.f29024c);
    }

    public x(SocketAddress socketAddress, a aVar) {
        this((List<SocketAddress>) Collections.singletonList(socketAddress), aVar);
    }

    public x(List<SocketAddress> list) {
        this(list, a.f29024c);
    }

    public x(List<SocketAddress> list, a aVar) {
        eb.o.e(!list.isEmpty(), "addrs is empty");
        List<SocketAddress> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f29240a = unmodifiableList;
        this.f29241b = (a) eb.o.p(aVar, "attrs");
        this.f29242c = unmodifiableList.hashCode();
    }

    public List<SocketAddress> a() {
        return this.f29240a;
    }

    public a b() {
        return this.f29241b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f29240a.size() != xVar.f29240a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f29240a.size(); i10++) {
            if (!this.f29240a.get(i10).equals(xVar.f29240a.get(i10))) {
                return false;
            }
        }
        return this.f29241b.equals(xVar.f29241b);
    }

    public int hashCode() {
        return this.f29242c;
    }

    public String toString() {
        return "[" + this.f29240a + "/" + this.f29241b + "]";
    }
}
