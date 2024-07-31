package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import ig.k;
import ig.l;

/* loaded from: classes3.dex */
public class CaptureActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private e f13416a;

    /* renamed from: b, reason: collision with root package name */
    private DecoratedBarcodeView f13417b;

    protected DecoratedBarcodeView a() {
        setContentView(l.f17743b);
        return (DecoratedBarcodeView) findViewById(k.f17730a);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13417b = a();
        e eVar = new e(this, this.f13417b);
        this.f13416a = eVar;
        eVar.p(getIntent(), bundle);
        this.f13416a.l();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f13416a.u();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return this.f13417b.onKeyDown(i10, keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f13416a.v();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f13416a.w(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f13416a.x();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f13416a.y(bundle);
    }
}
