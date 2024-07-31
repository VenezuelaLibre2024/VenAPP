package p246n3;

import com.bumptech.glide.EnumC2121g;
import com.bumptech.glide.load.data.InterfaceC2133d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p022b4.C1656d;
import p129h3.C7624h;
import p129h3.EnumC7617a;
import p246n3.InterfaceC9649o;

/* renamed from: n3.b */
/* loaded from: classes.dex */
public class C9636b<Data> implements InterfaceC9649o<byte[], Data> {

    /* renamed from: a */
    private final b<Data> f23626a;

    /* renamed from: n3.b$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC9650p<byte[], ByteBuffer> {

        /* renamed from: n3.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C13225a implements b<ByteBuffer> {
            C13225a() {
            }

            @Override // p246n3.C9636b.b
            /* renamed from: a */
            public Class<ByteBuffer> mo28855a() {
                return ByteBuffer.class;
            }

            @Override // p246n3.C9636b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer mo28856b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<byte[], ByteBuffer> mo28852d(C9653s c9653s) {
            return new C9636b(new C13225a());
        }
    }

    /* renamed from: n3.b$b */
    /* loaded from: classes.dex */
    public interface b<Data> {
        /* renamed from: a */
        Class<Data> mo28855a();

        /* renamed from: b */
        Data mo28856b(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.b$c */
    /* loaded from: classes.dex */
    public static class c<Data> implements InterfaceC2133d<Data> {

        /* renamed from: a */
        private final byte[] f23628a;

        /* renamed from: b */
        private final b<Data> f23629b;

        c(byte[] bArr, b<Data> bVar) {
            this.f23628a = bArr;
            this.f23629b = bVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: a */
        public Class<Data> mo10760a() {
            return this.f23629b.mo28855a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: b */
        public void mo10765b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: d */
        public EnumC7617a mo10767d() {
            return EnumC7617a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: e */
        public void mo10768e(EnumC2121g enumC2121g, InterfaceC2133d.a<? super Data> aVar) {
            aVar.mo10774f(this.f23629b.mo28856b(this.f23628a));
        }
    }

    /* renamed from: n3.b$d */
    /* loaded from: classes.dex */
    public static class d implements InterfaceC9650p<byte[], InputStream> {

        /* renamed from: n3.b$d$a */
        /* loaded from: classes.dex */
        class a implements b<InputStream> {
            a() {
            }

            @Override // p246n3.C9636b.b
            /* renamed from: a */
            public Class<InputStream> mo28855a() {
                return InputStream.class;
            }

            @Override // p246n3.C9636b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream mo28856b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<byte[], InputStream> mo28852d(C9653s c9653s) {
            return new C9636b(new a());
        }
    }

    public C9636b(b<Data> bVar) {
        this.f23626a = bVar;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9649o.a<Data> mo28848b(byte[] bArr, int i10, int i11, C7624h c7624h) {
        return new InterfaceC9649o.a<>(new C1656d(bArr), new c(bArr, this.f23626a));
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo28847a(byte[] bArr) {
        return true;
    }
}
