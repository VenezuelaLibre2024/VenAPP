.class Lio/grpc/internal/p$c;
.super Lio/grpc/internal/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/p;->E(Lvi/g$a;Lvi/w0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic b:Lvi/g$a;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lio/grpc/internal/p;


# direct methods
.method constructor <init>(Lio/grpc/internal/p;Lvi/g$a;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/p$c;->d:Lio/grpc/internal/p;

    iput-object p2, p0, Lio/grpc/internal/p$c;->b:Lvi/g$a;

    iput-object p3, p0, Lio/grpc/internal/p$c;->c:Ljava/lang/String;

    invoke-static {p1}, Lio/grpc/internal/p;->k(Lio/grpc/internal/p;)Lvi/r;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/grpc/internal/x;-><init>(Lvi/r;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    iget-object v0, p0, Lio/grpc/internal/p$c;->d:Lio/grpc/internal/p;

    iget-object v1, p0, Lio/grpc/internal/p$c;->b:Lvi/g$a;

    sget-object v2, Lvi/g1;->t:Lvi/g1;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lio/grpc/internal/p$c;->c:Ljava/lang/String;

    aput-object v5, v3, v4

    const-string v4, "Unable to find compressor by name %s"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v2

    new-instance v3, Lvi/w0;

    invoke-direct {v3}, Lvi/w0;-><init>()V

    invoke-static {v0, v1, v2, v3}, Lio/grpc/internal/p;->l(Lio/grpc/internal/p;Lvi/g$a;Lvi/g1;Lvi/w0;)V

    return-void
.end method
