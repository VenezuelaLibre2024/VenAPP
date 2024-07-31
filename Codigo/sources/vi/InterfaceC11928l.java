package vi;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: vi.l */
/* loaded from: classes3.dex */
public interface InterfaceC11928l extends InterfaceC11934n, InterfaceC11948u {

    /* renamed from: vi.l$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC11928l {
        @Override // vi.InterfaceC11934n, vi.InterfaceC11948u
        /* renamed from: a */
        public String mo38199a() {
            return "gzip";
        }

        @Override // vi.InterfaceC11948u
        /* renamed from: b */
        public InputStream mo38200b(InputStream inputStream) {
            return new GZIPInputStream(inputStream);
        }

        @Override // vi.InterfaceC11934n
        /* renamed from: c */
        public OutputStream mo38201c(OutputStream outputStream) {
            return new GZIPOutputStream(outputStream);
        }
    }

    /* renamed from: vi.l$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC11928l {

        /* renamed from: a */
        public static final InterfaceC11928l f31595a = new b();

        private b() {
        }

        @Override // vi.InterfaceC11934n, vi.InterfaceC11948u
        /* renamed from: a */
        public String mo38199a() {
            return "identity";
        }

        @Override // vi.InterfaceC11948u
        /* renamed from: b */
        public InputStream mo38200b(InputStream inputStream) {
            return inputStream;
        }

        @Override // vi.InterfaceC11934n
        /* renamed from: c */
        public OutputStream mo38201c(OutputStream outputStream) {
            return outputStream;
        }
    }
}
