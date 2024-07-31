package dm;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final /* synthetic */ class m {

    /* renamed from: a */
    private static final Logger f14310a = Logger.getLogger("okio.Okio");

    public static final boolean b(AssertionError assertionError) {
        kotlin.jvm.internal.n.e(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? xk.q.J(message, "getsockname failed", false, 2, null) : false;
    }

    public static final v c(OutputStream outputStream) {
        kotlin.jvm.internal.n.e(outputStream, "<this>");
        return new p(outputStream, new y());
    }

    public static final v d(Socket socket) {
        kotlin.jvm.internal.n.e(socket, "<this>");
        w wVar = new w(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.n.d(outputStream, "getOutputStream()");
        return wVar.x(new p(outputStream, wVar));
    }

    public static final x e(File file) {
        kotlin.jvm.internal.n.e(file, "<this>");
        return new k(new FileInputStream(file), y.f14339e);
    }

    public static final x f(InputStream inputStream) {
        kotlin.jvm.internal.n.e(inputStream, "<this>");
        return new k(inputStream, new y());
    }

    public static final x g(Socket socket) {
        kotlin.jvm.internal.n.e(socket, "<this>");
        w wVar = new w(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.n.d(inputStream, "getInputStream()");
        return wVar.y(new k(inputStream, wVar));
    }
}
