package wl;

import java.net.ProtocolException;
import kotlin.jvm.internal.n;
import ql.z;
import xk.p;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final a f30221d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final z f30222a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30223b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30224c;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final k a(String statusLine) {
            boolean E;
            boolean E2;
            z zVar;
            int i10;
            String str;
            n.e(statusLine, "statusLine");
            E = p.E(statusLine, "HTTP/1.", false, 2, null);
            if (E) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException(n.k("Unexpected status line: ", statusLine));
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt == 0) {
                    zVar = z.HTTP_1_0;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException(n.k("Unexpected status line: ", statusLine));
                    }
                    zVar = z.HTTP_1_1;
                }
            } else {
                E2 = p.E(statusLine, "ICY ", false, 2, null);
                if (!E2) {
                    throw new ProtocolException(n.k("Unexpected status line: ", statusLine));
                }
                zVar = z.HTTP_1_0;
                i10 = 4;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException(n.k("Unexpected status line: ", statusLine));
            }
            try {
                String substring = statusLine.substring(i10, i11);
                n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (statusLine.length() <= i11) {
                    str = "";
                } else {
                    if (statusLine.charAt(i11) != ' ') {
                        throw new ProtocolException(n.k("Unexpected status line: ", statusLine));
                    }
                    str = statusLine.substring(i10 + 4);
                    n.d(str, "this as java.lang.String).substring(startIndex)");
                }
                return new k(zVar, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(n.k("Unexpected status line: ", statusLine));
            }
        }
    }

    public k(z protocol, int i10, String message) {
        n.e(protocol, "protocol");
        n.e(message, "message");
        this.f30222a = protocol;
        this.f30223b = i10;
        this.f30224c = message;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30222a == z.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f30223b);
        sb2.append(' ');
        sb2.append(this.f30224c);
        String sb3 = sb2.toString();
        n.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
