package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cb */
/* loaded from: assets/audience_network.dex */
public class C4559cb<ModelType, StateType> {
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    public List<InterfaceC4561cd<ModelType, StateType>> A01 = null;
    public C4558ca A00 = C4558ca.A08;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cb != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C4559cb(ModelType model, StateType state, String str) {
        this.A02 = model;
        this.A03 = state;
        this.A04 = str;
    }

    public static /* synthetic */ C4558ca A00(C4559cb c4559cb) {
        return c4559cb.A00;
    }

    public static /* synthetic */ Object A01(C4559cb c4559cb) {
        return c4559cb.A02;
    }

    public static /* synthetic */ Object A02(C4559cb c4559cb) {
        return c4559cb.A03;
    }

    public static /* synthetic */ String A03(C4559cb c4559cb) {
        return c4559cb.A04;
    }

    public static /* synthetic */ List A04(C4559cb c4559cb) {
        return c4559cb.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cb != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cd != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C4559cb<ModelType, StateType> A05(InterfaceC4561cd<ModelType, StateType> interfaceC4561cd) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC4561cd);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cb != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C4558ca<ModelType, StateType> A06() {
        return new C4558ca<>(this);
    }
}
