package p008a6;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C2116b;
import com.bumptech.glide.EnumC2121g;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.C9322n;
import p022b4.C1656d;
import p024b6.C1666e;
import p395v5.C11627a;
import p395v5.C11630d;
import p456y3.C12594i;
import p456y3.InterfaceFutureC12589d;

/* renamed from: a6.a */
/* loaded from: classes.dex */
public final class C0034a {

    /* renamed from: a */
    public static final C0034a f68a = new C0034a();

    private C0034a() {
    }

    /* renamed from: a */
    public final void m109a(Context context) {
        C9322n.m27781e(context, "context");
        ComponentCallbacks2C2116b.m10641d(context).m10648b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m110b(Context context, C11627a entity, int i10, int i11, Bitmap.CompressFormat format, int i12, long j10, C1666e resultHandler) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(entity, "entity");
        C9322n.m27781e(format, "format");
        C9322n.m27781e(resultHandler, "resultHandler");
        try {
            Bitmap bitmap = (Bitmap) ComponentCallbacks2C2116b.m10647u(context).m10722k().mo10708a(new C12594i().m41361h(j10).m41345P(EnumC2121g.IMMEDIATE)).m10715s0(entity.m36441n()).m41349V(new C1656d(Long.valueOf(entity.m36436i()))).m10718y0(i10, i11).get();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(format, i12, byteArrayOutputStream);
            resultHandler.m9148g(byteArrayOutputStream.toByteArray());
        } catch (Exception e10) {
            C1666e.m9144j(resultHandler, "Thumbnail request error", e10.toString(), null, 4, null);
        }
    }

    /* renamed from: c */
    public final InterfaceFutureC12589d<Bitmap> m111c(Context context, String path, C11630d thumbLoadOption) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(path, "path");
        C9322n.m27781e(thumbLoadOption, "thumbLoadOption");
        InterfaceFutureC12589d<Bitmap> m10718y0 = ComponentCallbacks2C2116b.m10647u(context).m10722k().mo10708a(new C12594i().m41361h(thumbLoadOption.m36452b()).m41345P(EnumC2121g.LOW)).m10717u0(path).m10718y0(thumbLoadOption.m36455e(), thumbLoadOption.m36453c());
        C9322n.m27780d(m10718y0, "submit(...)");
        return m10718y0;
    }
}
