package com.facebook.ads.redexgen.uinode;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Y4 */
/* loaded from: assets/audience_network.dex */
public final class SurfaceHolderCallbackC4292Y4 implements InterfaceC3344Id, InterfaceC2881Aj, InterfaceC3176Fr, InterfaceC3042DZ, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"nMHZhEZSp5EcTMzj890UQSIKsf7nOssk", "WLzxKTE2vNTMCpqDs", "SfczCGFglH", "X5aT15p3N3rGxVL5g", "GbnJfxrb9aQYK7s9S1Y8QTSWgx7P8ZxV", "tLWa3XxeFvyx8wOT4", "wILb6N7ReXeeP8cmU", "dyBLf42uqj"};
    public final /* synthetic */ C3080EH A00;

    public SurfaceHolderCallbackC4292Y4(C3080EH c3080eh) {
        this.A00 = c3080eh;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2881Aj
    public final void AAo(String str, long j10, long j11) {
        Iterator it = C3080EH.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC2881Aj) it.next()).AAo(str, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2881Aj
    public final void AAp(C2910BC c2910bc) {
        Iterator it = C3080EH.A0D(this.A00).iterator();
        while (it.hasNext()) {
            InterfaceC2881Aj interfaceC2881Aj = (InterfaceC2881Aj) it.next();
            String[] strArr = A01;
            if (strArr[1].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A01[4] = "5uZ3F86UAJ67QZD2oUJwcWpEFJTFqeup";
            interfaceC2881Aj.AAp(c2910bc);
        }
        C3080EH.A04(this.A00, null);
        C3080EH.A06(this.A00, null);
        C3080EH.A00(this.A00, 0);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2881Aj
    public final void AAq(C2910BC c2910bc) {
        C3080EH.A06(this.A00, c2910bc);
        Iterator it = C3080EH.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC2881Aj) it.next()).AAq(c2910bc);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2881Aj
    public final void AAr(Format format) {
        C3080EH.A04(this.A00, format);
        Iterator it = C3080EH.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC2881Aj) it.next()).AAr(format);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2881Aj
    public final void AAs(int i10) {
        C3080EH.A00(this.A00, i10);
        Iterator it = C3080EH.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC2881Aj) it.next()).AAs(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2881Aj
    public final void AAt(int i10, long j10, long j11) {
        Iterator it = C3080EH.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC2881Aj) it.next()).AAt(i10, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3176Fr
    public final void ABF(List<C3172Fn> list) {
        C3080EH.A08(this.A00, list);
        Iterator it = C3080EH.A09(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC3176Fr) it.next()).ABF(list);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3344Id
    public final void ABN(int i10, long j10) {
        Iterator it = C3080EH.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC3344Id) it.next()).ABN(i10, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3042DZ
    public final void ACK(Metadata metadata) {
        Iterator it = C3080EH.A0A(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC3042DZ) it.next()).ACK(metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3344Id
    public final void ACt(Surface surface) {
        if (C3080EH.A01(this.A00) == surface) {
            Iterator it = C3080EH.A0C(this.A00).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = C3080EH.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            ((InterfaceC3344Id) it2.next()).ACt(surface);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3344Id
    public final void ADU(String str, long j10, long j11) {
        Iterator it = C3080EH.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC3344Id) it.next()).ADU(str, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3344Id
    public final void ADV(C2910BC c2910bc) {
        Iterator it = C3080EH.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC3344Id) it.next()).ADV(c2910bc);
        }
        C3080EH.A03(this.A00, null);
        String[] strArr = A01;
        if (strArr[1].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A01[0] = "zG8NefRqMKYqbgzRufdCrC4W5rqrDhRZ";
        C3080EH.A05(this.A00, null);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3344Id
    public final void ADW(C2910BC c2910bc) {
        C3080EH.A05(this.A00, c2910bc);
        Iterator it = C3080EH.A0B(this.A00).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[0].charAt(5) == '7') {
                throw new RuntimeException();
            }
            A01[4] = "B3QwduSxUwudXX0SLqqw26pCzLpqq2sU";
            if (hasNext) {
                ((InterfaceC3344Id) it.next()).ADW(c2910bc);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3344Id
    public final void ADa(Format format) {
        C3080EH.A03(this.A00, format);
        Iterator it = C3080EH.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC3344Id) it.next()).ADa(format);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3344Id
    public final void ADf(int i10, int i11, int i12, float f10) {
        Iterator it = C3080EH.A0C(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC3335IU) it.next()).ADf(i10, i11, i12, f10);
        }
        Iterator it2 = C3080EH.A0B(this.A00).iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            String[] strArr = A01;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[4] = "2vUTxC8fdDWhhRkArIujhTo4qLvFXYNt";
            if (hasNext) {
                ((InterfaceC3344Id) it2.next()).ADf(i10, i11, i12, f10);
            } else {
                return;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        C3080EH.A0H(this.A00, new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C3080EH.A0H(this.A00, null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C3080EH.A0H(this.A00, surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C3080EH.A0H(this.A00, null, false);
    }
}
