package io.flutter.plugins.googlemobileads;

import android.content.Context;
import x8.i;

/* loaded from: classes3.dex */
class FlutterAdSize {
    final int height;
    final i size;
    final int width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class AdSizeFactory {
        i getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i10) {
            return i.a(context, i10);
        }

        i getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i10) {
            return i.b(context, i10);
        }

        i getInlineAdaptiveBannerAdSize(int i10, int i11) {
            return i.e(i10, i11);
        }

        i getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i10) {
            return i.f(context, i10);
        }

        i getLandscapeInlineAdaptiveBannerAdSize(Context context, int i10) {
            return i.g(context, i10);
        }

        i getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i10) {
            return i.h(context, i10);
        }

        i getPortraitInlineAdaptiveBannerAdSize(Context context, int i10) {
            return i.i(context, i10);
        }
    }

    /* loaded from: classes3.dex */
    static class AnchoredAdaptiveBannerAdSize extends FlutterAdSize {
        final String orientation;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AnchoredAdaptiveBannerAdSize(Context context, AdSizeFactory adSizeFactory, String str, int i10) {
            super(getAdSize(context, adSizeFactory, str, i10));
            this.orientation = str;
        }

        private static i getAdSize(Context context, AdSizeFactory adSizeFactory, String str, int i10) {
            if (str == null) {
                return adSizeFactory.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, i10);
            }
            if (str.equals("portrait")) {
                return adSizeFactory.getPortraitAnchoredAdaptiveBannerAdSize(context, i10);
            }
            if (str.equals("landscape")) {
                return adSizeFactory.getLandscapeAnchoredAdaptiveBannerAdSize(context, i10);
            }
            throw new IllegalArgumentException("Unexpected value for orientation: " + str);
        }
    }

    /* loaded from: classes3.dex */
    static class FluidAdSize extends FlutterAdSize {
        /* JADX INFO: Access modifiers changed from: package-private */
        public FluidAdSize() {
            super(i.f30685p);
        }
    }

    /* loaded from: classes3.dex */
    static class InlineAdaptiveBannerAdSize extends FlutterAdSize {
        final Integer maxHeight;
        final Integer orientation;

        /* JADX INFO: Access modifiers changed from: package-private */
        public InlineAdaptiveBannerAdSize(AdSizeFactory adSizeFactory, Context context, int i10, Integer num, Integer num2) {
            super(getAdSize(adSizeFactory, context, i10, num, num2));
            this.orientation = num;
            this.maxHeight = num2;
        }

        private static i getAdSize(AdSizeFactory adSizeFactory, Context context, int i10, Integer num, Integer num2) {
            return num != null ? num.intValue() == 0 ? adSizeFactory.getPortraitInlineAdaptiveBannerAdSize(context, i10) : adSizeFactory.getLandscapeInlineAdaptiveBannerAdSize(context, i10) : num2 != null ? adSizeFactory.getInlineAdaptiveBannerAdSize(i10, num2.intValue()) : adSizeFactory.getCurrentOrientationInlineAdaptiveBannerAdSize(context, i10);
        }
    }

    /* loaded from: classes3.dex */
    static class SmartBannerAdSize extends FlutterAdSize {
        /* JADX INFO: Access modifiers changed from: package-private */
        public SmartBannerAdSize() {
            super(i.f30684o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterAdSize(int i10, int i11) {
        this(new i(i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterAdSize(i iVar) {
        this.size = iVar;
        this.width = iVar.j();
        this.height = iVar.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterAdSize)) {
            return false;
        }
        FlutterAdSize flutterAdSize = (FlutterAdSize) obj;
        return this.width == flutterAdSize.width && this.height == flutterAdSize.height;
    }

    public i getAdSize() {
        return this.size;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }
}
