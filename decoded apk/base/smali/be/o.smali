.class public final Lbe/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lzd/s;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/n;

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbe/n;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/n;",
            "Lbk/a<",
            "Ljava/util/concurrent/Executor;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/o;->a:Lbe/n;

    iput-object p2, p0, Lbe/o;->b:Lbk/a;

    return-void
.end method

.method public static a(Lbe/n;Lbk/a;)Lbe/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/n;",
            "Lbk/a<",
            "Ljava/util/concurrent/Executor;",
            ">;)",
            "Lbe/o;"
        }
    .end annotation

    new-instance v0, Lbe/o;

    invoke-direct {v0, p0, p1}, Lbe/o;-><init>(Lbe/n;Lbk/a;)V

    return-object v0
.end method

.method public static b(Lbe/n;Ljava/util/concurrent/Executor;)Lzd/s;
    .locals 0

    invoke-virtual {p0, p1}, Lbe/n;->a(Ljava/util/concurrent/Executor;)Lzd/s;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzd/s;

    return-object p0
.end method


# virtual methods
.method public c()Lzd/s;
    .locals 2

    iget-object v0, p0, Lbe/o;->a:Lbe/n;

    iget-object v1, p0, Lbe/o;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lbe/o;->b(Lbe/n;Ljava/util/concurrent/Executor;)Lzd/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/o;->c()Lzd/s;

    move-result-object v0

    return-object v0
.end method
