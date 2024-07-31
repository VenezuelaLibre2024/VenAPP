package dm;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.C9322n;
import p450xk.C12525q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dm.m */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7069m {

    /* renamed from: a */
    private static final Logger f15668a = Logger.getLogger("okio.Okio");

    /* renamed from: b */
    public static final boolean m20811b(AssertionError assertionError) {
        C9322n.m27781e(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? C12525q.m41059J(message, "getsockname failed", false, 2, null) : false;
    }

    /* renamed from: c */
    public static final InterfaceC7078v m20812c(OutputStream outputStream) {
        C9322n.m27781e(outputStream, "<this>");
        return new C7072p(outputStream, new C7081y());
    }

    /* renamed from: d */
    public static final InterfaceC7078v m20813d(Socket socket) {
        C9322n.m27781e(socket, "<this>");
        C7079w c7079w = new C7079w(socket);
        OutputStream outputStream = socket.getOutputStream();
        C9322n.m27780d(outputStream, "getOutputStream()");
        return c7079w.m20674x(new C7072p(outputStream, c7079w));
    }

    /* renamed from: e */
    public static final InterfaceC7080x m20814e(File file) {
        C9322n.m27781e(file, "<this>");
        return new C7067k(new FileInputStream(file), C7081y.f15697e);
    }

    /* renamed from: f */
    public static final InterfaceC7080x m20815f(InputStream inputStream) {
        C9322n.m27781e(inputStream, "<this>");
        return new C7067k(inputStream, new C7081y());
    }

    /* renamed from: g */
    public static final InterfaceC7080x m20816g(Socket socket) {
        C9322n.m27781e(socket, "<this>");
        C7079w c7079w = new C7079w(socket);
        InputStream inputStream = socket.getInputStream();
        C9322n.m27780d(inputStream, "getInputStream()");
        return c7079w.m20675y(new C7067k(inputStream, c7079w));
    }
}
