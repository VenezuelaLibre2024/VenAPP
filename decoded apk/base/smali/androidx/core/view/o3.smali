.class public final Landroidx/core/view/o3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/o3$d;,
        Landroidx/core/view/o3$e;,
        Landroidx/core/view/o3$c;,
        Landroidx/core/view/o3$b;,
        Landroidx/core/view/o3$a;
    }
.end annotation


# instance fields
.field private final a:Landroidx/core/view/o3$e;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance p2, Landroidx/core/view/o3$d;

    invoke-direct {p2, p1, p0}, Landroidx/core/view/o3$d;-><init>(Landroid/view/Window;Landroidx/core/view/o3;)V

    iput-object p2, p0, Landroidx/core/view/o3;->a:Landroidx/core/view/o3$e;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    new-instance v0, Landroidx/core/view/o3$c;

    invoke-direct {v0, p1, p2}, Landroidx/core/view/o3$c;-><init>(Landroid/view/Window;Landroid/view/View;)V

    :goto_0
    iput-object v0, p0, Landroidx/core/view/o3;->a:Landroidx/core/view/o3$e;

    goto :goto_1

    :cond_1
    new-instance v0, Landroidx/core/view/o3$b;

    invoke-direct {v0, p1, p2}, Landroidx/core/view/o3$b;-><init>(Landroid/view/Window;Landroid/view/View;)V

    goto :goto_0

    :goto_1
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/o3;->a:Landroidx/core/view/o3$e;

    invoke-virtual {v0, p1}, Landroidx/core/view/o3$e;->a(Z)V

    return-void
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/o3;->a:Landroidx/core/view/o3$e;

    invoke-virtual {v0, p1}, Landroidx/core/view/o3$e;->b(Z)V

    return-void
.end method
