package p302q3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C2128a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C2140k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p036c4.C1860a;
import p036c4.C1870k;
import p193k3.InterfaceC9139b;

/* renamed from: q3.v */
/* loaded from: classes.dex */
interface InterfaceC10256v {

    /* renamed from: q3.v$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC10256v {

        /* renamed from: a */
        private final ByteBuffer f25451a;

        /* renamed from: b */
        private final List<ImageHeaderParser> f25452b;

        /* renamed from: c */
        private final InterfaceC9139b f25453c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, InterfaceC9139b interfaceC9139b) {
            this.f25451a = byteBuffer;
            this.f25452b = list;
            this.f25453c = interfaceC9139b;
        }

        /* renamed from: e */
        private InputStream m30707e() {
            return C1860a.m9923g(C1860a.m9920d(this.f25451a));
        }

        @Override // p302q3.InterfaceC10256v
        /* renamed from: a */
        public Bitmap mo30703a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(m30707e(), null, options);
        }

        @Override // p302q3.InterfaceC10256v
        /* renamed from: b */
        public void mo30704b() {
        }

        @Override // p302q3.InterfaceC10256v
        /* renamed from: c */
        public int mo30705c() {
            return C2128a.m10745c(this.f25452b, C1860a.m9920d(this.f25451a), this.f25453c);
        }

        @Override // p302q3.InterfaceC10256v
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo30706d() {
            return C2128a.m10749g(this.f25452b, C1860a.m9920d(this.f25451a));
        }
    }

    /* renamed from: q3.v$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC10256v {

        /* renamed from: a */
        private final C2140k f25454a;

        /* renamed from: b */
        private final InterfaceC9139b f25455b;

        /* renamed from: c */
        private final List<ImageHeaderParser> f25456c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(InputStream inputStream, List<ImageHeaderParser> list, InterfaceC9139b interfaceC9139b) {
            this.f25455b = (InterfaceC9139b) C1870k.m9950d(interfaceC9139b);
            this.f25456c = (List) C1870k.m9950d(list);
            this.f25454a = new C2140k(inputStream, interfaceC9139b);
        }

        @Override // p302q3.InterfaceC10256v
        /* renamed from: a */
        public Bitmap mo30703a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f25454a.mo10754a(), null, options);
        }

        @Override // p302q3.InterfaceC10256v
        /* renamed from: b */
        public void mo30704b() {
            this.f25454a.m10788c();
        }

        @Override // p302q3.InterfaceC10256v
        /* renamed from: c */
        public int mo30705c() {
            return C2128a.m10744b(this.f25456c, this.f25454a.mo10754a(), this.f25455b);
        }

        @Override // p302q3.InterfaceC10256v
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo30706d() {
            return C2128a.m10748f(this.f25456c, this.f25454a.mo10754a(), this.f25455b);
        }
    }

    /* renamed from: q3.v$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC10256v {

        /* renamed from: a */
        private final InterfaceC9139b f25457a;

        /* renamed from: b */
        private final List<ImageHeaderParser> f25458b;

        /* renamed from: c */
        private final ParcelFileDescriptorRewinder f25459c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, InterfaceC9139b interfaceC9139b) {
            this.f25457a = (InterfaceC9139b) C1870k.m9950d(interfaceC9139b);
            this.f25458b = (List) C1870k.m9950d(list);
            this.f25459c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // p302q3.InterfaceC10256v
        /* renamed from: a */
        public Bitmap mo30703a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f25459c.mo10754a().getFileDescriptor(), null, options);
        }

        @Override // p302q3.InterfaceC10256v
        /* renamed from: b */
        public void mo30704b() {
        }

        @Override // p302q3.InterfaceC10256v
        /* renamed from: c */
        public int mo30705c() {
            return C2128a.m10743a(this.f25458b, this.f25459c, this.f25457a);
        }

        @Override // p302q3.InterfaceC10256v
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo30706d() {
            return C2128a.m10747e(this.f25458b, this.f25459c, this.f25457a);
        }
    }

    /* renamed from: a */
    Bitmap mo30703a(BitmapFactory.Options options);

    /* renamed from: b */
    void mo30704b();

    /* renamed from: c */
    int mo30705c();

    /* renamed from: d */
    ImageHeaderParser.ImageType mo30706d();
}
