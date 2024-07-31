package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import q3.z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0129a implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f7435a;

        C0129a(InputStream inputStream) {
            this.f7435a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.c(this.f7435a);
            } finally {
                this.f7435a.reset();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f7436a;

        b(ByteBuffer byteBuffer) {
            this.f7436a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.b(this.f7436a);
            } finally {
                c4.a.d(this.f7436a);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f7437a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k3.b f7438b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, k3.b bVar) {
            this.f7437a = parcelFileDescriptorRewinder;
            this.f7438b = bVar;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            z zVar;
            z zVar2 = null;
            try {
                zVar = new z(new FileInputStream(this.f7437a.a().getFileDescriptor()), this.f7438b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                ImageHeaderParser.ImageType c10 = imageHeaderParser.c(zVar);
                zVar.e();
                this.f7437a.a();
                return c10;
            } catch (Throwable th3) {
                th = th3;
                zVar2 = zVar;
                if (zVar2 != null) {
                    zVar2.e();
                }
                this.f7437a.a();
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f7439a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k3.b f7440b;

        d(ByteBuffer byteBuffer, k3.b bVar) {
            this.f7439a = byteBuffer;
            this.f7440b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.a(this.f7439a, this.f7440b);
            } finally {
                c4.a.d(this.f7439a);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f7441a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k3.b f7442b;

        e(InputStream inputStream, k3.b bVar) {
            this.f7441a = inputStream;
            this.f7442b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.d(this.f7441a, this.f7442b);
            } finally {
                this.f7441a.reset();
            }
        }
    }

    /* loaded from: classes.dex */
    class f implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f7443a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k3.b f7444b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, k3.b bVar) {
            this.f7443a = parcelFileDescriptorRewinder;
            this.f7444b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            z zVar;
            z zVar2 = null;
            try {
                zVar = new z(new FileInputStream(this.f7443a.a().getFileDescriptor()), this.f7444b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                int d10 = imageHeaderParser.d(zVar, this.f7444b);
                zVar.e();
                this.f7443a.a();
                return d10;
            } catch (Throwable th3) {
                th = th3;
                zVar2 = zVar;
                if (zVar2 != null) {
                    zVar2.e();
                }
                this.f7443a.a();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface g {
        int a(ImageHeaderParser imageHeaderParser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, k3.b bVar) {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List<ImageHeaderParser> list, InputStream inputStream, k3.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new z(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(List<ImageHeaderParser> list, ByteBuffer byteBuffer, k3.b bVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    private static int d(List<ImageHeaderParser> list, g gVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int a10 = gVar.a(list.get(i10));
            if (a10 != -1) {
                return a10;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, k3.b bVar) {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType f(List<ImageHeaderParser> list, InputStream inputStream, k3.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new z(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new C0129a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType h(List<ImageHeaderParser> list, h hVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType a10 = hVar.a(list.get(i10));
            if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a10;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
