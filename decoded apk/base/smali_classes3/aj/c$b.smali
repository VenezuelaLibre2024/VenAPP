.class final Laj/c$b;
.super Lcom/google/common/util/concurrent/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laj/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RespT:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/util/concurrent/a<",
        "TRespT;>;"
    }
.end annotation


# instance fields
.field private final s:Lvi/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/g<",
            "*TRespT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lvi/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/g<",
            "*TRespT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/common/util/concurrent/a;-><init>()V

    iput-object p1, p0, Laj/c$b;->s:Lvi/g;

    return-void
.end method

.method static synthetic C(Laj/c$b;)Lvi/g;
    .locals 0

    iget-object p0, p0, Laj/c$b;->s:Lvi/g;

    return-object p0
.end method


# virtual methods
.method protected A(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TRespT;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/google/common/util/concurrent/a;->A(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method protected B(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/google/common/util/concurrent/a;->B(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method protected w()V
    .locals 3

    iget-object v0, p0, Laj/c$b;->s:Lvi/g;

    const-string v1, "GrpcFuture was cancelled"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lvi/g;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method protected x()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "clientCall"

    iget-object v2, p0, Laj/c$b;->s:Lvi/g;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
