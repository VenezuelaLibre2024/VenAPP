package p324r3;

import com.bumptech.glide.load.data.InterfaceC2134e;
import java.nio.ByteBuffer;

/* renamed from: r3.a */
/* loaded from: classes.dex */
public class C10611a implements InterfaceC2134e<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f26811a;

    /* renamed from: r3.a$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC2134e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.InterfaceC2134e.a
        /* renamed from: a */
        public Class<ByteBuffer> mo10757a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2134e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC2134e<ByteBuffer> mo10758b(ByteBuffer byteBuffer) {
            return new C10611a(byteBuffer);
        }
    }

    public C10611a(ByteBuffer byteBuffer) {
        this.f26811a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2134e
    /* renamed from: b */
    public void mo10755b() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2134e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer mo10754a() {
        this.f26811a.position(0);
        return this.f26811a;
    }
}
