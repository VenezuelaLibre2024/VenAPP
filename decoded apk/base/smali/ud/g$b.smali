.class Lud/g$b;
.super Lud/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lud/g;->e(Lud/l;Lvd/c;Landroid/view/WindowManager;Landroid/view/WindowManager$LayoutParams;)Lud/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic A:Landroid/view/WindowManager;

.field final synthetic B:Lvd/c;

.field final synthetic C:Lud/g;

.field final synthetic z:Landroid/view/WindowManager$LayoutParams;


# direct methods
.method constructor <init>(Lud/g;Landroid/view/View;Ljava/lang/Object;Lud/p$e;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;Lvd/c;)V
    .locals 0

    iput-object p1, p0, Lud/g$b;->C:Lud/g;

    iput-object p5, p0, Lud/g$b;->z:Landroid/view/WindowManager$LayoutParams;

    iput-object p6, p0, Lud/g$b;->A:Landroid/view/WindowManager;

    iput-object p7, p0, Lud/g$b;->B:Lvd/c;

    invoke-direct {p0, p2, p3, p4}, Lud/p;-><init>(Landroid/view/View;Ljava/lang/Object;Lud/p$e;)V

    return-void
.end method


# virtual methods
.method protected f()F
    .locals 1

    iget-object v0, p0, Lud/g$b;->z:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    int-to-float v0, v0

    return v0
.end method

.method protected i(F)V
    .locals 2

    iget-object v0, p0, Lud/g$b;->z:Landroid/view/WindowManager$LayoutParams;

    float-to-int p1, p1

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object p1, p0, Lud/g$b;->A:Landroid/view/WindowManager;

    iget-object v0, p0, Lud/g$b;->B:Lvd/c;

    invoke-virtual {v0}, Lvd/c;->f()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lud/g$b;->z:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p1, v0, v1}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
