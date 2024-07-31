.class public final Lyl/i$d;
.super Ldm/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyl/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field final synthetic m:Lyl/i;


# direct methods
.method public constructor <init>(Lyl/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lyl/i$d;->m:Lyl/i;

    invoke-direct {p0}, Ldm/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 1

    invoke-virtual {p0}, Ldm/a;->u()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lyl/i$d;->v(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method protected v(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method protected z()V
    .locals 2

    iget-object v0, p0, Lyl/i$d;->m:Lyl/i;

    sget-object v1, Lyl/b;->CANCEL:Lyl/b;

    invoke-virtual {v0, v1}, Lyl/i;->f(Lyl/b;)V

    iget-object v0, p0, Lyl/i$d;->m:Lyl/i;

    invoke-virtual {v0}, Lyl/i;->g()Lyl/f;

    move-result-object v0

    invoke-virtual {v0}, Lyl/f;->b1()V

    return-void
.end method
