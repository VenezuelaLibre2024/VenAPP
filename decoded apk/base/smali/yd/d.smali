.class public Lyd/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/View;

.field private b:Z

.field private c:I

.field private d:I


# direct methods
.method public constructor <init>(Landroid/view/View;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyd/d;->a:Landroid/view/View;

    iput-boolean p2, p0, Lyd/d;->b:Z

    return-void
.end method


# virtual methods
.method public a()I
    .locals 4

    iget-object v0, p0, Lyd/d;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, Lyd/d;->a:Landroid/view/View;

    instance-of v1, v0, Landroid/widget/ScrollView;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/widget/ScrollView;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    add-int/2addr v1, v3

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int/2addr v1, v0

    return v1

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lyd/d;->d:I

    return v0
.end method

.method public c()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lyd/d;->a:Landroid/view/View;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lyd/d;->b:Z

    return v0
.end method

.method public e(II)V
    .locals 1

    iget-object v0, p0, Lyd/d;->a:Landroid/view/View;

    invoke-static {v0, p1, p2}, Lyd/b;->b(Landroid/view/View;II)V

    return-void
.end method

.method public f(II)V
    .locals 0

    iput p1, p0, Lyd/d;->c:I

    iput p2, p0, Lyd/d;->d:I

    return-void
.end method
