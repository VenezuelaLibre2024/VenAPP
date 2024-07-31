package p246n3;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.EnumC2121g;
import com.bumptech.glide.load.data.InterfaceC2133d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p022b4.C1656d;
import p129h3.C7624h;
import p129h3.EnumC7617a;
import p246n3.InterfaceC9649o;

/* renamed from: n3.g */
/* loaded from: classes.dex */
public class C9641g<Data> implements InterfaceC9649o<File, Data> {

    /* renamed from: a */
    private final d<Data> f23648a;

    /* renamed from: n3.g$a */
    /* loaded from: classes.dex */
    public static class a<Data> implements InterfaceC9650p<File, Data> {

        /* renamed from: a */
        private final d<Data> f23649a;

        public a(d<Data> dVar) {
            this.f23649a = dVar;
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public final InterfaceC9649o<File, Data> mo28852d(C9653s c9653s) {
            return new C9641g(this.f23649a);
        }
    }

    /* renamed from: n3.g$b */
    /* loaded from: classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* renamed from: n3.g$b$a */
        /* loaded from: classes.dex */
        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            @Override // p246n3.C9641g.d
            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo28882a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p246n3.C9641g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo28883b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            @Override // p246n3.C9641g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor mo28884c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.g$c */
    /* loaded from: classes.dex */
    public static final class c<Data> implements InterfaceC2133d<Data> {

        /* renamed from: a */
        private final File f23650a;

        /* renamed from: b */
        private final d<Data> f23651b;

        /* renamed from: c */
        private Data f23652c;

        c(File file, d<Data> dVar) {
            this.f23650a = file;
            this.f23651b = dVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: a */
        public Class<Data> mo10760a() {
            return this.f23651b.mo28882a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: b */
        public void mo10765b() {
            Data data = this.f23652c;
            if (data != null) {
                try {
                    this.f23651b.mo28883b(data);
                } catch (IOException unused) {
                }
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

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: e */
        public void mo10768e(EnumC2121g enumC2121g, InterfaceC2133d.a<? super Data> aVar) {
            try {
                Data mo28884c = this.f23651b.mo28884c(this.f23650a);
                this.f23652c = mo28884c;
                aVar.mo10774f(mo28884c);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.mo10773c(e10);
            }
        }
    }

    /* renamed from: n3.g$d */
    /* loaded from: classes.dex */
    public interface d<Data> {
        /* renamed from: a */
        Class<Data> mo28882a();

        /* renamed from: b */
        void mo28883b(Data data);

        /* renamed from: c */
        Data mo28884c(File file);
    }

    /* renamed from: n3.g$e */
    /* loaded from: classes.dex */
    public static class e extends a<InputStream> {

        /* renamed from: n3.g$e$a */
        /* loaded from: classes.dex */
        class a implements d<InputStream> {
            a() {
            }

            @Override // p246n3.C9641g.d
            /* renamed from: a */
            public Class<InputStream> mo28882a() {
                return InputStream.class;
            }

            @Override // p246n3.C9641g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo28883b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // p246n3.C9641g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream mo28884c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public C9641g(d<Data> dVar) {
        this.f23648a = dVar;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9649o.a<Data> mo28848b(File file, int i10, int i11, C7624h c7624h) {
        return new InterfaceC9649o.a<>(new C1656d(file), new c(file, this.f23648a));
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo28847a(File file) {
        return true;
    }
}
