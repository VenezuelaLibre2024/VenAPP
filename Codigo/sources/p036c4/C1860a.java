package p036c4;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c4.a */
/* loaded from: classes.dex */
public final class C1860a {

    /* renamed from: a */
    private static final AtomicReference<byte[]> f7777a = new AtomicReference<>();

    /* renamed from: c4.a$a */
    /* loaded from: classes.dex */
    private static class a extends InputStream {

        /* renamed from: a */
        private final ByteBuffer f7778a;

        /* renamed from: b */
        private int f7779b = -1;

        a(ByteBuffer byteBuffer) {
            this.f7778a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f7778a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i10) {
            this.f7779b = this.f7778a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f7778a.hasRemaining()) {
                return this.f7778a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            if (!this.f7778a.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i11, available());
            this.f7778a.get(bArr, i10, min);
            return min;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i10 = this.f7779b;
            if (i10 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f7778a.position(i10);
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (!this.f7778a.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j10, available());
            this.f7778a.position((int) (r0.position() + min));
            return min;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c4.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final int f7780a;

        /* renamed from: b */
        final int f7781b;

        /* renamed from: c */
        final byte[] f7782c;

        b(byte[] bArr, int i10, int i11) {
            this.f7782c = bArr;
            this.f7780a = i10;
            this.f7781b = i11;
        }
    }

    /* renamed from: a */
    public static ByteBuffer m9917a(File file) {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                fileChannel = randomAccessFile.getChannel();
                MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return load;
            } catch (Throwable th2) {
                th = th2;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    /* renamed from: b */
    public static ByteBuffer m9918b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f7777a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read < 0) {
                f7777a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return m9920d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, read);
        }
    }

    /* renamed from: c */
    private static b m9919c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* renamed from: d */
    public static ByteBuffer m9920d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* renamed from: e */
    public static byte[] m9921e(ByteBuffer byteBuffer) {
        b m9919c = m9919c(byteBuffer);
        if (m9919c != null && m9919c.f7780a == 0 && m9919c.f7781b == m9919c.f7782c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        m9920d(asReadOnlyBuffer);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: f */
    public static void m9922f(ByteBuffer byteBuffer, File file) {
        RandomAccessFile randomAccessFile;
        m9920d(byteBuffer);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
        try {
            fileChannel = randomAccessFile.getChannel();
            fileChannel.write(byteBuffer);
            fileChannel.force(false);
            fileChannel.close();
            randomAccessFile.close();
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused3) {
                }
            }
            if (randomAccessFile == null) {
                throw th;
            }
            try {
                randomAccessFile.close();
                throw th;
            } catch (IOException unused4) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public static InputStream m9923g(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }
}
