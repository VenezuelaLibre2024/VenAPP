package la;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
/* loaded from: classes.dex */
public final class l {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static long b(InputStream inputStream, OutputStream outputStream) {
        return c(inputStream, outputStream, false, RecognitionOptions.UPC_E);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static long c(InputStream inputStream, OutputStream outputStream, boolean z10, int i10) {
        byte[] bArr = new byte[i10];
        long j10 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i10);
                if (read == -1) {
                    break;
                }
                j10 += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th2) {
                if (z10) {
                    a(inputStream);
                    a(outputStream);
                }
                throw th2;
            }
        }
        if (z10) {
            a(inputStream);
            a(outputStream);
        }
        return j10;
    }

    @Deprecated
    public static byte[] d(InputStream inputStream, boolean z10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c(inputStream, byteArrayOutputStream, z10, RecognitionOptions.UPC_E);
        return byteArrayOutputStream.toByteArray();
    }
}
