.class public final synthetic Landroidx/core/view/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/i;


# instance fields
.field public final synthetic a:Landroidx/core/view/x;

.field public final synthetic b:Landroidx/core/view/m0;


# direct methods
.method public synthetic constructor <init>(Landroidx/core/view/x;Landroidx/core/view/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/core/view/v;->a:Landroidx/core/view/x;

    iput-object p2, p0, Landroidx/core/view/v;->b:Landroidx/core/view/m0;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V
    .locals 2

    iget-object v0, p0, Landroidx/core/view/v;->a:Landroidx/core/view/x;

    iget-object v1, p0, Landroidx/core/view/v;->b:Landroidx/core/view/m0;

    invoke-static {v0, v1, p1, p2}, Landroidx/core/view/x;->b(Landroidx/core/view/x;Landroidx/core/view/m0;Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V

    return-void
.end method
