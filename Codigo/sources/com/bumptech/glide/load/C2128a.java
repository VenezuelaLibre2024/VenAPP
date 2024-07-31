package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p036c4.C1860a;
import p193k3.InterfaceC9139b;
import p302q3.C10260z;

/* renamed from: com.bumptech.glide.load.a */
/* loaded from: classes.dex */
public final class C2128a {

    /* renamed from: com.bumptech.glide.load.a$a */
    /* loaded from: classes.dex */
    class a implements h {

        /* renamed from: a */
        final /* synthetic */ InputStream f8402a;

        a(InputStream inputStream) {
            this.f8402a = inputStream;
        }

        @Override // com.bumptech.glide.load.C2128a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo10751a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo10741c(this.f8402a);
            } finally {
                this.f8402a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$b */
    /* loaded from: classes.dex */
    class b implements h {

        /* renamed from: a */
        final /* synthetic */ ByteBuffer f8403a;

        b(ByteBuffer byteBuffer) {
            this.f8403a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.C2128a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo10751a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo10740b(this.f8403a);
            } finally {
                C1860a.m9920d(this.f8403a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$c */
    /* loaded from: classes.dex */
    class c implements h {

        /* renamed from: a */
        final /* synthetic */ ParcelFileDescriptorRewinder f8404a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC9139b f8405b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC9139b interfaceC9139b) {
            this.f8404a = parcelFileDescriptorRewinder;
            this.f8405b = interfaceC9139b;
        }

        @Override // com.bumptech.glide.load.C2128a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo10751a(ImageHeaderParser imageHeaderParser) {
            C10260z c10260z;
            C10260z c10260z2 = null;
            try {
                c10260z = new C10260z(new FileInputStream(this.f8404a.mo10754a().getFileDescriptor()), this.f8405b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                ImageHeaderParser.ImageType mo10741c = imageHeaderParser.mo10741c(c10260z);
                c10260z.m30718e();
                this.f8404a.mo10754a();
                return mo10741c;
            } catch (Throwable th3) {
                th = th3;
                c10260z2 = c10260z;
                if (c10260z2 != null) {
                    c10260z2.m30718e();
                }
                this.f8404a.mo10754a();
                throw th;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$d */
    /* loaded from: classes.dex */
    class d implements g {

        /* renamed from: a */
        final /* synthetic */ ByteBuffer f8406a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC9139b f8407b;

        d(ByteBuffer byteBuffer, InterfaceC9139b interfaceC9139b) {
            this.f8406a = byteBuffer;
            this.f8407b = interfaceC9139b;
        }

        @Override // com.bumptech.glide.load.C2128a.g
        /* renamed from: a */
        public int mo10752a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo10739a(this.f8406a, this.f8407b);
            } finally {
                C1860a.m9920d(this.f8406a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$e */
    /* loaded from: classes.dex */
    class e implements g {

        /* renamed from: a */
        final /* synthetic */ InputStream f8408a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC9139b f8409b;

        e(InputStream inputStream, InterfaceC9139b interfaceC9139b) {
            this.f8408a = inputStream;
            this.f8409b = interfaceC9139b;
        }

        @Override // com.bumptech.glide.load.C2128a.g
        /* renamed from: a */
        public int mo10752a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo10742d(this.f8408a, this.f8409b);
            } finally {
                this.f8408a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$f */
    /* loaded from: classes.dex */
    class f implements g {

        /* renamed from: a */
        final /* synthetic */ ParcelFileDescriptorRewinder f8410a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC9139b f8411b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC9139b interfaceC9139b) {
            this.f8410a = parcelFileDescriptorRewinder;
            this.f8411b = interfaceC9139b;
        }

        @Override // com.bumptech.glide.load.C2128a.g
        /* renamed from: a */
        public int mo10752a(ImageHeaderParser imageHeaderParser) {
            C10260z c10260z;
            C10260z c10260z2 = null;
            try {
                c10260z = new C10260z(new FileInputStream(this.f8410a.mo10754a().getFileDescriptor()), this.f8411b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                int mo10742d = imageHeaderParser.mo10742d(c10260z, this.f8411b);
                c10260z.m30718e();
                this.f8410a.mo10754a();
                return mo10742d;
            } catch (Throwable th3) {
                th = th3;
                c10260z2 = c10260z;
                if (c10260z2 != null) {
                    c10260z2.m30718e();
                }
                this.f8410a.mo10754a();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.a$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: a */
        int mo10752a(ImageHeaderParser imageHeaderParser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.a$h */
    /* loaded from: classes.dex */
    public interface h {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo10751a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: a */
    public static int m10743a(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC9139b interfaceC9139b) {
        return m10746d(list, new f(parcelFileDescriptorRewinder, interfaceC9139b));
    }

    /* renamed from: b */
    public static int m10744b(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC9139b interfaceC9139b) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C10260z(inputStream, interfaceC9139b);
        }
        inputStream.mark(5242880);
        return m10746d(list, new e(inputStream, interfaceC9139b));
    }

    /* renamed from: c */
    public static int m10745c(List<ImageHeaderParser> list, ByteBuffer byteBuffer, InterfaceC9139b interfaceC9139b) {
        if (byteBuffer == null) {
            return -1;
        }
        return m10746d(list, new d(byteBuffer, interfaceC9139b));
    }

    /* renamed from: d */
    private static int m10746d(List<ImageHeaderParser> list, g gVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int mo10752a = gVar.mo10752a(list.get(i10));
            if (mo10752a != -1) {
                return mo10752a;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static ImageHeaderParser.ImageType m10747e(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC9139b interfaceC9139b) {
        return m10750h(list, new c(parcelFileDescriptorRewinder, interfaceC9139b));
    }

    /* renamed from: f */
    public static ImageHeaderParser.ImageType m10748f(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC9139b interfaceC9139b) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C10260z(inputStream, interfaceC9139b);
        }
        inputStream.mark(5242880);
        return m10750h(list, new a(inputStream));
    }

    /* renamed from: g */
    public static ImageHeaderParser.ImageType m10749g(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : m10750h(list, new b(byteBuffer));
    }

    /* renamed from: h */
    private static ImageHeaderParser.ImageType m10750h(List<ImageHeaderParser> list, h hVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType mo10751a = hVar.mo10751a(list.get(i10));
            if (mo10751a != ImageHeaderParser.ImageType.UNKNOWN) {
                return mo10751a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
