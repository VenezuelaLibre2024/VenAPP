.class Lio/grpc/internal/b0$o$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/b0$o;->d(Lvi/g1;Lio/grpc/internal/r$a;Lvi/w0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lvi/g1;

.field final synthetic b:Lio/grpc/internal/r$a;

.field final synthetic c:Lvi/w0;

.field final synthetic d:Lio/grpc/internal/b0$o;


# direct methods
.method constructor <init>(Lio/grpc/internal/b0$o;Lvi/g1;Lio/grpc/internal/r$a;Lvi/w0;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/b0$o$d;->d:Lio/grpc/internal/b0$o;

    iput-object p2, p0, Lio/grpc/internal/b0$o$d;->a:Lvi/g1;

    iput-object p3, p0, Lio/grpc/internal/b0$o$d;->b:Lio/grpc/internal/r$a;

    iput-object p4, p0, Lio/grpc/internal/b0$o$d;->c:Lvi/w0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/b0$o$d;->d:Lio/grpc/internal/b0$o;

    invoke-static {v0}, Lio/grpc/internal/b0$o;->e(Lio/grpc/internal/b0$o;)Lio/grpc/internal/r;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/b0$o$d;->a:Lvi/g1;

    iget-object v2, p0, Lio/grpc/internal/b0$o$d;->b:Lio/grpc/internal/r$a;

    iget-object v3, p0, Lio/grpc/internal/b0$o$d;->c:Lvi/w0;

    invoke-interface {v0, v1, v2, v3}, Lio/grpc/internal/r;->d(Lvi/g1;Lio/grpc/internal/r$a;Lvi/w0;)V

    return-void
.end method
