package com.google.android.ads.nativetemplates;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.nativead.b;
import e6.a;
import io.flutter.plugins.googlemobileads.R;

/* loaded from: classes.dex */
public final class TemplateView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f8080a;

    /* renamed from: b, reason: collision with root package name */
    private a f8081b;

    /* renamed from: c, reason: collision with root package name */
    private b f8082c;

    /* renamed from: d, reason: collision with root package name */
    private NativeAdView f8083d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f8084e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f8085f;

    /* renamed from: r, reason: collision with root package name */
    private RatingBar f8086r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f8087s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f8088t;

    /* renamed from: u, reason: collision with root package name */
    private MediaView f8089u;

    /* renamed from: v, reason: collision with root package name */
    private Button f8090v;

    /* renamed from: w, reason: collision with root package name */
    private ConstraintLayout f8091w;

    public TemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet);
    }

    private boolean a(b bVar) {
        return !TextUtils.isEmpty(bVar.getStore()) && TextUtils.isEmpty(bVar.getAdvertiser());
    }

    private void b() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        Button button;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        Button button2;
        Button button3;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        Button button4;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        ColorDrawable v10 = this.f8081b.v();
        if (v10 != null) {
            this.f8091w.setBackground(v10);
            TextView textView13 = this.f8084e;
            if (textView13 != null) {
                textView13.setBackground(v10);
            }
            TextView textView14 = this.f8085f;
            if (textView14 != null) {
                textView14.setBackground(v10);
            }
            TextView textView15 = this.f8087s;
            if (textView15 != null) {
                textView15.setBackground(v10);
            }
        }
        Typeface y10 = this.f8081b.y();
        if (y10 != null && (textView12 = this.f8084e) != null) {
            textView12.setTypeface(y10);
        }
        Typeface C = this.f8081b.C();
        if (C != null && (textView11 = this.f8085f) != null) {
            textView11.setTypeface(C);
        }
        Typeface G = this.f8081b.G();
        if (G != null && (textView10 = this.f8087s) != null) {
            textView10.setTypeface(G);
        }
        Typeface t10 = this.f8081b.t();
        if (t10 != null && (button4 = this.f8090v) != null) {
            button4.setTypeface(t10);
        }
        if (this.f8081b.z() != null && (textView9 = this.f8084e) != null) {
            textView9.setTextColor(this.f8081b.z().intValue());
        }
        if (this.f8081b.D() != null && (textView8 = this.f8085f) != null) {
            textView8.setTextColor(this.f8081b.D().intValue());
        }
        if (this.f8081b.H() != null && (textView7 = this.f8087s) != null) {
            textView7.setTextColor(this.f8081b.H().intValue());
        }
        if (this.f8081b.u() != null && (button3 = this.f8090v) != null) {
            button3.setTextColor(this.f8081b.u().intValue());
        }
        float s10 = this.f8081b.s();
        if (s10 > 0.0f && (button2 = this.f8090v) != null) {
            button2.setTextSize(s10);
        }
        float x10 = this.f8081b.x();
        if (x10 > 0.0f && (textView6 = this.f8084e) != null) {
            textView6.setTextSize(x10);
        }
        float B = this.f8081b.B();
        if (B > 0.0f && (textView5 = this.f8085f) != null) {
            textView5.setTextSize(B);
        }
        float F = this.f8081b.F();
        if (F > 0.0f && (textView4 = this.f8087s) != null) {
            textView4.setTextSize(F);
        }
        ColorDrawable r10 = this.f8081b.r();
        if (r10 != null && (button = this.f8090v) != null) {
            button.setBackground(r10);
        }
        ColorDrawable w10 = this.f8081b.w();
        if (w10 != null && (textView3 = this.f8084e) != null) {
            textView3.setBackground(w10);
        }
        ColorDrawable A = this.f8081b.A();
        if (A != null && (textView2 = this.f8085f) != null) {
            textView2.setBackground(A);
        }
        ColorDrawable E = this.f8081b.E();
        if (E != null && (textView = this.f8087s) != null) {
            textView.setBackground(E);
        }
        invalidate();
        requestLayout();
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TemplateView, 0, 0);
        try {
            this.f8080a = obtainStyledAttributes.getResourceId(R.styleable.TemplateView_gnt_template_type, R.layout.gnt_medium_template_view);
            obtainStyledAttributes.recycle();
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.f8080a, this);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void c() {
        this.f8082c.destroy();
    }

    public NativeAdView getNativeAdView() {
        return this.f8083d;
    }

    public String getTemplateTypeName() {
        int i10 = this.f8080a;
        return i10 == R.layout.gnt_medium_template_view ? "medium_template" : i10 == R.layout.gnt_small_template_view ? "small_template" : "";
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f8083d = (NativeAdView) findViewById(R.id.native_ad_view);
        this.f8084e = (TextView) findViewById(R.id.primary);
        this.f8085f = (TextView) findViewById(R.id.secondary);
        this.f8087s = (TextView) findViewById(R.id.body);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.rating_bar);
        this.f8086r = ratingBar;
        ratingBar.setEnabled(false);
        this.f8090v = (Button) findViewById(R.id.cta);
        this.f8088t = (ImageView) findViewById(R.id.icon);
        this.f8089u = (MediaView) findViewById(R.id.media_view);
        this.f8091w = (ConstraintLayout) findViewById(R.id.background);
    }

    public void setNativeAd(b bVar) {
        this.f8082c = bVar;
        String store = bVar.getStore();
        String advertiser = bVar.getAdvertiser();
        String headline = bVar.getHeadline();
        String body = bVar.getBody();
        String callToAction = bVar.getCallToAction();
        Double starRating = bVar.getStarRating();
        b.AbstractC0145b icon = bVar.getIcon();
        this.f8083d.setCallToActionView(this.f8090v);
        this.f8083d.setHeadlineView(this.f8084e);
        this.f8083d.setMediaView(this.f8089u);
        this.f8085f.setVisibility(0);
        if (a(bVar)) {
            this.f8083d.setStoreView(this.f8085f);
        } else if (TextUtils.isEmpty(advertiser)) {
            store = "";
        } else {
            this.f8083d.setAdvertiserView(this.f8085f);
            store = advertiser;
        }
        this.f8084e.setText(headline);
        this.f8090v.setText(callToAction);
        if (starRating == null || starRating.doubleValue() <= 0.0d) {
            this.f8085f.setText(store);
            this.f8085f.setVisibility(0);
            this.f8086r.setVisibility(8);
        } else {
            this.f8085f.setVisibility(8);
            this.f8086r.setVisibility(0);
            this.f8086r.setRating(starRating.floatValue());
            this.f8083d.setStarRatingView(this.f8086r);
        }
        ImageView imageView = this.f8088t;
        if (icon != null) {
            imageView.setVisibility(0);
            this.f8088t.setImageDrawable(icon.getDrawable());
        } else {
            imageView.setVisibility(8);
        }
        TextView textView = this.f8087s;
        if (textView != null) {
            textView.setText(body);
            this.f8083d.setBodyView(this.f8087s);
        }
        this.f8083d.setNativeAd(bVar);
    }

    public void setStyles(a aVar) {
        this.f8081b = aVar;
        b();
    }
}
