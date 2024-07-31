package la;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
/* renamed from: la.l */
/* loaded from: classes.dex */
public final class C9467l {
    /* renamed from: a */
    public static void m28157a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    /* renamed from: b */
    public static long m28158b(InputStream inputStream, OutputStream outputStream) {
        return m28159c(inputStream, outputStream, false, RecognitionOptions.UPC_E);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    /* renamed from: c */
    public static long m28159c(InputStream inputStream, OutputStream outputStream, boolean z10, int i10) {
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
                    m28157a(inputStream);
                    m28157a(outputStream);
                }
                throw th2;
            }
        }
        if (z10) {
            m28157a(inputStream);
            m28157a(outputStream);
        }
        return j10;
    }

    @Deprecated
    /* renamed from: d */
    public static byte[] m28160d(InputStream inputStream, boolean z10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m28159c(inputStream, byteArrayOutputStream, z10, RecognitionOptions.UPC_E);
        return byteArrayOutputStream.toByteArray();
    }
}
