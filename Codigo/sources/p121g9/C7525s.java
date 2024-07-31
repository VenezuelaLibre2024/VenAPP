package p121g9;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.C4954j;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.util.AbstractC4971b0;
import com.google.android.gms.ads.internal.util.C5005j2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g9.s */
/* loaded from: classes.dex */
public final class C7525s extends AbstractC4971b0 {

    /* renamed from: a */
    final /* synthetic */ BinderC7527u f17772a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C7525s(BinderC7527u binderC7527u, C7524r c7524r) {
        this.f17772a = binderC7527u;
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC4971b0
    public final void zza() {
        final BitmapDrawable bitmapDrawable;
        Bitmap m12592a = C4965t.m12586w().m12592a(Integer.valueOf(this.f17772a.f17782b.f9991z.f9960f));
        if (m12592a != null) {
            C4965t.m12581r();
            BinderC7527u binderC7527u = this.f17772a;
            C4954j c4954j = binderC7527u.f17782b.f9991z;
            boolean z10 = c4954j.f9958d;
            float f10 = c4954j.f9959e;
            Activity activity = binderC7527u.f17781a;
            if (!z10 || f10 <= 0.0f || f10 > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), m12592a);
            } else {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(m12592a, m12592a.getWidth(), m12592a.getHeight(), false);
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
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), m12592a);
                }
            }
            C5005j2.f10092l.post(new Runnable() { // from class: g9.q
                @Override // java.lang.Runnable
                public final void run() {
                    C7525s.this.f17772a.f17781a.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
