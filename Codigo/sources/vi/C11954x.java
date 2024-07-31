package vi;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p082eb.C7159o;
import vi.C11895a;

/* renamed from: vi.x */
/* loaded from: classes3.dex */
public final class C11954x {

    /* renamed from: d */
    public static final C11895a.c<String> f31674d = C11895a.c.m38054a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: a */
    private final List<SocketAddress> f31675a;

    /* renamed from: b */
    private final C11895a f31676b;

    /* renamed from: c */
    private final int f31677c;

    public C11954x(SocketAddress socketAddress) {
        this(socketAddress, C11895a.f31458c);
    }

    public C11954x(SocketAddress socketAddress, C11895a c11895a) {
        this((List<SocketAddress>) Collections.singletonList(socketAddress), c11895a);
    }

    public C11954x(List<SocketAddress> list) {
        this(list, C11895a.f31458c);
    }

    public C11954x(List<SocketAddress> list, C11895a c11895a) {
        C7159o.m21302e(!list.isEmpty(), "addrs is empty");
        List<SocketAddress> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f31675a = unmodifiableList;
        this.f31676b = (C11895a) C7159o.m21313p(c11895a, "attrs");
        this.f31677c = unmodifiableList.hashCode();
    }

    /* renamed from: a */
    public List<SocketAddress> m38335a() {
        return this.f31675a;
    }

    /* renamed from: b */
    public C11895a m38336b() {
        return this.f31676b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11954x)) {
            return false;
        }
        C11954x c11954x = (C11954x) obj;
        if (this.f31675a.size() != c11954x.f31675a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f31675a.size(); i10++) {
            if (!this.f31675a.get(i10).equals(c11954x.f31675a.get(i10))) {
                return false;
            }
        }
        return this.f31676b.equals(c11954x.f31676b);
    }

    public int hashCode() {
        return this.f31677c;
    }

    public String toString() {
        return "[" + this.f31675a + "/" + this.f31676b + "]";
    }
}
