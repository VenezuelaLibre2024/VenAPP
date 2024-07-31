package p103fb;

import com.google.android.libraries.barhopper.RecognitionOptions;
import gb.C7535b;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import p082eb.C7159o;

/* renamed from: fb.b */
/* loaded from: classes2.dex */
public final class C7324b {

    /* renamed from: a */
    private static final OutputStream f16506a = new a();

    /* renamed from: fb.b$a */
    /* loaded from: classes2.dex */
    class a extends OutputStream {
        a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            C7159o.m21312o(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            C7159o.m21312o(bArr);
            C7159o.m21317t(i10, i11 + i10, bArr.length);
        }
    }

    /* renamed from: a */
    private static byte[] m21975a(Queue<byte[]> queue, int i10) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i10) {
            return remove;
        }
        int length = i10 - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i10);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i10 - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* renamed from: b */
    public static long m21976b(InputStream inputStream, OutputStream outputStream) {
        C7159o.m21312o(inputStream);
        C7159o.m21312o(outputStream);
        byte[] m21977c = m21977c();
        long j10 = 0;
        while (true) {
            int read = inputStream.read(m21977c);
            if (read == -1) {
                return j10;
            }
            outputStream.write(m21977c, 0, read);
            j10 += read;
        }
    }

    /* renamed from: c */
    static byte[] m21977c() {
        return new byte[8192];
    }

    /* renamed from: d */
    public static byte[] m21978d(InputStream inputStream) {
        C7159o.m21312o(inputStream);
        return m21979e(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: e */
    private static byte[] m21979e(InputStream inputStream, Queue<byte[]> queue, int i10) {
        int min = Math.min(8192, Math.max(RecognitionOptions.ITF, Integer.highestOneBit(i10) * 2));
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i11 = 0;
            while (i11 < min2) {
                int read = inputStream.read(bArr, i11, min2 - i11);
                if (read == -1) {
                    return m21975a(queue, i10);
                }
                i11 += read;
                i10 += read;
            }
            min = C7535b.m22885f(min, min < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return m21975a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
