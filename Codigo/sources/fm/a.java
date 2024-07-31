package fm;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char f15256a = File.separatorChar;

    /* renamed from: b, reason: collision with root package name */
    public static final String f15257b;

    static {
        gm.a aVar = new gm.a(4);
        try {
            PrintWriter printWriter = new PrintWriter(aVar);
            try {
                printWriter.println();
                f15257b = aVar.toString();
                printWriter.close();
                aVar.close();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    aVar.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        long c10 = c(inputStream, outputStream);
        if (c10 > 2147483647L) {
            return -1;
        }
        return (int) c10;
    }

    public static long b(InputStream inputStream, OutputStream outputStream, int i10) {
        return d(inputStream, outputStream, new byte[i10]);
    }

    public static long c(InputStream inputStream, OutputStream outputStream) {
        return b(inputStream, outputStream, RecognitionOptions.AZTEC);
    }

    public static long d(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
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

    public static void e(byte[] bArr, OutputStream outputStream) {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }
}
