package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.MediaViewVideoRenderer;

/* loaded from: assets/audience_network.dex */
public class EY extends NX {
    public final /* synthetic */ C06835h A00;

    public EY(C06835h c06835h) {
        this.A00 = c06835h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1117Nn c1117Nn) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onPrepared();
    }
}