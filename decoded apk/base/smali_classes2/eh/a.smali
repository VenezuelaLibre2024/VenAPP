.class public final Leh/a;
.super Ldg/s;
.source "SourceFile"


# instance fields
.field private final c:F


# direct methods
.method constructor <init>(FFF)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ldg/s;-><init>(FF)V

    iput p3, p0, Leh/a;->c:F

    return-void
.end method


# virtual methods
.method f(FFF)Z
    .locals 1

    invoke-virtual {p0}, Ldg/s;->d()F

    move-result v0

    sub-float/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpg-float p2, p2, p1

    const/4 v0, 0x0

    if-gtz p2, :cond_1

    invoke-virtual {p0}, Ldg/s;->c()F

    move-result p2

    sub-float/2addr p3, p2

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpg-float p2, p2, p1

    if-gtz p2, :cond_1

    iget p2, p0, Leh/a;->c:F

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p2, p1, p2

    if-lez p2, :cond_0

    iget p2, p0, Leh/a;->c:F

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method g(FFF)Leh/a;
    .locals 2

    invoke-virtual {p0}, Ldg/s;->c()F

    move-result v0

    add-float/2addr v0, p2

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr v0, p2

    invoke-virtual {p0}, Ldg/s;->d()F

    move-result v1

    add-float/2addr v1, p1

    div-float/2addr v1, p2

    iget p1, p0, Leh/a;->c:F

    add-float/2addr p1, p3

    div-float/2addr p1, p2

    new-instance p2, Leh/a;

    invoke-direct {p2, v0, v1, p1}, Leh/a;-><init>(FFF)V

    return-object p2
.end method