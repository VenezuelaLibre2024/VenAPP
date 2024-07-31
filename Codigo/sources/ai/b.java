package ai;

import java.util.List;
import yh.c0;

/* loaded from: classes3.dex */
public abstract class b implements e {
    private Boolean h(String str) {
        Object a10 = a(str);
        if (a10 instanceof Boolean) {
            return (Boolean) a10;
        }
        return null;
    }

    private String j() {
        return (String) a("sql");
    }

    private List<Object> k() {
        return (List) a("arguments");
    }

    @Override // ai.e
    public boolean b() {
        return c("transactionId") && g() == null;
    }

    @Override // ai.e
    public Boolean d() {
        return h("inTransaction");
    }

    @Override // ai.e
    public c0 e() {
        return new c0(j(), k());
    }

    @Override // ai.e
    public boolean f() {
        return Boolean.TRUE.equals(a("noResult"));
    }

    @Override // ai.e
    public Integer g() {
        return (Integer) a("transactionId");
    }

    public boolean i() {
        return Boolean.TRUE.equals(a("continueOnError"));
    }

    public String toString() {
        return "" + getMethod() + " " + j() + " " + k();
    }
}
