.class Lq3/k$c;
.super Lq3/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq3/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lq3/k;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IIII)Lq3/k$g;
    .locals 2

    invoke-virtual {p0, p1, p2, p3, p4}, Lq3/k$c;->b(IIII)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    sget-object p1, Lq3/k$g;->QUALITY:Lq3/k$g;

    goto :goto_0

    :cond_0
    sget-object v0, Lq3/k;->c:Lq3/k;

    invoke-virtual {v0, p1, p2, p3, p4}, Lq3/k;->a(IIII)Lq3/k$g;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public b(IIII)F
    .locals 1

    sget-object v0, Lq3/k;->c:Lq3/k;

    invoke-virtual {v0, p1, p2, p3, p4}, Lq3/k;->b(IIII)F

    move-result p1

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    return p1
.end method
