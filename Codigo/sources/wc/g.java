package wc;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g implements Closeable {

    /* renamed from: r, reason: collision with root package name */
    private static final Logger f29847r = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f29848a;

    /* renamed from: b, reason: collision with root package name */
    int f29849b;

    /* renamed from: c, reason: collision with root package name */
    private int f29850c;

    /* renamed from: d, reason: collision with root package name */
    private b f29851d;

    /* renamed from: e, reason: collision with root package name */
    private b f29852e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f29853f = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        boolean f29854a = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f29855b;

        a(StringBuilder sb2) {
            this.f29855b = sb2;
        }

        @Override // wc.g.d
        public void a(InputStream inputStream, int i10) {
            if (this.f29854a) {
                this.f29854a = false;
            } else {
                this.f29855b.append(", ");
            }
            this.f29855b.append(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f29857c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        final int f29858a;

        /* renamed from: b, reason: collision with root package name */
        final int f29859b;

        b(int i10, int i11) {
            this.f29858a = i10;
            this.f29859b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f29858a + ", length = " + this.f29859b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        private int f29860a;

        /* renamed from: b, reason: collision with root package name */
        private int f29861b;

        private c(b bVar) {
            this.f29860a = g.this.a0(bVar.f29858a + 4);
            this.f29861b = bVar.f29859b;
        }

        /* synthetic */ c(g gVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f29861b == 0) {
                return -1;
            }
            g.this.f29848a.seek(this.f29860a);
            int read = g.this.f29848a.read();
            this.f29860a = g.this.a0(this.f29860a + 1);
            this.f29861b--;
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            g.r(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f29861b;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            g.this.Q(this.f29860a, bArr, i10, i11);
            this.f29860a = g.this.a0(this.f29860a + i11);
            this.f29861b -= i11;
            return i11;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(InputStream inputStream, int i10);
    }

    public g(File file) {
        if (!file.exists()) {
            o(file);
        }
        this.f29848a = y(file);
        E();
    }

    private b B(int i10) {
        if (i10 == 0) {
            return b.f29857c;
        }
        this.f29848a.seek(i10);
        return new b(i10, this.f29848a.readInt());
    }

    private void E() {
        this.f29848a.seek(0L);
        this.f29848a.readFully(this.f29853f);
        int H = H(this.f29853f, 0);
        this.f29849b = H;
        if (H <= this.f29848a.length()) {
            this.f29850c = H(this.f29853f, 4);
            int H2 = H(this.f29853f, 8);
            int H3 = H(this.f29853f, 12);
            this.f29851d = B(H2);
            this.f29852e = B(H3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f29849b + ", Actual length: " + this.f29848a.length());
    }

    private static int H(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private int I() {
        return this.f29849b - U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(int i10, byte[] bArr, int i11, int i12) {
        RandomAccessFile randomAccessFile;
        int a02 = a0(i10);
        int i13 = a02 + i12;
        int i14 = this.f29849b;
        if (i13 <= i14) {
            this.f29848a.seek(a02);
            randomAccessFile = this.f29848a;
        } else {
            int i15 = i14 - a02;
            this.f29848a.seek(a02);
            this.f29848a.readFully(bArr, i11, i15);
            this.f29848a.seek(16L);
            randomAccessFile = this.f29848a;
            i11 += i15;
            i12 -= i15;
        }
        randomAccessFile.readFully(bArr, i11, i12);
    }

    private void R(int i10, byte[] bArr, int i11, int i12) {
        RandomAccessFile randomAccessFile;
        int a02 = a0(i10);
        int i13 = a02 + i12;
        int i14 = this.f29849b;
        if (i13 <= i14) {
            this.f29848a.seek(a02);
            randomAccessFile = this.f29848a;
        } else {
            int i15 = i14 - a02;
            this.f29848a.seek(a02);
            this.f29848a.write(bArr, i11, i15);
            this.f29848a.seek(16L);
            randomAccessFile = this.f29848a;
            i11 += i15;
            i12 -= i15;
        }
        randomAccessFile.write(bArr, i11, i12);
    }

    private void S(int i10) {
        this.f29848a.setLength(i10);
        this.f29848a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a0(int i10) {
        int i11 = this.f29849b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    private void c0(int i10, int i11, int i12, int i13) {
        i0(this.f29853f, i10, i11, i12, i13);
        this.f29848a.seek(0L);
        this.f29848a.write(this.f29853f);
    }

    private static void h0(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static void i0(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            h0(bArr, i10, i11);
            i10 += 4;
        }
    }

    private void l(int i10) {
        int i11 = i10 + 4;
        int I = I();
        if (I >= i11) {
            return;
        }
        int i12 = this.f29849b;
        do {
            I += i12;
            i12 <<= 1;
        } while (I < i11);
        S(i12);
        b bVar = this.f29852e;
        int a02 = a0(bVar.f29858a + 4 + bVar.f29859b);
        if (a02 < this.f29851d.f29858a) {
            FileChannel channel = this.f29848a.getChannel();
            channel.position(this.f29849b);
            long j10 = a02 - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f29852e.f29858a;
        int i14 = this.f29851d.f29858a;
        if (i13 < i14) {
            int i15 = (this.f29849b + i13) - 16;
            c0(i12, this.f29850c, i14, i15);
            this.f29852e = new b(i15, this.f29852e.f29859b);
        } else {
            c0(i12, this.f29850c, i14, i13);
        }
        this.f29849b = i12;
    }

    private static void o(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile y10 = y(file2);
        try {
            y10.setLength(4096L);
            y10.seek(0L);
            byte[] bArr = new byte[16];
            i0(bArr, RecognitionOptions.AZTEC, 0, 0, 0);
            y10.write(bArr);
            y10.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            y10.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T r(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile y(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    public synchronized void O() {
        if (q()) {
            throw new NoSuchElementException();
        }
        if (this.f29850c == 1) {
            j();
        } else {
            b bVar = this.f29851d;
            int a02 = a0(bVar.f29858a + 4 + bVar.f29859b);
            Q(a02, this.f29853f, 0, 4);
            int H = H(this.f29853f, 0);
            c0(this.f29849b, this.f29850c - 1, a02, this.f29852e.f29858a);
            this.f29850c--;
            this.f29851d = new b(a02, H);
        }
    }

    public int U() {
        if (this.f29850c == 0) {
            return 16;
        }
        b bVar = this.f29852e;
        int i10 = bVar.f29858a;
        int i11 = this.f29851d.f29858a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f29859b + 16 : (((i10 + 4) + bVar.f29859b) + this.f29849b) - i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f29848a.close();
    }

    public void g(byte[] bArr) {
        i(bArr, 0, bArr.length);
    }

    public synchronized void i(byte[] bArr, int i10, int i11) {
        int a02;
        r(bArr, "buffer");
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        l(i11);
        boolean q10 = q();
        if (q10) {
            a02 = 16;
        } else {
            b bVar = this.f29852e;
            a02 = a0(bVar.f29858a + 4 + bVar.f29859b);
        }
        b bVar2 = new b(a02, i11);
        h0(this.f29853f, 0, i11);
        R(bVar2.f29858a, this.f29853f, 0, 4);
        R(bVar2.f29858a + 4, bArr, i10, i11);
        c0(this.f29849b, this.f29850c + 1, q10 ? bVar2.f29858a : this.f29851d.f29858a, bVar2.f29858a);
        this.f29852e = bVar2;
        this.f29850c++;
        if (q10) {
            this.f29851d = bVar2;
        }
    }

    public synchronized void j() {
        c0(RecognitionOptions.AZTEC, 0, 0, 0);
        this.f29850c = 0;
        b bVar = b.f29857c;
        this.f29851d = bVar;
        this.f29852e = bVar;
        if (this.f29849b > 4096) {
            S(RecognitionOptions.AZTEC);
        }
        this.f29849b = RecognitionOptions.AZTEC;
    }

    public synchronized void n(d dVar) {
        int i10 = this.f29851d.f29858a;
        for (int i11 = 0; i11 < this.f29850c; i11++) {
            b B = B(i10);
            dVar.a(new c(this, B, null), B.f29859b);
            i10 = a0(B.f29858a + 4 + B.f29859b);
        }
    }

    public synchronized boolean q() {
        return this.f29850c == 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f29849b);
        sb2.append(", size=");
        sb2.append(this.f29850c);
        sb2.append(", first=");
        sb2.append(this.f29851d);
        sb2.append(", last=");
        sb2.append(this.f29852e);
        sb2.append(", element lengths=[");
        try {
            n(new a(sb2));
        } catch (IOException e10) {
            f29847r.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }
}
