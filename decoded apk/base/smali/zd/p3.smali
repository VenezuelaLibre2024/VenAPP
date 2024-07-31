.class public final Lzd/p3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lzd/o3;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Ldj/r;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Ldj/r;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Ldj/r;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbk/a;Lbk/a;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Ldj/r;",
            ">;",
            "Lbk/a<",
            "Ldj/r;",
            ">;",
            "Lbk/a<",
            "Ldj/r;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/p3;->a:Lbk/a;

    iput-object p2, p0, Lzd/p3;->b:Lbk/a;

    iput-object p3, p0, Lzd/p3;->c:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;Lbk/a;Lbk/a;)Lzd/p3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Ldj/r;",
            ">;",
            "Lbk/a<",
            "Ldj/r;",
            ">;",
            "Lbk/a<",
            "Ldj/r;",
            ">;)",
            "Lzd/p3;"
        }
    .end annotation

    new-instance v0, Lzd/p3;

    invoke-direct {v0, p0, p1, p2}, Lzd/p3;-><init>(Lbk/a;Lbk/a;Lbk/a;)V

    return-object v0
.end method

.method public static c(Ldj/r;Ldj/r;Ldj/r;)Lzd/o3;
    .locals 1

    new-instance v0, Lzd/o3;

    invoke-direct {v0, p0, p1, p2}, Lzd/o3;-><init>(Ldj/r;Ldj/r;Ldj/r;)V

    return-object v0
.end method


# virtual methods
.method public b()Lzd/o3;
    .locals 3

    iget-object v0, p0, Lzd/p3;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldj/r;

    iget-object v1, p0, Lzd/p3;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldj/r;

    iget-object v2, p0, Lzd/p3;->c:Lbk/a;

    invoke-interface {v2}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldj/r;

    invoke-static {v0, v1, v2}, Lzd/p3;->c(Ldj/r;Ldj/r;Ldj/r;)Lzd/o3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzd/p3;->b()Lzd/o3;

    move-result-object v0

    return-object v0
.end method
