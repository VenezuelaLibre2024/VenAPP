package p246n3;

import android.util.Log;
import com.bumptech.glide.EnumC2121g;
import com.bumptech.glide.load.data.InterfaceC2133d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p022b4.C1656d;
import p036c4.C1860a;
import p129h3.C7624h;
import p129h3.EnumC7617a;
import p246n3.InterfaceC9649o;

/* renamed from: n3.d */
/* loaded from: classes.dex */
public class C9638d implements InterfaceC9649o<File, ByteBuffer> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.d$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC2133d<ByteBuffer> {

        /* renamed from: a */
        private final File f23631a;

        a(File file) {
            this.f23631a = file;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: a */
        public Class<ByteBuffer> mo10760a() {
            return ByteBuffer.class;
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
        public void mo10768e(EnumC2121g enumC2121g, InterfaceC2133d.a<? super ByteBuffer> aVar) {
            try {
                aVar.mo10774f(C1860a.m9917a(this.f23631a));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.mo10773c(e10);
            }
        }
    }

    /* renamed from: n3.d$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC9650p<File, ByteBuffer> {
        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<File, ByteBuffer> mo28852d(C9653s c9653s) {
            return new C9638d();
        }
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9649o.a<ByteBuffer> mo28848b(File file, int i10, int i11, C7624h c7624h) {
        return new InterfaceC9649o.a<>(new C1656d(file), new a(file));
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo28847a(File file) {
        return true;
    }
}
