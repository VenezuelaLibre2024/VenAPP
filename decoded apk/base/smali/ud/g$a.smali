.class Lud/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud/p$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lud/g;->e(Lud/l;Lvd/c;Landroid/view/WindowManager;Landroid/view/WindowManager$LayoutParams;)Lud/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lvd/c;

.field final synthetic b:Lud/g;


# direct methods
.method constructor <init>(Lud/g;Lvd/c;)V
    .locals 0

    iput-object p1, p0, Lud/g$a;->b:Lud/g;

    iput-object p2, p0, Lud/g$a;->a:Lvd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public b(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    iget-object p2, p0, Lud/g$a;->a:Lvd/c;

    invoke-virtual {p2}, Lvd/c;->d()Landroid/view/View$OnClickListener;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lud/g$a;->a:Lvd/c;

    invoke-virtual {p2}, Lvd/c;->d()Landroid/view/View$OnClickListener;

    move-result-object p2

    invoke-interface {p2, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method
