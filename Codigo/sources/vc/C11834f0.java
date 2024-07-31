package vc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: vc.f0 */
/* loaded from: classes.dex */
class C11834f0 {
    /* renamed from: a */
    private static void m37704a(InputStream inputStream, File file) {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        gZIPOutputStream2.finish();
                        C11839i.m37726g(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, read);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    C11839i.m37726g(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m37705b(File file, List<InterfaceC11832e0> list) {
        for (InterfaceC11832e0 interfaceC11832e0 : list) {
            InputStream inputStream = null;
            try {
                inputStream = interfaceC11832e0.mo37671h();
                if (inputStream != null) {
                    m37704a(inputStream, new File(file, interfaceC11832e0.mo37670b()));
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                C11839i.m37726g(null);
                throw th2;
            }
            C11839i.m37726g(inputStream);
        }
    }
}
