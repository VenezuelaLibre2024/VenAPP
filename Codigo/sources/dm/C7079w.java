package dm;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C9322n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dm.w */
/* loaded from: classes3.dex */
public final class C7079w extends C7054a {

    /* renamed from: m */
    private final Socket f15695m;

    public C7079w(Socket socket) {
        C9322n.m27781e(socket, "socket");
        this.f15695m = socket;
    }

    @Override // dm.C7054a
    /* renamed from: v */
    protected IOException mo20673v(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dm.C7054a
    /* renamed from: z */
    protected void mo20676z() {
        Logger logger;
        Level level;
        StringBuilder sb2;
        Logger logger2;
        Exception exc;
        Logger logger3;
        try {
            this.f15695m.close();
        } catch (AssertionError e10) {
            if (!C7068l.m20804c(e10)) {
                throw e10;
            }
            logger3 = C7069m.f15668a;
            level = Level.WARNING;
            sb2 = new StringBuilder();
            exc = e10;
            logger2 = logger3;
            sb2.append("Failed to close timed out socket ");
            sb2.append(this.f15695m);
            logger2.log(level, sb2.toString(), (Throwable) exc);
        } catch (Exception e11) {
            logger = C7069m.f15668a;
            level = Level.WARNING;
            sb2 = new StringBuilder();
            exc = e11;
            logger2 = logger;
            sb2.append("Failed to close timed out socket ");
            sb2.append(this.f15695m);
            logger2.log(level, sb2.toString(), (Throwable) exc);
        }
    }
}
