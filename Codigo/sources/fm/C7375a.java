package fm;

import com.google.android.libraries.barhopper.RecognitionOptions;
import gm.C7603a;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/* renamed from: fm.a */
/* loaded from: classes3.dex */
public class C7375a {

    /* renamed from: a */
    public static final char f16679a = File.separatorChar;

    /* renamed from: b */
    public static final String f16680b;

    static {
        C7603a c7603a = new C7603a(4);
        try {
            PrintWriter printWriter = new PrintWriter(c7603a);
            try {
                printWriter.println();
                f16680b = c7603a.toString();
                printWriter.close();
                c7603a.close();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    c7603a.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    /* renamed from: a */
    public static int m22247a(InputStream inputStream, OutputStream outputStream) {
        long m22249c = m22249c(inputStream, outputStream);
        if (m22249c > 2147483647L) {
            return -1;
        }
        return (int) m22249c;
    }

    /* renamed from: b */
    public static long m22248b(InputStream inputStream, OutputStream outputStream, int i10) {
        return m22250d(inputStream, outputStream, new byte[i10]);
    }

    /* renamed from: c */
    public static long m22249c(InputStream inputStream, OutputStream outputStream) {
        return m22248b(inputStream, outputStream, RecognitionOptions.AZTEC);
    }

    /* renamed from: d */
    public static long m22250d(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j10;
            }
            outputStream.write(bArr, 0, read);
            j10 += read;
        }
    }

    /* renamed from: e */
    public static void m22251e(byte[] bArr, OutputStream outputStream) {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }
}
