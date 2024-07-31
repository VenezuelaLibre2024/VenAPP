package p022b4;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p036c4.C1871l;
import p129h3.InterfaceC7622f;

/* renamed from: b4.a */
/* loaded from: classes.dex */
public final class C1653a implements InterfaceC7622f {

    /* renamed from: b */
    private final int f7036b;

    /* renamed from: c */
    private final InterfaceC7622f f7037c;

    private C1653a(int i10, InterfaceC7622f interfaceC7622f) {
        this.f7036b = i10;
        this.f7037c = interfaceC7622f;
    }

    /* renamed from: c */
    public static InterfaceC7622f m9109c(Context context) {
        return new C1653a(context.getResources().getConfiguration().uiMode & 48, C1654b.m9113c(context));
    }

    @Override // p129h3.InterfaceC7622f
    /* renamed from: b */
    public void mo9110b(MessageDigest messageDigest) {
        this.f7037c.mo9110b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f7036b).array());
    }

    @Override // p129h3.InterfaceC7622f
    public boolean equals(Object obj) {
        if (!(obj instanceof C1653a)) {
            return false;
        }
        C1653a c1653a = (C1653a) obj;
        return this.f7036b == c1653a.f7036b && this.f7037c.equals(c1653a.f7037c);
    }

    @Override // p129h3.InterfaceC7622f
    public int hashCode() {
        return C1871l.m9966o(this.f7037c, this.f7036b);
    }
}
