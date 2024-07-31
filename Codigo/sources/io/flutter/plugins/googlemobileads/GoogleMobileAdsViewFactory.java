package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import io.flutter.Log;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.Locale;

/* loaded from: classes3.dex */
final class GoogleMobileAdsViewFactory extends PlatformViewFactory {
    private final AdInstanceManager manager;

    /* loaded from: classes3.dex */
    private static class ErrorTextView implements PlatformView {
        private final TextView textView;

        private ErrorTextView(Context context, String str) {
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setText(str);
            textView.setBackgroundColor(-65536);
            textView.setTextColor(-256);
        }

        @Override // io.flutter.plugin.platform.PlatformView
        public void dispose() {
        }

        @Override // io.flutter.plugin.platform.PlatformView
        public View getView() {
            return this.textView;
        }
    }

    public GoogleMobileAdsViewFactory(AdInstanceManager adInstanceManager) {
        super(StandardMessageCodec.INSTANCE);
        this.manager = adInstanceManager;
    }

    private static PlatformView getErrorView(final Context context, int i10) {
        Log.e(GoogleMobileAdsViewFactory.class.getSimpleName(), String.format(Locale.getDefault(), "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d.", Integer.valueOf(i10)));
        return new PlatformView() { // from class: io.flutter.plugins.googlemobileads.GoogleMobileAdsViewFactory.1
            @Override // io.flutter.plugin.platform.PlatformView
            public void dispose() {
            }

            @Override // io.flutter.plugin.platform.PlatformView
            public View getView() {
                return new View(context);
            }
        };
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public PlatformView create(Context context, int i10, Object obj) {
        int intValue;
        if (obj == null) {
            intValue = 0;
        } else {
            Integer num = (Integer) obj;
            FlutterAd adForId = this.manager.adForId(num.intValue());
            if (adForId != null && adForId.getPlatformView() != null) {
                return adForId.getPlatformView();
            }
            intValue = num.intValue();
        }
        return getErrorView(context, intValue);
    }
}
