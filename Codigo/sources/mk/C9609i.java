package mk;

import dk.C7019l;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import kotlin.jvm.internal.C9322n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: mk.i */
/* loaded from: classes3.dex */
public class C9609i extends C9608h {
    /* renamed from: a */
    public static byte[] m28601a(File file) {
        C9322n.m27781e(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i10 = (int) length;
            byte[] bArr = new byte[i10];
            int i11 = i10;
            int i12 = 0;
            while (i11 > 0) {
                int read = fileInputStream.read(bArr, i12, i11);
                if (read < 0) {
                    break;
                }
                i11 -= read;
                i12 += read;
            }
            if (i11 > 0) {
                bArr = Arrays.copyOf(bArr, i12);
                C9322n.m27780d(bArr, "copyOf(this, newSize)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    C9604d c9604d = new C9604d(8193);
                    c9604d.write(read2);
                    C9601a.m28591b(fileInputStream, c9604d, 0, 2, null);
                    int size = c9604d.size() + i10;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] m28596a = c9604d.m28596a();
                    byte[] copyOf = Arrays.copyOf(bArr, size);
                    C9322n.m27780d(copyOf, "copyOf(this, newSize)");
                    bArr = C7019l.m20436d(m28596a, copyOf, i10, 0, c9604d.size());
                }
            }
            C9602b.m28593a(fileInputStream, null);
            return bArr;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C9602b.m28593a(fileInputStream, th2);
                throw th3;
            }
        }
    }
}
