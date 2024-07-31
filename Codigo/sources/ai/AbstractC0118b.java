package ai;

import java.util.List;
import p469yh.C12700c0;

/* renamed from: ai.b */
/* loaded from: classes3.dex */
public abstract class AbstractC0118b implements InterfaceC0121e {
    /* renamed from: h */
    private Boolean m556h(String str) {
        Object mo565a = mo565a(str);
        if (mo565a instanceof Boolean) {
            return (Boolean) mo565a;
        }
        return null;
    }

    /* renamed from: j */
    private String m557j() {
        return (String) mo565a("sql");
    }

    /* renamed from: k */
    private List<Object> m558k() {
        return (List) mo565a("arguments");
    }

    @Override // ai.InterfaceC0121e
    /* renamed from: b */
    public boolean mo559b() {
        return mo566c("transactionId") && mo563g() == null;
    }

    @Override // ai.InterfaceC0121e
    /* renamed from: d */
    public Boolean mo560d() {
        return m556h("inTransaction");
    }

    @Override // ai.InterfaceC0121e
    /* renamed from: e */
    public C12700c0 mo561e() {
        return new C12700c0(m557j(), m558k());
    }

    @Override // ai.InterfaceC0121e
    /* renamed from: f */
    public boolean mo562f() {
        return Boolean.TRUE.equals(mo565a("noResult"));
    }

    @Override // ai.InterfaceC0121e
    /* renamed from: g */
    public Integer mo563g() {
        return (Integer) mo565a("transactionId");
    }

    /* renamed from: i */
    public boolean m564i() {
        return Boolean.TRUE.equals(mo565a("continueOnError"));
    }

    public String toString() {
        return "" + getMethod() + " " + m557j() + " " + m558k();
    }
}
