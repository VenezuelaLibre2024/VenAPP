package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import dg.s;
import ig.f;
import ig.g;
import ig.k;
import ig.l;
import ig.o;
import ih.j;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jh.i;

/* loaded from: classes3.dex */
public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private BarcodeView f13418a;

    /* renamed from: b, reason: collision with root package name */
    private ViewfinderView f13419b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f13420c;

    /* loaded from: classes3.dex */
    public interface a {
    }

    /* loaded from: classes3.dex */
    private class b implements ih.a {

        /* renamed from: a, reason: collision with root package name */
        private ih.a f13421a;

        public b(ih.a aVar) {
            this.f13421a = aVar;
        }

        @Override // ih.a
        public void a(List<s> list) {
            Iterator<s> it = list.iterator();
            while (it.hasNext()) {
                DecoratedBarcodeView.this.f13419b.a(it.next());
            }
            this.f13421a.a(list);
        }

        @Override // ih.a
        public void b(ih.b bVar) {
            this.f13421a.b(bVar);
        }
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
    }

    private void c(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f17767t);
        int resourceId = obtainStyledAttributes.getResourceId(o.f17768u, l.f17742a);
        obtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(k.f17731b);
        this.f13418a = barcodeView;
        if (barcodeView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
        }
        barcodeView.q(attributeSet);
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(k.f17741l);
        this.f13419b = viewfinderView;
        if (viewfinderView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        viewfinderView.setCameraPreview(this.f13418a);
        this.f13420c = (TextView) findViewById(k.f17740k);
    }

    public void b(ih.a aVar) {
        this.f13418a.J(new b(aVar));
    }

    public void d(Intent intent) {
        int intExtra;
        Set<dg.a> a10 = f.a(intent);
        Map<dg.e, ?> a11 = g.a(intent);
        i iVar = new i();
        if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
            iVar.i(intExtra);
        }
        if (intent.hasExtra("TORCH_ENABLED") && intent.getBooleanExtra("TORCH_ENABLED", false)) {
            i();
        }
        String stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
        String stringExtra2 = intent.getStringExtra("CHARACTER_SET");
        new dg.k().e(a11);
        this.f13418a.setCameraSettings(iVar);
        this.f13418a.setDecoderFactory(new j(a10, a11, stringExtra2, intExtra2));
    }

    public void e() {
        this.f13418a.u();
    }

    public void f() {
        this.f13418a.v();
    }

    public void g() {
        this.f13418a.y();
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(k.f17731b);
    }

    public i getCameraSettings() {
        return this.f13418a.getCameraSettings();
    }

    public ih.g getDecoderFactory() {
        return this.f13418a.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f13420c;
    }

    public ViewfinderView getViewFinder() {
        return this.f13419b;
    }

    public void h() {
        this.f13418a.setTorch(false);
    }

    public void i() {
        this.f13418a.setTorch(true);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 24) {
            i();
            return true;
        }
        if (i10 == 25) {
            h();
            return true;
        }
        if (i10 == 27 || i10 == 80) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public void setCameraSettings(i iVar) {
        this.f13418a.setCameraSettings(iVar);
    }

    public void setDecoderFactory(ih.g gVar) {
        this.f13418a.setDecoderFactory(gVar);
    }

    public void setStatusText(String str) {
        TextView textView = this.f13420c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(a aVar) {
    }
}
