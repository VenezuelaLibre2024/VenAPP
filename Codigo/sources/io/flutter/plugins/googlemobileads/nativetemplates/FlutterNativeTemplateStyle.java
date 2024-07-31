package io.flutter.plugins.googlemobileads.nativetemplates;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.ads.nativetemplates.TemplateView;
import e6.a;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class FlutterNativeTemplateStyle {
    final FlutterNativeTemplateTextStyle callToActionStyle;
    final ColorDrawable mainBackgroundColor;
    final FlutterNativeTemplateTextStyle primaryTextStyle;
    final FlutterNativeTemplateTextStyle secondaryTextStyle;
    final FlutterNativeTemplateType templateType;
    final FlutterNativeTemplateTextStyle tertiaryTextStyle;

    public FlutterNativeTemplateStyle(FlutterNativeTemplateType flutterNativeTemplateType, ColorDrawable colorDrawable, FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle, FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle2, FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle3, FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle4) {
        this.templateType = flutterNativeTemplateType;
        this.mainBackgroundColor = colorDrawable;
        this.callToActionStyle = flutterNativeTemplateTextStyle;
        this.primaryTextStyle = flutterNativeTemplateTextStyle2;
        this.secondaryTextStyle = flutterNativeTemplateTextStyle3;
        this.tertiaryTextStyle = flutterNativeTemplateTextStyle4;
    }

    public a asNativeTemplateStyle() {
        a.C0220a c0220a = new a.C0220a();
        ColorDrawable colorDrawable = this.mainBackgroundColor;
        if (colorDrawable != null) {
            c0220a.f(colorDrawable);
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle = this.callToActionStyle;
        if (flutterNativeTemplateTextStyle != null) {
            if (flutterNativeTemplateTextStyle.getBackgroundColor() != null) {
                c0220a.b(this.callToActionStyle.getBackgroundColor());
            }
            if (this.callToActionStyle.getTextColor() != null) {
                c0220a.e(this.callToActionStyle.getTextColor().getColor());
            }
            if (this.callToActionStyle.getFontStyle() != null) {
                c0220a.d(this.callToActionStyle.getFontStyle().getTypeface());
            }
            if (this.callToActionStyle.getSize() != null) {
                c0220a.c(this.callToActionStyle.getSize().floatValue());
            }
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle2 = this.primaryTextStyle;
        if (flutterNativeTemplateTextStyle2 != null) {
            if (flutterNativeTemplateTextStyle2.getBackgroundColor() != null) {
                c0220a.g(this.primaryTextStyle.getBackgroundColor());
            }
            if (this.primaryTextStyle.getTextColor() != null) {
                c0220a.j(this.primaryTextStyle.getTextColor().getColor());
            }
            if (this.primaryTextStyle.getFontStyle() != null) {
                c0220a.i(this.primaryTextStyle.getFontStyle().getTypeface());
            }
            if (this.primaryTextStyle.getSize() != null) {
                c0220a.h(this.primaryTextStyle.getSize().floatValue());
            }
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle3 = this.secondaryTextStyle;
        if (flutterNativeTemplateTextStyle3 != null) {
            if (flutterNativeTemplateTextStyle3.getBackgroundColor() != null) {
                c0220a.k(this.secondaryTextStyle.getBackgroundColor());
            }
            if (this.secondaryTextStyle.getTextColor() != null) {
                c0220a.n(this.secondaryTextStyle.getTextColor().getColor());
            }
            if (this.secondaryTextStyle.getFontStyle() != null) {
                c0220a.m(this.secondaryTextStyle.getFontStyle().getTypeface());
            }
            if (this.secondaryTextStyle.getSize() != null) {
                c0220a.l(this.secondaryTextStyle.getSize().floatValue());
            }
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle4 = this.tertiaryTextStyle;
        if (flutterNativeTemplateTextStyle4 != null) {
            if (flutterNativeTemplateTextStyle4.getBackgroundColor() != null) {
                c0220a.o(this.tertiaryTextStyle.getBackgroundColor());
            }
            if (this.tertiaryTextStyle.getTextColor() != null) {
                c0220a.r(this.tertiaryTextStyle.getTextColor().getColor());
            }
            if (this.tertiaryTextStyle.getFontStyle() != null) {
                c0220a.q(this.tertiaryTextStyle.getFontStyle().getTypeface());
            }
            if (this.tertiaryTextStyle.getSize() != null) {
                c0220a.p(this.tertiaryTextStyle.getSize().floatValue());
            }
        }
        return c0220a.a();
    }

    public TemplateView asTemplateView(Context context) {
        TemplateView templateView = (TemplateView) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.templateType.resourceId(), (ViewGroup) null);
        templateView.setStyles(asNativeTemplateStyle());
        return templateView;
    }

    public boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterNativeTemplateStyle)) {
            return false;
        }
        FlutterNativeTemplateStyle flutterNativeTemplateStyle = (FlutterNativeTemplateStyle) obj;
        return this.templateType == flutterNativeTemplateStyle.templateType && (((colorDrawable = this.mainBackgroundColor) == null && flutterNativeTemplateStyle.mainBackgroundColor == null) || colorDrawable.getColor() == flutterNativeTemplateStyle.mainBackgroundColor.getColor()) && Objects.equals(this.callToActionStyle, flutterNativeTemplateStyle.callToActionStyle) && Objects.equals(this.primaryTextStyle, flutterNativeTemplateStyle.primaryTextStyle) && Objects.equals(this.secondaryTextStyle, flutterNativeTemplateStyle.secondaryTextStyle) && Objects.equals(this.tertiaryTextStyle, flutterNativeTemplateStyle.tertiaryTextStyle);
    }

    public FlutterNativeTemplateTextStyle getCallToActionStyle() {
        return this.callToActionStyle;
    }

    public ColorDrawable getMainBackgroundColor() {
        return this.mainBackgroundColor;
    }

    public FlutterNativeTemplateTextStyle getPrimaryTextStyle() {
        return this.primaryTextStyle;
    }

    public FlutterNativeTemplateTextStyle getSecondaryTextStyle() {
        return this.secondaryTextStyle;
    }

    public FlutterNativeTemplateType getTemplateType() {
        return this.templateType;
    }

    public FlutterNativeTemplateTextStyle getTertiaryTextStyle() {
        return this.tertiaryTextStyle;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        ColorDrawable colorDrawable = this.mainBackgroundColor;
        objArr[0] = colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor());
        objArr[1] = this.callToActionStyle;
        objArr[2] = this.primaryTextStyle;
        objArr[3] = this.secondaryTextStyle;
        objArr[4] = this.tertiaryTextStyle;
        return Objects.hash(objArr);
    }
}
