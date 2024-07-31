.class Landroidx/core/view/x$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field final a:Landroidx/lifecycle/f;

.field private b:Landroidx/lifecycle/i;


# direct methods
.method constructor <init>(Landroidx/lifecycle/f;Landroidx/lifecycle/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/core/view/x$a;->a:Landroidx/lifecycle/f;

    iput-object p2, p0, Landroidx/core/view/x$a;->b:Landroidx/lifecycle/i;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/j;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    iget-object v0, p0, Landroidx/core/view/x$a;->a:Landroidx/lifecycle/f;

    iget-object v1, p0, Landroidx/core/view/x$a;->b:Landroidx/lifecycle/i;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/f;->c(Landroidx/lifecycle/j;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/core/view/x$a;->b:Landroidx/lifecycle/i;

    return-void
.end method
