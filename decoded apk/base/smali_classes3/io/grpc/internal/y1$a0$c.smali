.class Lio/grpc/internal/y1$a0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/y1$a0;->d(Lvi/g1;Lio/grpc/internal/r$a;Lvi/w0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/y1$b0;

.field final synthetic b:Lio/grpc/internal/y1$a0;


# direct methods
.method constructor <init>(Lio/grpc/internal/y1$a0;Lio/grpc/internal/y1$b0;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/y1$a0$c;->b:Lio/grpc/internal/y1$a0;

    iput-object p2, p0, Lio/grpc/internal/y1$a0$c;->a:Lio/grpc/internal/y1$b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/y1$a0$c;->b:Lio/grpc/internal/y1$a0;

    iget-object v0, v0, Lio/grpc/internal/y1$a0;->b:Lio/grpc/internal/y1;

    iget-object v1, p0, Lio/grpc/internal/y1$a0$c;->a:Lio/grpc/internal/y1$b0;

    invoke-static {v0, v1}, Lio/grpc/internal/y1;->t(Lio/grpc/internal/y1;Lio/grpc/internal/y1$b0;)V

    return-void
.end method
