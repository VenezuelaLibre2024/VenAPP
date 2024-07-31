package n3;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import n3.o;

/* loaded from: classes.dex */
public class g<Data> implements o<File, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final d<Data> f21715a;

    /* loaded from: classes.dex */
    public static class a<Data> implements p<File, Data> {

        /* renamed from: a, reason: collision with root package name */
        private final d<Data> f21716a;

        public a(d<Data> dVar) {
            this.f21716a = dVar;
        }

        @Override // n3.p
        public final o<File, Data> d(s sVar) {
            return new g(this.f21716a);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* loaded from: classes.dex */
        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            @Override // n3.g.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // n3.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            @Override // n3.g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a, reason: collision with root package name */
        private final File f21717a;

        /* renamed from: b, reason: collision with root package name */
        private final d<Data> f21718b;

        /* renamed from: c, reason: collision with root package name */
        private Data f21719c;

        c(File file, d<Data> dVar) {
            this.f21717a = file;
            this.f21718b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f21718b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Data data = this.f21719c;
            if (data != null) {
                try {
                    this.f21718b.b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public h3.a d() {
            return h3.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            try {
                Data c10 = this.f21718b.c(this.f21717a);
                this.f21719c = c10;
                aVar.f(c10);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(File file);
    }

    /* loaded from: classes.dex */
    public static class e extends a<InputStream> {

        /* loaded from: classes.dex */
        class a implements d<InputStream> {
            a() {
            }

            @Override // n3.g.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // n3.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // n3.g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d<Data> dVar) {
        this.f21715a = dVar;
    }

    @Override // n3.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(File file, int i10, int i11, h3.h hVar) {
        return new o.a<>(new b4.d(file), new c(file, this.f21715a));
    }

    @Override // n3.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(File file) {
        return true;
    }
}
