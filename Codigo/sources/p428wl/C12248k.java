package p428wl;

import java.net.ProtocolException;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.EnumC10551z;
import p450xk.C12524p;

/* renamed from: wl.k */
/* loaded from: classes3.dex */
public final class C12248k {

    /* renamed from: d */
    public static final a f32733d = new a(null);

    /* renamed from: a */
    public final EnumC10551z f32734a;

    /* renamed from: b */
    public final int f32735b;

    /* renamed from: c */
    public final String f32736c;

    /* renamed from: wl.k$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C12248k m39433a(String statusLine) {
            boolean m41031E;
            boolean m41031E2;
            EnumC10551z enumC10551z;
            int i10;
            String str;
            C9322n.m27781e(statusLine, "statusLine");
            m41031E = C12524p.m41031E(statusLine, "HTTP/1.", false, 2, null);
            if (m41031E) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException(C9322n.m27787k("Unexpected status line: ", statusLine));
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt == 0) {
                    enumC10551z = EnumC10551z.HTTP_1_0;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException(C9322n.m27787k("Unexpected status line: ", statusLine));
                    }
                    enumC10551z = EnumC10551z.HTTP_1_1;
                }
            } else {
                m41031E2 = C12524p.m41031E(statusLine, "ICY ", false, 2, null);
                if (!m41031E2) {
                    throw new ProtocolException(C9322n.m27787k("Unexpected status line: ", statusLine));
                }
                enumC10551z = EnumC10551z.HTTP_1_0;
                i10 = 4;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException(C9322n.m27787k("Unexpected status line: ", statusLine));
            }
            try {
                String substring = statusLine.substring(i10, i11);
                C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (statusLine.length() <= i11) {
                    str = "";
                } else {
                    if (statusLine.charAt(i11) != ' ') {
                        throw new ProtocolException(C9322n.m27787k("Unexpected status line: ", statusLine));
                    }
                    str = statusLine.substring(i10 + 4);
                    C9322n.m27780d(str, "this as java.lang.String).substring(startIndex)");
                }
                return new C12248k(enumC10551z, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(C9322n.m27787k("Unexpected status line: ", statusLine));
            }
        }
    }

    public C12248k(EnumC10551z protocol, int i10, String message) {
        C9322n.m27781e(protocol, "protocol");
        C9322n.m27781e(message, "message");
        this.f32734a = protocol;
        this.f32735b = i10;
        this.f32736c = message;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f32734a == EnumC10551z.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f32735b);
        sb2.append(' ');
        sb2.append(this.f32736c);
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
