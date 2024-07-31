.class Landroidx/swiperefreshlayout/widget/c$g;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/swiperefreshlayout/widget/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/swiperefreshlayout/widget/c;


# direct methods
.method constructor <init>(Landroidx/swiperefreshlayout/widget/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/c$g;->a:Landroidx/swiperefreshlayout/widget/c;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 0

    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/c$g;->a:Landroidx/swiperefreshlayout/widget/c;

    invoke-virtual {p2, p1}, Landroidx/swiperefreshlayout/widget/c;->moveToStart(F)V

    return-void
.end method
