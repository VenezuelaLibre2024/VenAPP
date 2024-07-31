package p316qi;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.renderscript.Type;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.C9322n;

/* renamed from: qi.b */
/* loaded from: classes3.dex */
public final class C10494b {

    /* renamed from: a */
    private final RenderScript f26083a;

    /* renamed from: b */
    private final ScriptIntrinsicYuvToRGB f26084b;

    /* renamed from: c */
    private ByteBuffer f26085c;

    /* renamed from: d */
    private byte[] f26086d;

    /* renamed from: e */
    private Allocation f26087e;

    /* renamed from: f */
    private Allocation f26088f;

    public C10494b(Context context) {
        C9322n.m27781e(context, "context");
        RenderScript create = RenderScript.create(context);
        this.f26083a = create;
        this.f26084b = ScriptIntrinsicYuvToRGB.create(create, Element.U8_4(create));
        this.f26086d = new byte[0];
    }

    /* renamed from: a */
    private final boolean m31575a(Image image, C10493a c10493a) {
        Allocation allocation = this.f26087e;
        if (allocation != null) {
            C9322n.m27778b(allocation);
            if (allocation.getType().getX() == image.getWidth()) {
                Allocation allocation2 = this.f26087e;
                C9322n.m27778b(allocation2);
                if (allocation2.getType().getY() == image.getHeight()) {
                    Allocation allocation3 = this.f26087e;
                    C9322n.m27778b(allocation3);
                    if (allocation3.getType().getYuv() == c10493a.m31566c() && this.f26086d.length != c10493a.m31565b().capacity()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public final synchronized void m31576b(Image image, Bitmap output) {
        C9322n.m27781e(image, "image");
        C9322n.m27781e(output, "output");
        C10493a c10493a = new C10493a(image, this.f26085c);
        this.f26085c = c10493a.m31565b();
        if (m31575a(image, c10493a)) {
            RenderScript renderScript = this.f26083a;
            this.f26087e = Allocation.createTyped(this.f26083a, new Type.Builder(renderScript, Element.U8(renderScript)).setX(image.getWidth()).setY(image.getHeight()).setYuvFormat(c10493a.m31566c()).create(), 1);
            this.f26086d = new byte[c10493a.m31565b().capacity()];
            RenderScript renderScript2 = this.f26083a;
            this.f26088f = Allocation.createTyped(this.f26083a, new Type.Builder(renderScript2, Element.RGBA_8888(renderScript2)).setX(image.getWidth()).setY(image.getHeight()).create(), 1);
        }
        c10493a.m31565b().get(this.f26086d);
        Allocation allocation = this.f26087e;
        C9322n.m27778b(allocation);
        allocation.copyFrom(this.f26086d);
        Allocation allocation2 = this.f26087e;
        C9322n.m27778b(allocation2);
        allocation2.copyFrom(this.f26086d);
        this.f26084b.setInput(this.f26087e);
        this.f26084b.forEach(this.f26088f);
        Allocation allocation3 = this.f26088f;
        C9322n.m27778b(allocation3);
        allocation3.copyTo(output);
    }
}
