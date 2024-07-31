.class public final synthetic Landroidx/camera/core/impl/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Lcom/google/common/util/concurrent/f;

.field public final synthetic c:Landroidx/concurrent/futures/c$a;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/common/util/concurrent/f;Landroidx/concurrent/futures/c$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/u0;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Landroidx/camera/core/impl/u0;->b:Lcom/google/common/util/concurrent/f;

    iput-object p3, p0, Landroidx/camera/core/impl/u0;->c:Landroidx/concurrent/futures/c$a;

    iput-wide p4, p0, Landroidx/camera/core/impl/u0;->d:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Landroidx/camera/core/impl/u0;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Landroidx/camera/core/impl/u0;->b:Lcom/google/common/util/concurrent/f;

    iget-object v2, p0, Landroidx/camera/core/impl/u0;->c:Landroidx/concurrent/futures/c$a;

    iget-wide v3, p0, Landroidx/camera/core/impl/u0;->d:J

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/camera/core/impl/w0;->d(Ljava/util/concurrent/Executor;Lcom/google/common/util/concurrent/f;Landroidx/concurrent/futures/c$a;J)V

    return-void
.end method
