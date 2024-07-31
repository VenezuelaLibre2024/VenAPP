package p420wc;

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
/* renamed from: wc.g */
/* loaded from: classes.dex */
public class C12154g implements Closeable {

    /* renamed from: r */
    private static final Logger f32312r = Logger.getLogger(C12154g.class.getName());

    /* renamed from: a */
    private final RandomAccessFile f32313a;

    /* renamed from: b */
    int f32314b;

    /* renamed from: c */
    private int f32315c;

    /* renamed from: d */
    private b f32316d;

    /* renamed from: e */
    private b f32317e;

    /* renamed from: f */
    private final byte[] f32318f = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wc.g$a */
    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a */
        boolean f32319a = true;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f32320b;

        a(StringBuilder sb2) {
            this.f32320b = sb2;
        }

        @Override // p420wc.C12154g.d
        /* renamed from: a */
        public void mo38982a(InputStream inputStream, int i10) {
            if (this.f32319a) {
                this.f32319a = false;
            } else {
                this.f32320b.append(", ");
            }
            this.f32320b.append(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wc.g$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c */
        static final b f32322c = new b(0, 0);

        /* renamed from: a */
        final int f32323a;

        /* renamed from: b */
        final int f32324b;

        b(int i10, int i11) {
            this.f32323a = i10;
            this.f32324b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f32323a + ", length = " + this.f32324b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wc.g$c */
    /* loaded from: classes.dex */
    public final class c extends InputStream {

        /* renamed from: a */
        private int f32325a;

        /* renamed from: b */
        private int f32326b;

        private c(b bVar) {
            this.f32325a = C12154g.this.m38964a0(bVar.f32323a + 4);
            this.f32326b = bVar.f32324b;
        }

        /* synthetic */ c(C12154g c12154g, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f32326b == 0) {
                return -1;
            }
            C12154g.this.f32313a.seek(this.f32325a);
            int read = C12154g.this.f32313a.read();
            this.f32325a = C12154g.this.m38964a0(this.f32325a + 1);
            this.f32326b--;
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            C12154g.m38973r(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f32326b;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            C12154g.this.m38960Q(this.f32325a, bArr, i10, i11);
            this.f32325a = C12154g.this.m38964a0(this.f32325a + i11);
            this.f32326b -= i11;
            return i11;
        }
    }

    /* renamed from: wc.g$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo38982a(InputStream inputStream, int i10);
    }

    public C12154g(File file) {
        if (!file.exists()) {
            m38972o(file);
        }
        this.f32313a = m38974y(file);
        m38957E();
    }

    /* renamed from: B */
    private b m38956B(int i10) {
        if (i10 == 0) {
            return b.f32322c;
        }
        this.f32313a.seek(i10);
        return new b(i10, this.f32313a.readInt());
    }

    /* renamed from: E */
    private void m38957E() {
        this.f32313a.seek(0L);
        this.f32313a.readFully(this.f32318f);
        int m38958H = m38958H(this.f32318f, 0);
        this.f32314b = m38958H;
        if (m38958H <= this.f32313a.length()) {
            this.f32315c = m38958H(this.f32318f, 4);
            int m38958H2 = m38958H(this.f32318f, 8);
            int m38958H3 = m38958H(this.f32318f, 12);
            this.f32316d = m38956B(m38958H2);
            this.f32317e = m38956B(m38958H3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f32314b + ", Actual length: " + this.f32313a.length());
    }

    /* renamed from: H */
    private static int m38958H(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    /* renamed from: I */
    private int m38959I() {
        return this.f32314b - m38976U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public void m38960Q(int i10, byte[] bArr, int i11, int i12) {
        RandomAccessFile randomAccessFile;
        int m38964a0 = m38964a0(i10);
        int i13 = m38964a0 + i12;
        int i14 = this.f32314b;
        if (i13 <= i14) {
            this.f32313a.seek(m38964a0);
            randomAccessFile = this.f32313a;
        } else {
            int i15 = i14 - m38964a0;
            this.f32313a.seek(m38964a0);
            this.f32313a.readFully(bArr, i11, i15);
            this.f32313a.seek(16L);
            randomAccessFile = this.f32313a;
            i11 += i15;
            i12 -= i15;
        }
        randomAccessFile.readFully(bArr, i11, i12);
    }

    /* renamed from: R */
    private void m38961R(int i10, byte[] bArr, int i11, int i12) {
        RandomAccessFile randomAccessFile;
        int m38964a0 = m38964a0(i10);
        int i13 = m38964a0 + i12;
        int i14 = this.f32314b;
        if (i13 <= i14) {
            this.f32313a.seek(m38964a0);
            randomAccessFile = this.f32313a;
        } else {
            int i15 = i14 - m38964a0;
            this.f32313a.seek(m38964a0);
            this.f32313a.write(bArr, i11, i15);
            this.f32313a.seek(16L);
            randomAccessFile = this.f32313a;
            i11 += i15;
            i12 -= i15;
        }
        randomAccessFile.write(bArr, i11, i12);
    }

    /* renamed from: S */
    private void m38962S(int i10) {
        this.f32313a.setLength(i10);
        this.f32313a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public int m38964a0(int i10) {
        int i11 = this.f32314b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    /* renamed from: c0 */
    private void m38966c0(int i10, int i11, int i12, int i13) {
        m38970i0(this.f32318f, i10, i11, i12, i13);
        this.f32313a.seek(0L);
        this.f32313a.write(this.f32318f);
    }

    /* renamed from: h0 */
    private static void m38969h0(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    /* renamed from: i0 */
    private static void m38970i0(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            m38969h0(bArr, i10, i11);
            i10 += 4;
        }
    }

    /* renamed from: l */
    private void m38971l(int i10) {
        int i11 = i10 + 4;
        int m38959I = m38959I();
        if (m38959I >= i11) {
            return;
        }
        int i12 = this.f32314b;
        do {
            m38959I += i12;
            i12 <<= 1;
        } while (m38959I < i11);
        m38962S(i12);
        b bVar = this.f32317e;
        int m38964a0 = m38964a0(bVar.f32323a + 4 + bVar.f32324b);
        if (m38964a0 < this.f32316d.f32323a) {
            FileChannel channel = this.f32313a.getChannel();
            channel.position(this.f32314b);
            long j10 = m38964a0 - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f32317e.f32323a;
        int i14 = this.f32316d.f32323a;
        if (i13 < i14) {
            int i15 = (this.f32314b + i13) - 16;
            m38966c0(i12, this.f32315c, i14, i15);
            this.f32317e = new b(i15, this.f32317e.f32324b);
        } else {
            m38966c0(i12, this.f32315c, i14, i13);
        }
        this.f32314b = i12;
    }

    /* renamed from: o */
    private static void m38972o(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile m38974y = m38974y(file2);
        try {
            m38974y.setLength(4096L);
            m38974y.seek(0L);
            byte[] bArr = new byte[16];
            m38970i0(bArr, RecognitionOptions.AZTEC, 0, 0, 0);
            m38974y.write(bArr);
            m38974y.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            m38974y.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static <T> T m38973r(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: y */
    private static RandomAccessFile m38974y(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: O */
    public synchronized void m38975O() {
        if (m38981q()) {
            throw new NoSuchElementException();
        }
        if (this.f32315c == 1) {
            m38979j();
        } else {
            b bVar = this.f32316d;
            int m38964a0 = m38964a0(bVar.f32323a + 4 + bVar.f32324b);
            m38960Q(m38964a0, this.f32318f, 0, 4);
            int m38958H = m38958H(this.f32318f, 0);
            m38966c0(this.f32314b, this.f32315c - 1, m38964a0, this.f32317e.f32323a);
            this.f32315c--;
            this.f32316d = new b(m38964a0, m38958H);
        }
    }

    /* renamed from: U */
    public int m38976U() {
        if (this.f32315c == 0) {
            return 16;
        }
        b bVar = this.f32317e;
        int i10 = bVar.f32323a;
        int i11 = this.f32316d.f32323a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f32324b + 16 : (((i10 + 4) + bVar.f32324b) + this.f32314b) - i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f32313a.close();
    }

    /* renamed from: g */
    public void m38977g(byte[] bArr) {
        m38978i(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public synchronized void m38978i(byte[] bArr, int i10, int i11) {
        int m38964a0;
        m38973r(bArr, "buffer");
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        m38971l(i11);
        boolean m38981q = m38981q();
        if (m38981q) {
            m38964a0 = 16;
        } else {
            b bVar = this.f32317e;
            m38964a0 = m38964a0(bVar.f32323a + 4 + bVar.f32324b);
        }
        b bVar2 = new b(m38964a0, i11);
        m38969h0(this.f32318f, 0, i11);
        m38961R(bVar2.f32323a, this.f32318f, 0, 4);
        m38961R(bVar2.f32323a + 4, bArr, i10, i11);
        m38966c0(this.f32314b, this.f32315c + 1, m38981q ? bVar2.f32323a : this.f32316d.f32323a, bVar2.f32323a);
        this.f32317e = bVar2;
        this.f32315c++;
        if (m38981q) {
            this.f32316d = bVar2;
        }
    }

    /* renamed from: j */
    public synchronized void m38979j() {
        m38966c0(RecognitionOptions.AZTEC, 0, 0, 0);
        this.f32315c = 0;
        b bVar = b.f32322c;
        this.f32316d = bVar;
        this.f32317e = bVar;
        if (this.f32314b > 4096) {
            m38962S(RecognitionOptions.AZTEC);
        }
        this.f32314b = RecognitionOptions.AZTEC;
    }

    /* renamed from: n */
    public synchronized void m38980n(d dVar) {
        int i10 = this.f32316d.f32323a;
        for (int i11 = 0; i11 < this.f32315c; i11++) {
            b m38956B = m38956B(i10);
            dVar.mo38982a(new c(this, m38956B, null), m38956B.f32324b);
            i10 = m38964a0(m38956B.f32323a + 4 + m38956B.f32324b);
        }
    }

    /* renamed from: q */
    public synchronized boolean m38981q() {
        return this.f32315c == 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f32314b);
        sb2.append(", size=");
        sb2.append(this.f32315c);
        sb2.append(", first=");
        sb2.append(this.f32316d);
        sb2.append(", last=");
        sb2.append(this.f32317e);
        sb2.append(", element lengths=[");
        try {
            m38980n(new a(sb2));
        } catch (IOException e10) {
            f32312r.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }
}
