.class Landroidx/appcompat/widget/y$a;
.super Landroidx/appcompat/widget/s0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/y;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILandroid/content/res/Resources$Theme;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic u:Landroidx/appcompat/widget/y$h;

.field final synthetic v:Landroidx/appcompat/widget/y;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/y;Landroid/view/View;Landroidx/appcompat/widget/y$h;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/y$a;->v:Landroidx/appcompat/widget/y;

    iput-object p3, p0, Landroidx/appcompat/widget/y$a;->u:Landroidx/appcompat/widget/y$h;

    invoke-direct {p0, p2}, Landroidx/appcompat/widget/s0;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public b()Landroidx/appcompat/view/menu/p;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y$a;->u:Landroidx/appcompat/widget/y$h;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/y$a;->v:Landroidx/appcompat/widget/y;

    invoke-virtual {v0}, Landroidx/appcompat/widget/y;->getInternalPopup()Landroidx/appcompat/widget/y$j;

    move-result-object v0

    invoke-interface {v0}, Landroidx/appcompat/widget/y$j;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/y$a;->v:Landroidx/appcompat/widget/y;

    invoke-virtual {v0}, Landroidx/appcompat/widget/y;->b()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
