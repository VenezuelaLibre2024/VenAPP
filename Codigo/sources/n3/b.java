package n3;

import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import n3.o;

/* loaded from: classes.dex */
public class b<Data> implements o<byte[], Data> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0353b<Data> f21693a;

    /* loaded from: classes.dex */
    public static class a implements p<byte[], ByteBuffer> {

        /* renamed from: n3.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0352a implements InterfaceC0353b<ByteBuffer> {
            C0352a() {
            }

            @Override // n3.b.InterfaceC0353b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // n3.b.InterfaceC0353b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // n3.p
        public o<byte[], ByteBuffer> d(s sVar) {
            return new b(new C0352a());
        }
    }

    /* renamed from: n3.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0353b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f21695a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC0353b<Data> f21696b;

        c(byte[] bArr, InterfaceC0353b<Data> interfaceC0353b) {
            this.f21695a = bArr;
            this.f21696b = interfaceC0353b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f21696b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public h3.a d() {
            return h3.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            aVar.f(this.f21696b.b(this.f21695a));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements p<byte[], InputStream> {

        /* loaded from: classes.dex */
        class a implements InterfaceC0353b<InputStream> {
            a() {
            }

            @Override // n3.b.InterfaceC0353b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // n3.b.InterfaceC0353b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // n3.p
        public o<byte[], InputStream> d(s sVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0353b<Data> interfaceC0353b) {
        this.f21693a = interfaceC0353b;
    }

    @Override // n3.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(byte[] bArr, int i10, int i11, h3.h hVar) {
        return new o.a<>(new b4.d(bArr), new c(bArr, this.f21693a));
    }

    @Override // n3.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(byte[] bArr) {
        return true;
    }
}
