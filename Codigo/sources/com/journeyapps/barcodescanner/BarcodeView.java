package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import dg.s;
import ig.k;
import ih.f;
import ih.g;
import ih.h;
import ih.i;
import ih.j;
import ih.r;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class BarcodeView extends com.journeyapps.barcodescanner.a {
    private b M;
    private ih.a N;
    private i O;
    private g P;
    private Handler Q;
    private final Handler.Callback R;

    /* loaded from: classes3.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == k.f17736g) {
                ih.b bVar = (ih.b) message.obj;
                if (bVar != null && BarcodeView.this.N != null && BarcodeView.this.M != b.NONE) {
                    BarcodeView.this.N.b(bVar);
                    if (BarcodeView.this.M == b.SINGLE) {
                        BarcodeView.this.N();
                    }
                }
                return true;
            }
            if (i10 == k.f17735f) {
                return true;
            }
            if (i10 != k.f17737h) {
                return false;
            }
            List<s> list = (List) message.obj;
            if (BarcodeView.this.N != null && BarcodeView.this.M != b.NONE) {
                BarcodeView.this.N.a(list);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public enum b {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context) {
        super(context);
        this.M = b.NONE;
        this.N = null;
        this.R = new a();
        K();
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = b.NONE;
        this.N = null;
        this.R = new a();
        K();
    }

    private f G() {
        if (this.P == null) {
            this.P = H();
        }
        h hVar = new h();
        HashMap hashMap = new HashMap();
        hashMap.put(dg.e.NEED_RESULT_POINT_CALLBACK, hVar);
        f a10 = this.P.a(hashMap);
        hVar.b(a10);
        return a10;
    }

    private void K() {
        this.P = new j();
        this.Q = new Handler(this.R);
    }

    private void L() {
        M();
        if (this.M == b.NONE || !t()) {
            return;
        }
        i iVar = new i(getCameraInstance(), G(), this.Q);
        this.O = iVar;
        iVar.i(getPreviewFramingRect());
        this.O.k();
    }

    private void M() {
        i iVar = this.O;
        if (iVar != null) {
            iVar.l();
            this.O = null;
        }
    }

    protected g H() {
        return new j();
    }

    public void I(ih.a aVar) {
        this.M = b.CONTINUOUS;
        this.N = aVar;
        L();
    }

    public void J(ih.a aVar) {
        this.M = b.SINGLE;
        this.N = aVar;
        L();
    }

    public void N() {
        this.M = b.NONE;
        this.N = null;
        M();
    }

    public g getDecoderFactory() {
        return this.P;
    }

    public void setDecoderFactory(g gVar) {
        r.a();
        this.P = gVar;
        i iVar = this.O;
        if (iVar != null) {
            iVar.j(G());
        }
    }

    @Override // com.journeyapps.barcodescanner.a
    public void u() {
        M();
        super.u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.journeyapps.barcodescanner.a
    public void x() {
        super.x();
        L();
    }
}
