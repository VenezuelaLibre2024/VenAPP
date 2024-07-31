.class public final synthetic Landroidx/core/view/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/i;


# instance fields
.field public final synthetic a:Landroidx/core/view/x;

.field public final synthetic b:Landroidx/lifecycle/f$b;

.field public final synthetic c:Landroidx/core/view/m0;


# direct methods
.method public synthetic constructor <init>(Landroidx/core/view/x;Landroidx/lifecycle/f$b;Landroidx/core/view/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/core/view/w;->a:Landroidx/core/view/x;

    iput-object p2, p0, Landroidx/core/view/w;->b:Landroidx/lifecycle/f$b;

    iput-object p3, p0, Landroidx/core/view/w;->c:Landroidx/core/view/m0;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V
    .locals 3

    iget-object v0, p0, Landroidx/core/view/w;->a:Landroidx/core/view/x;

    iget-object v1, p0, Landroidx/core/view/w;->b:Landroidx/lifecycle/f$b;

    iget-object v2, p0, Landroidx/core/view/w;->c:Landroidx/core/view/m0;

    invoke-static {v0, v1, v2, p1, p2}, Landroidx/core/view/x;->a(Landroidx/core/view/x;Landroidx/lifecycle/f$b;Landroidx/core/view/m0;Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V

    return-void
.end method
