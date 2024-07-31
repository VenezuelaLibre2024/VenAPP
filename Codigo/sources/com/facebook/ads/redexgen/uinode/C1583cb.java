package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1583cb<ModelType, StateType> {
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    public List<InterfaceC1585cd<ModelType, StateType>> A01 = null;
    public C1582ca A00 = C1582ca.A08;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cb != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C1583cb(ModelType model, StateType state, String str) {
        this.A02 = model;
        this.A03 = state;
        this.A04 = str;
    }

    public static /* synthetic */ C1582ca A00(C1583cb c1583cb) {
        return c1583cb.A00;
    }

    public static /* synthetic */ Object A01(C1583cb c1583cb) {
        return c1583cb.A02;
    }

    public static /* synthetic */ Object A02(C1583cb c1583cb) {
        return c1583cb.A03;
    }

    public static /* synthetic */ String A03(C1583cb c1583cb) {
        return c1583cb.A04;
    }

    public static /* synthetic */ List A04(C1583cb c1583cb) {
        return c1583cb.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cb != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cd != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C1583cb<ModelType, StateType> A05(InterfaceC1585cd<ModelType, StateType> interfaceC1585cd) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC1585cd);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cb != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C1582ca<ModelType, StateType> A06() {
        return new C1582ca<>(this);
    }
}
