package mk;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.C9322n;

/* renamed from: mk.a */
/* loaded from: classes3.dex */
public final class C9601a {
    /* renamed from: a */
    public static final long m28590a(InputStream inputStream, OutputStream out, int i10) {
        C9322n.m27781e(inputStream, "<this>");
        C9322n.m27781e(out, "out");
        byte[] bArr = new byte[i10];
        int read = inputStream.read(bArr);
        long j10 = 0;
        while (read >= 0) {
            out.write(bArr, 0, read);
            j10 += read;
            read = inputStream.read(bArr);
        }
        return j10;
    }

    /* renamed from: b */
    public static /* synthetic */ long m28591b(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return m28590a(inputStream, outputStream, i10);
    }

    /* renamed from: c */
    public static final byte[] m28592c(InputStream inputStream) {
        C9322n.m27781e(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m28591b(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C9322n.m27780d(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
}
