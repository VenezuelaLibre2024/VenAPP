.class public Lyd/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Landroid/view/View;IIII)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    int-to-float v1, v1

    const-string v2, "\tdesired (w,h)"

    invoke-static {v2, v0, v1}, Lud/m;->d(Ljava/lang/String;FF)V

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    move p2, p1

    :cond_0
    invoke-static {p1, p3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-static {p2, p4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->measure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p0

    int-to-float p0, p0

    const-string p2, "\tactual (w,h)"

    invoke-static {p2, p1, p0}, Lud/m;->d(Ljava/lang/String;FF)V

    return-void
.end method

.method public static b(Landroid/view/View;II)V
    .locals 1

    const/high16 v0, -0x80000000

    invoke-static {p0, p1, p2, v0, v0}, Lyd/b;->a(Landroid/view/View;IIII)V

    return-void
.end method

.method public static c(Landroid/view/View;II)V
    .locals 2

    const/high16 v0, -0x80000000

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {p0, p1, p2, v0, v1}, Lyd/b;->a(Landroid/view/View;IIII)V

    return-void
.end method

.method public static d(Landroid/view/View;II)V
    .locals 2

    const/high16 v0, 0x40000000    # 2.0f

    const/high16 v1, -0x80000000

    invoke-static {p0, p1, p2, v0, v1}, Lyd/b;->a(Landroid/view/View;IIII)V

    return-void
.end method
