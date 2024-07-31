package q3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
interface v {

    /* loaded from: classes.dex */
    public static final class a implements v {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f23483a;

        /* renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f23484b;

        /* renamed from: c, reason: collision with root package name */
        private final k3.b f23485c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, k3.b bVar) {
            this.f23483a = byteBuffer;
            this.f23484b = list;
            this.f23485c = bVar;
        }

        private InputStream e() {
            return c4.a.g(c4.a.d(this.f23483a));
        }

        @Override // q3.v
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // q3.v
        public void b() {
        }

        @Override // q3.v
        public int c() {
            return com.bumptech.glide.load.a.c(this.f23484b, c4.a.d(this.f23483a), this.f23485c);
        }

        @Override // q3.v
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.g(this.f23484b, c4.a.d(this.f23483a));
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements v {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f23486a;

        /* renamed from: b, reason: collision with root package name */
        private final k3.b f23487b;

        /* renamed from: c, reason: collision with root package name */
        private final List<ImageHeaderParser> f23488c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(InputStream inputStream, List<ImageHeaderParser> list, k3.b bVar) {
            this.f23487b = (k3.b) c4.k.d(bVar);
            this.f23488c = (List) c4.k.d(list);
            this.f23486a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // q3.v
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f23486a.a(), null, options);
        }

        @Override // q3.v
        public void b() {
            this.f23486a.c();
        }

        @Override // q3.v
        public int c() {
            return com.bumptech.glide.load.a.b(this.f23488c, this.f23486a.a(), this.f23487b);
        }

        @Override // q3.v
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.f(this.f23488c, this.f23486a.a(), this.f23487b);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements v {

        /* renamed from: a, reason: collision with root package name */
        private final k3.b f23489a;

        /* renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f23490b;

        /* renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f23491c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, k3.b bVar) {
            this.f23489a = (k3.b) c4.k.d(bVar);
            this.f23490b = (List) c4.k.d(list);
            this.f23491c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // q3.v
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f23491c.a().getFileDescriptor(), null, options);
        }

        @Override // q3.v
        public void b() {
        }

        @Override // q3.v
        public int c() {
            return com.bumptech.glide.load.a.a(this.f23490b, this.f23491c, this.f23489a);
        }

        @Override // q3.v
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.e(this.f23490b, this.f23491c, this.f23489a);
        }
    }

    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();
}
