package mk;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import kotlin.jvm.internal.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class i extends h {
    public static byte[] a(File file) {
        n.e(file, "<this>");
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
                n.d(bArr, "copyOf(this, newSize)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    d dVar = new d(8193);
                    dVar.write(read2);
                    a.b(fileInputStream, dVar, 0, 2, null);
                    int size = dVar.size() + i10;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] a10 = dVar.a();
                    byte[] copyOf = Arrays.copyOf(bArr, size);
                    n.d(copyOf, "copyOf(this, newSize)");
                    bArr = dk.l.d(a10, copyOf, i10, 0, dVar.size());
                }
            }
            b.a(fileInputStream, null);
            return bArr;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(fileInputStream, th2);
                throw th3;
            }
        }
    }
}
