.class Lwi/f$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwi/f$f;->h1(Ljava/net/SocketAddress;Lio/grpc/internal/t$a;Lvi/f;)Lio/grpc/internal/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/h$b;

.field final synthetic b:Lwi/f$f;


# direct methods
.method constructor <init>(Lwi/f$f;Lio/grpc/internal/h$b;)V
    .locals 0

    iput-object p1, p0, Lwi/f$f$a;->b:Lwi/f$f;

    iput-object p2, p0, Lwi/f$f$a;->a:Lio/grpc/internal/h$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lwi/f$f$a;->a:Lio/grpc/internal/h$b;

    invoke-virtual {v0}, Lio/grpc/internal/h$b;->a()V

    return-void
.end method
