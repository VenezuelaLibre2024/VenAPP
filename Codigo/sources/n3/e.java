package n3;

import android.util.Base64;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import n3.o;

/* loaded from: classes.dex */
public final class e<Model, Data> implements o<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final a<Data> f21699a;

    /* loaded from: classes.dex */
    public interface a<Data> {
        Class<Data> a();

        void b(Data data);

        Data decode(String str);
    }

    /* loaded from: classes.dex */
    private static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a, reason: collision with root package name */
        private final String f21700a;

        /* renamed from: b, reason: collision with root package name */
        private final a<Data> f21701b;

        /* renamed from: c, reason: collision with root package name */
        private Data f21702c;

        b(String str, a<Data> aVar) {
            this.f21700a = str;
            this.f21701b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f21701b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f21701b.b(this.f21702c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public h3.a d() {
            return h3.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            try {
                Data decode = this.f21701b.decode(this.f21700a);
                this.f21702c = decode;
                aVar.f(decode);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c<Model> implements p<Model, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final a<InputStream> f21703a = new a();

        /* loaded from: classes.dex */
        class a implements a<InputStream> {
            a() {
            }

            @Override // n3.e.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // n3.e.a
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // n3.e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream decode(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // n3.p
        public o<Model, InputStream> d(s sVar) {
            return new e(this.f21703a);
        }
    }

    public e(a<Data> aVar) {
        this.f21699a = aVar;
    }

    @Override // n3.o
    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // n3.o
    public o.a<Data> b(Model model, int i10, int i11, h3.h hVar) {
        return new o.a<>(new b4.d(model), new b(model.toString(), this.f21699a));
    }
}
