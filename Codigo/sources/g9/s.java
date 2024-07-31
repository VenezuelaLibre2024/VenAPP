package g9;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.util.j2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s extends com.google.android.gms.ads.internal.util.b0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f16143a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ s(u uVar, r rVar) {
        this.f16143a = uVar;
    }

    @Override // com.google.android.gms.ads.internal.util.b0
    public final void zza() {
        final BitmapDrawable bitmapDrawable;
        Bitmap a10 = com.google.android.gms.ads.internal.t.w().a(Integer.valueOf(this.f16143a.f16145b.f8896z.f8873f));
        if (a10 != null) {
            com.google.android.gms.ads.internal.t.r();
            u uVar = this.f16143a;
            com.google.android.gms.ads.internal.j jVar = uVar.f16145b.f8896z;
            boolean z10 = jVar.f8871d;
            float f10 = jVar.f8872e;
            Activity activity = uVar.f16144a;
            if (!z10 || f10 <= 0.0f || f10 > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), a10);
            } else {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a10, a10.getWidth(), a10.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f10);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), a10);
                }
            }
            j2.f8993l.post(new Runnable() { // from class: g9.q
                @Override // java.lang.Runnable
                public final void run() {
                    s.this.f16143a.f16144a.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
