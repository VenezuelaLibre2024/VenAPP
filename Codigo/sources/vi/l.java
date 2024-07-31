package vi;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
public interface l extends n, u {

    /* loaded from: classes3.dex */
    public static final class a implements l {
        @Override // vi.n, vi.u
        public String a() {
            return "gzip";
        }

        @Override // vi.u
        public InputStream b(InputStream inputStream) {
            return new GZIPInputStream(inputStream);
        }

        @Override // vi.n
        public OutputStream c(OutputStream outputStream) {
            return new GZIPOutputStream(outputStream);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final l f29160a = new b();

        private b() {
        }

        @Override // vi.n, vi.u
        public String a() {
            return "identity";
        }

        @Override // vi.u
        public InputStream b(InputStream inputStream) {
            return inputStream;
        }

        @Override // vi.n
        public OutputStream c(OutputStream outputStream) {
            return outputStream;
        }
    }
}
