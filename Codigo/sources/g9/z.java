package g9;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcdv;

/* loaded from: classes.dex */
public final class z extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final ImageButton f16164a;

    /* renamed from: b, reason: collision with root package name */
    private final f f16165b;

    public z(Context context, y yVar, f fVar) {
        super(context);
        this.f16165b = fVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f16164a = imageButton;
        c();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        com.google.android.gms.ads.internal.client.x.b();
        int zzx = zzcdv.zzx(context, yVar.f16160a);
        com.google.android.gms.ads.internal.client.x.b();
        int zzx2 = zzcdv.zzx(context, 0);
        com.google.android.gms.ads.internal.client.x.b();
        int zzx3 = zzcdv.zzx(context, yVar.f16161b);
        com.google.android.gms.ads.internal.client.x.b();
        imageButton.setPadding(zzx, zzx2, zzx3, zzcdv.zzx(context, yVar.f16162c));
        imageButton.setContentDescription("Interstitial close button");
        com.google.android.gms.ads.internal.client.x.b();
        int zzx4 = zzcdv.zzx(context, yVar.f16163d + yVar.f16160a + yVar.f16161b);
        com.google.android.gms.ads.internal.client.x.b();
        addView(imageButton, new FrameLayout.LayoutParams(zzx4, zzcdv.zzx(context, yVar.f16163d + yVar.f16162c), 17));
        long longValue = ((Long) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzbc)).longValue();
        if (longValue <= 0) {
            return;
        }
        x xVar = ((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzbd)).booleanValue() ? new x(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(xVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzbb
            com.google.android.gms.internal.ads.zzbga r1 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = la.p.f()
            r2 = 17301527(0x1080017, float:2.497932E-38)
            if (r1 == 0) goto L67
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L67
            java.lang.String r1 = "default"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L24
            goto L67
        L24:
            com.google.android.gms.internal.ads.zzcdl r1 = com.google.android.gms.ads.internal.t.q()
            android.content.res.Resources r1 = r1.zze()
            if (r1 == 0) goto L61
            r3 = 0
            java.lang.String r4 = "white"
            boolean r4 = r4.equals(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            if (r4 == 0) goto L3e
            int r0 = d9.a.f13852b     // Catch: android.content.res.Resources.NotFoundException -> L49
        L39:
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            goto L4e
        L3e:
            java.lang.String r4 = "black"
            boolean r0 = r4.equals(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            if (r0 == 0) goto L4e
            int r0 = d9.a.f13851a     // Catch: android.content.res.Resources.NotFoundException -> L49
            goto L39
        L49:
            java.lang.String r0 = "Close button resource not found, falling back to default."
            com.google.android.gms.internal.ads.zzcec.zze(r0)
        L4e:
            android.widget.ImageButton r0 = r5.f16164a
            if (r3 != 0) goto L56
            r0.setImageResource(r2)
            return
        L56:
            r0.setImageDrawable(r3)
            android.widget.ImageButton r0 = r5.f16164a
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            r0.setScaleType(r1)
            return
        L61:
            android.widget.ImageButton r0 = r5.f16164a
            r0.setImageResource(r2)
            return
        L67:
            android.widget.ImageButton r0 = r5.f16164a
            r0.setImageResource(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.z.c():void");
    }

    public final void b(boolean z10) {
        if (!z10) {
            this.f16164a.setVisibility(0);
            return;
        }
        this.f16164a.setVisibility(8);
        if (((Long) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzbc)).longValue() > 0) {
            this.f16164a.animate().cancel();
            this.f16164a.clearAnimation();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f fVar = this.f16165b;
        if (fVar != null) {
            fVar.zzj();
        }
    }
}
