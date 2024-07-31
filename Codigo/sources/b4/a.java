package b4;

import android.content.Context;
import c4.l;
import h3.f;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: b, reason: collision with root package name */
    private final int f6141b;

    /* renamed from: c, reason: collision with root package name */
    private final f f6142c;

    private a(int i10, f fVar) {
        this.f6141b = i10;
        this.f6142c = fVar;
    }

    public static f c(Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    @Override // h3.f
    public void b(MessageDigest messageDigest) {
        this.f6142c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f6141b).array());
    }

    @Override // h3.f
    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6141b == aVar.f6141b && this.f6142c.equals(aVar.f6142c);
    }

    @Override // h3.f
    public int hashCode() {
        return l.o(this.f6142c, this.f6141b);
    }
}
