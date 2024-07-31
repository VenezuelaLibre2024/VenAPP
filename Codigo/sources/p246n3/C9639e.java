package p246n3;

import android.util.Base64;
import com.bumptech.glide.EnumC2121g;
import com.bumptech.glide.load.data.InterfaceC2133d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p022b4.C1656d;
import p129h3.C7624h;
import p129h3.EnumC7617a;
import p246n3.InterfaceC9649o;

/* renamed from: n3.e */
/* loaded from: classes.dex */
public final class C9639e<Model, Data> implements InterfaceC9649o<Model, Data> {

    /* renamed from: a */
    private final a<Data> f23632a;

    /* renamed from: n3.e$a */
    /* loaded from: classes.dex */
    public interface a<Data> {
        /* renamed from: a */
        Class<Data> mo28862a();

        /* renamed from: b */
        void mo28863b(Data data);

        Data decode(String str);
    }

    /* renamed from: n3.e$b */
    /* loaded from: classes.dex */
    private static final class b<Data> implements InterfaceC2133d<Data> {

        /* renamed from: a */
        private final String f23633a;

        /* renamed from: b */
        private final a<Data> f23634b;

        /* renamed from: c */
        private Data f23635c;

        b(String str, a<Data> aVar) {
            this.f23633a = str;
            this.f23634b = aVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: a */
        public Class<Data> mo10760a() {
            return this.f23634b.mo28862a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: b */
        public void mo10765b() {
            try {
                this.f23634b.mo28863b(this.f23635c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: d */
        public EnumC7617a mo10767d() {
            return EnumC7617a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: e */
        public void mo10768e(EnumC2121g enumC2121g, InterfaceC2133d.a<? super Data> aVar) {
            try {
                Data decode = this.f23634b.decode(this.f23633a);
                this.f23635c = decode;
                aVar.mo10774f(decode);
            } catch (IllegalArgumentException e10) {
                aVar.mo10773c(e10);
            }
        }
    }

    /* renamed from: n3.e$c */
    /* loaded from: classes.dex */
    public static final class c<Model> implements InterfaceC9650p<Model, InputStream> {

        /* renamed from: a */
        private final a<InputStream> f23636a = new a();

        /* renamed from: n3.e$c$a */
        /* loaded from: classes.dex */
        class a implements a<InputStream> {
            a() {
            }

            @Override // p246n3.C9639e.a
            /* renamed from: a */
            public Class<InputStream> mo28862a() {
                return InputStream.class;
            }

            @Override // p246n3.C9639e.a
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void mo28863b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // p246n3.C9639e.a
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

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Model, InputStream> mo28852d(C9653s c9653s) {
            return new C9639e(this.f23636a);
        }
    }

    public C9639e(a<Data> aVar) {
        this.f23632a = aVar;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: a */
    public boolean mo28847a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: b */
    public InterfaceC9649o.a<Data> mo28848b(Model model, int i10, int i11, C7624h c7624h) {
        return new InterfaceC9649o.a<>(new C1656d(model), new b(model.toString(), this.f23632a));
    }
}
