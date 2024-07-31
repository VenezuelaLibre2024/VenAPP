.class public final synthetic Lw/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lw/v;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:J

.field public final synthetic d:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Lw/v;Ljava/util/concurrent/Executor;JLandroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/u;->a:Lw/v;

    iput-object p2, p0, Lw/u;->b:Ljava/util/concurrent/Executor;

    iput-wide p3, p0, Lw/u;->c:J

    iput-object p5, p0, Lw/u;->d:Landroidx/concurrent/futures/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lw/u;->a:Lw/v;

    iget-object v1, p0, Lw/u;->b:Ljava/util/concurrent/Executor;

    iget-wide v2, p0, Lw/u;->c:J

    iget-object v4, p0, Lw/u;->d:Landroidx/concurrent/futures/c$a;

    invoke-static {v0, v1, v2, v3, v4}, Lw/v;->c(Lw/v;Ljava/util/concurrent/Executor;JLandroidx/concurrent/futures/c$a;)V

    return-void
.end method
