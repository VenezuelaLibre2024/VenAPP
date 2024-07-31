.class public final Lbe/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lzd/n;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/d;

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lzd/q3;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lnd/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbe/d;Lbk/a;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/d;",
            "Lbk/a<",
            "Lzd/q3;",
            ">;",
            "Lbk/a<",
            "Lnd/d;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/f;->a:Lbe/d;

    iput-object p2, p0, Lbe/f;->b:Lbk/a;

    iput-object p3, p0, Lbe/f;->c:Lbk/a;

    return-void
.end method

.method public static a(Lbe/d;Lbk/a;Lbk/a;)Lbe/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/d;",
            "Lbk/a<",
            "Lzd/q3;",
            ">;",
            "Lbk/a<",
            "Lnd/d;",
            ">;)",
            "Lbe/f;"
        }
    .end annotation

    new-instance v0, Lbe/f;

    invoke-direct {v0, p0, p1, p2}, Lbe/f;-><init>(Lbe/d;Lbk/a;Lbk/a;)V

    return-object v0
.end method

.method public static c(Lbe/d;Lzd/q3;Lnd/d;)Lzd/n;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lbe/d;->b(Lzd/q3;Lnd/d;)Lzd/n;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzd/n;

    return-object p0
.end method


# virtual methods
.method public b()Lzd/n;
    .locals 3

    iget-object v0, p0, Lbe/f;->a:Lbe/d;

    iget-object v1, p0, Lbe/f;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzd/q3;

    iget-object v2, p0, Lbe/f;->c:Lbk/a;

    invoke-interface {v2}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnd/d;

    invoke-static {v0, v1, v2}, Lbe/f;->c(Lbe/d;Lzd/q3;Lnd/d;)Lzd/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/f;->b()Lzd/n;

    move-result-object v0

    return-object v0
.end method
