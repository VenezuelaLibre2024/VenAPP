package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.VideoStartReason;

/* loaded from: assets/audience_network.dex */
public class EU extends AbstractC1176Pu {
    public final /* synthetic */ C06835h A00;

    public EU(C06835h c06835h) {
        this.A00 = c06835h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C9H c9h) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        MediaViewVideoRenderer mediaViewVideoRenderer2;
        MediaViewVideoRenderer mediaViewVideoRenderer3;
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onCompleted();
        mediaViewVideoRenderer2 = this.A00.A00;
        if (C0988Ih.A1H(mediaViewVideoRenderer2.getContext())) {
            mediaViewVideoRenderer3 = this.A00.A00;
            mediaViewVideoRenderer3.play(VideoStartReason.AUTO_STARTED);
        }
    }
}