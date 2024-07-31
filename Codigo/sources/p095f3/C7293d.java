package p095f3;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: f3.d */
/* loaded from: classes.dex */
final class C7293d {

    /* renamed from: a */
    static final Charset f16373a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f16374b = Charset.forName("UTF-8");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21868a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m21869b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                m21869b(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
