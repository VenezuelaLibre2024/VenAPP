.class final Lio/flutter/plugins/camera/features/zoomlevel/ZoomUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static computeZoomRatio(FFF)Ljava/lang/Float;
    .locals 0

    invoke-static {p0, p1, p2}, Ls0/a;->b(FFF)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method static computeZoomRect(FLandroid/graphics/Rect;FF)Landroid/graphics/Rect;
    .locals 3

    invoke-static {p0, p2, p3}, Lio/flutter/plugins/camera/features/zoomlevel/ZoomUtils;->computeZoomRatio(FFF)Ljava/lang/Float;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    div-float/2addr v0, p0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    int-to-float p1, p1

    mul-float/2addr p1, v1

    div-float/2addr p1, p0

    float-to-int p0, p1

    new-instance p1, Landroid/graphics/Rect;

    sub-int v1, p2, v0

    sub-int v2, p3, p0

    add-int/2addr p2, v0

    add-int/2addr p3, p0

    invoke-direct {p1, v1, v2, p2, p3}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1
.end method
