.class public final synthetic Landroidx/camera/lifecycle/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Landroidx/camera/lifecycle/e;

.field public final synthetic b:Lw/v;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/lifecycle/e;Lw/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/lifecycle/c;->a:Landroidx/camera/lifecycle/e;

    iput-object p2, p0, Landroidx/camera/lifecycle/c;->b:Lw/v;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/camera/lifecycle/c;->a:Landroidx/camera/lifecycle/e;

    iget-object v1, p0, Landroidx/camera/lifecycle/c;->b:Lw/v;

    invoke-static {v0, v1, p1}, Landroidx/camera/lifecycle/e;->b(Landroidx/camera/lifecycle/e;Lw/v;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method