package p216l7;

import p235m7.C9551b;
import p250n7.C9673b;
import p290p7.C10108a;
import p306q7.C10286h;
import p350s7.C10804c;
import p361t6.C11108u1;

/* renamed from: l7.c */
/* loaded from: classes.dex */
public interface InterfaceC9402c {

    /* renamed from: a */
    public static final InterfaceC9402c f22805a = new a();

    /* renamed from: l7.c$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC9402c {
        a() {
        }

        @Override // p216l7.InterfaceC9402c
        /* renamed from: a */
        public boolean mo28006a(C11108u1 c11108u1) {
            String str = c11108u1.f28797w;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // p216l7.InterfaceC9402c
        /* renamed from: b */
        public InterfaceC9401b mo28007b(C11108u1 c11108u1) {
            String str = c11108u1.f28797w;
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new C9551b();
                    case 1:
                        return new C10108a();
                    case 2:
                        return new C10286h();
                    case 3:
                        return new C9673b();
                    case 4:
                        return new C10804c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    /* renamed from: a */
    boolean mo28006a(C11108u1 c11108u1);

    /* renamed from: b */
    InterfaceC9401b mo28007b(C11108u1 c11108u1);
}
