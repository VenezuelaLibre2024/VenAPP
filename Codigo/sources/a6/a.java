package a6;

import android.content.Context;
import android.graphics.Bitmap;
import b4.d;
import b6.e;
import com.bumptech.glide.b;
import com.bumptech.glide.g;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.n;
import y3.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f68a = new a();

    private a() {
    }

    public final void a(Context context) {
        n.e(context, "context");
        b.d(context).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Context context, v5.a entity, int i10, int i11, Bitmap.CompressFormat format, int i12, long j10, e resultHandler) {
        n.e(context, "context");
        n.e(entity, "entity");
        n.e(format, "format");
        n.e(resultHandler, "resultHandler");
        try {
            Bitmap bitmap = (Bitmap) b.u(context).k().a(new i().h(j10).P(g.IMMEDIATE)).s0(entity.n()).V(new d(Long.valueOf(entity.i()))).y0(i10, i11).get();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(format, i12, byteArrayOutputStream);
            resultHandler.g(byteArrayOutputStream.toByteArray());
        } catch (Exception e10) {
            e.j(resultHandler, "Thumbnail request error", e10.toString(), null, 4, null);
        }
    }

    public final y3.d<Bitmap> c(Context context, String path, v5.d thumbLoadOption) {
        n.e(context, "context");
        n.e(path, "path");
        n.e(thumbLoadOption, "thumbLoadOption");
        y3.d<Bitmap> y02 = b.u(context).k().a(new i().h(thumbLoadOption.b()).P(g.LOW)).u0(path).y0(thumbLoadOption.e(), thumbLoadOption.c());
        n.d(y02, "submit(...)");
        return y02;
    }
}
