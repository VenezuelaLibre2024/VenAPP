package dm;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class w extends a {

    /* renamed from: m, reason: collision with root package name */
    private final Socket f14337m;

    public w(Socket socket) {
        kotlin.jvm.internal.n.e(socket, "socket");
        this.f14337m = socket;
    }

    @Override // dm.a
    protected IOException v(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dm.a
    protected void z() {
        Logger logger;
        Level level;
        StringBuilder sb2;
        Logger logger2;
        Exception exc;
        Logger logger3;
        try {
            this.f14337m.close();
        } catch (AssertionError e10) {
            if (!l.c(e10)) {
                throw e10;
            }
            logger3 = m.f14310a;
            level = Level.WARNING;
            sb2 = new StringBuilder();
            exc = e10;
            logger2 = logger3;
            sb2.append("Failed to close timed out socket ");
            sb2.append(this.f14337m);
            logger2.log(level, sb2.toString(), (Throwable) exc);
        } catch (Exception e11) {
            logger = m.f14310a;
            level = Level.WARNING;
            sb2 = new StringBuilder();
            exc = e11;
            logger2 = logger;
            sb2.append("Failed to close timed out socket ");
            sb2.append(this.f14337m);
            logger2.log(level, sb2.toString(), (Throwable) exc);
        }
    }
}
