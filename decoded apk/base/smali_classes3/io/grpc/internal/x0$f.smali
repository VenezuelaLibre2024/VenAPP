.class Lio/grpc/internal/x0$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/x0;->O()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/x0;


# direct methods
.method constructor <init>(Lio/grpc/internal/x0;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0$f;->a:Lio/grpc/internal/x0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/x0$f;->a:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->y(Lio/grpc/internal/x0;)Lvi/f;

    move-result-object v0

    sget-object v1, Lvi/f$a;->INFO:Lvi/f$a;

    const-string v2, "Terminated"

    invoke-virtual {v0, v1, v2}, Lvi/f;->a(Lvi/f$a;Ljava/lang/String;)V

    iget-object v0, p0, Lio/grpc/internal/x0$f;->a:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->h(Lio/grpc/internal/x0;)Lio/grpc/internal/x0$j;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/x0$f;->a:Lio/grpc/internal/x0;

    invoke-virtual {v0, v1}, Lio/grpc/internal/x0$j;->d(Lio/grpc/internal/x0;)V

    return-void
.end method
