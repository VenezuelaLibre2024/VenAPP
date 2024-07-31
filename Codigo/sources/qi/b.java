package qi;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.renderscript.Type;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final RenderScript f24041a;

    /* renamed from: b, reason: collision with root package name */
    private final ScriptIntrinsicYuvToRGB f24042b;

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer f24043c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f24044d;

    /* renamed from: e, reason: collision with root package name */
    private Allocation f24045e;

    /* renamed from: f, reason: collision with root package name */
    private Allocation f24046f;

    public b(Context context) {
        n.e(context, "context");
        RenderScript create = RenderScript.create(context);
        this.f24041a = create;
        this.f24042b = ScriptIntrinsicYuvToRGB.create(create, Element.U8_4(create));
        this.f24044d = new byte[0];
    }

    private final boolean a(Image image, a aVar) {
        Allocation allocation = this.f24045e;
        if (allocation != null) {
            n.b(allocation);
            if (allocation.getType().getX() == image.getWidth()) {
                Allocation allocation2 = this.f24045e;
                n.b(allocation2);
                if (allocation2.getType().getY() == image.getHeight()) {
                    Allocation allocation3 = this.f24045e;
                    n.b(allocation3);
                    if (allocation3.getType().getYuv() == aVar.c() && this.f24044d.length != aVar.b().capacity()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final synchronized void b(Image image, Bitmap output) {
        n.e(image, "image");
        n.e(output, "output");
        a aVar = new a(image, this.f24043c);
        this.f24043c = aVar.b();
        if (a(image, aVar)) {
            RenderScript renderScript = this.f24041a;
            this.f24045e = Allocation.createTyped(this.f24041a, new Type.Builder(renderScript, Element.U8(renderScript)).setX(image.getWidth()).setY(image.getHeight()).setYuvFormat(aVar.c()).create(), 1);
            this.f24044d = new byte[aVar.b().capacity()];
            RenderScript renderScript2 = this.f24041a;
            this.f24046f = Allocation.createTyped(this.f24041a, new Type.Builder(renderScript2, Element.RGBA_8888(renderScript2)).setX(image.getWidth()).setY(image.getHeight()).create(), 1);
        }
        aVar.b().get(this.f24044d);
        Allocation allocation = this.f24045e;
        n.b(allocation);
        allocation.copyFrom(this.f24044d);
        Allocation allocation2 = this.f24045e;
        n.b(allocation2);
        allocation2.copyFrom(this.f24044d);
        this.f24042b.setInput(this.f24045e);
        this.f24042b.forEach(this.f24046f);
        Allocation allocation3 = this.f24046f;
        n.b(allocation3);
        allocation3.copyTo(output);
    }
}
